package com.spotify.music.features.ads.audioplus.overlay;

import com.google.common.base.Predicate;

public final /* synthetic */ class a implements Predicate {
    public final /* synthetic */ String a;

    public /* synthetic */ a(String str) {
        this.a = str;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        return ((j) obj).name().equals(this.a);
    }
}
