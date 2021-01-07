package com.spotify.mobius;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ x a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a(x xVar, Object obj) {
        this.a = xVar;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b(this.b);
    }
}
