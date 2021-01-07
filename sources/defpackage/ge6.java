package defpackage;

import android.content.Context;
import com.spotify.music.features.playlistentity.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.playlistentity.homemix.l;
import com.spotify.music.features.playlistentity.homemix.models.HomeMixTuning;
import com.spotify.music.features.playlistentity.homemix.q;
import com.spotify.music.features.playlistentity.w;
import java.util.EnumMap;

/* renamed from: ge6  reason: default package */
public final class ge6 implements fjf<fe6> {
    private final wlf<ce6> a;
    private final wlf<w> b;
    private final wlf<Context> c;
    private final wlf<EnumMap<HomeMixTuning.Style, String>> d;
    private final wlf<me6> e;
    private final wlf<l> f;
    private final wlf<ie6> g;
    private final wlf<af6> h;
    private final wlf<q> i;
    private final wlf<HomeMixFormatListAttributesHelper> j;

    public ge6(wlf<ce6> wlf, wlf<w> wlf2, wlf<Context> wlf3, wlf<EnumMap<HomeMixTuning.Style, String>> wlf4, wlf<me6> wlf5, wlf<l> wlf6, wlf<ie6> wlf7, wlf<af6> wlf8, wlf<q> wlf9, wlf<HomeMixFormatListAttributesHelper> wlf10) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
        this.j = wlf10;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new fe6(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }
}
