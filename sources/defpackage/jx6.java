package defpackage;

import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.configuration.ToolbarConfiguration;
import com.spotify.playlist.endpoints.v;
import com.spotify.playlist.models.j;
import com.spotify.rxjava2.p;
import io.reactivex.y;

/* renamed from: jx6  reason: default package */
public class jx6 implements gu6 {
    private final wt6 a;
    private final y b;
    private final SnackbarManager c;
    private final v d;
    private final p e = new p();

    public jx6(wt6 wt6, y yVar, SnackbarManager snackbarManager, v vVar) {
        this.a = wt6;
        this.b = yVar;
        this.c = snackbarManager;
        this.d = vVar;
    }

    @Override // defpackage.gu6
    public void a(a0 a0Var, h76 h76) {
        j l = h76.l();
        boolean y = l.y();
        a0Var.j(C0707R.id.options_menu_publish, y ? C0707R.string.playlist_options_menu_unpublish : C0707R.string.playlist_options_menu_publish, l70.i(a0Var.getContext(), y ? SpotifyIconV2.LOCKED : SpotifyIconV2.LOCKED_ACTIVE)).a(new ew6(this, l));
    }

    @Override // defpackage.gu6
    public boolean b(ToolbarConfiguration toolbarConfiguration, h76 h76) {
        j l = h76.l();
        return l.w() || l.t();
    }

    public void c(boolean z) {
        je.e(z ? C0707R.string.playlist_snackbar_published : C0707R.string.playlist_snackbar_unpublished, this.c);
    }

    public /* synthetic */ void d(j jVar) {
        boolean y = jVar.y();
        boolean z = !y;
        this.a.s(jVar.getUri(), y);
        this.e.b(this.d.b(jVar.getUri(), z).A(this.b).subscribe(new cw6(this, z), dw6.a));
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
        this.e.a();
    }
}
