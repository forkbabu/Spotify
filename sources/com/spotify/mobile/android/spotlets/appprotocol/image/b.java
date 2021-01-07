package com.spotify.mobile.android.spotlets.appprotocol.image;

import com.spotify.mobile.android.spotlets.appprotocol.image.c;

public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ c a;
    public final /* synthetic */ c.b b;

    public /* synthetic */ b(c cVar, c.b bVar) {
        this.a = cVar;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.e(this.b);
    }
}
