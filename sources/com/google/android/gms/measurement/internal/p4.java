package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.exoplayer2.util.g;

public final class p4 {
    private final String a;
    private final boolean b;
    private boolean c;
    private boolean d;
    private final /* synthetic */ n4 e;

    public p4(n4 n4Var, String str, boolean z) {
        this.e = n4Var;
        g.i(str);
        this.a = str;
        this.b = z;
    }

    public final void a(boolean z) {
        SharedPreferences.Editor edit = this.e.x().edit();
        edit.putBoolean(this.a, z);
        edit.apply();
        this.d = z;
    }

    public final boolean b() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.x().getBoolean(this.a, this.b);
        }
        return this.d;
    }
}
