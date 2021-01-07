package defpackage;

import android.graphics.Bitmap;
import com.google.common.base.Optional;
import com.spotify.share.sharedata.o;
import com.spotify.share.sharedata.q;
import com.spotify.share.sharedata.r;
import com.spotify.share.sharedata.u;
import io.reactivex.d0;
import io.reactivex.z;
import java.util.Arrays;
import java.util.Map;
import retrofit2.v;

/* renamed from: c0d  reason: default package */
public class c0d implements b0d {
    private final Map<Integer, p1d> a;
    private final Map<Integer, w9e> b;
    private final w1d c;

    c0d(Map<Integer, p1d> map, Map<Integer, w9e> map2, w1d w1d) {
        this.a = map;
        this.b = map2;
        this.c = w1d;
    }

    @Override // defpackage.b0d
    public z<u<?>> a(o8e o8e, r rVar) {
        p1d p1d = this.a.get(Integer.valueOf(o8e.id()));
        if (p1d != null) {
            return p1d.a(rVar.g()).s(new tzc(this, o8e, rVar));
        }
        StringBuilder V0 = je.V0("StoryBackendApi for ");
        V0.append(o8e.id());
        V0.append(" is not provided.");
        return z.q(new Exception(V0.toString()));
    }

    public d0 b(o8e o8e, r rVar, v vVar) {
        Optional optional;
        Object obj;
        w9e w9e = this.b.get(Integer.valueOf(o8e.id()));
        if (w9e == null) {
            optional = Optional.absent();
        } else {
            if (w9e.b()) {
                Optional<Bitmap> b2 = this.c.b(vVar);
                if (!b2.isPresent()) {
                    optional = Optional.absent();
                } else {
                    obj = q.k(rVar, b2.get(), Optional.absent());
                }
            } else {
                Optional<Bitmap> a2 = this.c.a(vVar);
                if (!a2.isPresent()) {
                    optional = Optional.absent();
                } else {
                    obj = o.j(rVar, Arrays.asList(vVar.e().c("X-Background-Top-Color"), vVar.e().c("X-Background-Bottom-Color")), a2.get());
                }
            }
            optional = Optional.of(obj);
        }
        if (optional.isPresent()) {
            return z.z(optional.get());
        }
        return z.q(new Exception("Can't convert response to bitmap"));
    }
}
