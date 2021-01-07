package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.glue.patterns.toolbarmenu.e0;
import com.spotify.music.features.playlistentity.configuration.ToolbarConfiguration;
import com.spotify.music.libs.viewuri.c;

/* renamed from: rx6  reason: default package */
public class rx6 implements gu6 {
    private final c a;
    private final wt6 b;
    private final e0 c;
    private final ky6 d;

    public rx6(c cVar, wt6 wt6, e0 e0Var, ky6 ky6) {
        this.a = cVar;
        this.b = wt6;
        this.c = e0Var;
        this.d = ky6;
    }

    @Override // defpackage.gu6
    public void a(a0 a0Var, h76 h76) {
        MoreObjects.checkArgument(this.d.a().isPresent());
        wt6 wt6 = this.b;
        wt6.getClass();
        this.c.i(a0Var, this.a, this.d.a().get(), new fv6(wt6));
    }

    @Override // defpackage.gu6
    public boolean b(ToolbarConfiguration toolbarConfiguration, h76 h76) {
        return h76.l().p() && this.d.a().isPresent();
    }

    @Override // defpackage.gu6
    public void f() {
        this.d.stop();
    }

    @Override // defpackage.gu6
    public void h() {
        this.d.start();
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
