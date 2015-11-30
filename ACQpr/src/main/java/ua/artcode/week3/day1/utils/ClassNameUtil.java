package main.java.ua.artcode.week3.day1.utils;

/**
 * Created by ViTaLES on 18.10.2015.
 */
public class ClassNameUtil {

    private ClassNameUtil(){}
// для логгера - чтобы в логгере каждый раз не писать класс нейм каждый раз когдаюзаем логгер
    public static String getCurrentClassName() {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e){
            return e.getStackTrace()[1].getClassName();
        }
    }

}
