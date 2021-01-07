package com.spotify.music.homecomponents.promotionv2;

import android.view.View;

public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ h a;
    public final /* synthetic */ s81 b;
    public final /* synthetic */ View c;

    public /* synthetic */ b(h hVar, s81 s81, View view) {
        this.a = hVar;
        this.b = s81;
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.g(this.b, this.c);
    }
}
