package defpackage;

import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.configuration.ToolbarConfiguration;
import com.spotify.music.features.renameplaylist.d;
import com.spotify.playlist.models.j;

/* renamed from: px6  reason: default package */
public class px6 implements gu6 {
    private final wt6 a;
    private final d b;

    public px6(wt6 wt6, d dVar) {
        this.a = wt6;
        this.b = dVar;
    }

    @Override // defpackage.gu6
    public void a(a0 a0Var, h76 h76) {
        j l = h76.l();
        a0Var.j(C0707R.id.options_menu_rename_playlist, C0707R.string.playlist_options_menu_rename, l70.i(a0Var.getContext(), SpotifyIconV2.EDIT)).a(new jw6(this, l.getUri(), l));
    }

    @Override // defpackage.gu6
    public boolean b(ToolbarConfiguration toolbarConfiguration, h76 h76) {
        return toolbarConfiguration.k() && h76.l().w();
    }

    public /* synthetic */ void c(String str, j jVar) {
        this.a.n(str);
        this.b.a(str, jVar.j());
    }

    @Override // defpackage.gu6
    public /* synthetic */ void f() {
        fu6.b(this);
    }

    @Override // defpackage.gu6
    public /* synthetic */ void h() {
        fu6.a(this);
    }

    @Override // defpackage.gu6
    public /* synthetic */ void onStart() {
        fu6.c(this);
    }

    @Override // defpackage.gu6
    public /* synthetic */ void onStop() {
        fu6.d(this);
    }
}
