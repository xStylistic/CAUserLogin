package interface_adapter.logged_in;

import interface_adapter.ViewModel;

/**
 * The View Model for the Logged In View.
 */
public class LoggedInViewModel extends ViewModel<LoggedInState> {

    public LoggedInViewModel() {
        super("logged in");
        setState(new LoggedInState());
    }

}
