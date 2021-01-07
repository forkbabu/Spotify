package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.exoplayer2.util.g;

public final class r4 {
    private final String a;
    private final long b;
    private boolean c;
    private long d;
    private final /* synthetic */ n4 e;

    public r4(n4 n4Var, String str, long j) {
        this.e = n4Var;
        g.i(str);
        this.a = str;
        this.b = j;
    }

    public final long a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.x().getLong(this.a, this.b);
        }
        return this.d;
    }

    public final void b(long j) {
        SharedPreferences.Editor edit = this.e.x().edit();
        edit.putLong(this.a, j);
        edit.apply();
        this.d = j;
    }
}
