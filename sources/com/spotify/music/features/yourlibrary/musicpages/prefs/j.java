package com.spotify.music.features.yourlibrary.musicpages.prefs;

import com.google.common.base.Optional;
import com.google.common.collect.Collections2;
import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PagePrefs;
import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PrefsModel;
import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.m;
import io.reactivex.functions.l;

public final /* synthetic */ class j implements l {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;

    public /* synthetic */ j(String str, long j) {
        this.a = str;
        this.b = j;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        String str = this.a;
        long j = this.b;
        int i = MusicPagesPrefs.u;
        PrefsModel orNull = ((m) obj).d().orNull();
        orNull.getClass();
        Optional tryFind = Collections2.tryFind(orNull.pagePrefs(), new m(str));
        PagePrefs.a builderWithDefault = PagePrefs.builderWithDefault();
        builderWithDefault.f(str);
        builderWithDefault.e(Long.valueOf(j));
        return (PagePrefs) tryFind.or((Optional) builderWithDefault.b());
    }
}
