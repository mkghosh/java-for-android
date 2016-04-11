package mooc.vandy.java4android.birthdayprob.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.diamonds.R;
import mooc.vandy.java4android.birthdayprob.logic.Logic;
import mooc.vandy.java4android.birthdayprob.logic.LogicInterface;

/**
 * Main UI for the App.
 */
public class MainActivity extends AppCompatActivity implements OutputInterface {

    // String for LOGGING
    public final static String LOG_TAG = MainActivity.class.getCanonicalName();

    // Logic Instance.
    LogicInterface mLogic;

    // UI Components.
    EditText outputET;
    EditText sizeET;
    EditText countET;
    Button processButton;

    /**
     * Called when the activity is starting.
     *
     * Similar to 'main' in C/C++/Standalone Java
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // required
        super.onCreate(savedInstanceState);
        // create a new 'Logic' instance.
        mLogic = new Logic(this);
        // setup the UI.
        setupUI();
    }

    /**
     * This method sets up/gets reference to the UI components
     */
    private void setupUI(){
        setContentView(R.layout.activity_main);
        outputET = (EditText) findViewById(R.id.outputET);
        sizeET = (EditText) findViewById(R.id.editTextGroupSize);
        countET = (EditText) findViewById(R.id.editTextCount);
        processButton = (Button) findViewById(R.id.button);
    }

    /**
     * Called when Button is Pressed.
     *
     * @param buttonPress
     */
    public void buttonPressed(View buttonPress)
    {
        resetText();
        mLogic.process();
    }

    private void addToEditText(String string){
        outputET.setText("" + outputET.getText() + string);
    }

    /**
     * This prints to the output a string
     * @param text
     */
    @Override
    public void print(String text) {
        Log.d(LOG_TAG, "print(String)");
        addToEditText(text);
    }

    /**
     * This prints to the output a char
     * @param _char
     */
    @Override
    public void print(char _char) {
        print("" + _char);
    }

    /**
     * This prints to the screen a string then a new line
     * @param text
     */
    @Override
    public void println(String text) {
        Log.d(LOG_TAG,"println(String)");
        addToEditText(text + "\n");
    }

    /**
     * This prints to the screen a char then a new line
     * @param _char
     */
    @Override
    public void println(char _char) {
        println("" + _char + "\n");
    }

    /**
     * Reset the on-screen output (EditText box)
     */
    @Override
    public void resetText() {
        outputET.setText("");
    }

    /**
     * Make Log statements from Logic
     */
    @Override
    public void log(String logtext) {
        Log.d(Logic.TAG, logtext);
    }

    /**
     * Make a Toast from Logic
     */
    @Override
    public void makeAlertToast(String alertText) {
        Toast.makeText(this,alertText,Toast.LENGTH_LONG);
    }

    /**
     * Get Size value from displayed UI.
     */
    public int getSize(){
        int value = Integer.valueOf( sizeET.getText().toString() );
        return value;
    }

    /**
     * Get Count value from displayed UI.
     */
    public int getCount(){
        int value = Integer.valueOf( countET.getText().toString() );
        return value;
    }
}
