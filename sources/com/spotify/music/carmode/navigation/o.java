package com.spotify.music.carmode.navigation;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.common.base.Optional;
import com.spotify.music.libs.carmodeengine.util.y;
import defpackage.d7a;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.s;
import java.util.concurrent.TimeUnit;

public class o implements ahb, wgb {
    private final vgb a;
    private final y b;
    private final io.reactivex.y c;
    private final io.reactivex.y f;
    private final s<u3<d7a, Boolean>> n;
    private b o = EmptyDisposable.INSTANCE;
    private d7a p;
    private boolean q;

    public o(vgb vgb, s<d7a> sVar, io.reactivex.y yVar, io.reactivex.y yVar2, y yVar3) {
        this.a = vgb;
        this.c = yVar;
        this.f = yVar2;
        this.b = yVar3;
        this.n = s.n(sVar, yVar3.d(), m.a);
    }

    @Override // defpackage.ahb
    public void a() {
        if (this.p == null) {
            u3<d7a, Boolean> d = this.n.U0(500, TimeUnit.MILLISECONDS, this.f, s.i0(new u3(d7a.b(), Boolean.FALSE))).d();
            this.p = d.a;
            this.q = d.b.booleanValue();
        }
        this.o = this.n.o0(this.c).subscribe(new d(this));
    }

    @Override // defpackage.wgb
    public Optional<Fragment> b() {
        boolean z = false;
        if (this.p != null && (this.q || this.b.h())) {
            d7a d7a = this.p;
            d7a.getClass();
            if (d7a instanceof d7a.a) {
                z = true;
            }
        }
        if (z) {
            return Optional.of(new CarModeNavigationFragment());
        }
        return Optional.absent();
    }

    @Override // defpackage.ahb
    public void c() {
    }

    public /* synthetic */ void d(u3 u3Var) {
        this.p = u3Var.a;
        this.q = u3Var.b.booleanValue();
        this.a.m0();
    }

    @Override // defpackage.ahb
    public void e() {
        this.o.dispose();
    }

    @Override // defpackage.ahb
    public void f(ViewGroup viewGroup) {
    }
}
