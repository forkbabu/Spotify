package defpackage;

import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.glue.patterns.toolbarmenu.e0;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.configuration.ToolbarConfiguration;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.spotlets.offline.util.OffliningLogger;
import com.spotify.playlist.models.j;

/* renamed from: xw6  reason: default package */
public class xw6 implements gu6 {
    private final c a;
    private final wt6 b;
    private final OffliningLogger c;
    private final e0 d;
    private final hy6 e;

    public xw6(c cVar, wt6 wt6, OffliningLogger offliningLogger, e0 e0Var, hy6 hy6) {
        this.a = cVar;
        this.b = wt6;
        this.c = offliningLogger;
        this.d = e0Var;
        this.e = hy6;
    }

    @Override // defpackage.gu6
    public void a(a0 a0Var, h76 h76) {
        this.e.b(h76);
        j l = h76.l();
        int i = h76.d() && h76.c() && !h76.b() ? C0707R.string.options_menu_download_only_songs : C0707R.string.options_menu_download;
        String uri = l.getUri();
        this.d.b(a0Var, this.a, l.k(), i, new pv6(this, true, uri), C0707R.string.options_menu_undownload, new pv6(this, false, uri));
    }

    @Override // defpackage.gu6
    public boolean b(ToolbarConfiguration toolbarConfiguration, h76 h76) {
        return toolbarConfiguration.b() && (h76.d() || h76.b());
    }

    public /* synthetic */ void c(boolean z, String str) {
        this.e.a(z);
        this.b.j(str, z);
        this.c.a(str, OffliningLogger.SourceElement.OPTIONS_MENU, z);
    }

    @Override // defpackage.gu6
    public void f() {
        this.e.stop();
    }

    @Override // defpackage.gu6
    public void h() {
        this.e.start();
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
