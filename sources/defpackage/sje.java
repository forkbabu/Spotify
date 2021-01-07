package defpackage;

import android.os.Parcelable;
import defpackage.kje;
import defpackage.tje;

/* renamed from: sje  reason: default package */
public abstract class sje implements Parcelable {
    public static final sje a;

    /* renamed from: sje$a */
    public interface a {
    }

    static {
        kje.b bVar = new kje.b();
        bVar.d(false);
        bVar.f(new tje.a());
        bVar.h(false);
        bVar.g(false);
        bVar.c(false);
        bVar.b(false);
        bVar.e(false);
        bVar.i(false);
        a = bVar.a();
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract boolean e();

    public String f() {
        return (String) g().b(nje.a, oje.a);
    }

    public abstract tje g();

    public abstract boolean h();

    public abstract boolean i();

    public abstract boolean j();

    public abstract a k();

    public sje l(boolean z) {
        kje.b bVar = (kje.b) k();
        bVar.g(z);
        return bVar.a();
    }

    public sje m(boolean z) {
        kje.b bVar = (kje.b) k();
        bVar.d(z);
        return bVar.a();
    }

    public sje n(boolean z) {
        kje.b bVar = (kje.b) k();
        bVar.i(z);
        return bVar.a();
    }

    public sje o(boolean z) {
        kje.b bVar = (kje.b) k();
        bVar.h(z);
        return bVar.a();
    }
}
