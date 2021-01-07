package defpackage;

import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.glue.patterns.toolbarmenu.h0;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.configuration.ToolbarConfiguration;
import com.spotify.music.features.playlistentity.t;
import com.spotify.playlist.endpoints.v;
import com.spotify.playlist.models.j;
import com.spotify.rxjava2.p;
import defpackage.eu6;
import io.reactivex.e;
import io.reactivex.z;

/* renamed from: yu6  reason: default package */
public class yu6 implements eu6 {
    private final wt6 a;
    private final SnackbarManager b;
    private final h0 c;
    private final v d;
    private final p e = new p();

    public yu6(wt6 wt6, SnackbarManager snackbarManager, h0 h0Var, v vVar) {
        this.a = wt6;
        this.b = snackbarManager;
        this.c = h0Var;
        this.d = vVar;
    }

    @Override // defpackage.eu6
    public void a(a0 a0Var, h76 h76) {
        j l = h76.l();
        boolean t = l.t();
        this.c.a(a0Var, t, new ku6(this, l, t));
    }

    @Override // defpackage.eu6
    public boolean b(ar6 ar6, ToolbarConfiguration toolbarConfiguration, h76 h76) {
        return !h76.l().w() && toolbarConfiguration.g();
    }

    @Override // defpackage.eu6
    public /* synthetic */ void c(eu6.a aVar) {
        du6.b(this, aVar);
    }

    @Override // defpackage.eu6
    public /* synthetic */ void d(a0 a0Var, ar6 ar6, h76 h76) {
        du6.a(this, a0Var, ar6, h76);
    }

    public /* synthetic */ e e(String str, Boolean bool) {
        if (bool.booleanValue()) {
            return this.d.d(str);
        }
        return this.d.c(str);
    }

    @Override // defpackage.eu6
    public /* synthetic */ void f() {
        du6.c(this);
    }

    public void g(j jVar, boolean z) {
        this.a.A(jVar.getUri(), z);
        this.e.b(z.z(Boolean.valueOf(jVar.t())).t(new mu6(this, jVar.getUri())).subscribe(nu6.a, lu6.a));
        je.e(z ^ true ? C0707R.string.playlist_toolbar_snackbar_playlist_saved_to_your_library : C0707R.string.playlist_toolbar_snackbar_playlist_removed_from_your_library, this.b);
    }

    @Override // defpackage.eu6
    public /* synthetic */ void l(t.b bVar) {
        du6.d(this, bVar);
    }

    @Override // defpackage.eu6
    public void onStop() {
        this.e.a();
    }
}
