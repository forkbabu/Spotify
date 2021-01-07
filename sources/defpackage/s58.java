package defpackage;

import com.google.common.base.Optional;
import com.spotify.libs.search.history.i;
import com.spotify.music.navigation.t;
import defpackage.x98;

/* renamed from: s58  reason: default package */
class s58 implements r58 {
    private final t a;
    private final i b;
    private final s6b c;
    private final jb8 d;
    private final j81 e;

    public s58(t tVar, i iVar, s6b s6b, jb8 jb8, j81 j81) {
        tVar.getClass();
        this.a = tVar;
        iVar.getClass();
        this.b = iVar;
        s6b.getClass();
        this.c = s6b;
        jb8.getClass();
        this.d = jb8;
        this.e = j81;
    }

    private String c(String str, n61 n61) {
        s81 d2 = n61.d();
        x98.a a2 = x98.a();
        a2.e(xb8.a(this.e.a(n61)));
        a2.a(rqa.e(d2));
        a2.b(str);
        a2.c(Optional.fromNullable(d2.logging().string("ui:group")));
        a2.d(Optional.of(rqa.g(d2)));
        return this.d.a(a2.build());
    }

    @Override // defpackage.r58
    public void a(String str, String str2, n61 n61) {
        this.a.b(str, c(str, n61));
        this.b.a(this.c.a(str2, n61.d()));
    }

    @Override // defpackage.r58
    public void b(String str, n61 n61) {
        this.a.b(str, c(str, n61));
        this.b.a(this.c.a(str, n61.d()));
    }
}
