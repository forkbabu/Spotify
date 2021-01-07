package defpackage;

import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.features.playlistentity.itemlist.adapter.ContextMenuItem;
import com.spotify.music.features.playlistentity.t;
import com.spotify.playlist.models.l;

/* renamed from: lh6  reason: default package */
public interface lh6 {

    /* renamed from: lh6$a */
    public interface a {
        lh6 a(ItemListConfiguration itemListConfiguration);
    }

    void a(int i, l lVar);

    void b(int i, l lVar);

    void c(int i, l lVar, boolean z);

    void d(int i, l lVar);

    void f(int i, l lVar);

    io.reactivex.a g();

    void h(int i, l lVar);

    void i(wh6 wh6);

    void j(int i, l lVar, boolean z, boolean z2);

    void k(t.b bVar);

    r3 l(ContextMenuItem contextMenuItem);

    void m(int i, l lVar, boolean z, boolean z2);

    r3 n(ContextMenuItem contextMenuItem, boolean z);

    void stop();
}
