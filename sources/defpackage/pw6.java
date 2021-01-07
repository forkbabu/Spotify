package defpackage;

import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.glue.patterns.toolbarmenu.e0;
import com.spotify.music.features.playlistentity.configuration.ToolbarConfiguration;
import com.spotify.music.libs.viewuri.c;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.j;
import com.spotify.playlist.models.q;

/* renamed from: pw6  reason: default package */
public class pw6 implements gu6 {
    private final c a;
    private final wt6 b;
    private final e0 c;

    public pw6(c cVar, wt6 wt6, e0 e0Var) {
        this.a = cVar;
        this.b = wt6;
        this.c = e0Var;
    }

    @Override // defpackage.gu6
    public void a(a0 a0Var, h76 h76) {
        j l = h76.l();
        String c2 = q.c(l.c(), Covers.Size.SMALL);
        e0 e0Var = this.c;
        String uri = l.getUri();
        String j = l.j();
        c cVar = this.a;
        wt6 wt6 = this.b;
        wt6.getClass();
        e0Var.a(a0Var, uri, j, c2, cVar, new fw6(wt6));
    }

    @Override // defpackage.gu6
    public boolean b(ToolbarConfiguration toolbarConfiguration, h76 h76) {
        return !h76.m() && toolbarConfiguration.a();
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
