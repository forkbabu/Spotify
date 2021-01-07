package com.spotify.mobile.android.service.feature;

import android.content.Context;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class i {
    private static final SpSharedPreferences.b<Object, JSONObject> c = SpSharedPreferences.b.e("feature-service-cached-abba-values");
    private final Context a;
    private final com.spotify.mobile.android.util.prefs.i b;

    i(Context context, com.spotify.mobile.android.util.prefs.i iVar) {
        this.a = context;
        this.b = iVar;
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        SpSharedPreferences<Object> b2 = this.b.b(this.a, str);
        SpSharedPreferences.b<Object, JSONObject> bVar = c;
        if (b2.a(bVar)) {
            SpSharedPreferences.a<Object> b3 = b2.b();
            b3.h(bVar);
            b3.i();
        }
    }
}
