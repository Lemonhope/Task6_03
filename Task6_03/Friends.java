package Task6_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Friends implements Comparator<Person> {
    private final ArrayList<Person> friendList=new ArrayList<>();
    public void addFriend(Person myFriend){
        this.friendList.add(myFriend);
    }
    public void showFriends(){
        System.out.println("Friends: "+this.friendList);
    }
    public void sortList(){
        Collections.sort(this.friendList, new Friends());
        System.out.println("\nFriends sorted: "+this.friendList);
    }

    @Override
    public int compare(Person o1, Person o2) {
        if(o1.getName().compareTo(o2.getName()) == 0) {
            return 0;
        }
        else if(o1.getName().compareTo(o2.getName()) > 0) {
            return 1;
        }
        else{
            return -1;
        }

    }
}
