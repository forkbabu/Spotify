package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;

/* renamed from: wa8  reason: default package */
public class wa8 implements kb8 {
    private final ere a;
    private final jz1 b;
    private final c.a c;
    private final cqe d;
    private final nqe e;

    public wa8(ere ere, jz1 jz1, c.a aVar, cqe cqe, nqe nqe) {
        this.a = ere;
        this.b = jz1;
        this.c = aVar;
        this.d = cqe;
        this.e = nqe;
    }

    @Override // defpackage.kb8
    public void a() {
        this.a.a(this.e);
        jz1 jz1 = this.b;
        String name = kfd.e1.getName();
        c.a aVar = this.c;
        aVar.getClass();
        jz1.a(new ea1(null, name, aVar.getViewUri().toString(), 0, 0, ViewUris.k2.toString(), "tap-camera-button", "navigate-forward", (double) this.d.d()));
    }
}
