package com.spotify.mobile.android.spotlets.appprotocol.image;

import android.net.Uri;
import com.spotify.mobile.android.spotlets.appprotocol.image.c;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ c a;
    public final /* synthetic */ Uri b;
    public final /* synthetic */ c.b c;
    public final /* synthetic */ c.a f;

    public /* synthetic */ a(c cVar, Uri uri, c.b bVar, c.a aVar) {
        this.a = cVar;
        this.b = uri;
        this.c = bVar;
        this.f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.f(this.b, this.c, this.f);
    }
}
