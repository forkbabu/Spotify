package defpackage;

import android.os.Parcelable;
import com.spotify.login.AuthenticationMetadata;
import defpackage.gee;
import defpackage.mbe;

/* renamed from: kee  reason: default package */
public abstract class kee implements Parcelable {
    public static final kee a;

    /* renamed from: kee$a */
    public interface a {
    }

    static {
        mbe.b bVar = new mbe.b();
        bVar.d(phe.a);
        fee fee = fee.a;
        bVar.l(new gee.a(fee));
        bVar.k(pke.a);
        bVar.a(tae.a);
        bVar.f(zie.a.g(fee.e()));
        bVar.i(sje.a);
        bVar.g(true);
        bVar.h(null);
        bVar.b(null);
        bVar.e(null);
        bVar.j(0);
        a = bVar.c();
    }

    public abstract tae a();

    public abstract AuthenticationMetadata.AuthSource b();

    public abstract phe c();

    public abstract com.spotify.loginflow.navigation.a e();

    public abstract zie f();

    public abstract boolean g();

    public abstract String h();

    public boolean i() {
        return (m() && k() == 1) || k() == 3;
    }

    public abstract sje j();

    public abstract int k();

    public abstract pke l();

    public boolean m() {
        return (h() == null && e() == null) ? false : true;
    }

    public abstract gee n();

    public abstract a o();

    public kee p(AuthenticationMetadata.AuthSource authSource) {
        mbe.b bVar = (mbe.b) o();
        bVar.b(authSource);
        return bVar.c();
    }

    public kee q(phe phe) {
        mbe.b bVar = (mbe.b) o();
        bVar.d(phe);
        return bVar.c();
    }

    public kee r(com.spotify.loginflow.navigation.a aVar) {
        mbe.b bVar = (mbe.b) o();
        bVar.e(aVar);
        return bVar.c();
    }

    public kee s(zie zie) {
        mbe.b bVar = (mbe.b) o();
        bVar.f(zie);
        return bVar.c();
    }

    public kee t(String str) {
        mbe.b bVar = (mbe.b) o();
        bVar.h(str);
        return bVar.c();
    }

    public kee u(sje sje) {
        mbe.b bVar = (mbe.b) o();
        bVar.i(sje);
        return bVar.c();
    }

    public kee v(int i) {
        mbe.b bVar = (mbe.b) o();
        bVar.j(i);
        return bVar.c();
    }
}
