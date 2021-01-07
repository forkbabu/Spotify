package com.spotify.magiclink.setpassword;

import java.util.concurrent.atomic.AtomicBoolean;

public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ o a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ da2 c;

    public /* synthetic */ b(o oVar, AtomicBoolean atomicBoolean, da2 da2) {
        this.a = oVar;
        this.b = atomicBoolean;
        this.c = da2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b(this.b, this.c);
    }
}
