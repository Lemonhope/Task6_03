package Task6_03;

import java.util.ArrayList;
import java.util.Collections;

public class Friends{
    private final ArrayList<String> friendList=new ArrayList<>();
    public void addFriend(String myFriend){
        this.friendList.add(myFriend);
    }
    public void showFriends(){
        System.out.println("Friends: "+this.friendList);
    }
    public void sortList(){
        Collections.sort(this.friendList);
        System.out.println("\nFriends sorted: "+this.friendList);


    }
}
