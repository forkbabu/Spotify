package defpackage;

import defpackage.re0;
import io.reactivex.d0;
import io.reactivex.e0;
import io.reactivex.z;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.h;

/* renamed from: te0  reason: default package */
public final class te0 {
    private final cqe a;
    private final ae0 b;
    private final pe0 c;

    /* access modifiers changed from: package-private */
    /* renamed from: te0$a */
    public static final class a<Upstream, Downstream> implements e0<R, R> {
        final /* synthetic */ te0 a;
        final /* synthetic */ re0.d b;

        a(te0 te0, re0.d dVar) {
            this.a = te0;
            this.b = dVar;
        }

        @Override // io.reactivex.e0
        public final d0<R> a(z<R> zVar) {
            h.e(zVar, "upstream");
            return this.a.a(zVar, this.b);
        }
    }

    public te0(cqe cqe, ae0 ae0, pe0 pe0) {
        h.e(cqe, "clock");
        h.e(ae0, "authTracker");
        h.e(pe0, "randomIdProvider");
        this.a = cqe;
        this.b = ae0;
        this.c = pe0;
    }

    public <R> z<R> a(z<R> zVar, re0.d dVar) {
        h.e(zVar, "single");
        h.e(dVar, "event");
        cqe cqe = this.a;
        ae0 ae0 = this.b;
        pe0 pe0 = this.c;
        ve0 ve0 = new ve0();
        we0 we0 = new we0();
        h.e(zVar, "single");
        h.e(cqe, "clock");
        h.e(ae0, "authTracker");
        h.e(pe0, "idProvider");
        h.e(dVar, "event");
        h.e(ve0, "throwableToErrorMapper");
        h.e(we0, "successToError");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = null;
        z<R> p = zVar.o(new xe0(ref$ObjectRef, ae0, cqe, pe0, dVar)).m(new ye0(ref$ObjectRef, ve0)).p(new ze0(ref$ObjectRef, we0));
        h.d(p, "single.doOnSubscribe {\n …essToError.map(it))\n    }");
        return p;
    }

    public <R> e0<R, R> b(re0.d dVar) {
        h.e(dVar, "event");
        return new a(this, dVar);
    }
}
