package com.spotify.music.homecomponents.shortcuts;

import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ k a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ a(k kVar, boolean z) {
        this.a = kVar;
        this.b = z;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        k kVar = this.a;
        boolean z = this.b;
        Throwable th = (Throwable) obj;
        int i = HomeShortcutsItemComponent.s;
        kVar.J1();
        if (z) {
            kVar.N0();
        }
    }
}
