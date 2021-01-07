package defpackage;

import com.spotify.music.libs.viewuri.c;
import com.spotify.player.model.Context;
import com.spotify.ubi.specification.factories.q3;

/* renamed from: bb8  reason: default package */
public class bb8 implements mb8 {
    private final ere a;
    private final q3 b;
    private final jz1 c;
    private final ifd d;
    private final c.a e;
    private final cqe f;

    public bb8(ere ere, q3 q3Var, jz1 jz1, ifd ifd, c.a aVar, cqe cqe) {
        this.a = ere;
        this.b = q3Var;
        this.c = jz1;
        this.d = ifd;
        this.e = aVar;
        this.f = cqe;
    }

    @Override // defpackage.mb8
    public void a(int i, String str) {
        this.a.a(this.b.c().c().b().c(Integer.valueOf(i), str).b());
        jz1 jz1 = this.c;
        ifd ifd = this.d;
        ifd.getClass();
        String name = ifd.getName();
        c.a aVar = this.e;
        aVar.getClass();
        jz1.a(new fa1("", name, aVar.getViewUri().toString(), Context.Metadata.SHUFFLE_ALGORITHM_HISTORY, (long) i, str, "hit", "dismiss", (double) this.f.d()));
    }
}
