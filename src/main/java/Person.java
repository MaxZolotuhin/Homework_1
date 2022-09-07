public class Person {

    private String name;
    private int age;
    private double valueSprint;
    private int valuePullUp;
    private double valueCross;

    public Person(String name, int age, double valueSprint, int valuePullUp, double valueCross){
        this.name = name;
        this.age = age;
        this.valueSprint = valueSprint;
        this.valuePullUp = valuePullUp;
        this.valueCross = valueCross;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getValueSprint(){
        return valueSprint;
    }

    public int getValuePullUp() {
        return valuePullUp;
    }

    public double getValueCross() {
        return valueCross;
    }
}
