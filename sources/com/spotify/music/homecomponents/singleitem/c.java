package com.spotify.music.homecomponents.singleitem;

import android.view.View;

public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ e a;
    public final /* synthetic */ s81 b;
    public final /* synthetic */ View c;

    public /* synthetic */ c(e eVar, s81 s81, View view) {
        this.a = eVar;
        this.b = s81;
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.b, this.c);
    }
}
