package com.spotify.music.features.ads;

import com.spotify.music.features.ads.model.AdSlot;

public final /* synthetic */ class t implements AdSlot.b {
    public final /* synthetic */ n1 a;
    public final /* synthetic */ String b;

    public /* synthetic */ t(n1 n1Var, String str) {
        this.a = n1Var;
        this.b = str;
    }

    @Override // com.spotify.music.features.ads.model.AdSlot.b
    public final void i() {
        this.a.d(this.b);
    }
}
