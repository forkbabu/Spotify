package defpackage;

import com.google.common.base.Optional;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.connection.g;
import io.reactivex.z;

/* renamed from: c6b  reason: default package */
public class c6b implements g6b {
    private final l6b a;
    private final sg0<gua, b91> b;

    public c6b(l6b l6b, sg0<gua, b91> sg0) {
        this.a = l6b;
        this.b = sg0;
    }

    @Override // defpackage.g6b
    public z<d7b<b91>> a(s7b s7b, g gVar) {
        String str;
        gVar.getClass();
        if ((gVar instanceof g.b) || (gVar instanceof g.a)) {
            return z.z(d7b.a());
        }
        boolean z = s7b instanceof t7b;
        if (z) {
            str = ((t7b) s7b).e();
        } else {
            Assertion.g("Request is not a drilldown request to parse the drilldown path: " + s7b);
            str = "";
        }
        Optional<Integer> absent = Optional.absent();
        if (z) {
            absent = ((t7b) s7b).f();
        } else {
            Assertion.g("Request is not a drilldown request to parse the next offset: " + s7b);
        }
        z<R> A = this.a.b(s7b, str).A(new o5b(s7b, str, absent));
        sg0<gua, b91> sg0 = this.b;
        sg0.getClass();
        return A.A(new u5b(sg0)).A(new p5b(s7b));
    }
}
