package defpackage;

import com.spotify.instrumentation.a;
import com.spotify.music.nowplaying.common.view.logging.c;
import com.spotify.nowplaying.ui.components.controls.next.e;
import com.spotify.nowplaying.ui.components.controls.playpause.d;
import com.spotify.nowplaying.ui.components.controls.seekbar.h;
import com.spotify.ubi.specification.factories.z1;

/* renamed from: job  reason: default package */
public final class job implements jqd, e, d, com.spotify.nowplaying.ui.components.controls.previous.d, h {
    private final c a;
    private final ere b;
    private final z1 c;

    public job(c cVar, ere ere, a aVar, com.spotify.music.libs.viewuri.c cVar2) {
        this.a = cVar;
        this.b = ere;
        this.c = new z1(aVar.path(), cVar2.toString());
    }

    @Override // com.spotify.nowplaying.ui.components.controls.playpause.d
    public void b(String str) {
        this.a.o(str);
        this.b.a(this.c.b().b().a(str));
    }

    @Override // defpackage.jqd
    public void m() {
        this.a.f();
        this.b.a(this.c.d().b().a());
    }

    @Override // com.spotify.nowplaying.ui.components.controls.previous.d
    public void o(String str) {
        this.a.q();
        this.b.a(this.c.b().d().a(str));
    }

    @Override // com.spotify.nowplaying.ui.components.controls.seekbar.h
    public void q(String str, int i) {
        this.a.w(str);
        this.b.a(this.c.c().a(Integer.valueOf(i)));
    }

    @Override // com.spotify.nowplaying.ui.components.controls.playpause.d
    public void v(String str) {
        this.a.p(str);
        this.b.a(this.c.b().b().b(str));
    }

    @Override // com.spotify.nowplaying.ui.components.controls.next.e
    public void z(String str, String str2) {
        this.a.n(str2);
        this.b.a(this.c.b().c().a(str));
    }
}
