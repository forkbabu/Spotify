package defpackage;

import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.configuration.ToolbarConfiguration;
import com.spotify.playlist.models.j;
import com.spotify.rxjava2.p;
import io.reactivex.y;

/* renamed from: rw6  reason: default package */
public class rw6 implements gu6 {
    private final wt6 a;
    private final y b;
    private final oy6 c;
    private final p d = new p();

    public rw6(wt6 wt6, y yVar, oy6 oy6) {
        this.a = wt6;
        this.b = yVar;
        this.c = oy6;
    }

    @Override // defpackage.gu6
    public void a(a0 a0Var, h76 h76) {
        j l = h76.l();
        a0Var.j(C0707R.id.options_menu_collaborative, l.r() ? C0707R.string.playlist_options_menu_uncollaborative : C0707R.string.playlist_options_menu_collaborative, l70.i(a0Var.getContext(), SpotifyIconV2.COLLABORATIVE_PLAYLIST)).a(new hv6(this, l));
    }

    @Override // defpackage.gu6
    public boolean b(ToolbarConfiguration toolbarConfiguration, h76 h76) {
        return h76.l().w();
    }

    public /* synthetic */ void c(boolean z) {
        this.c.a(z);
    }

    public /* synthetic */ void d(j jVar) {
        boolean r = jVar.r();
        boolean z = !r;
        this.a.k(jVar.getUri(), r);
        this.d.b(this.c.b(jVar, z).A(this.b).subscribe(new iv6(this, z), jv6.a));
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
