package defpackage;

import com.google.common.base.Optional;
import com.spotify.libs.search.history.i;
import defpackage.x98;

/* renamed from: v58  reason: default package */
class v58 implements u58 {
    private final qe8 a;
    private final lb8 b;
    private final j81 c;
    private final i d;
    private final s6b e;

    v58(qe8 qe8, lb8 lb8, j81 j81, i iVar, s6b s6b) {
        this.a = qe8;
        this.b = lb8;
        this.c = j81;
        this.d = iVar;
        this.e = s6b;
    }

    private String d(String str, n61 n61) {
        s81 d2 = n61.d();
        x98.a a2 = x98.a();
        a2.e(xb8.a(this.c.a(n61)));
        a2.a(rqa.e(d2));
        a2.b(str);
        a2.c(Optional.fromNullable(d2.logging().string("ui:group")));
        a2.d(Optional.of(rqa.g(d2)));
        return this.b.a(a2.build());
    }

    @Override // defpackage.u58
    public void a(String str, n61 n61) {
        this.a.b(str, n61.d(), d(str, n61));
    }

    @Override // defpackage.u58
    public void b(String str, n61 n61) {
        this.a.a(str, n61.d(), d(str, n61), new q58(this, str, n61));
    }

    public void c(String str, n61 n61) {
        this.d.a(this.e.a(str, n61.d()));
    }
}
