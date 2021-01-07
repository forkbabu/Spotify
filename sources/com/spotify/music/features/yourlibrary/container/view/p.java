package com.spotify.music.features.yourlibrary.container.view;

import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;

public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ x a;
    public final /* synthetic */ YourLibraryPageId b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean f;

    public /* synthetic */ p(x xVar, YourLibraryPageId yourLibraryPageId, boolean z, boolean z2) {
        this.a = xVar;
        this.b = yourLibraryPageId;
        this.c = z;
        this.f = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.p(this.b, this.c, this.f);
    }
}
