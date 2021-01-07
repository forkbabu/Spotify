package com.spotify.music.freetiercommon.uicomponents;

import android.view.View;

public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ b a;
    public final /* synthetic */ View b;

    public /* synthetic */ a(b bVar, View view) {
        this.a = bVar;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b(this.b);
    }
}
