package defpackage;

import com.google.common.base.Optional;
import com.spotify.libs.search.history.i;
import defpackage.x98;

/* renamed from: k58  reason: default package */
public class k58 implements a71 {
    public static final /* synthetic */ int n = 0;
    private final hb8 a;
    private final j81 b;
    private final i c;
    private final c8b f;

    public k58(hb8 hb8, j81 j81, i iVar, c8b c8b) {
        this.b = j81;
        iVar.getClass();
        this.c = iVar;
        this.a = hb8;
        c8b.getClass();
        this.f = c8b;
    }

    @Override // defpackage.a71
    public void b(o81 o81, n61 n61) {
        s81 d = n61.d();
        x98.a a2 = x98.a();
        a2.e(xb8.a(this.b.a(n61)));
        a2.a(rqa.e(d));
        a2.c(Optional.fromNullable(d.logging().string("ui:group")));
        a2.d(Optional.of(rqa.g(d)));
        this.a.a(a2.build());
        this.f.a();
        this.c.b();
    }
}
