package com.spotify.music.features.playlistentity.datasource.sorting;

import com.google.common.base.Predicate;

public final /* synthetic */ class a implements Predicate {
    public final /* synthetic */ String a;

    public /* synthetic */ a(String str) {
        this.a = str;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        ane ane = (ane) obj;
        return ane != null && this.a.equals(ane.c());
    }
}
