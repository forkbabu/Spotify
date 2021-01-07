package defpackage;

import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.connection.g;
import io.reactivex.z;

/* renamed from: d6b  reason: default package */
public class d6b implements g6b {
    private final z5b a;

    public d6b(z5b z5b) {
        this.a = z5b;
    }

    @Override // defpackage.g6b
    public z<d7b<b91>> a(s7b s7b, g gVar) {
        String str;
        gVar.getClass();
        if ((gVar instanceof g.b) || (gVar instanceof g.a)) {
            return z.z(d7b.a());
        }
        if (s7b instanceof t7b) {
            str = ((t7b) s7b).e();
        } else {
            Assertion.g("Request is not a drilldown request to parse the drilldown path: " + s7b);
            str = "";
        }
        return this.a.a(str, s7b).A(new q5b(s7b));
    }
}
