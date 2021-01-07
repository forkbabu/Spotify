package defpackage;

import com.spotify.music.features.playlistentity.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.playlistentity.itemlist.adapter.ContextMenuItem;
import com.spotify.music.features.playlistentity.itemlist.adapter.a;
import com.spotify.music.features.playlistentity.itemlist.adapter.d;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.playlist.ui.l0;

/* renamed from: je6  reason: default package */
public final class je6 implements fjf<ie6> {
    private final wlf<d> a;
    private final wlf<l0.a<ContextMenuItem>> b;
    private final wlf<a> c;
    private final wlf<zd6> d;
    private final wlf<c> e;
    private final wlf<HomeMixFormatListAttributesHelper> f;

    public je6(wlf<d> wlf, wlf<l0.a<ContextMenuItem>> wlf2, wlf<a> wlf3, wlf<zd6> wlf4, wlf<c> wlf5, wlf<HomeMixFormatListAttributesHelper> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ie6(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
