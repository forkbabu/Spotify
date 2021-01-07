package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.common.util.d;

public final class q4 {
    private final String a;
    private final String b;
    private final String c;
    private final long d;
    private final /* synthetic */ n4 e;

    q4(n4 n4Var, String str, long j, m4 m4Var) {
        this.e = n4Var;
        g.i(str);
        g.c(j > 0);
        this.a = str.concat(":start");
        this.b = str.concat(":count");
        this.c = str.concat(":value");
        this.d = j;
    }

    private final void c() {
        this.e.b();
        ((d) this.e.d()).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = this.e.x().edit();
        edit.remove(this.b);
        edit.remove(this.c);
        edit.putLong(this.a, currentTimeMillis);
        edit.apply();
    }

    public final Pair<String, Long> a() {
        long j;
        this.e.b();
        this.e.b();
        long j2 = this.e.x().getLong(this.a, 0);
        if (j2 == 0) {
            c();
            j = 0;
        } else {
            ((d) this.e.d()).getClass();
            j = Math.abs(j2 - System.currentTimeMillis());
        }
        long j3 = this.d;
        if (j < j3) {
            return null;
        }
        if (j > (j3 << 1)) {
            c();
            return null;
        }
        String string = this.e.x().getString(this.c, null);
        long j4 = this.e.x().getLong(this.b, 0);
        c();
        if (string == null || j4 <= 0) {
            return n4.D;
        }
        return new Pair<>(string, Long.valueOf(j4));
    }

    public final void b(String str) {
        this.e.b();
        if (this.e.x().getLong(this.a, 0) == 0) {
            c();
        }
        if (str == null) {
            str = "";
        }
        long j = this.e.x().getLong(this.b, 0);
        if (j <= 0) {
            SharedPreferences.Editor edit = this.e.x().edit();
            edit.putString(this.c, str);
            edit.putLong(this.b, 1);
            edit.apply();
            return;
        }
        long j2 = j + 1;
        boolean z = (this.e.f().B0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j2;
        SharedPreferences.Editor edit2 = this.e.x().edit();
        if (z) {
            edit2.putString(this.c, str);
        }
        edit2.putLong(this.b, j2);
        edit2.apply();
    }
}
