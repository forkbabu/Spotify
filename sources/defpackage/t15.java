package defpackage;

import com.google.protobuf.u;
import com.spotify.messages.FollowFeedImpression;
import com.spotify.messages.FollowFeedInteraction;
import defpackage.t25;
import defpackage.u25;
import java.util.UUID;
import kotlin.jvm.internal.h;

/* renamed from: t15  reason: default package */
public final class t15 implements c25 {
    private static final String b;
    private final gl0<u> a;

    static {
        String uuid = UUID.randomUUID().toString();
        h.d(uuid, "UUID.randomUUID().toString()");
        b = uuid;
    }

    public t15(gl0<u> gl0) {
        h.e(gl0, "eventPublisher");
        this.a = gl0;
    }

    @Override // defpackage.c25
    public void a(a35 a35) {
        h.e(a35, "event");
    }

    @Override // defpackage.c25
    public void b(u25 u25) {
        h.e(u25, "event");
        if (h.a(u25, u25.c.a)) {
            g25 f = h25.f();
            gl0<u> gl0 = this.a;
            FollowFeedInteraction.b n = FollowFeedInteraction.n();
            n.o(b);
            n.p(f.c());
            n.n(f.b());
            gl0.c(n.build());
        }
    }

    @Override // defpackage.c25
    public void c(t25 t25) {
        h.e(t25, "event");
        if (t25 instanceof t25.b) {
            f25 f25 = new f25(((t25.b) t25).a() ? "feed-entry-button-impression-badged" : "feed-entry-button-impression", 0, null, null, 14);
            gl0<u> gl0 = this.a;
            FollowFeedImpression.b o = FollowFeedImpression.o();
            o.p(b);
            o.q(f25.d());
            gl0.c(o.build());
        }
    }
}
