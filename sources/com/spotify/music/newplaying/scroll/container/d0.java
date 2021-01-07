package com.spotify.music.newplaying.scroll.container;

import com.coremedia.iso.boxes.FreeSpaceBox;
import com.google.common.collect.ImmutableList;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.newplaying.scroll.NowPlayingWidget;
import io.reactivex.disposables.a;
import io.reactivex.g;
import io.reactivex.internal.operators.flowable.FlowableBuffer;
import io.reactivex.internal.util.ArrayListSupplier;
import io.reactivex.y;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class d0 {
    private final g<ImmutableList<NowPlayingWidget>> a;
    private final g0 b;
    private final y c;
    private final y d;
    private final List<NowPlayingWidget> e = new LinkedList();
    private final a f = new a();
    private f0 g;

    public d0(g<ImmutableList<NowPlayingWidget>> gVar, g0 g0Var, y yVar, y yVar2) {
        this.a = gVar;
        this.b = g0Var;
        this.c = yVar;
        this.d = yVar2;
    }

    public static void c(d0 d0Var, Throwable th) {
        d0Var.getClass();
        Logger.d("Error observing NPV widgets: %s", th.toString());
        d0Var.h();
        d0Var.e.clear();
        d0Var.g.a();
    }

    private void h() {
        for (NowPlayingWidget nowPlayingWidget : this.e) {
            nowPlayingWidget.onStop();
        }
    }

    public /* synthetic */ void d(ImmutableList immutableList) {
        this.b.n();
    }

    public void e(a0 a0Var) {
        int b2 = a0Var.b();
        NowPlayingWidget.Type c2 = a0Var.c();
        this.b.g(c2.toString(), b2);
        for (NowPlayingWidget nowPlayingWidget : this.e) {
            if (nowPlayingWidget.type() == c2) {
                nowPlayingWidget.b();
                return;
            }
        }
    }

    public void f(f0 f0Var) {
        f0Var.getClass();
        this.g = f0Var;
        for (NowPlayingWidget nowPlayingWidget : this.e) {
            nowPlayingWidget.onStart();
        }
        a aVar = this.f;
        g<ImmutableList<NowPlayingWidget>> b0 = this.a.s().b0(ImmutableList.copyOf((Collection) this.e));
        b0.getClass();
        ArrayListSupplier arrayListSupplier = ArrayListSupplier.INSTANCE;
        io.reactivex.internal.functions.a.d(2, "count");
        io.reactivex.internal.functions.a.d(1, FreeSpaceBox.TYPE);
        aVar.b(new FlowableBuffer(b0, 2, 1, arrayListSupplier).O(m.a).Q(this.d).subscribe(new s(this), new o(this)));
        this.f.b(this.a.r(1, TimeUnit.SECONDS, this.c, false).C(n.a).A(new q(this)).f0(new p(this.g.d(1.0f))).subscribe(new r(this), l.a));
    }

    public void g() {
        this.f.f();
        h();
    }
}
