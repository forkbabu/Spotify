package defpackage;

import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.glue.patterns.toolbarmenu.h0;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.configuration.ToolbarConfiguration;
import com.spotify.playlist.endpoints.v;
import com.spotify.playlist.models.j;
import com.spotify.rxjava2.p;
import io.reactivex.e;
import io.reactivex.z;

/* renamed from: fx6  reason: default package */
public class fx6 implements gu6 {
    private final wt6 a;
    private final SnackbarManager b;
    private final h0 c;
    private final v d;
    private final p e = new p();

    public fx6(wt6 wt6, SnackbarManager snackbarManager, h0 h0Var, v vVar) {
        this.a = wt6;
        this.b = snackbarManager;
        this.c = h0Var;
        this.d = vVar;
    }

    @Override // defpackage.gu6
    public void a(a0 a0Var, h76 h76) {
        j l = h76.l();
        boolean t = l.t();
        this.c.j(a0Var, t, new yv6(this, l, t));
    }

    @Override // defpackage.gu6
    public boolean b(ToolbarConfiguration toolbarConfiguration, h76 h76) {
        return toolbarConfiguration.e() == ToolbarConfiguration.FollowOption.LIKE && !h76.l().w();
    }

    public /* synthetic */ e c(String str, Boolean bool) {
        if (bool.booleanValue()) {
            return this.d.d(str);
        }
        return this.d.c(str);
    }

    public void d(j jVar, boolean z) {
        this.a.r(jVar.getUri(), z);
        this.e.b(z.z(Boolean.valueOf(jVar.t())).t(new xv6(this, jVar.getUri())).subscribe(zv6.a, wv6.a));
        je.e(z ^ true ? C0707R.string.playlist_toolbar_snackbar_playlist_saved_to_your_library : C0707R.string.playlist_toolbar_snackbar_playlist_removed_from_your_library, this.b);
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
