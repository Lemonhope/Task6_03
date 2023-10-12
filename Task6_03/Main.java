package Task6_03;

public class Main {
    public static void main(String[] args) {
        Friends myFriends=new Friends();
        Person person1=new Person("Olga");
        Person person2=new Person("Natali");
        Person person3=new Person("Ivan");
        Person person4=new Person("Alice");
        Person person5=new Person("Anna");

        myFriends.addFriend(person1);
        myFriends.addFriend(person2);
        myFriends.addFriend(person3);
        myFriends.addFriend(person4);
        myFriends.addFriend(person5);

        myFriends.showFriends();
        myFriends.sortList();
    }
}
