package com.spotify.music.features.playlistentity.viewbinder;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.w;
import com.spotify.android.glue.patterns.toolbarmenu.d0;
import com.spotify.music.features.playlistentity.o;
import com.spotify.music.features.playlistentity.viewbinder.h0;
import com.spotify.music.features.playlistentity.viewbinder.l0;
import com.spotify.music.features.playlistentity.viewbinder.o0;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.s0;
import com.spotify.pageloader.t0;
import com.spotify.pageloader.w0;
import com.spotify.remoteconfig.h6;
import defpackage.as6;

public class MasterViewBinder {
    private final f0 a;
    private final wr6 b;
    private final q0 c;
    private final t0<as6> d;
    private final PageLoaderView.a<as6> e;
    private PageLoaderView<as6> f;

    public MasterViewBinder(wr6 wr6, f0 f0Var, q0 q0Var, String str, zac zac, o oVar, h6 h6Var, o0.a aVar, h0.a aVar2, l0.a aVar3, w0 w0Var) {
        this.a = f0Var;
        this.b = wr6;
        this.c = q0Var;
        this.d = zac.a(q0Var.g());
        PageLoaderView.a<as6> b2 = zac.b(oVar.getViewUri(), ij9.c(new y(oVar)));
        b2.e(new d(this));
        b2.b(new c(aVar, aVar2, aVar3));
        this.e = b2;
        if (h6Var.b()) {
            b2.i(new e(w0Var));
        }
    }

    public d0 f() {
        q0 q0Var = this.c;
        q0Var.getClass();
        return new r0(q0Var);
    }

    public s0 g(as6 as6) {
        as6.getClass();
        if (as6 instanceof as6.a) {
            return this.c.f((as6.a) as6);
        }
        throw new IllegalArgumentException("Loaded state for Result " + as6 + " is not supported.");
    }

    public View h(Context context, final n nVar) {
        nVar.A().a(new m() {
            /* class com.spotify.music.features.playlistentity.viewbinder.MasterViewBinder.AnonymousClass1 */

            @w(Lifecycle.Event.ON_DESTROY)
            public void onDestroy() {
                MasterViewBinder.this.a.b();
            }

            @w(Lifecycle.Event.ON_PAUSE)
            public void onPause() {
                MasterViewBinder.this.d.stop();
            }

            @w(Lifecycle.Event.ON_RESUME)
            public void onResume() {
                MasterViewBinder.this.f.j0(nVar, MasterViewBinder.this.d);
                MasterViewBinder.this.d.start();
            }

            @w(Lifecycle.Event.ON_START)
            public void onStart() {
                MasterViewBinder.this.a.e(MasterViewBinder.this.c.i(), MasterViewBinder.this.c.h());
            }

            @w(Lifecycle.Event.ON_STOP)
            public void onStop() {
                MasterViewBinder.this.a.f(MasterViewBinder.this.c.i());
                MasterViewBinder.this.b.f();
            }
        });
        PageLoaderView<as6> a2 = this.e.a(context);
        this.f = a2;
        return a2;
    }

    public void i(Bundle bundle) {
        this.a.c(this.c.i(), bundle);
        this.c.p(bundle);
        this.b.d(bundle);
    }

    public void j(Bundle bundle) {
        this.a.d(this.c.i(), bundle);
        this.c.q(bundle);
        this.b.e(bundle);
    }

    public void k(y0 y0Var) {
        this.c.s(y0Var);
    }
}
