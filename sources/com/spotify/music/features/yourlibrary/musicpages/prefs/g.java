package com.spotify.music.features.yourlibrary.musicpages.prefs;

import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PagePrefs;
import io.reactivex.functions.d;

public final /* synthetic */ class g implements d {
    public static final /* synthetic */ g a = new g();

    private /* synthetic */ g() {
    }

    @Override // io.reactivex.functions.d
    public final boolean a(Object obj, Object obj2) {
        PagePrefs pagePrefs = (PagePrefs) obj;
        int i = MusicPagesPrefs.u;
        PagePrefs.a builder = ((PagePrefs) obj2).toBuilder();
        builder.e(pagePrefs.timestamp());
        return pagePrefs.equals(builder.b());
    }
}
