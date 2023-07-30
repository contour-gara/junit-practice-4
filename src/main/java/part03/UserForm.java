package part03;

public class UserForm {

    private final String userName;
    private final String password;

    public UserForm(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Boolean isValid() {
        return this.userName != null && this.password != null;
    }

}
