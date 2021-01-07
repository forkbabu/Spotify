package com.spotify.music.features.yourlibrary.musicpages.prefs.domain;

import com.google.common.base.Function;
import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PagePrefs;

public final /* synthetic */ class a implements Function {
    public final /* synthetic */ String a;
    public final /* synthetic */ Long b;

    public /* synthetic */ a(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        String str = this.a;
        Long l = this.b;
        PagePrefs pagePrefs = (PagePrefs) obj;
        pagePrefs.getClass();
        if (!pagePrefs.uri().equals(str)) {
            return pagePrefs;
        }
        PagePrefs.a builder = pagePrefs.toBuilder();
        builder.e(l);
        return builder.b();
    }
}
