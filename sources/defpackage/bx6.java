package defpackage;

import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.configuration.ToolbarConfiguration;
import com.spotify.music.features.playlistentity.l;

/* renamed from: bx6  reason: default package */
public class bx6 implements gu6 {
    private final wt6 a;
    private final l b;

    public bx6(wt6 wt6, l lVar) {
        this.a = wt6;
        this.b = lVar;
    }

    @Override // defpackage.gu6
    public void a(a0 a0Var, h76 h76) {
        a0Var.j(C0707R.id.toolbar_menu_find, C0707R.string.playlist_toolbar_find, l70.i(a0Var.getContext(), SpotifyIconV2.SEARCH)).a(new rv6(this));
    }

    @Override // defpackage.gu6
    public boolean b(ToolbarConfiguration toolbarConfiguration, h76 h76) {
        return toolbarConfiguration.d() && !h76.n();
    }

    public /* synthetic */ void c() {
        this.a.B();
        this.b.b();
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
