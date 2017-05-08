package daniyyeltouboul.mamlitzimshelbar;



/**
 * Created by Daniyyel on 28/02/2017.
 */

public class Game {

    private String Name;
    private String UserName;
    private String Age;

    public Game(String name, String userName, String age) {
        Name = name;
        UserName = userName;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }
}