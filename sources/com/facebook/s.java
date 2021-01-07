package com.facebook;

import android.content.SharedPreferences;
import com.facebook.internal.h0;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class s {
    private final SharedPreferences a = k.d().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);

    s() {
    }

    /* access modifiers changed from: package-private */
    public void a() {
        this.a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }

    /* access modifiers changed from: package-private */
    public r b() {
        String string = this.a.getString("com.facebook.ProfileManager.CachedProfile", null);
        if (string != null) {
            try {
                return new r(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void c(r rVar) {
        h0.f(rVar, "profile");
        JSONObject f = rVar.f();
        if (f != null) {
            this.a.edit().putString("com.facebook.ProfileManager.CachedProfile", f.toString()).apply();
        }
    }
}
