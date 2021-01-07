package defpackage;

import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.itemlist.adapter.ContextMenuItem;
import com.spotify.music.features.playlistentity.itemlist.adapter.h;
import com.spotify.music.playlist.ui.d0;
import defpackage.hi6;
import defpackage.rj6;

/* renamed from: fi6  reason: default package */
class fi6 implements ei6 {
    private final h<d0, ajf<b4<ContextMenuItem>>> a;
    private final rj6.a b;

    public fi6(hi6.a aVar, rj6.a aVar2) {
        aVar.getClass();
        this.a = new di6(aVar);
        this.b = aVar2;
    }

    @Override // defpackage.ei6
    public uh6 a(ItemListConfiguration itemListConfiguration) {
        return this.b.a(this.a, itemListConfiguration);
    }
}
