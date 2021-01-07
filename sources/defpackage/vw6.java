package defpackage;

import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.configuration.ToolbarConfiguration;

/* renamed from: vw6  reason: default package */
public class vw6 implements gu6 {
    private final wt6 a;
    private final ed3 b;

    public vw6(wt6 wt6, ed3 ed3) {
        this.a = wt6;
        this.b = ed3;
    }

    @Override // defpackage.gu6
    public void a(a0 a0Var, h76 h76) {
        a0Var.b(C0707R.id.toolbar_menu_download_central, "Download Central", l70.i(a0Var.getContext(), SpotifyIconV2.DESTINATION_PIN)).a(new ov6(this, h76));
    }

    @Override // defpackage.gu6
    public boolean b(ToolbarConfiguration toolbarConfiguration, h76 h76) {
        return toolbarConfiguration.i();
    }

    public /* synthetic */ void c(h76 h76) {
        this.a.w();
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
