package com.example.appdev;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class onboarding___sign_in_activity extends Activity {

	private View _bg__onboarding___sign_in_ek2;
	private ImageView tab;
	private TextView label;
	private View _bg__button_ek1;
	private TextView email;
	private View _bg__textbox_ek1;
	private TextView enter_your_email;
	private TextView password;
	private View _bg__textbox_ek3;
	private TextView enter_your_password;
	private ImageView icon;
	private ImageView line_40;
	private TextView or_sign_in_with;
	private ImageView line_41;
	private View _bg__button_ek3;
	private ImageView vector;
	private ImageView vector_ek1;
	private ImageView vector_ek2;
	private ImageView vector_ek3;
	private TextView label_ek2;
	private ImageView underline;
	private View _bg__top_bar___home_indicator_ek1;
	private TextView title_ek2;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.onboarding___sign_in);

		// Initialize views
		_bg__onboarding___sign_in_ek2 = findViewById(R.id._bg__onboarding___sign_in_ek2);
		tab = findViewById(R.id.tab);
		label = findViewById(R.id.label);
		_bg__button_ek1 = findViewById(R.id._bg__button_ek1);
		email = findViewById(R.id.email);
		_bg__textbox_ek1 = findViewById(R.id._bg__textbox_ek1);
		enter_your_email = findViewById(R.id.enter_your_email);
		password = findViewById(R.id.password);
		_bg__textbox_ek3 = findViewById(R.id._bg__textbox_ek3);
		enter_your_password = findViewById(R.id.enter_your_password);
		icon = findViewById(R.id.icon);
		line_40 = findViewById(R.id.line_40);
		or_sign_in_with = findViewById(R.id.or_sign_in_with);
		line_41 = findViewById(R.id.line_41);
		_bg__button_ek3 = findViewById(R.id._bg__button_ek3);
		vector = findViewById(R.id.vector);
		vector_ek1 = findViewById(R.id.vector_ek1);
		vector_ek2 = findViewById(R.id.vector_ek2);
		vector_ek3 = findViewById(R.id.vector_ek3);
		label_ek2 = findViewById(R.id.label_ek2);
		underline = findViewById(R.id.underline);
		_bg__top_bar___home_indicator_ek1 = findViewById(R.id._bg__top_bar___home_indicator_ek1);
		title_ek2 = findViewById(R.id.title_ek2);

		// Set click listener for sign in button
		Button signInButton = findViewById(R.id._bg__button_ek1);
		signInButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				goToDashBoard();
			}
		});
	}

	// Method to navigate to dashboard activity
	public void goToDashBoard() {
		Intent intent = new Intent(this, dashboard___overview_activity.class);
		startActivity(intent);
	}
}
