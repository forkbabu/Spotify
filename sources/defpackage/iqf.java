package defpackage;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.k;
import com.google.protobuf.u;
import com.google.protobuf.x;
import okhttp3.e0;
import retrofit2.j;

/* renamed from: iqf  reason: default package */
final class iqf<T extends u> implements j<e0, T> {
    private final x<T> a;
    private final k b;

    iqf(x<T> xVar, k kVar) {
        this.a = xVar;
        this.b = kVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // retrofit2.j
    public Object convert(e0 e0Var) {
        T t;
        e0 e0Var2 = e0Var;
        try {
            if (this.b == null) {
                t = this.a.b(e0Var2.a());
            } else {
                t = this.a.c(e0Var2.a(), this.b);
            }
            e0Var2.close();
            return t;
        } catch (InvalidProtocolBufferException e) {
            throw new RuntimeException(e);
        } catch (Throwable th) {
            e0Var2.close();
            throw th;
        }
    }
}
