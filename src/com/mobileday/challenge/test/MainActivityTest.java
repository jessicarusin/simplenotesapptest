package com.mobileday.challenge.test;

import com.mobileday.challenge.MainActivity;
import com.mobileday.challenge.R;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;

public class MainActivityTest extends
		ActivityInstrumentationTestCase2<MainActivity> {

	private MainActivity mainActivity;
	private EditText editText;

	public MainActivityTest() {
		super(MainActivity.class);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		mainActivity = getActivity();
		editText = (EditText) mainActivity.findViewById(R.id.editText1);
	}

	public void testPreconditions() {
		assertNotNull(mainActivity);
		assertNotNull(editText);
	}
	
	

}
