package defpackage;

import com.spotify.mobile.android.util.decorator.d;
import io.reactivex.s;
import java.util.Map;

/* renamed from: g62  reason: default package */
public class g62<T> {
    private final d<T> a;

    public g62(d<T> dVar) {
        this.a = dVar;
    }

    public s<Map<String, T>> a(String str, String... strArr) {
        return this.a.create().e(str, strArr).P();
    }
}
