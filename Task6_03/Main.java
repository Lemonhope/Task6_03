package Task6_03;

public class Main {
    public static void main(String[] args) {
        Friends myFriends=new Friends();

        myFriends.addFriend("Olga");
        myFriends.addFriend("Natali");
        myFriends.addFriend("Ivan");
        myFriends.addFriend("Alice");
        myFriends.addFriend("Anna");

        myFriends.showFriends();
        myFriends.sortList();
    }
}
