public class Teams {

    private String TeamName;
    private Person[] person = new Person[4];

    public Teams(String TeamName, Person[] person){
        this.TeamName = TeamName;
        this.person = person;
    }

    public String getTeamName(){
        return TeamName;
    }

    public Person[] getPerson(){
        return person;
    }

}
