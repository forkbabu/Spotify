package defpackage;

import okhttp3.c0;
import okhttp3.w;
import retrofit2.j;

/* renamed from: jqf  reason: default package */
final class jqf<T> implements j<T, c0> {
    static final jqf<Object> a = new jqf<>();
    private static final w b = w.c("text/plain; charset=UTF-8");

    private jqf() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // retrofit2.j
    public c0 convert(Object obj) {
        return c0.d(b, String.valueOf(obj));
    }
}
