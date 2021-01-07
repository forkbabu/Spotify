package defpackage;

import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.configuration.ToolbarConfiguration;

/* renamed from: nw6  reason: default package */
public class nw6 implements gu6 {
    private final wt6 a;
    private final wec b;

    public nw6(wt6 wt6, wec wec) {
        this.a = wt6;
        this.b = wec;
    }

    @Override // defpackage.gu6
    public void a(a0 a0Var, h76 h76) {
        a0Var.j(C0707R.id.options_menu_add_songs_to_playlist, C0707R.string.playlist_options_menu_add_songs, l70.i(a0Var.getContext(), SpotifyIconV2.PLUS_ALT)).a(new gv6(this, h76.l().getUri()));
    }

    @Override // defpackage.gu6
    public boolean b(ToolbarConfiguration toolbarConfiguration, h76 h76) {
        return h76.a();
    }

    public /* synthetic */ void c(String str) {
        this.a.z(str);
        this.b.a(str);
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
