# Мои заметки по изучению Java.  
## Learn Java with JM, Stepik  

### 1. Введение в Java
---
1.1 Что такое Java
Java - объектно-ориентированный язык программирования. Широко используется в сети как самый стабильный и надежный, проверенный временем и крупными проектами.  
1.2 Первый контакт - Hello World  
```java  
    public class Main {
       public static void main(String[] args) {
           System.out.println(“Hello World”);
    }
}
```  
1.3 Знакомство со средой разработки  

### 2. Базовый синтаксис Java  
---
2.1 Примитивные типы    
Битовые операции:
```java  
<< сдвиг влево, заполняем нулями
>> сдвиг вправо с сохранением знака (заполнение 0-и если положительное, 
заполнение 1-и если отрицательное)
>>> сдвиг вправо без учета знака (с заполнением 0-и)
<<= сдвиг влево с присваиванием
>>= сдвиг вправо с присвоением с учетом знака
>>>= сдвиг вправо с присвоением без учета знака
```
```java  
& - проверяем оба значения слева и справа
&& - проверяем слева, если false - то справа не проверяем
```
Явное и неявное приведение типов:
```java  
При математических операциях byte short char - приводятся к int; 
если один из операндов long - все выражение приводится к long; 
если один из операндов float - к float; 
если один из операндов double - к double.
```   

```java
	|Type		|Default Value	|
	|byte		|0		|
	|short		|0		|
	|int		|0		|
	|long		|0L		|
	|float 		|0.0f		|
	|double		|0.0d		|
	|char		|'\u0000'	|
	|boolean	|false		|
```
2.2 Преобразования типов  
2.3 Массивы и строки  
String является массивом символов, и так же как и массив - фиксированная (изменять размер нельзя)
```java 
	//равносильная запись  
	int[] array1 = {1,2,3,-5,0};  
	int[] array2 = new int{1,2,3,-5,0};
```
2.4 Управляющие конструкции

### 3. Объекты, классы, пакеты Java  
---
3.1 Основы ООП    
Класс наследник расширяет новым функционалом суперкласс.
Уборщик мусора работает в адаптивном режиме: сначала остановить-и-копировать живые ссылки из одной кучи в другую, и удалить из первой кучи мертвые ссылки, затем пометить-и-убрать - в стеке и статической памяти.  
```  
-Псевдокод для задачи 3.3.1:  
-Пока координата х меньше заданной
	-Пока направление не в нужную сторону
		-вращаем
	-идем
-Пока координата х больше заданной
	-Пока направление не в нужную сторону
		-вращаем
	-идем
-Пока координата y меньше заданной
	-Пока направление не в нужную сторону
		-вращаем
	-идем
-Пока координата y больше заданной
	-Пока направление не в нужную сторону
		-вращаем
	-идем
```  

3.2 Пакеты и модификаторы доступа  
3.3 Объявление класса  
3.4 Наследование. Класс Object  
```java
- При необходимости методы .equals() и .hashCode() необходимо переопределять @override  
(не путать с перегрузкой) иначе для двух одинаковых объектов всегда будет false
```  
```java  
equals(): нужно проверить ссылки на объекты this == obj -> true, obj == null -> false, 
проверить классы this.getClass() != obj.getClass() -> false, 
привести obj к типу класса (ссылка object1) и проверить поля this.var1 == object1.var1.
hashCode(): если примитив - добавляем матиматики и возвращаем переменную.  
```  

3.5 Абстрактные классы и интерфейсы  
```java  
Интерфейс - это каркас, который наш класс должен имплементировать (реализовать). 
Создается как класс, только вместо слова class пишем interface. Методы в интерфейсе 
не должны иметь тела (фигурных скобок). Класс наследует (extends) только один 
другой класс и реализуем (implements) любое количество интерфейсов. Эти методы 
интерфейса обязательно необходимо реализовать в классе.
```  

### 4. Обработка ошибок, исключения, отладка
---

### 5. Ввод-вывод, доступ к файловой системе
---

### 6. Generics, Collections, Streams
---
 
