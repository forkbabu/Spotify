package com.spotify.music.features.album.di;

import android.content.Context;
import com.spotify.android.flags.c;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.music.features.album.AlbumFragment;
import defpackage.of3;

public final class t implements fjf<of3> {
    private final wlf<Context> a;
    private final wlf<c> b;
    private final wlf<Boolean> c;
    private final wlf<AlbumFragment> d;

    public t(wlf<Context> wlf, wlf<c> wlf2, wlf<Boolean> wlf3, wlf<AlbumFragment> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        this.b.get();
        boolean booleanValue = this.c.get().booleanValue();
        of3.a a2 = of3.a();
        this.d.get().getClass();
        a2.a(this.a.get().getString(C0707R.string.album_title_default));
        a2.f(SpotifyIconV2.ALBUM);
        a2.h(true);
        a2.d(booleanValue);
        a2.j(booleanValue);
        a2.b(booleanValue);
        a2.l(booleanValue);
        a2.k(true);
        return a2.build();
    }
}
