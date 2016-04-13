package mooc.vandy.java4android.birthdayprob.logic;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import mooc.vandy.java4android.birthdayprob.logic.tools.TestingOutputInterface;

import static org.junit.Assert.*;

/**
 * Created by Mithun Kumer Ghose on 4/13/2016.
 */
public class LogicTest {

    Logic mLogic;
    TestingOutputInterface output;

    @Before
    public void setupClasses(){
        output = new TestingOutputInterface();
        mLogic = new Logic(output);
    }

    @Test
    public void testCheckPair() throws Exception {
        List<Integer> studentList = new ArrayList<>(4);
        studentList.add(56);
        studentList.add(56);
        studentList.add(306);
        studentList.add(34);

        assertEquals("Faild this test", true, mLogic.checkPair(studentList));
    }

    @Test
    public void testCheckSameBirthday() throws Exception {
        List<Integer> studentList = new ArrayList<>(4);
        studentList.add(56);
        studentList.add(56);
        studentList.add(306);
        studentList.add(34);

        assertEquals("Faild this test", true, mLogic.checkSameBirthday(studentList));
    }
}