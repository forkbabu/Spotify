package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.a;
import kotlin.coroutines.b;
import kotlin.coroutines.c;
import kotlin.jvm.internal.h;

public abstract class ContinuationImpl extends BaseContinuationImpl {
    private final c _context;
    private transient a<Object> a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContinuationImpl(a<Object> aVar) {
        super(aVar);
        c context = aVar != null ? aVar.getContext() : null;
        this._context = context;
    }

    /* access modifiers changed from: protected */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void g() {
        a<?> aVar = this.a;
        if (!(aVar == null || aVar == this)) {
            c cVar = this._context;
            h.c(cVar);
            c.a c = cVar.c(b.m);
            h.c(c);
            ((b) c).a(aVar);
        }
        this.a = a.a;
    }

    @Override // kotlin.coroutines.a
    public c getContext() {
        c cVar = this._context;
        h.c(cVar);
        return cVar;
    }

    public final a<Object> h() {
        a<Object> aVar = this.a;
        if (aVar == null) {
            c cVar = this._context;
            h.c(cVar);
            b bVar = (b) cVar.c(b.m);
            if (bVar == null || (aVar = bVar.b(this)) == null) {
                aVar = this;
            }
            this.a = aVar;
        }
        return aVar;
    }
}
