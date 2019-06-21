/**
 * Вам необходимо описать набор классов, каждый из которых является MailService:
 * 1) UntrustworthyMailWorker – класс, моделирующий ненадежного работника почты, который вместо того, чтобы передать
 * почтовый объект непосредственно в сервис почты, последовательно передает этот объект набору третьих лиц, а затем,
 * в конце концов, передает получившийся объект непосредственно экземпляру RealMailService. У UntrustworthyMailWorker
 * должен быть конструктор от массива MailService ( результат вызова processMail первого элемента массива передается на
 * вход processMail второго элемента, и т. д.) и метод getRealMailService, который возвращает ссылку на внутренний
 * экземпляр RealMailService.
 * 2) Spy – шпион, который логгирует о всей почтовой переписке, которая проходит через его руки. Объект конструируется
 * от экземпляра Logger, с помощью которого шпион будет сообщать о всех действиях. Он следит только за объектами класса
 * MailMessage и пишет в логгер следующие сообщения (в выражениях нужно заменить части в фигурных скобках на значения
 * полей почты):
 * 2.1) Если в качестве отправителя или получателя указан "Austin Powers", то нужно написать в лог сообщение с уровнем
 * WARN: Detected target mail correspondence: from {from} to {to} "{message}"
 * 2.2) Иначе, необходимо написать в лог сообщение с уровнем INFO: Usual correspondence: from {from} to {to}
 * 3) Thief – вор, который ворует самые ценные посылки и игнорирует все остальное. Вор принимает в конструкторе
 * переменную int – минимальную стоимость посылки, которую он будет воровать. Также, в данном классе должен
 * присутствовать метод getStolenValue, который возвращает суммарную стоимость всех посылок, которые он своровал.
 * Воровство происходит следующим образом: вместо посылки, которая пришла вору, он отдает новую, такую же, только с
 * нулевой ценностью и содержимым посылки "stones instead of {content}".
 * 4) Inspector – Инспектор, который следит за запрещенными и украденными посылками и бьет тревогу в виде исключения,
 * если была обнаружена подобная посылка. Если он заметил запрещенную посылку с одним из запрещенных содержимым
 * ("weapons" и "banned substance"), то он бросает IllegalPackageException. Если он находит посылку, состоящую из камней
 * (содержит слово "stones"), то тревога прозвучит в виде StolenPackageException. Оба исключения вы должны объявить
 * самостоятельно в виде непроверяемых исключений.
 * Все классы должны быть определены как публичные и статические, так как в процессе проверки ваш код будет подставлен
 * во внешний класс, который занимается тестированием и проверкой структуры. Для удобства во внешнем классе объявлено
 * несколько удобных констант и импортировано все содержимое пакета java.util.logging. Для определения, посылкой или
 * письмом является Sendable объект воспользуйтесь оператором instanceof.
 * public static final String AUSTIN_POWERS = "Austin Powers";
 * public static final String WEAPONS = "weapons";
 * public static final String BANNED_SUBSTANCE = "banned substance";
 */

package com.jm.Stepik_04_03_02;

public class Main {
    // implement UntrustworthyMailWorker, Spy, Inspector, Thief, StolenPackageException, IllegalPackageException as public static classes here

    MailServices[] mailServices;
    UntrustworthyMailWorker untrustworthyMailWorker = new UntrustworthyMailWorker(mailServices);
}
