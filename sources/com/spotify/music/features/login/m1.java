package com.spotify.music.features.login;

import android.content.Context;
import android.content.Intent;
import com.google.common.base.MoreObjects;
import com.spotify.loginflow.LoginActivity;
import com.spotify.loginflow.t;
import com.spotify.music.z0;

public class m1 implements t {
    private final z0 a;
    private final String b;

    public m1(z0 z0Var, String str) {
        this.a = z0Var;
        this.b = str;
    }

    @Override // com.spotify.loginflow.t
    public Intent a(Context context) {
        return this.a.a(context).a();
    }

    @Override // com.spotify.loginflow.t
    public Intent b(Context context, String str, boolean z) {
        Intent intent = new Intent();
        intent.setClassName(context, this.b);
        intent.putExtra("password_reset", true);
        intent.putExtra("password_reset_username", MoreObjects.nullToEmpty(str));
        intent.putExtra("password_reset_auto_send_email", z);
        return LoginActivity.V0(context, intent, 268468224, false);
    }
}
