package com.facebook.login;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.internal.f0;
import com.facebook.login.LoginClient;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class l implements f0.b {
    final /* synthetic */ Bundle a;
    final /* synthetic */ LoginClient.d b;
    final /* synthetic */ k c;

    l(k kVar, Bundle bundle, LoginClient.d dVar) {
        this.c = kVar;
        this.a = bundle;
        this.b = dVar;
    }

    @Override // com.facebook.internal.f0.b
    public void a(JSONObject jSONObject) {
        try {
            this.a.putString("com.facebook.platform.extra.USER_ID", jSONObject.getString("id"));
            this.c.m(this.b, this.a);
        } catch (JSONException e) {
            LoginClient loginClient = this.c.b;
            loginClient.c(LoginClient.Result.b(loginClient.p, "Caught exception", e.getMessage()));
        }
    }

    @Override // com.facebook.internal.f0.b
    public void b(FacebookException facebookException) {
        LoginClient loginClient = this.c.b;
        loginClient.c(LoginClient.Result.b(loginClient.p, "Caught exception", facebookException.getMessage()));
    }
}
