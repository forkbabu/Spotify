package com.spotify.music.features.yourlibrary.musicpages.prefs;

import com.google.common.base.Predicate;
import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PagePrefs;

public final /* synthetic */ class m implements Predicate {
    public final /* synthetic */ String a;

    public /* synthetic */ m(String str) {
        this.a = str;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        String str = this.a;
        PagePrefs pagePrefs = (PagePrefs) obj;
        int i = MusicPagesPrefs.u;
        pagePrefs.getClass();
        return pagePrefs.uri().equals(str);
    }
}
