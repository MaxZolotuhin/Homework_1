public class Course {

    String result;

    private double Sprint;
    private int PullUp;
    private double Cross;

    public Course(double Sprint, int PullUp, double Cross){
        this.Sprint = Sprint;
        this.PullUp = PullUp;
        this.Cross = Cross;
    }

    public String doIt (Teams team){
        result = "Команда: " +  team.getTeamName() + " " + '\n';
        for (Person person: team.getPerson()){
            result += "имя участника: " + person.getName() + " " + '\n' + "бег 100м: " + person.getValueSprint() + " " + '\n' + "подтягивание: " + person.getValuePullUp() + " " + '\n' + "бег 3000м: " + person.getValueCross() + " " + '\n';
        }
        return result;
    }

    public String checkIt (Teams team){
        result = "Успешно выполнили нормативы ГТО в команде " +  team.getTeamName() + " " + '\n';
        for (Person person: team.getPerson()){
            int valueAge = person.getAge();
            double valueSprint = person.getValueSprint();
            int valuePullUp = person.getValuePullUp();
            double valueCross = person.getValueCross();
            if ((valueSprint < Sprint) && (valuePullUp > PullUp) && (valueCross < Cross)){
                result += "имя участника: " + person.getName() + " " + '\n';
                testSprint(valueAge, valueSprint);
                testPullUp(valueAge, valuePullUp);
                testCross(valueAge, valueCross);
            }
        }
        return result;
    }

    private void testSprint (int valueAge, double valueSprint){
        if (valueAge < 18)
        {
            if (valueSprint <= 13.4) result = result + "бег 100м: " + valueSprint + " - золото" + '\n';
            else
                if(valueSprint <= 14.3) result = result + "бег 100м: " + valueSprint + " - серебро" + '\n';
                else
                    if (valueSprint <= Sprint) result = result + "бег 100м: " + valueSprint + " - бронза" + '\n';
                    else result = result + "бег 100м: " + valueSprint + " - не сдал" + '\n';
        }
        else
            if (valueAge < 35){
                if (valueSprint <= 13.1) result = result + "бег 100м: " + valueSprint + " - золото" + '\n';
                else
                    if(valueSprint <= 14.1) result = result + "бег 100м: " + valueSprint + " - серебро" + '\n';
                    else
                        if (valueSprint <= Sprint) result = result + "бег 100м: " + valueSprint + " - бронза" + '\n';
                        else result = result + "бег 100м: " + valueSprint + " - не сдал" + '\n';
            }
            else
            {
                if (valueSprint <= 13.6) result = result + "бег 100м: " + valueSprint + " - золото" + '\n';
                else
                    if(valueSprint <= 14.6) result = result + "бег 100м: " + valueSprint + " - серебро" + '\n';
                    else
                        if (valueSprint <= Sprint) result = result + "бег 100м: " + valueSprint + " - бронза" + '\n';
                        else result = result + "бег 100м: " + valueSprint + " - не сдал" + '\n';
            }
    }
    private void testPullUp (int valueAge, int valuePullUp){
        if (valueAge < 18)
        {
            if (valuePullUp >= 14) result = result + "подтягивание: " + valuePullUp + " - золото" + '\n';
            else
                if(valuePullUp >= 11) result = result + "подтягивание: " + valuePullUp + " - серебро" + '\n';
                else
                    if (valuePullUp >= PullUp) result = result + "подтягивание: " + valuePullUp + " - бронза" + '\n';
                    else result = result + "подтягивание: " + valuePullUp + " - не сдал" + '\n';
        }
        else
            if (valueAge < 35){
                if (valuePullUp >= 15) result = result + "подтягивание: " + valuePullUp + " - золото" + '\n';
                else
                    if(valuePullUp >= 12) result = result + "подтягивание: " + valuePullUp + " - серебро" + '\n';
                    else
                        if (valuePullUp >= PullUp) result = result + "подтягивание: " + valuePullUp + " - бронза" + '\n';
                        else result = result + "подтягивание: " + valuePullUp + " - не сдал" + '\n';

            }
            else
            {
                if (valuePullUp >= 12) result = result + "подтягивание: " + valuePullUp + " - золото" + '\n';
                else
                    if(valuePullUp >= 7) result = result + "подтягивание: " + valuePullUp + " - серебро" + '\n';
                    else
                        if (valuePullUp >= PullUp) result = result + "подтягивание: " + valuePullUp + " - бронза" + '\n';
                        else result = result + "подтягивание: " + valuePullUp + " - не сдал" + '\n';
        }
    }
    private void testCross (int valueAge, double valueCross){
        if (valueAge < 18)
        {
            if (valueCross <= 12.6) result = result + "бег 3000м: " + valueCross + " - золото" + '\n';
            else
                if(valueCross <= 14.5) result = result + "бег 3000м: " + valueCross + " - серебро" + '\n';
                else
                    if (valueCross <= Cross) result = result + "бег 3000м: " + valueCross + " - бронза" + '\n';
                    else result = result + "бег 3000м: " + valueCross + " - не сдал" + '\n';
        }
        else
            if (valueAge < 35){
                if (valueCross <= 12.0) result = result + "бег 3000м: " + valueCross + " - золото" + '\n';
                else
                    if(valueCross <= 13.6) result = result + "бег 3000м: " + valueCross + " - серебро" + '\n';
                    else
                        if (valueCross <= Cross) result = result + "бег 3000м: " + valueCross + " - бронза" + '\n';
                        else result = result + "бег 3000м: " + valueCross + " - не сдал" + '\n';
        }
            else {
                if (valueCross <= 13.4) result = result + "бег 3000м: " + valueCross + " - золото" + '\n';
                else
                    if(valueCross <= 14.8) result = result + "бег 3000м: " + valueCross + " - серебро" + '\n';
                    else
                        if (valueCross <= Cross) result = result + "бег 3000м: " + valueCross + " - бронза" + '\n';
                        else result = result + "бег 3000м: " + valueCross + " - не сдал" + '\n';
            }
    }
}
