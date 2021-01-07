package defpackage;

import com.spotify.music.features.playlistentity.itemlist.adapter.ContextMenuItem;
import com.spotify.music.features.playlistentity.itemlist.adapter.a;
import com.spotify.music.features.playlistentity.itemlist.adapter.d;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.playlist.ui.l0;

/* renamed from: um6  reason: default package */
public final class um6 implements fjf<tm6> {
    private final wlf<d> a;
    private final wlf<a> b;
    private final wlf<l0.a<ContextMenuItem>> c;
    private final wlf<pm6> d;
    private final wlf<c> e;

    public um6(wlf<d> wlf, wlf<a> wlf2, wlf<l0.a<ContextMenuItem>> wlf3, wlf<pm6> wlf4, wlf<c> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tm6(this.a, this.b, this.c, this.d, this.e);
    }
}
