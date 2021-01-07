package com.spotify.music.libs.connect.access;

import android.view.View;
import androidx.appcompat.app.g;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.w;
import com.google.common.base.Optional;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.music.C0707R;
import com.spotify.music.libs.connect.access.animation.logic.NudgeResolver;
import com.spotify.music.libs.connect.access.view.ConnectAccessButton;
import com.spotify.rxjava2.p;
import io.reactivex.disposables.a;
import io.reactivex.s;
import io.reactivex.y;
import java.util.HashSet;
import java.util.Set;

public class ConnectAccessViewModel implements m {
    private final o a;
    private final r b;
    private final qba c;
    private final hba f;
    private final mba n;
    private final y o;
    private final NudgeResolver p;
    private final s<Boolean> q;
    private final Set<Runnable> r;
    private boolean s;
    private final p t = new p();
    final a u = new a();
    o v;
    Optional<n> w = Optional.absent();
    Optional<paa> x = Optional.absent();
    int y = 0;

    public ConnectAccessViewModel(o oVar, r rVar, qba qba, hba hba, y yVar, mba mba, NudgeResolver nudgeResolver, s<Boolean> sVar) {
        this.a = oVar;
        this.b = rVar;
        this.c = qba;
        this.f = hba;
        this.o = yVar;
        this.n = mba;
        this.p = nudgeResolver;
        this.q = sVar;
        this.r = new HashSet(2);
    }

    private boolean d() {
        return this.a.a();
    }

    public void a(ConnectAccessButton connectAccessButton) {
        this.w = Optional.of(new n(connectAccessButton, this.b));
        this.x = Optional.of(new paa(connectAccessButton));
        l(0, null);
        l lVar = new l(this, connectAccessButton);
        if (d()) {
            lVar.run();
        } else {
            this.r.add(lVar);
        }
    }

    public void b(g gVar) {
        g gVar2 = new g(this, gVar);
        if (d()) {
            gVar2.run();
        } else {
            this.r.add(gVar2);
        }
        this.v = gVar.v0();
    }

    public void c(Runnable runnable) {
        if (d()) {
            runnable.run();
        }
    }

    public /* synthetic */ void e(ConnectAccessButton connectAccessButton) {
        connectAccessButton.setOnClickListener(new i(this));
        this.p.c(new k(this));
    }

    public /* synthetic */ void f(g gVar) {
        Lifecycle A = gVar.A();
        A.a(this);
        A.a(this.p);
    }

    public /* synthetic */ void g(String str, u3 u3Var) {
        this.n.c(str, u3Var.a, u3Var.b);
    }

    public void h(View view) {
        Fragment T = this.v.T(C0707R.id.content);
        if (T != null) {
            this.u.b(kca.b(T).o0(this.o).subscribe(new m(this, lba.a(this.y))));
        }
        this.c.a();
    }

    public /* synthetic */ void i() {
        if (this.x.isPresent() && 1 == this.y) {
            this.x.get().h();
            this.n.a();
        }
    }

    public void j(Boolean bool) {
        boolean z = true;
        if (bool.booleanValue()) {
            if (this.s) {
                int i = this.y;
                if (!(5 == i || 4 == i)) {
                    z = false;
                }
                if (z && this.x.isPresent()) {
                    this.x.get().f();
                }
            }
            this.s = false;
            return;
        }
        int i2 = this.y;
        if (5 == i2 || 4 == i2) {
            this.s = true;
        } else {
            this.s = false;
        }
    }

    public void k(Runnable runnable) {
        this.r.add(runnable);
    }

    public void l(int i, GaiaDevice gaiaDevice) {
        int i2;
        if (this.w.isPresent() && this.x.isPresent() && (i2 = this.y) != i) {
            if (i2 == 0) {
                this.n.b();
            }
            this.y = i;
            this.w.get().i(this.y, gaiaDevice == null ? null : gaiaDevice.getName());
            this.x.get().e(this.y);
        }
    }

    /* access modifiers changed from: package-private */
    @w(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        this.t.b(this.q.o0(this.o).subscribe(new h(this)));
    }

    /* access modifiers changed from: package-private */
    @w(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        this.t.a();
    }

    /* access modifiers changed from: package-private */
    @w(Lifecycle.Event.ON_START)
    public void onStart() {
        this.u.b(this.f.a().o0(this.o).subscribe(new j(this)));
    }

    /* access modifiers changed from: package-private */
    @w(Lifecycle.Event.ON_STOP)
    public void onStop() {
        this.u.f();
    }
}
