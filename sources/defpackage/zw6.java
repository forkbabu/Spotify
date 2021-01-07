package defpackage;

import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.music.features.editplaylist.g;
import com.spotify.music.features.playlistentity.configuration.ToolbarConfiguration;

/* renamed from: zw6  reason: default package */
public class zw6 implements gu6 {
    private final wt6 a;
    private final g b;

    public zw6(wt6 wt6, g gVar) {
        this.a = wt6;
        this.b = gVar;
    }

    @Override // defpackage.gu6
    public void a(a0 a0Var, h76 h76) {
        a0Var.j(C0707R.id.options_menu_edit_playlist, C0707R.string.playlist_options_menu_edit, l70.i(a0Var.getContext(), SpotifyIconV2.EDIT)).a(new qv6(this, h76.l().getUri()));
    }

    @Override // defpackage.gu6
    public boolean b(ToolbarConfiguration toolbarConfiguration, h76 h76) {
        int ordinal = toolbarConfiguration.c().ordinal();
        if (ordinal == 1) {
            return h76.a();
        }
        if (ordinal != 2) {
            return false;
        }
        return h76.l().w();
    }

    public /* synthetic */ void c(String str) {
        this.a.y(str);
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
