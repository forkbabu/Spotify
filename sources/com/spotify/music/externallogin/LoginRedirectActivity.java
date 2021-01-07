package com.spotify.music.externallogin;

import android.content.Intent;
import androidx.appcompat.app.g;
import com.spotify.loginflow.LoginActivity;

public final class LoginRedirectActivity extends g {
    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.c, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        setResult(i2);
        finish();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStart() {
        super.onStart();
        startActivityForResult(LoginActivity.V0(getApplicationContext(), new Intent(getApplicationContext(), LoginRedirectActivity.class), 0, false), 56876);
    }
}
