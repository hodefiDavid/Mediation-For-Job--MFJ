package string.web_server.userManager;

public class User {
    private static long id_num = 0;
    private String firstName;
    //uniq userName
    private String userName;

    private String lastName;
    private long idKey;
    private String emailAddress;//optional
    private String phoneNumber;

    public long getIdKey() {
        return idKey;
    }

    public User(String userName,String firstName, String lastName, String emailAddress, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }


//ToDo pdf resume
    //https://docs.aspose.com/pdf/java/converting/
    //https://www.baeldung.com/pdf-conversions-java
}
