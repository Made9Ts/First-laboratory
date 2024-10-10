# Лабораторная работа №1: Создание Activity и передача параметров между ними

- _Выполнил:_ Поправко
- _Язык программирования:_ Java

## Описание приложения
Приложение состоит из двух экранов и передает параметр с одного на другой при нажатии на кнопку. Для запуска проекта следуйте разделу ["Как собрать проект?"](##Как-собрать-проект).

### Внешний вид
После запуска открывается экран 1 (`MainActivity`) с кнопкой "Переход к Activity 2". По нажатию на кнопку происходит:
- Переход на экран 2 (`SecondActivity`)
- Передача параметра из `MainActivity` в переменную на экране `SecondActivity`
- Отображение текста "Переданный параметр: Поправко".

<p align="center">
    <img src="https://github.com/Made9Ts/First-laboratory/blob/74c01f9e12d5e30bba4d3e48c2f55bf6ab7b54d5/image.png" width="250"> 
    <img src="https://github.com/Made9Ts/First-laboratory/blob/a0bea4ed00c0cb5af31480690ce2be3e68af3fee/image1.png" width="250">
</p> 

## <a id="Как-собрать-проект">Как собрать проект?</a>
_Описан один из возможных способов:_
1. Скачать ZIP проекта:
    - Клик на зеленую кнопку "<> Code".
    - Клик на "Download ZIP".
2. Распаковать загруженный архив.
3. Запустить Android Studio.
4. Клик на "Open..." на начальном экране / в верхней панели File -> Open...
5. Выбрать распакованный архив.
6. Дождаться завершения всех процессов внутри проекта.
7. Выбрать эмулятор или подключить реальное устройство.
8. Клик на "Run" (должна быть выбрана конфигурация "app").
9. Готово ✅
