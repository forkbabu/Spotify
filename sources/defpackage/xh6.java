package defpackage;

import com.spotify.music.features.playlistentity.itemlist.adapter.g;
import com.spotify.music.playlist.ui.ItemConfiguration;

/* renamed from: xh6  reason: default package */
final class xh6 implements wh6 {
    private final g<?> a;

    xh6(g<?> gVar) {
        this.a = gVar;
    }

    @Override // defpackage.wh6
    public void i(ItemConfiguration itemConfiguration) {
        this.a.i(itemConfiguration);
    }

    @Override // defpackage.wh6
    public void j(String str, boolean z) {
        this.a.j(str, z);
    }
}
