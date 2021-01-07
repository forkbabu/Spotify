package com.spotify.mobile.android.util.prefs;

import android.content.Context;
import com.google.common.hash.Hashing;
import java.nio.charset.Charset;

public final /* synthetic */ class f implements wlf {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;

    public /* synthetic */ f(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    @Override // defpackage.wlf
    public final Object get() {
        Context context = this.a;
        String str = this.b;
        Context applicationContext = context.getApplicationContext();
        StringBuilder V0 = je.V0("user-");
        V0.append(Hashing.sha1().hashString(str, Charset.defaultCharset()).toString());
        return applicationContext.getSharedPreferences(V0.toString(), 0);
    }
}
