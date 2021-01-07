package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import com.google.android.datatransport.c;
import com.google.android.datatransport.e;
import com.google.android.gms.internal.cast.w3;
import java.util.UUID;

public final class p0 {
    private final e<w3> a;
    private final String b;
    private final int c;

    private p0(SharedPreferences sharedPreferences, e<w3> eVar, long j) {
        this.a = eVar;
        String string = sharedPreferences.getString("client_sender_id", null);
        if (string == null) {
            string = UUID.randomUUID().toString();
            sharedPreferences.edit().putString("client_sender_id", string).apply();
        }
        this.b = string;
        this.c = j == 0 ? 1 : 2;
    }

    public static p0 a(SharedPreferences sharedPreferences, e<w3> eVar, long j) {
        return new p0(sharedPreferences, eVar, j);
    }

    public final void b(w3 w3Var, zzia zzia) {
        w3.a n = w3.n(w3Var);
        String str = this.b;
        if (n.c) {
            n.k();
            n.c = false;
        }
        w3.t((w3) n.b, str);
        w3 w3Var2 = (w3) ((r5) n.n());
        c<w3> cVar = null;
        int i = g1.a[this.c - 1];
        if (i == 1) {
            cVar = c.e(zzia.j(), w3Var2);
        } else if (i == 2) {
            cVar = c.d(zzia.j(), w3Var2);
        }
        this.a.b(cVar);
    }
}
