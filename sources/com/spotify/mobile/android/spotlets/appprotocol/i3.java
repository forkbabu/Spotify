package com.spotify.mobile.android.spotlets.appprotocol;

public final /* synthetic */ class i3 implements Runnable {
    public final /* synthetic */ i4 a;
    public final /* synthetic */ byte[] b;

    public /* synthetic */ i3(i4 i4Var, byte[] bArr) {
        this.a = i4Var;
        this.b = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.n(this.b);
    }
}
