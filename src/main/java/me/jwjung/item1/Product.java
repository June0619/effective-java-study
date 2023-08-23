package me.jwjung.item1;

public class Product {

    public static void main(String[] args) {

        //기본 생성자를 private 으로 지정함으로써 통제
//        Settings settings = new Settings();

        Settings settings1 = Settings.newInstance();
        Settings settings2 = Settings.newInstance();

        System.out.println(settings1);
        System.out.println(settings2);

        //미리 만들어놓은 객체를 가지고 비교함
        Boolean.valueOf(false);
    }
}
