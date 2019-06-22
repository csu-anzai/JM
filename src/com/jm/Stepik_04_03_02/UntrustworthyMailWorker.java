package com.jm.Stepik_04_03_02;

/**
 * 1) UntrustworthyMailWorker – класс, моделирующий ненадежного работника почты, который вместо того, чтобы передать
 * почтовый объект непосредственно в сервис почты, последовательно передает этот объект набору третьих лиц, а затем, в
 * конце концов, передает получившийся объект непосредственно экземпляру RealMailService. У UntrustworthyMailWorker
 * должен быть конструктор от массива MailService ( результат вызова processMail первого элемента массива передается на
 * вход processMail второго элемента, и т. д.) и метод getRealMailService, который возвращает ссылку на внутренний
 * экземпляр RealMailService.
 */
public class UntrustworthyMailWorker implements MailService {

    private MailService[] mailService;

    @Override
    public Sendable processMail(Sendable mail) {
        for (int i = 0; i < mailService.length; i++) {
            mail = mailService[i + 1].processMail(mailService[i].processMail(mail));
        }
        return mail;
    }

    UntrustworthyMailWorker(MailService[] mailService) {
        this.mailService = mailService;
    }

    public RealMailService getRealMailService() {
        return new RealMailService();
    }
}
