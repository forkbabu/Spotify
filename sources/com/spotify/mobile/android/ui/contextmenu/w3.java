package com.spotify.mobile.android.ui.contextmenu;

import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.music.connection.g;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.observable.o;
import io.reactivex.s;
import io.reactivex.schedulers.a;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public class w3<T> {
    public static final /* synthetic */ int e = 0;
    private final y3<T> a;
    private final z3<T> b;
    private final x3<T> c;
    private l<ContextMenuViewModel, ContextMenuViewModel> d = j3.a;

    static {
        y3<Void> y3Var = y3.h;
        int i = z3.a;
        m3 m3Var = m3.b;
    }

    w3(y3<T> y3Var, z3<T> z3Var, x3<T> x3Var) {
        this.a = y3Var;
        this.b = z3Var;
        this.c = x3Var;
    }

    /* access modifiers changed from: package-private */
    public s<ContextMenuViewModel> a(s<g> sVar) {
        s<Object> sVar2;
        s<y3<T>> sVar3;
        if (this.a.m()) {
            sVar2 = o.a;
        } else {
            ContextMenuViewModel c2 = this.c.c(this.a);
            c2.A(true);
            sVar2 = s.i0(c2);
        }
        if (this.a.m()) {
            sVar3 = s.i0(this.a);
        } else {
            sVar3 = this.b.a(this.a);
        }
        x3<T> x3Var = this.c;
        x3Var.getClass();
        s r = s.r(sVar3.j0(new k3(x3Var)));
        s<R> j0 = sVar.j0(n3.a);
        x3<T> x3Var2 = this.c;
        x3Var2.getClass();
        return s.s(sVar2, s.n(r, j0, new l3(x3Var2)).j0(this.d).D((long) r3.c.a().intValue(), TimeUnit.MILLISECONDS, a.a(), false).N(i3.a));
    }

    public y3<T> b() {
        return this.a;
    }

    public ContextMenuViewModel c() {
        return this.c.c(this.a);
    }

    /* access modifiers changed from: package-private */
    public w3<T> d(l<ContextMenuViewModel, ContextMenuViewModel> lVar) {
        lVar.getClass();
        this.d = lVar;
        return this;
    }
}
