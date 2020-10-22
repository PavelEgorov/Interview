package com.first.polygonteam.interview.lesson2.meteo;

public class MeteoStation{
    private static Integer startIdST500 = 1000;

    public static void main(String[] args){
        MeteoStore meteoDb = new MeteoStore();

        MeteoSensor ms200_1 = new MS200(1);
        meteoDb.save(ms200_1);

        // Здесь надо вызвать метод getData у класса ST500Info. Полученные данные отправить в метод save объекта meteoDb
        ST500Info sensor = new ST500Info();
        ST500Adapter adapter = new ST500Adapter(sensor.getData(), startIdST500);
        meteoDb.save(adapter);
    }
}
