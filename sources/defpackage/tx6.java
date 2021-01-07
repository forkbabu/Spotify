package defpackage;

import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.glue.patterns.toolbarmenu.h0;
import com.spotify.music.features.playlistentity.configuration.ToolbarConfiguration;

/* renamed from: tx6  reason: default package */
public class tx6 implements gu6 {
    private final wt6 a;
    private final ry6 b;
    private final h0 c;

    public tx6(wt6 wt6, ry6 ry6, h0 h0Var) {
        this.a = wt6;
        this.b = ry6;
        this.c = h0Var;
    }

    @Override // defpackage.gu6
    public void a(a0 a0Var, h76 h76) {
        this.c.p(a0Var, new kw6(this, a0Var, h76));
    }

    @Override // defpackage.gu6
    public boolean b(ToolbarConfiguration toolbarConfiguration, h76 h76) {
        return h76.l().m() != null;
    }

    public /* synthetic */ void c(a0 a0Var, h76 h76) {
        this.a.p();
        this.b.a(a0Var.getContext(), h76.l());
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
