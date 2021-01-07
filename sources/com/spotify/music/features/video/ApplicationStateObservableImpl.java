package com.spotify.music.features.video;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.n;
import java.util.Collections;
import java.util.Set;

public class ApplicationStateObservableImpl implements q72, e {
    private final Lifecycle a;
    private final Set<r72> b = Collections.newSetFromMap(gf0.b());

    public ApplicationStateObservableImpl(Lifecycle lifecycle) {
        this.a = lifecycle;
        lifecycle.a(this);
    }

    @Override // androidx.lifecycle.g
    public void V(n nVar) {
        for (r72 r72 : this.b) {
            r72.S();
        }
    }

    @Override // defpackage.q72
    public boolean a() {
        return !(this.a.b().compareTo(Lifecycle.State.RESUMED) >= 0);
    }

    @Override // androidx.lifecycle.g
    public void a0(n nVar) {
        for (r72 r72 : this.b) {
            r72.Z();
        }
    }

    @Override // defpackage.q72
    public void b(r72 r72) {
        this.b.remove(r72);
    }

    @Override // defpackage.q72
    public void c(r72 r72) {
        this.b.add(r72);
    }

    @Override // androidx.lifecycle.g
    public /* synthetic */ void d0(n nVar) {
        d.f(this, nVar);
    }

    @Override // androidx.lifecycle.g
    public /* synthetic */ void h0(n nVar) {
        d.b(this, nVar);
    }

    @Override // androidx.lifecycle.g
    public /* synthetic */ void n(n nVar) {
        d.a(this, nVar);
    }

    @Override // androidx.lifecycle.g
    public /* synthetic */ void o0(n nVar) {
        d.e(this, nVar);
    }
}
