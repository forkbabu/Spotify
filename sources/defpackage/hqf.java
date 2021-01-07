package defpackage;

import com.google.protobuf.u;
import okhttp3.c0;
import okhttp3.w;
import retrofit2.j;

/* renamed from: hqf  reason: default package */
final class hqf<T extends u> implements j<T, c0> {
    private static final w a = w.c("application/x-protobuf");

    hqf() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // retrofit2.j
    public c0 convert(Object obj) {
        return c0.e(a, ((u) obj).toByteArray());
    }
}
