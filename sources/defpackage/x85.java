package defpackage;

import android.net.Uri;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;
import java.util.HashMap;

/* renamed from: x85  reason: default package */
public class x85 {
    private final wlf<h81> a;
    private final ia5 b;
    private final boolean c;
    private final w85 d;

    public x85(wlf<h81> wlf, ia5 ia5, boolean z, w85 w85) {
        wlf.getClass();
        this.a = wlf;
        ia5.getClass();
        this.b = ia5;
        this.c = z;
        this.d = w85;
    }

    public s<b91> a(String str) {
        if (this.c) {
            return new v(this.a.get().a());
        }
        return this.b.a(str).W(new v85(this), false, Integer.MAX_VALUE);
    }

    public io.reactivex.v b(Uri uri) {
        this.b.getClass();
        String lastPathSegment = uri.getLastPathSegment();
        this.b.getClass();
        HashMap hashMap = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            hashMap.put(str, uri.getQueryParameter(str));
        }
        return this.d.a(lastPathSegment, hashMap).e(b91.class).P();
    }
}
