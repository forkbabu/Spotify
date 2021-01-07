package defpackage;

import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.configuration.ToolbarConfiguration;
import com.spotify.playlist.endpoints.v;
import com.spotify.playlist.models.j;
import com.spotify.rxjava2.p;
import io.reactivex.e;
import io.reactivex.z;

/* renamed from: dx6  reason: default package */
public class dx6 implements gu6 {
    private final wt6 a;
    private final SnackbarManager b;
    private final v c;
    private final p d = new p();

    public dx6(wt6 wt6, SnackbarManager snackbarManager, v vVar) {
        this.a = wt6;
        this.b = snackbarManager;
        this.c = vVar;
    }

    @Override // defpackage.gu6
    public void a(a0 a0Var, h76 h76) {
        j l = h76.l();
        boolean t = l.t();
        a0Var.j(C0707R.id.options_menu_follow_playlist, t ? C0707R.string.playlist_options_menu_unfollow : C0707R.string.playlist_options_menu_follow, l70.i(a0Var.getContext(), t ? SpotifyIconV2.X : SpotifyIconV2.PLUS)).a(new vv6(this, l, t, a0Var));
    }

    @Override // defpackage.gu6
    public boolean b(ToolbarConfiguration toolbarConfiguration, h76 h76) {
        return toolbarConfiguration.e() == ToolbarConfiguration.FollowOption.FOLLOW && !h76.l().w();
    }

    public /* synthetic */ e c(String str, Boolean bool) {
        if (bool.booleanValue()) {
            return this.c.d(str);
        }
        return this.c.c(str);
    }

    public void d(j jVar, boolean z, a0 a0Var) {
        this.a.r(jVar.getUri(), z);
        this.d.b(z.z(Boolean.valueOf(jVar.t())).t(new sv6(this, jVar.getUri())).subscribe(uv6.a, tv6.a));
        this.b.show(SnackbarConfiguration.builder(a0Var.getContext().getString(z ^ true ? C0707R.string.playlist_toolbar_snackbar_follow_playlist : C0707R.string.playlist_toolbar_snackbar_unfollow_playlist, jVar.j())).build());
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
    public void onStop() {
        this.d.a();
    }
}
