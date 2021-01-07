package com.spotify.music.features.yourlibrary.musicpages.prefs.domain;

import com.google.common.base.Predicate;
import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.k;

public final /* synthetic */ class b implements Predicate {
    public final /* synthetic */ k.c a;

    public /* synthetic */ b(k.c cVar) {
        this.a = cVar;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        k.c cVar = this.a;
        PagePrefs pagePrefs = (PagePrefs) obj;
        pagePrefs.getClass();
        return !pagePrefs.uri().equals(cVar.h());
    }
}
