package me.jwjung.item1;

public class Settings {

    private boolean useAutoSteering;

    private boolean useABS;

    private Difficulty difficulty;

    public static void main(String[] args) {
        System.out.println(new Settings());
        System.out.println(new Settings());
        System.out.println(new Settings());

        //생성자를 통해 생성한다면 매번 새로운 인스턴스를 만들게 허용하므로 통제가 되지 않는다.
    }

    private Settings() {};

    //기본 생성자가 없는경우 인스턴스 제공 방법
    private static final Settings SETTINGS = new Settings();

    public static Settings newInstance() {
        return SETTINGS;
    }

}
