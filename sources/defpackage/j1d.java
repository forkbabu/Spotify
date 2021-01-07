package defpackage;

import android.graphics.Bitmap;
import com.google.common.base.Optional;
import io.reactivex.z;
import java.util.Arrays;
import java.util.Map;
import retrofit2.v;

/* renamed from: j1d  reason: default package */
public class j1d implements i1d {
    private final w1d a;
    private final l1d b;
    private final n1d c;
    private final Map<Integer, p1d> d;

    public j1d(w1d w1d, l1d l1d, n1d n1d, Map<Integer, p1d> map) {
        this.a = w1d;
        this.b = l1d;
        this.c = n1d;
        this.d = map;
    }

    public static z c(j1d j1d, v vVar) {
        Optional optional;
        j1d.getClass();
        String c2 = vVar.e().c("X-Background-Top-Color");
        String c3 = vVar.e().c("X-Background-Bottom-Color");
        Optional<Bitmap> a2 = j1d.a.a(vVar);
        if (a2.isPresent()) {
            optional = Optional.of(new g1d(a2.get(), Arrays.asList(c2, c3)));
        } else {
            optional = Optional.absent();
        }
        if (optional.isPresent()) {
            return z.z(optional.get());
        }
        return z.q(new Exception("Can't convert response to bitmap"));
    }

    @Override // defpackage.i1d
    public z<h1d> a(String str) {
        return this.b.a(str).s(new f1d(this));
    }

    @Override // defpackage.i1d
    public z<h1d> b(String str) {
        return this.c.a(str).s(new f1d(this));
    }
}
