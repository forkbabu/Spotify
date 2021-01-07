package defpackage;

import io.reactivex.d0;
import okhttp3.c0;
import okhttp3.e0;
import retrofit2.w;

/* renamed from: mhf  reason: default package */
public abstract class mhf<TRequest, TResponse> {
    private final nhf a;

    protected mhf(w wVar) {
        this.a = (nhf) wVar.d(nhf.class);
    }

    /* access modifiers changed from: protected */
    public abstract TResponse a(e0 e0Var);

    public d0 b(boolean z, c0 c0Var) {
        return this.a.a(c0Var, z ? "alternative-results" : "");
    }

    /* access modifiers changed from: protected */
    public abstract c0 c(TRequest trequest);
}
