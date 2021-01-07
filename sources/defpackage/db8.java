package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.music.libs.viewuri.c;
import defpackage.xb8;

/* renamed from: db8  reason: default package */
public class db8 implements nb8 {
    private final ere a;
    private final jz1 b;
    private final ifd c;
    private final c.a d;
    private final cqe e;

    public db8(ere ere, jz1 jz1, ifd ifd, c.a aVar, cqe cqe) {
        this.a = ere;
        this.b = jz1;
        this.c = ifd;
        this.d = aVar;
        this.e = cqe;
    }

    @Override // defpackage.nb8
    public void a(x98 x98) {
        xb8.a aVar = (xb8.a) x98.g();
        aVar.getClass();
        b(aVar);
        Optional<String> d2 = x98.d();
        jz1 jz1 = this.b;
        ifd ifd = this.c;
        ifd.getClass();
        String name = ifd.getName();
        c.a aVar2 = this.d;
        aVar2.getClass();
        jz1.a(new fa1(null, name, aVar2.getViewUri().toString(), d2.or((Optional<String>) AppProtocol.LogMessage.SEVERITY_ERROR), -1, "", "hit", "retry", (double) this.e.d()));
    }

    public void b(xb8.a aVar) {
        this.a.a(aVar.b().g());
    }
}
