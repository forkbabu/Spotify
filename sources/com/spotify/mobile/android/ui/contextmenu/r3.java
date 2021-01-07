package com.spotify.mobile.android.ui.contextmenu;

import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.music.connection.g;
import io.reactivex.functions.l;
import io.reactivex.s;

public final class r3 {
    public static final r3 b;
    public static final jvd<Integer> c = jvd.b(0);
    private final w3<?> a;

    static {
        y3<Void> y3Var = y3.h;
        int i = z3.a;
        b = new r3(new w3(y3Var, m3.b, x3.a));
    }

    private r3(w3<?> w3Var) {
        this.a = w3Var;
    }

    public static <T> r3 a(y3<T> y3Var, z3<T> z3Var, x3<T> x3Var) {
        return new r3(new w3(y3Var, z3Var, x3Var));
    }

    public static r3 f(x3<Void> x3Var) {
        y3<Void> y3Var = y3.h;
        int i = z3.a;
        return new r3(new w3(y3Var, m3.b, x3Var));
    }

    public s<ContextMenuViewModel> b(s<g> sVar) {
        return this.a.a(sVar);
    }

    public y3<?> c() {
        return this.a.b();
    }

    public ContextMenuViewModel d() {
        return this.a.c();
    }

    public r3 e(l<ContextMenuViewModel, ContextMenuViewModel> lVar) {
        this.a.d(lVar);
        return this;
    }
}
