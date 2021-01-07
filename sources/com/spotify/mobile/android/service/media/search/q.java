package com.spotify.mobile.android.service.media.search;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import org.json.JSONArray;
import org.json.JSONException;

/* access modifiers changed from: package-private */
public class q {
    private final SpSharedPreferences.b<Object, JSONArray> a;
    private final SpSharedPreferences<Object> b;
    private final cqe c;

    q(SpSharedPreferences.b<Object, JSONArray> bVar, SpSharedPreferences<Object> spSharedPreferences, cqe cqe) {
        this.a = bVar;
        this.b = spSharedPreferences;
        this.c = cqe;
    }

    /* access modifiers changed from: package-private */
    public void a(String str, long j) {
        try {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(0, str);
            jSONArray.put(1, this.c.b() + j);
            SpSharedPreferences.a<Object> b2 = this.b.b();
            b2.c(this.a, jSONArray);
            b2.i();
        } catch (JSONException unused) {
            Logger.d("Could not store access token", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        SpSharedPreferences.a<Object> b2 = this.b.b();
        b2.h(this.a);
        b2.i();
    }

    /* access modifiers changed from: package-private */
    public String c() {
        if (!this.b.a(this.a)) {
            return null;
        }
        try {
            JSONArray g = this.b.g(this.a, new JSONArray());
            g.getClass();
            if (g.length() != 2) {
                Assertion.g("Token array is not of length 2");
                return null;
            } else if (g.getLong(1) >= this.c.b()) {
                return g.getString(0);
            } else {
                return null;
            }
        } catch (JSONException unused) {
            Logger.d("Stored token array is malformed", new Object[0]);
            return null;
        }
    }
}
