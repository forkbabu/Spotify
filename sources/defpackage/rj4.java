package defpackage;

import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.music.features.playlistentity.itemlist.adapter.ContextMenuItem;

/* renamed from: rj4  reason: default package */
public final /* synthetic */ class rj4 implements b4 {
    public final /* synthetic */ zj4 a;
    public final /* synthetic */ ajf b;

    public /* synthetic */ rj4(zj4 zj4, ajf ajf) {
        this.a = zj4;
        this.b = ajf;
    }

    @Override // com.spotify.mobile.android.ui.contextmenu.b4
    public final r3 p0(Object obj) {
        zj4 zj4 = this.a;
        ajf ajf = this.b;
        ContextMenuItem contextMenuItem = (ContextMenuItem) obj;
        zj4.getClass();
        r3 p0 = ((b4) ajf.get()).p0(contextMenuItem);
        p0.e(new tj4(zj4, contextMenuItem));
        return p0;
    }
}
