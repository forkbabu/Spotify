package com.spotify.music.offlinetrials.limited.trackentity;

import com.google.common.collect.ImmutableBiMap;
import com.spotify.music.offlinetrials.limited.uicomponents.u;

public final /* synthetic */ class c implements u.b {
    public final /* synthetic */ w51 a;
    public final /* synthetic */ s81 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ c(w51 w51, s81 s81, boolean z) {
        this.a = w51;
        this.b = s81;
        this.c = z;
    }

    @Override // com.spotify.music.offlinetrials.limited.uicomponents.u.b
    public final void a() {
        this.a.b().a(n61.c("click", this.b, ImmutableBiMap.of("download", Boolean.valueOf(this.c))));
    }
}
