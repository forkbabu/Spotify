package com.spotify.music.builtinauth.cache;

import android.database.Cursor;
import androidx.room.EmptyResultSetException;
import androidx.room.j;
import java.util.concurrent.Callable;

class h0 implements Callable<b0> {
    final /* synthetic */ j a;
    final /* synthetic */ d0 b;

    h0(d0 d0Var, j jVar) {
        this.b = d0Var;
        this.a = jVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public b0 call() {
        b0 b0Var = null;
        Cursor b2 = l7.b(this.b.a, this.a, false, null);
        try {
            int d = h7.d(b2, "client_id");
            int d2 = h7.d(b2, "redirect_uri");
            int d3 = h7.d(b2, "scopes");
            int d4 = h7.d(b2, "timestamp");
            int d5 = h7.d(b2, "package_name");
            int d6 = h7.d(b2, "app_signature");
            int d7 = h7.d(b2, "last_used_timestamp");
            if (b2.moveToFirst()) {
                b0Var = new b0(b2.getString(d), b2.getString(d2), b2.getString(d3), b2.getLong(d4), b2.getString(d5), b2.getString(d6), b2.getLong(d7));
            }
            if (b0Var != null) {
                return b0Var;
            }
            throw new EmptyResultSetException("Query returned empty result set: " + this.a.a());
        } finally {
            b2.close();
        }
    }

    /* access modifiers changed from: protected */
    @Override // java.lang.Object
    public void finalize() {
        this.a.f();
    }
}
