package defpackage;

import com.fasterxml.jackson.databind.ObjectReader;
import okhttp3.e0;
import retrofit2.j;

/* renamed from: fqf  reason: default package */
final class fqf<T> implements j<e0, T> {
    private final ObjectReader a;

    fqf(ObjectReader objectReader) {
        this.a = objectReader;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // retrofit2.j
    public Object convert(e0 e0Var) {
        e0 e0Var2 = e0Var;
        try {
            return this.a.readValue(e0Var2.d());
        } finally {
            e0Var2.close();
        }
    }
}
