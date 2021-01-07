package com.facebook;

import android.content.SharedPreferences;
import com.facebook.internal.h0;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class b {
    private final SharedPreferences a;
    private final a b;

    static class a {
        a() {
        }
    }

    public b() {
        SharedPreferences sharedPreferences = k.d().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        a aVar = new a();
        this.a = sharedPreferences;
        this.b = aVar;
    }

    public void a() {
        this.a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        boolean z = k.n;
    }

    public a b() {
        if (this.a.contains("com.facebook.AccessTokenManager.CachedAccessToken")) {
            String string = this.a.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
            if (string == null) {
                return null;
            }
            try {
                return a.a(new JSONObject(string));
            } catch (JSONException unused) {
                return null;
            }
        } else {
            boolean z = k.n;
            return null;
        }
    }

    public void c(a aVar) {
        h0.f(aVar, "accessToken");
        try {
            this.a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", aVar.s().toString()).apply();
        } catch (JSONException unused) {
        }
    }
}
