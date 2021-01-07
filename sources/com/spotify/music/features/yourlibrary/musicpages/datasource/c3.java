package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import java.util.regex.Pattern;

public final /* synthetic */ class c3 implements n4 {
    public static final /* synthetic */ c3 a = new c3();

    private /* synthetic */ c3() {
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.n4
    public final boolean a(x3 x3Var, MusicItem musicItem) {
        String e = x3Var.c().e();
        return e.isEmpty() || Pattern.compile(Pattern.quote(e), 66).matcher(musicItem.w()).find();
    }
}
