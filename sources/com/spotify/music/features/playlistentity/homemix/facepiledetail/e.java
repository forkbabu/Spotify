package com.spotify.music.features.playlistentity.homemix.facepiledetail;

import com.spotify.mobile.android.util.ui.k;
import com.spotify.music.features.playlistentity.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.playlist.endpoints.d;

public final class e {
    private final wlf<d> a;
    private final wlf<HomeMixFormatListAttributesHelper> b;
    private final wlf<k> c;

    public e(wlf<d> wlf, wlf<HomeMixFormatListAttributesHelper> wlf2, wlf<k> wlf3) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public d b(String str, String str2, l lVar, ke6 ke6) {
        d dVar = this.a.get();
        a(dVar, 1);
        d dVar2 = dVar;
        HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper = this.b.get();
        a(homeMixFormatListAttributesHelper, 2);
        HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper2 = homeMixFormatListAttributesHelper;
        k kVar = this.c.get();
        a(kVar, 3);
        a(str, 4);
        a(str2, 5);
        a(lVar, 6);
        a(ke6, 7);
        return new d(dVar2, homeMixFormatListAttributesHelper2, kVar, str, str2, lVar, ke6);
    }
}
