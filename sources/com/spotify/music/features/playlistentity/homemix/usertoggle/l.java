package com.spotify.music.features.playlistentity.homemix.usertoggle;

import com.spotify.mobile.android.util.ui.k;
import com.spotify.music.features.playlistentity.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.playlist.endpoints.d;
import com.spotify.playlist.endpoints.i;

public final class l {
    private final wlf<d> a;
    private final wlf<i> b;
    private final wlf<HomeMixFormatListAttributesHelper> c;
    private final wlf<wb6> d;
    private final wlf<String> e;
    private final wlf<com.spotify.music.connection.l> f;
    private final wlf<k> g;

    public l(wlf<d> wlf, wlf<i> wlf2, wlf<HomeMixFormatListAttributesHelper> wlf3, wlf<wb6> wlf4, wlf<String> wlf5, wlf<com.spotify.music.connection.l> wlf6, wlf<k> wlf7) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
        a(wlf4, 4);
        this.d = wlf4;
        a(wlf5, 5);
        this.e = wlf5;
        a(wlf6, 6);
        this.f = wlf6;
        a(wlf7, 7);
        this.g = wlf7;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public k b(u uVar, me6 me6) {
        d dVar = this.a.get();
        a(dVar, 1);
        d dVar2 = dVar;
        i iVar = this.b.get();
        a(iVar, 2);
        i iVar2 = iVar;
        HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper = this.c.get();
        a(homeMixFormatListAttributesHelper, 3);
        HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper2 = homeMixFormatListAttributesHelper;
        wb6 wb6 = this.d.get();
        a(wb6, 4);
        wb6 wb62 = wb6;
        String str = this.e.get();
        a(str, 5);
        String str2 = str;
        com.spotify.music.connection.l lVar = this.f.get();
        a(lVar, 6);
        com.spotify.music.connection.l lVar2 = lVar;
        k kVar = this.g.get();
        a(kVar, 7);
        a(uVar, 8);
        a(me6, 9);
        return new k(dVar2, iVar2, homeMixFormatListAttributesHelper2, wb62, str2, lVar2, kVar, uVar, me6);
    }
}
