package defpackage;

import com.spotify.music.libs.viewuri.c;

/* renamed from: tl5  reason: default package */
public class tl5 {
    private final jz1 a;
    private final ifd b;
    private final c.a c;
    private final cqe d;

    public tl5(jz1 jz1, ifd ifd, c.a aVar, cqe cqe) {
        this.a = jz1;
        this.b = ifd;
        this.c = aVar;
        this.d = cqe;
    }

    public void a(long j, String str) {
        jz1 jz1 = this.a;
        ifd ifd = this.b;
        ifd.getClass();
        String name = ifd.getName();
        c.a aVar = this.c;
        aVar.getClass();
        jz1.a(new ga1(null, name, aVar.getViewUri().toString(), null, j, null, "hit", str, (double) this.d.d(), null));
    }
}
