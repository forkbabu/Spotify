package defpackage;

import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.music.features.playlistentity.itemlist.adapter.ContextMenuItem;
import com.spotify.music.features.playlistentity.itemlist.adapter.a;
import com.spotify.music.features.playlistentity.itemlist.adapter.d;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.playlist.ui.d0;
import com.spotify.music.playlist.ui.l0;
import defpackage.sm6;

/* renamed from: tm6  reason: default package */
public final class tm6 implements sm6.a {
    private final wlf<d> a;
    private final wlf<a> b;
    private final wlf<l0.a<ContextMenuItem>> c;
    private final wlf<pm6> d;
    private final wlf<c> e;

    public tm6(wlf<d> wlf, wlf<a> wlf2, wlf<l0.a<ContextMenuItem>> wlf3, wlf<pm6> wlf4, wlf<c> wlf5) {
        b(wlf, 1);
        this.a = wlf;
        b(wlf2, 2);
        this.b = wlf2;
        b(wlf3, 3);
        this.c = wlf3;
        b(wlf4, 4);
        this.d = wlf4;
        b(wlf5, 5);
        this.e = wlf5;
    }

    private static <T> T b(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // defpackage.sm6.a
    public sm6 a(d0 d0Var, ajf<b4<ContextMenuItem>> ajf, boolean z) {
        d dVar = this.a.get();
        b(dVar, 1);
        d dVar2 = dVar;
        a aVar = this.b.get();
        b(aVar, 2);
        a aVar2 = aVar;
        l0.a<ContextMenuItem> aVar3 = this.c.get();
        b(aVar3, 3);
        l0.a<ContextMenuItem> aVar4 = aVar3;
        pm6 pm6 = this.d.get();
        b(pm6, 4);
        pm6 pm62 = pm6;
        c cVar = this.e.get();
        b(cVar, 5);
        b(d0Var, 6);
        b(ajf, 7);
        return new sm6(dVar2, aVar2, aVar4, pm62, cVar, d0Var, ajf, z);
    }
}
