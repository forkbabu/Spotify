package defpackage;

import io.reactivex.z;
import okhttp3.e0;
import retrofit2.v;

/* renamed from: p1d  reason: default package */
public class p1d {
    private final q1d a;
    private final String b;

    public p1d(q1d q1d, String str) {
        this.a = q1d;
        this.b = str;
    }

    public z<v<e0>> a(String str) {
        return this.a.c(this.b, str);
    }
}
