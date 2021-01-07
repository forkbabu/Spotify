package defpackage;

import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.configuration.ToolbarConfiguration;
import com.spotify.music.playlist.permissions.z;

/* renamed from: hx6  reason: default package */
public class hx6 implements gu6 {
    private final wt6 a;
    private final z b;

    public hx6(wt6 wt6, z zVar) {
        this.a = wt6;
        this.b = zVar;
    }

    @Override // defpackage.gu6
    public void a(a0 a0Var, h76 h76) {
        a0Var.j(C0707R.id.toolbar_menu_manage_privacy, C0707R.string.playlist_options_menu_manage_privacy, l70.i(a0Var.getContext(), SpotifyIconV2.LOCKED)).a(new aw6(this, h76));
    }

    @Override // defpackage.gu6
    public boolean b(ToolbarConfiguration toolbarConfiguration, h76 h76) {
        return toolbarConfiguration.h() && h76.l().w();
    }

    public /* synthetic */ void c(h76 h76) {
        this.a.d();
        this.b.a(h76.l().getUri());
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
