package loggedimpl;

import LOGIC.Controller;
import LOGIC.Message;
import util.log.MasterLogger;

import javax.naming.ldap.Control;

public class LoggedController extends Controller {
    @Override
    public boolean signUp(Message message) {
        boolean result = super.signUp(message);
        if (result) {
            MasterLogger.getInstance().log("signed up successfuly");
        }
        else {
            MasterLogger.getInstance().error("sign up failed");
        }
        return result;
    }
}
