public class Main {

    public static void main(String[] args) {
        Person[] person = new Person[4];
        person[0] = new Person("Мальцев Александр", 17, 12.7, 15, 12.1);
        person[1] = new Person("Пронин Анатолий", 16, 13.7, 7, 12.1);
        person[2] = new Person("Большаков Сергей", 17, 12.7, 15, 15.1);
        person[3] = new Person("Медведев Георгий ", 17, 14.7, 9, 12.1);

        Teams team = new Teams("Быки", person);

        Course GTO = new Course(14.9,8,14.5); // заданы минимальные значения нормативов, чтобы получить хоть какой-то знак
        String result = GTO.doIt(team);
        String Win = GTO.checkIt(team);
        System.out.println(result);
        System.out.println(Win);
    }
}
