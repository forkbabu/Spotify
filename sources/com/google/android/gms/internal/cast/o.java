package com.google.android.gms.internal.cast;

import android.os.Bundle;
import android.os.Looper;
import android.support.v4.media.session.MediaSessionCompat;
import defpackage.n6;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class o extends k {
    private final n6 a;
    private final Map<m6, Set<n6.a>> b = new HashMap();

    public o(n6 n6Var) {
        this.a = n6Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: G3 */
    public final void I3(m6 m6Var) {
        for (n6.a aVar : this.b.get(m6Var)) {
            this.a.k(aVar);
        }
    }

    private final void H3(m6 m6Var, int i) {
        for (n6.a aVar : this.b.get(m6Var)) {
            this.a.a(m6Var, aVar, i);
        }
    }

    public final void D3(MediaSessionCompat mediaSessionCompat) {
        this.a.n(mediaSessionCompat);
    }

    public final void E3(Bundle bundle, int i) {
        m6 c = m6.c(bundle);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            H3(c, i);
        } else {
            new o0(Looper.getMainLooper()).post(new r(this, c, i));
        }
    }

    public final void F3(Bundle bundle, n nVar) {
        m6 c = m6.c(bundle);
        if (!this.b.containsKey(c)) {
            this.b.put(c, new HashSet());
        }
        this.b.get(c).add(new p(nVar));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void J3(m6 m6Var, int i) {
        synchronized (this.b) {
            H3(m6Var, i);
        }
    }

    public final boolean K3(Bundle bundle, int i) {
        return this.a.j(m6.c(bundle), i);
    }

    public final void L3() {
        n6 n6Var = this.a;
        n6Var.m(n6Var.e());
    }

    public final boolean M3() {
        return this.a.i().i().equals(this.a.e().i());
    }

    public final String N3() {
        return this.a.i().i();
    }

    public final void O3() {
        for (Set<n6.a> set : this.b.values()) {
            for (n6.a aVar : set) {
                this.a.k(aVar);
            }
        }
        this.b.clear();
    }

    public final void P3(Bundle bundle) {
        m6 c = m6.c(bundle);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            I3(c);
        } else {
            new o0(Looper.getMainLooper()).post(new q(this, c));
        }
    }

    public final void Q3(String str) {
        for (n6.f fVar : this.a.h()) {
            if (fVar.i().equals(str)) {
                this.a.m(fVar);
                return;
            }
        }
    }

    public final Bundle R3(String str) {
        for (n6.f fVar : this.a.h()) {
            if (fVar.i().equals(str)) {
                return fVar.g();
            }
        }
        return null;
    }
}
