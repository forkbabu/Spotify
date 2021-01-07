package com.spotify.music.homecomponents.shortcuts;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.g;

public final /* synthetic */ class d implements g {
    public final /* synthetic */ String a;
    public final /* synthetic */ k b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ d(String str, k kVar, boolean z) {
        this.a = str;
        this.b = kVar;
        this.c = z;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        String str = this.a;
        k kVar = this.b;
        boolean z = this.c;
        int i = HomeShortcutsItemComponent.s;
        if (ar9.b((PlayerState) obj, str)) {
            kVar.X0();
        } else if (z) {
            kVar.N0();
        } else {
            kVar.J1();
        }
    }
}
