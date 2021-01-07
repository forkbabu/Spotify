package defpackage;

import io.reactivex.s;
import io.reactivex.y;

/* renamed from: qhf  reason: default package */
public class qhf<TRequest, TResponse> {
    private final wlf<mhf<TRequest, TResponse>> a;
    private final wlf<y> b;

    public qhf(wlf<mhf<TRequest, TResponse>> wlf, wlf<y> wlf2) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    public phf<TRequest, TResponse> b(ohf<TRequest, TResponse> ohf, s<Boolean> sVar) {
        mhf<TRequest, TResponse> mhf = this.a.get();
        a(mhf, 1);
        a(ohf, 2);
        a(sVar, 3);
        y yVar = this.b.get();
        a(yVar, 4);
        return new phf<>(mhf, ohf, sVar, yVar);
    }
}
