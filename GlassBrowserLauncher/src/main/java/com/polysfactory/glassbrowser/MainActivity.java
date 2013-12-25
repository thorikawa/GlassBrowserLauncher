package com.polysfactory.glassbrowser;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Intent intent = new Intent(Intent.ACTION_VIEW);
		intent.setData(Uri.parse("http://thorikawa.github.io/GlassBrowserLauncher/index.html"));
		intent.setClassName("com.google.glass.browser", "com.google.glass.browser.WebBrowserActivity");
		startActivity(intent);
	}
}
