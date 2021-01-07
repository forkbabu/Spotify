package com.spotify.music.features.playlistentity.homemix.tasteviz;

import com.spotify.mobile.android.util.ui.k;
import com.spotify.music.features.playlistentity.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.playlistentity.homemix.models.HomeMixTuning;
import com.spotify.playlist.endpoints.d;
import com.spotify.playlist.endpoints.i;
import java.util.EnumMap;

public final class o {
    private final wlf<d> a;
    private final wlf<HomeMixFormatListAttributesHelper> b;
    private final wlf<k> c;
    private final wlf<EnumMap<HomeMixTuning.Style, String>> d;
    private final wlf<vb6> e;
    private final wlf<i> f;
    private final wlf<String> g;
    private final wlf<me6> h;
    private final wlf<ke6> i;

    public o(wlf<d> wlf, wlf<HomeMixFormatListAttributesHelper> wlf2, wlf<k> wlf3, wlf<EnumMap<HomeMixTuning.Style, String>> wlf4, wlf<vb6> wlf5, wlf<i> wlf6, wlf<String> wlf7, wlf<me6> wlf8, wlf<ke6> wlf9) {
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
        a(wlf8, 8);
        this.h = wlf8;
        a(wlf9, 9);
        this.i = wlf9;
    }

    private static <T> T a(T t, int i2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i2));
    }

    public n b(Boolean bool, q qVar) {
        d dVar = this.a.get();
        a(dVar, 1);
        d dVar2 = dVar;
        HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper = this.b.get();
        a(homeMixFormatListAttributesHelper, 2);
        HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper2 = homeMixFormatListAttributesHelper;
        k kVar = this.c.get();
        a(kVar, 3);
        k kVar2 = kVar;
        EnumMap<HomeMixTuning.Style, String> enumMap = this.d.get();
        a(enumMap, 4);
        EnumMap<HomeMixTuning.Style, String> enumMap2 = enumMap;
        vb6 vb6 = this.e.get();
        a(vb6, 5);
        vb6 vb62 = vb6;
        i iVar = this.f.get();
        a(iVar, 6);
        i iVar2 = iVar;
        String str = this.g.get();
        a(str, 7);
        String str2 = str;
        me6 me6 = this.h.get();
        a(me6, 8);
        me6 me62 = me6;
        ke6 ke6 = this.i.get();
        a(ke6, 9);
        a(bool, 10);
        a(qVar, 11);
        return new n(dVar2, homeMixFormatListAttributesHelper2, kVar2, enumMap2, vb62, iVar2, str2, me62, ke6, bool, qVar);
    }
}
