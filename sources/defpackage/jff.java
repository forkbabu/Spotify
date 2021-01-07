package defpackage;

import android.os.Parcelable;
import defpackage.uef;
import java.util.Locale;

/* renamed from: jff  reason: default package */
public abstract class jff implements Parcelable {

    /* renamed from: jff$a */
    public interface a {
    }

    public static jff b() {
        uef.b bVar = new uef.b();
        bVar.f(false);
        uef.b bVar2 = bVar;
        bVar2.d(false);
        uef.b bVar3 = bVar2;
        bVar3.e(false);
        uef.b bVar4 = bVar3;
        bVar4.g(false);
        uef.b bVar5 = bVar4;
        bVar5.c(false);
        uef.b bVar6 = bVar5;
        bVar6.b(Locale.US.getCountry());
        return bVar6.a();
    }

    public abstract String a();

    public abstract boolean c();

    public abstract boolean e();

    public abstract a f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract boolean i();

    public jff j(boolean z) {
        uef.b bVar = (uef.b) f();
        bVar.c(z);
        return bVar.a();
    }

    public jff k(boolean z) {
        uef.b bVar = (uef.b) f();
        bVar.d(z);
        return bVar.a();
    }

    public jff l(boolean z) {
        uef.b bVar = (uef.b) f();
        bVar.f(z);
        return bVar.a();
    }

    public jff m(boolean z) {
        uef.b bVar = (uef.b) f();
        bVar.g(z);
        return bVar.a();
    }
}
