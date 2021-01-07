package com.spotify.mobile.android.sso.util;

import android.content.Context;
import android.content.Intent;
import com.spotify.loginflow.LoginActivity;

public class b {
    public Intent a(Context context) {
        Context applicationContext = context.getApplicationContext();
        int i = AfterLoginDummyActivity.a;
        Intent intent = new Intent(applicationContext, AfterLoginDummyActivity.class);
        intent.setAction("android.intent.action.VIEW");
        intent.addFlags(1082130432);
        return LoginActivity.V0(context, intent, 0, false);
    }
}
