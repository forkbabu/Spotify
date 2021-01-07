package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.glue.patterns.toolbarmenu.h0;
import com.spotify.music.features.playlistentity.configuration.ToolbarConfiguration;

/* renamed from: nx6  reason: default package */
public class nx6 implements gu6 {
    private final wt6 a;
    private final h0 b;
    private final vxc c;

    public nx6(wt6 wt6, h0 h0Var, vxc vxc) {
        this.a = wt6;
        this.b = h0Var;
        this.c = vxc;
    }

    @Override // defpackage.gu6
    public void a(a0 a0Var, h76 h76) {
        this.b.l(a0Var, h76.l().getUri(), new iw6(this));
    }

    @Override // defpackage.gu6
    public boolean b(ToolbarConfiguration toolbarConfiguration, h76 h76) {
        boolean z = !MoreObjects.isNullOrEmpty(h76.l().g());
        ToolbarConfiguration.RecommendationEducationOption j = toolbarConfiguration.j();
        if (j == ToolbarConfiguration.RecommendationEducationOption.FORMAT_LISTS_ONLY) {
            return z;
        }
        if (j == ToolbarConfiguration.RecommendationEducationOption.ALL_PLAYLISTS) {
            return true;
        }
        return false;
    }

    public /* synthetic */ void c() {
        this.a.u();
        this.c.a();
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
