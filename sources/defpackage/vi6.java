package defpackage;

import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.itemlist.adapter.ContextMenuItem;
import com.spotify.music.features.playlistentity.itemlist.adapter.h;
import com.spotify.music.playlist.ui.d0;
import defpackage.rj6;
import defpackage.xi6;

/* renamed from: vi6  reason: default package */
class vi6 implements ui6 {
    private final h<d0, ajf<b4<ContextMenuItem>>> a;
    private final rj6.a b;

    public vi6(xi6.a aVar, rj6.a aVar2) {
        aVar.getClass();
        this.a = new ri6(aVar);
        this.b = aVar2;
    }

    @Override // defpackage.ui6
    public uh6 a(ItemListConfiguration itemListConfiguration) {
        return this.b.a(this.a, itemListConfiguration);
    }
}
