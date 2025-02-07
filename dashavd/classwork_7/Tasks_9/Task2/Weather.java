package Tasks_9.Task2;

public class Weather {
    public static String getWeather(Season season) {
        switch (season) {
            case WINTER:
                return "Холодно";
            case SUMMER:
                return "Жарко";
            case SPRING:
            case AUTUMN:
                return "Прохладно";
            default:
                return "Неизвестный сезон";
        }
    }

    public static void main(String[] args) {
        System.out.println(getWeather(Season.WINTER));
        System.out.println(getWeather(Season.SPRING));
    }
}