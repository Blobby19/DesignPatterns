package fr.itv95.mediator;

import java.util.Date;

/**
 * Created by Luc on 17/10/2016.
 */
public class ChatRoom {

    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()+" ["+user.getName()+"] : "+message);
    }

}
