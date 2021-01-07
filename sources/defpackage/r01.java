package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.credentials.store.CredentialsSource;
import com.spotify.credentials.store.a;
import com.spotify.credentials.store.b;
import com.spotify.login.AuthenticationMetadata;
import com.spotify.login.r0;
import com.spotify.login.w0;
import defpackage.ce0;
import defpackage.je0;
import defpackage.t01;
import io.reactivex.d0;
import io.reactivex.internal.functions.Functions;
import io.reactivex.z;

/* renamed from: r01  reason: default package */
public class r01 {
    private final b a;
    private final r0 b;
    private final ae0 c;

    public r01(b bVar, r0 r0Var, ae0 ae0) {
        this.a = bVar;
        this.b = r0Var;
        this.c = ae0;
    }

    public z<t01> a() {
        return this.a.b().M(new m01(this), Functions.c).T().s(new q01(this));
    }

    public /* synthetic */ void b(io.reactivex.disposables.b bVar) {
        this.a.d();
    }

    public d0 c(a aVar) {
        AuthenticationMetadata.AuthSource authSource;
        Logger.b("Auto-login response %s", aVar);
        aVar.getClass();
        if (!(aVar instanceof a.c)) {
            return z.z(t01.a.a);
        }
        a.c cVar = (a.c) aVar;
        r0 r0Var = this.b;
        String f = cVar.f();
        String d = cVar.d();
        CredentialsSource e = cVar.e();
        if (e != null) {
            int ordinal = e.ordinal();
            if (ordinal == 0) {
                authSource = AuthenticationMetadata.AuthSource.AUTOSMARTLOCK;
            } else if (ordinal == 1) {
                authSource = AuthenticationMetadata.AuthSource.ASSISTEDSMARTLOCK;
            }
            return r0Var.b(f, d, false, authSource).B(io.reactivex.android.schedulers.a.b()).A(new o01(this));
        }
        authSource = null;
        return r0Var.b(f, d, false, authSource).B(io.reactivex.android.schedulers.a.b()).A(new o01(this));
    }

    public /* synthetic */ t01 d(w0.b bVar) {
        this.c.a(new ce0.b(je0.n.b));
        return t01.b.a;
    }

    public t01 e(w0.a aVar) {
        int c2 = aVar.c();
        if (c2 == 2 || c2 == 3 || c2 == 11 || c2 == 19) {
            this.a.c();
        }
        return t01.a.a;
    }
}
