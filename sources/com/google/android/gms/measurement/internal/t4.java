package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.exoplayer2.util.g;

public final class t4 {
    private final String a;
    private boolean b;
    private String c;
    private final /* synthetic */ n4 d;

    public t4(n4 n4Var, String str) {
        this.d = n4Var;
        g.i(str);
        this.a = str;
    }

    public final String a() {
        if (!this.b) {
            this.b = true;
            this.c = this.d.x().getString(this.a, null);
        }
        return this.c;
    }

    public final void b(String str) {
        SharedPreferences.Editor edit = this.d.x().edit();
        edit.putString(this.a, str);
        edit.apply();
        this.c = str;
    }
}
