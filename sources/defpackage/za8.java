package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.libs.viewuri.c;
import defpackage.xb8;

/* renamed from: za8  reason: default package */
public class za8 implements lb8 {
    private final ere a;
    private final jz1 b;
    private final ifd c;
    private final c.a d;
    private final cqe e;

    public za8(ere ere, jz1 jz1, ifd ifd, c.a aVar, cqe cqe) {
        this.a = ere;
        this.b = jz1;
        this.c = ifd;
        this.d = aVar;
        this.e = cqe;
    }

    @Override // defpackage.lb8
    public String a(x98 x98) {
        if (!x98.e().isPresent()) {
            Assertion.g("Search: No targetUri set for navigation instrumentation");
        }
        String str = x98.e().get();
        xb8.a aVar = (xb8.a) x98.g();
        aVar.getClass();
        String b2 = b(str, aVar);
        int b3 = x98.b();
        Optional<String> c2 = x98.c();
        Optional<String> d2 = x98.d();
        jz1 jz1 = this.b;
        ifd ifd = this.c;
        ifd.getClass();
        String name = ifd.getName();
        c.a aVar2 = this.d;
        aVar2.getClass();
        jz1.a(new fa1(c2.orNull(), name, aVar2.getViewUri().toString(), d2.orNull(), (long) b3, str, "hit", "play", (double) this.e.d()));
        return b2;
    }

    public String b(String str, xb8.a aVar) {
        nqe d2 = aVar.b().d(str);
        this.a.a(d2);
        return d2.b();
    }
}
