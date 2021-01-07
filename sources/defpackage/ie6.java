package defpackage;

import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.music.features.playlistentity.homemix.HomeMixFormatListAttributesHelper;
import com.spotify.music.features.playlistentity.itemlist.adapter.ContextMenuItem;
import com.spotify.music.features.playlistentity.itemlist.adapter.a;
import com.spotify.music.features.playlistentity.itemlist.adapter.d;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.playlist.ui.d0;
import com.spotify.music.playlist.ui.l0;

/* renamed from: ie6  reason: default package */
public class ie6 {
    private final wlf<d> a;
    private final wlf<l0.a<ContextMenuItem>> b;
    private final wlf<a> c;
    private final wlf<zd6> d;
    private final wlf<c> e;
    private final wlf<HomeMixFormatListAttributesHelper> f;

    public ie6(wlf<d> wlf, wlf<l0.a<ContextMenuItem>> wlf2, wlf<a> wlf3, wlf<zd6> wlf4, wlf<c> wlf5, wlf<HomeMixFormatListAttributesHelper> wlf6) {
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
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public he6 b(d0 d0Var, ajf<b4<ContextMenuItem>> ajf) {
        d dVar = this.a.get();
        a(dVar, 1);
        d dVar2 = dVar;
        l0.a<ContextMenuItem> aVar = this.b.get();
        a(aVar, 2);
        l0.a<ContextMenuItem> aVar2 = aVar;
        a aVar3 = this.c.get();
        a(aVar3, 3);
        a aVar4 = aVar3;
        zd6 zd6 = this.d.get();
        a(zd6, 4);
        zd6 zd62 = zd6;
        c cVar = this.e.get();
        a(cVar, 5);
        c cVar2 = cVar;
        HomeMixFormatListAttributesHelper homeMixFormatListAttributesHelper = this.f.get();
        a(homeMixFormatListAttributesHelper, 6);
        a(d0Var, 7);
        a(ajf, 8);
        return new he6(dVar2, aVar2, aVar4, zd62, cVar2, homeMixFormatListAttributesHelper, d0Var, ajf);
    }
}
