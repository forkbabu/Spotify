package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.playlist.endpoints.d;
import com.spotify.playlist.endpoints.policy.playlist.DecorationPolicy;
import com.spotify.playlist.endpoints.policy.playlist.HeaderPolicy;
import com.spotify.playlist.endpoints.policy.playlist.Policy;
import com.spotify.playlist.models.k;
import io.reactivex.s;
import io.reactivex.z;

/* access modifiers changed from: package-private */
/* renamed from: qr6  reason: default package */
public class qr6 {
    private static final d.b b;
    private final d a;

    static {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        Boolean bool = Boolean.TRUE;
        builder.mo51put("link", bool);
        builder.mo51put("name", bool);
        builder.mo51put("formatListType", bool);
        builder.mo51put("formatListAttributes", bool);
        builder.mo51put("onDemandInFreeReason", bool);
        builder.mo51put("preferLinearPlayback", bool);
        ImmutableMap build = builder.build();
        HeaderPolicy.a builder2 = HeaderPolicy.builder();
        builder2.a(build);
        HeaderPolicy b2 = builder2.b();
        DecorationPolicy.a builder3 = DecorationPolicy.builder();
        builder3.b(b2);
        DecorationPolicy a2 = builder3.a();
        Policy.a builder4 = Policy.builder();
        builder4.b(a2);
        Policy a3 = builder4.a();
        d.b.a b3 = d.b.b();
        b3.g(a3);
        b3.i(new qxd(0, 0));
        b = b3.b();
    }

    qr6(d dVar) {
        this.a = dVar;
    }

    /* access modifiers changed from: package-private */
    public z<k> a(String str) {
        return this.a.d(str, b);
    }

    /* access modifiers changed from: package-private */
    public s<k> b(String str) {
        return this.a.a(str, b);
    }
}
