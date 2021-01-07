package defpackage;

import defpackage.pyc;
import io.reactivex.functions.g;
import io.reactivex.functions.l;
import io.reactivex.z;
import kotlin.jvm.internal.h;
import retrofit2.v;

/* renamed from: qyc  reason: default package */
public final class qyc implements pyc {
    private final lyc a;
    private final myc b;

    /* renamed from: qyc$a */
    static final class a<T, R> implements l<v<String>, pyc.a> {
        final /* synthetic */ qyc a;

        a(qyc qyc) {
            this.a = qyc;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public pyc.a apply(v<String> vVar) {
            v<String> vVar2 = vVar;
            h.e(vVar2, "response");
            this.a.getClass();
            String a2 = vVar2.a();
            if (vVar2.b() != 200 || a2 == null) {
                return pyc.a.C0671a.a;
            }
            return new pyc.a.b(a2);
        }
    }

    /* renamed from: qyc$b */
    static final class b<T> implements g<pyc.a> {
        final /* synthetic */ qyc a;

        b(qyc qyc) {
            this.a = qyc;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(pyc.a aVar) {
            pyc.a aVar2 = aVar;
            qyc qyc = this.a;
            h.d(aVar2, "response");
            qyc.b(qyc, aVar2);
        }
    }

    public qyc(lyc lyc, myc myc) {
        h.e(lyc, "partnerUserIdTokenEndpoint");
        h.e(myc, "samsungPartnerUserIdCache");
        this.a = lyc;
        this.b = myc;
    }

    public static final void b(qyc qyc, pyc.a aVar) {
        qyc.getClass();
        if (aVar instanceof pyc.a.b) {
            qyc.b.b(((pyc.a.b) aVar).a());
        }
    }

    @Override // defpackage.pyc
    public z<pyc.a> a() {
        String a2 = this.b.a();
        if (a2 != null) {
            z<pyc.a> z = z.z(new pyc.a.b(a2));
            h.d(z, "Single.just(TokenResponse.Success(token))");
            return z;
        }
        z<R> p = this.a.a("samsung").A(new a(this)).p(new b(this));
        h.d(p, "partnerUserIdTokenEndpoi…-> cacheToken(response) }");
        return p;
    }
}
