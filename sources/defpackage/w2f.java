package defpackage;

import defpackage.u2f;
import defpackage.x2f;

/* renamed from: w2f  reason: default package */
public abstract class w2f {

    /* access modifiers changed from: package-private */
    /* renamed from: w2f$a */
    public interface a {
    }

    public static w2f a(String str) {
        u2f.b bVar = new u2f.b();
        bVar.d(new x2f.f());
        u2f.b bVar2 = bVar;
        bVar2.g("");
        u2f.b bVar3 = bVar2;
        bVar3.b(str);
        u2f.b bVar4 = bVar3;
        bVar4.f("");
        u2f.b bVar5 = bVar4;
        bVar5.c(v2f.b());
        u2f.b bVar6 = bVar5;
        bVar6.e(false);
        return bVar6.a();
    }

    public abstract String b();

    public abstract v2f c();

    public abstract x2f d();

    public abstract boolean e();

    public abstract String f();

    public abstract a g();

    public abstract String h();

    public w2f i(String str) {
        u2f.b bVar = (u2f.b) g();
        bVar.b(str);
        return bVar.a();
    }

    public w2f j(v2f v2f) {
        u2f.b bVar = (u2f.b) g();
        bVar.c(v2f);
        return bVar.a();
    }

    public w2f k(x2f x2f) {
        u2f.b bVar = (u2f.b) g();
        bVar.d(x2f);
        return bVar.a();
    }

    public w2f l(boolean z) {
        u2f.b bVar = (u2f.b) g();
        bVar.e(z);
        return bVar.a();
    }

    public w2f m(String str) {
        u2f.b bVar = (u2f.b) g();
        bVar.g(str);
        return bVar.a();
    }
}
