package com.example;

import com.jiahaoliuliu.unittestingwithandroidstudio.MainActivity;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;

//import static org.junit.Assert.assertNotNull;

/**
 * Created by jiahao on 3/9/15.
 */
@RunWith(RobolectricGradleTestRunner.class)
public class MainActivityTest {

    private MainActivity mMainActivity;

    @Before
    public void setup() {
        mMainActivity = Robolectric.buildActivity(MainActivity.class).create().get();
    }

    @Test
    public void simpleTest() {
//        assertNotNull(mMainActivity);
    }
}