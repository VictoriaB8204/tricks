# Кароче че я наваяла
##Использованные инструменты

Фреймворки:
-Spark - для реализации API
-Maven - для подтягивания зависимостей

Библиотеки:
-Gson - парсинг из JSON

IDE:
-Inteliji Idea

#Как это сейчас работает
##Вызов API
Request POST http://localhost:4567/
```json
Headers:
{
    "Content-Type" : "application/json"
}
```
Payload:
```json
{
    "histories":[
        {"a": 140,"b": 7},
        {"a": 14,"b": 7},
        {"a": 1,"b": 7}
    ]
}
```
##Ответ
Возвращает массив, где i-й элемент = a+b
```json
[147, 21, 8]
```
#Разворачивание проекта
Для работы проекта надо, чтобы был установлен maven

##Установка maven
Версия Maven 3.6.3 скачать можно тут: http://maven.apache.org/download.cgi (apache-maven-3.0.5-bin.zip)

После того как мы скачали Maven, начинаем его установку.

1. Распаковываем zip архив в любую удобную для вас директорию, я распаковываю в корень диска для удобства C:\\apache-maven-3.6.3

2. Создаем переменную среды.

Для этого заходим в Win+Pause, далее “Дополнительные параметры системы” -> “Переменные среды“, затем “Создать” указываем имя переменной “M2_HOME” и задаете значение, являющееся путем к директории apache-maven-3.0.5, у меня путь получился таким: C:\\apache-maven-3.0.5

1) Добавляем в PATH C:\\apache-maven-3.6.3\bin

2) Проверяем, что есть переменная с именем JAVA_HOME и она содержит путь к JDK. К примеру: C:\Program Files\Java\jdk1.7.0

3. Проверяем, что maven установился: cmd, команда mvn -v
Должно вывести:
```json
Apache Maven 3.6.3 (cecedd343002696d0abb50b32b541b8a6ba2883f)
Maven home: D:\ProgramData\ProgramFiles\apache-maven-3.6.3\bin\..
Java version: 10.0.2, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk-10.0.2
Default locale: ru_RU, platform encoding: Cp1251
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"
```

Потом скачиваем проект.

#Запуск проекта


cmd:
$ cd api

$ mvn package

$ mvn compile

$ mvn exec:java -Dexec.mainClass="api.Starter"

Ну или можно не выделываться и запустить проект в ide.


