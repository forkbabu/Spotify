package defpackage;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.features.album.offline.model.DecorationPolicy;
import com.spotify.music.features.album.offline.model.ListPolicy;
import com.spotify.music.features.album.offline.model.OfflineState;
import com.spotify.music.features.album.offline.model.Policy;
import io.reactivex.internal.operators.observable.ObservableSampleTimed;
import io.reactivex.s;
import io.reactivex.schedulers.a;
import io.reactivex.v;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: ly3  reason: default package */
public class ly3 {
    private static final Joiner b = Joiner.on(",").skipNulls();
    public static final /* synthetic */ int c = 0;
    private final rz3 a;

    public ly3(rz3 rz3) {
        this.a = rz3;
    }

    public v a(String str) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        Boolean bool = Boolean.TRUE;
        builder.mo51put("link", bool);
        builder.mo51put("offline", bool);
        builder.mo51put("syncProgress", bool);
        ImmutableMap<String, Boolean> build = builder.build();
        ListPolicy.a builder2 = ListPolicy.builder();
        builder2.a(build);
        ListPolicy build2 = builder2.build();
        DecorationPolicy.a builder3 = DecorationPolicy.builder();
        builder3.a(build2);
        DecorationPolicy build3 = builder3.build();
        Policy.a builder4 = Policy.builder();
        builder4.a(build3);
        return this.a.b(builder4.build(), ky3.a(str).b().e(), str);
    }

    public s<OfflineState> b(String str) {
        return s.B(new hx3(this, str));
    }

    public s<List<String>> c(b91 b91) {
        List<? extends s81> body = b91.body();
        ArrayList arrayList = new ArrayList(body.size());
        for (s81 s81 : body) {
            if (zy3.a(s81.componentId().id())) {
                arrayList.add(s81.metadata().string("uri"));
            }
        }
        if (body.isEmpty() || arrayList.isEmpty()) {
            return s.i0(Collections.emptyList());
        }
        s<R> j0 = this.a.a(b.join(arrayList)).P().j0(gx3.a);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        y a2 = a.a();
        if (timeUnit == null) {
            throw new NullPointerException("unit is null");
        } else if (a2 != null) {
            return new ObservableSampleTimed(j0, 500, timeUnit, a2, true);
        } else {
            throw new NullPointerException("scheduler is null");
        }
    }
}
