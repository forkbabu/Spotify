package com.spotify.mobile.android.util.prefs;

import android.content.Context;

public final /* synthetic */ class e implements wlf {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;

    public /* synthetic */ e(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    @Override // defpackage.wlf
    public final Object get() {
        return this.a.getSharedPreferences(this.b, 0);
    }
}
