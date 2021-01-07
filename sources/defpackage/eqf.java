package defpackage;

import com.fasterxml.jackson.databind.ObjectWriter;
import okhttp3.c0;
import okhttp3.w;
import retrofit2.j;

/* renamed from: eqf  reason: default package */
final class eqf<T> implements j<T, c0> {
    private static final w b = w.c("application/json; charset=UTF-8");
    private final ObjectWriter a;

    eqf(ObjectWriter objectWriter) {
        this.a = objectWriter;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // retrofit2.j
    public c0 convert(Object obj) {
        return c0.e(b, this.a.writeValueAsBytes(obj));
    }
}
