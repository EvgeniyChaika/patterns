package patterns.behavioral.mediator;

import java.util.Date;

/**
 * Created on 26.08.16.
 */
public class ChatRoom {

    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [ " + user.getName() + " ] : " + message);
    }
}
