package com.spotify.music.features.yourlibrary.musicpages.pages;

import com.google.common.base.MoreObjects;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.features.yourlibrary.musicpages.datasource.v4;
import com.spotify.music.features.yourlibrary.musicpages.datasource.w3;

public class p {
    private final ImmutableMap<MusicPageId, Supplier<w3>> a;
    private final Supplier<w3> b;
    private final p69 c;
    private final q69 d;

    public p(v4 v4Var, p69 p69, q69 q69) {
        this.c = p69;
        this.d = q69;
        MusicPageId musicPageId = MusicPageId.PLAYLISTS;
        v4Var.getClass();
        this.a = ImmutableMap.of(musicPageId, MoreObjects.memoize(new m(v4Var)), MusicPageId.ALBUMS, MoreObjects.memoize(new d(v4Var)), MusicPageId.ARTISTS, MoreObjects.memoize(new l(v4Var)), MusicPageId.SONGS, MoreObjects.memoize(new c(v4Var)));
        this.b = MoreObjects.memoize(new b(this, v4Var));
    }

    public w3 a() {
        MusicPageId J1 = this.c.J1();
        Supplier<w3> supplier = this.a.get(J1);
        if (supplier != null) {
            return supplier.get();
        }
        if (J1 == MusicPageId.FOLDER) {
            return this.b.get();
        }
        throw new AssertionError("No data source for page id " + J1);
    }

    public /* synthetic */ w3 b(v4 v4Var) {
        return v4Var.f(this.d.x());
    }
}
