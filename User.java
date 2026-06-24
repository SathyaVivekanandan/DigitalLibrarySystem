public class User {

    int userId;
    String userName;

    public User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public void displayUser() {
        System.out.println("User ID: " + userId);
        System.out.println("User Name: " + userName);
    }
}

