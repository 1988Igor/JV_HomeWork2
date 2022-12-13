package org.example;
//ООП:
//1)Напишите интерфейс Converter для конвертации из градусов по Цельсию в
//Кельвины, Фаренгейты. У классов наследников необходимо переопределить метод интерфейса,
// для валидного перевода величин. Метод для конвертации назовите "convertValue".
public interface Converter {
    double getConvertedElement(double element);
}

class CelsiusConverter implements Converter {

    @Override
    public double getConvertedElement(double element) {
        return element;
    }
}

class KelvinConverter implements Converter {

    @Override
    public double getConvertedElement(double element) {
        return element + 273.15;
    }


}

class FahrenheitConverter implements Converter {

    @Override
    public double getConvertedElement(double element) {
        return element + 32;
    }
}