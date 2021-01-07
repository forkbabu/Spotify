package com.spotify.mobile.android.spotlets.appprotocol;

public final /* synthetic */ class h3 implements Runnable {
    public final /* synthetic */ i4 a;
    public final /* synthetic */ Object[] b;

    public /* synthetic */ h3(i4 i4Var, Object[] objArr) {
        this.a = i4Var;
        this.b = objArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.o(this.b);
    }
}
