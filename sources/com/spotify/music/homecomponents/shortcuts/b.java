package com.spotify.music.homecomponents.shortcuts;

import android.view.View;

public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ HomeShortcutsItemComponent a;
    public final /* synthetic */ View b;
    public final /* synthetic */ s81 c;

    public /* synthetic */ b(HomeShortcutsItemComponent homeShortcutsItemComponent, View view, s81 s81) {
        this.a = homeShortcutsItemComponent;
        this.b = view;
        this.c = s81;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.b, this.c);
    }
}
