package com.spotify.music.features.nowplayingbar.view;

import com.spotify.mobius.h;

/* access modifiers changed from: package-private */
public class s0 implements h<lu5> {
    final /* synthetic */ v0 a;

    s0(v0 v0Var) {
        this.a = v0Var;
    }

    @Override // com.spotify.mobius.h, defpackage.da2
    public void accept(Object obj) {
        ((lu5) obj).b(new k(this), new j(this));
    }

    @Override // com.spotify.mobius.h, defpackage.w92
    public void dispose() {
        this.a.b.setOnClickListener(null);
        this.a.t.g0(null);
        this.a.c.setOnClickListener(null);
        this.a.f.setOnClickListener(null);
        this.a.o.setOnClickListener(null);
        this.a.r.setOnClickListener(null);
        this.a.w.e();
        this.a.s.D0(this.a.u);
        this.a.n.k(this.a.f);
    }
}
