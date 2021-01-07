package com.spotify.mobius.android;

import android.util.Log;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.e0;
import com.spotify.mobius.s;

public class e<M, E, F> implements MobiusLoop.i<M, E, F> {
    private final String a;

    public e(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // com.spotify.mobius.MobiusLoop.i
    public void a(M m, E e, e0<M, F> e0Var) {
        if (e0Var.c()) {
            StringBuilder V0 = je.V0("Model updated: ");
            V0.append((Object) e0Var.e());
            V0.toString();
        }
        for (F f : e0Var.b()) {
            String str = "Effect dispatched: " + ((Object) f);
        }
    }

    @Override // com.spotify.mobius.MobiusLoop.i
    public void b(M m, E e, Throwable th) {
        Log.e(this.a, String.format("FATAL ERROR: exception updating model '%s' with event '%s'", m, e), th);
    }

    @Override // com.spotify.mobius.MobiusLoop.i
    public void c(M m, s<M, F> sVar) {
        StringBuilder V0 = je.V0("Loop initialized, starting from model: ");
        V0.append((Object) sVar.d());
        V0.toString();
        for (F f : sVar.a()) {
            String str = "Effect dispatched: " + ((Object) f);
        }
    }

    @Override // com.spotify.mobius.MobiusLoop.i
    public void d(M m, Throwable th) {
        String str = this.a;
        Log.e(str, "FATAL ERROR: exception during initialization from model '" + ((Object) m) + "'", th);
    }

    @Override // com.spotify.mobius.MobiusLoop.i
    public void e(M m, E e) {
        String str = "Event received: " + ((Object) e);
    }

    @Override // com.spotify.mobius.MobiusLoop.i
    public void f(M m) {
    }
}
