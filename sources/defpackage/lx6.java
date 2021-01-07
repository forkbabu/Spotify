package defpackage;

import android.content.Context;
import com.google.common.collect.ImmutableMap;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.glue.patterns.toolbarmenu.e0;
import com.spotify.music.features.playlistentity.configuration.ToolbarConfiguration;
import com.spotify.music.libs.viewuri.c;
import com.spotify.playlist.models.j;
import com.spotify.rxjava2.p;
import io.reactivex.s;
import java.util.Map;

/* renamed from: lx6  reason: default package */
public class lx6 implements gu6 {
    private final c a;
    private final wt6 b;
    private final e0 c;
    private final s<Map<String, String>> d;
    private final p e = new p();
    private Map<String, String> f = ImmutableMap.of();

    public lx6(c cVar, wt6 wt6, e0 e0Var, s<Map<String, String>> sVar) {
        this.a = cVar;
        this.b = wt6;
        this.c = e0Var;
        this.d = sVar;
    }

    @Override // defpackage.gu6
    public void a(a0 a0Var, h76 h76) {
        j l = h76.l();
        e0 e0Var = this.c;
        c cVar = this.a;
        String uri = l.getUri();
        Context context = a0Var.getContext();
        wt6 wt6 = this.b;
        wt6.getClass();
        e0Var.k(a0Var, cVar, uri, context, new bw6(wt6), this.f);
    }

    @Override // defpackage.gu6
    public boolean b(ToolbarConfiguration toolbarConfiguration, h76 h76) {
        return toolbarConfiguration.f() && !h76.n() && h76.d();
    }

    public /* synthetic */ void c(Map map) {
        this.f = map;
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
    public void onStart() {
        this.e.b(this.d.subscribe(new hw6(this), gw6.a));
    }

    @Override // defpackage.gu6
    public void onStop() {
        this.e.a();
    }
}
