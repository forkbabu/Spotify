package defpackage;

import android.app.Activity;
import com.google.common.base.MoreObjects;
import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import com.spotify.android.glue.patterns.contextmenu.model.b;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.ui.contextmenu.ContextMenuEvent;
import com.spotify.mobile.android.ui.contextmenu.s3;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.navigation.n;
import com.spotify.music.navigation.t;

/* renamed from: c38  reason: default package */
public class c38 {
    private final Activity a;
    private final ifd b;
    private final c c;
    private final ContextMenuViewModel d;
    private final s3 e;
    private final jz1 f;
    private final t g;
    private final cqe h;

    public c38(Activity activity, ifd ifd, c cVar, ContextMenuViewModel contextMenuViewModel, t tVar, jz1 jz1, cqe cqe) {
        s3 s3Var = s3.a;
        this.a = activity;
        this.b = ifd;
        this.c = cVar;
        this.d = contextMenuViewModel;
        this.e = s3Var;
        this.g = tVar;
        jz1.getClass();
        this.f = jz1;
        this.h = cqe;
    }

    private b a(int i, int i2, SpotifyIconV2 spotifyIconV2) {
        return this.d.b(i, this.a.getText(i2), l70.i(this.a, spotifyIconV2));
    }

    private void j(ContextMenuEvent contextMenuEvent, String str) {
        this.f.a(new fa1(null, this.b.toString(), this.c.toString(), "context-menu", -1, str, "hit", contextMenuEvent.toString(), (double) this.h.d()));
    }

    public void b(String str, String str2) {
        a(C0707R.id.context_menu_browse_album, C0707R.string.context_menu_browse_album, SpotifyIconV2.ALBUM).o(new y28(this, str, str2));
    }

    public void c(String str, String str2) {
        a(C0707R.id.context_menu_browse_artist, C0707R.string.context_menu_browse_artist, SpotifyIconV2.ARTIST).o(new a38(this, str, str2));
    }

    public void d(String str, String str2) {
        a(C0707R.id.context_menu_browse_playlist, C0707R.string.context_menu_browse_playlist, SpotifyIconV2.PLAYLIST).o(new z28(this, str, str2));
    }

    public void e(String str, com.spotify.android.flags.c cVar, String... strArr) {
        MoreObjects.checkArgument(strArr.length > 0);
        int i = agd.b;
        if (!(!((Boolean) cVar.M0(vfd.c)).booleanValue())) {
            a(C0707R.id.menu_item_start_station, agd.g(l0.z(strArr[0])), SpotifyIconV2.RADIO).o(new x28(this, agd.c(strArr[0]), str));
        }
    }

    public /* synthetic */ void f(String str, String str2, b bVar) {
        j(ContextMenuEvent.BROWSE_ALBUM, str);
        n.a a2 = n.a(str);
        a2.h(str2);
        this.g.e(a2.a());
    }

    public /* synthetic */ void g(String str, String str2, b bVar) {
        j(ContextMenuEvent.BROWSE_ARTIST, str);
        n.a a2 = n.a(str);
        a2.h(str2);
        this.g.e(a2.a());
    }

    public /* synthetic */ void h(String str, String str2, b bVar) {
        j(ContextMenuEvent.BROWSE_PLAYLIST, str);
        n.a a2 = n.a(str);
        a2.h(str2);
        this.g.e(a2.a());
    }

    public void i(String str, String str2, b bVar) {
        j(ContextMenuEvent.START_RADIO, str);
        str.getClass();
        n.a a2 = n.a(str);
        a2.h(str2);
        this.g.e(a2.a());
    }
}
