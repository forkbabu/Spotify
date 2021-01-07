package defpackage;

import com.spotify.music.libs.viewuri.c;

/* renamed from: ra8  reason: default package */
public class ra8 implements ib8 {
    private final ere a;
    private final jz1 b;
    private final ifd c;
    private final c.a d;
    private final nqe e;
    private final cqe f;

    public ra8(ere ere, jz1 jz1, ifd ifd, c.a aVar, cqe cqe, nqe nqe) {
        this.a = ere;
        this.b = jz1;
        this.c = ifd;
        this.d = aVar;
        this.e = nqe;
        this.f = cqe;
    }

    @Override // defpackage.ib8
    public void log(String str) {
        this.a.a(this.e);
        jz1 jz1 = this.b;
        ifd ifd = this.c;
        ifd.getClass();
        String name = ifd.getName();
        c.a aVar = this.d;
        aVar.getClass();
        jz1.a(new fa1(str, name, aVar.getViewUri().toString(), "search-field", -1, "", "hit", "clear", (double) this.f.d()));
    }
}
