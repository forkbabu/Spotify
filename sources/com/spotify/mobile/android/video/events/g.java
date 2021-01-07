package com.spotify.mobile.android.video.events;

import com.spotify.mobile.android.video.v;

public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ e0 a;
    public final /* synthetic */ v b;
    public final /* synthetic */ ReasonEnd c;
    public final /* synthetic */ long f;
    public final /* synthetic */ long n;
    public final /* synthetic */ v.b o;

    public /* synthetic */ g(e0 e0Var, v vVar, ReasonEnd reasonEnd, long j, long j2, v.b bVar) {
        this.a = e0Var;
        this.b = vVar;
        this.c = reasonEnd;
        this.f = j;
        this.n = j2;
        this.o = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e0 e0Var = this.a;
        v vVar = this.b;
        ReasonEnd reasonEnd = this.c;
        long j = this.f;
        long j2 = this.n;
        v.b bVar = this.o;
        try {
            e0Var.p(vVar, reasonEnd, j, j2);
        } finally {
            bVar.a();
        }
    }
}
