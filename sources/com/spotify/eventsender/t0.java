package com.spotify.eventsender;

import android.os.SystemClock;
import android.util.Pair;
import com.google.common.base.Optional;
import com.google.common.collect.FluentIterable;
import com.google.protobuf.ByteString;
import com.spotify.eventsender.l0;
import com.spotify.eventsender.w;
import com.spotify.messages.EventSenderStats;
import com.spotify.messages.RejectedClientEventNonAuth;
import io.reactivex.functions.l;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

public class t0 implements l0 {
    private final zk0 a;
    private final b b;
    private final a c;
    private final a0 d;
    private final l0.a e;
    private final f0 f;
    private final g0 g;
    private final long h;
    private AtomicLong i = new AtomicLong(0);

    static class a implements l<EventSenderStats, c0> {
        private final pk0 a;
        private final wk0 b;
        private e0 c;
        private final gk0 f;

        a(gk0 gk0, pk0 pk0, wk0 wk0, e0 e0Var) {
            this.f = gk0;
            this.a = pk0;
            this.b = wk0;
            this.c = e0Var;
        }

        /* renamed from: a */
        public c0 apply(EventSenderStats eventSenderStats) {
            long c2 = ((xk0) this.b).c("EventSenderStats", this.a.a(this.c.a()));
            if (c2 == 0) {
                c2 = 1;
            }
            ((xk0) this.b).d(new vk0("EventSenderStats", 1 + c2, this.a.a(this.c.a())));
            w.b bVar = new w.b();
            bVar.d(-100);
            bVar.b("EventSenderStats");
            bVar.c(FluentIterable.from(this.f.a()).transform(o.a).append(Pair.create("message", ByteString.h(eventSenderStats.toByteArray()))));
            bVar.e(ByteString.h(this.a.a(this.c.a())));
            bVar.f(c2);
            return bVar.a();
        }
    }

    static class b implements l<List<yk0>, EventSenderStats> {
        b() {
        }

        /* renamed from: a */
        public EventSenderStats apply(List<yk0> list) {
            EventSenderStats.b m = EventSenderStats.m();
            for (yk0 yk0 : list) {
                Long l = yk0.b;
                if (l != null) {
                    m.m(yk0.a, l.longValue());
                } else {
                    m.m(yk0.a, yk0.c.longValue());
                }
                m.o(yk0.a, yk0.d.longValue());
                m.n(yk0.a, yk0.c.longValue());
            }
            return (EventSenderStats) m.build();
        }
    }

    t0(zk0 zk0, pk0 pk0, wk0 wk0, gk0 gk0, a0 a0Var, l0.a aVar, f0 f0Var, g0 g0Var, long j) {
        this.a = zk0;
        this.d = a0Var;
        this.e = aVar;
        this.f = f0Var;
        this.g = g0Var;
        this.h = j;
        this.b = new b();
        this.c = new a(gk0, pk0, wk0, f0Var);
    }

    @Override // com.spotify.eventsender.l0
    public l0.a a() {
        return this.e;
    }

    @Override // com.spotify.eventsender.l0
    public void b(Set<Long> set) {
        if (set.size() > 0) {
            AtomicLong atomicLong = this.i;
            ((o0) this.d).getClass();
            atomicLong.set(SystemClock.elapsedRealtime());
        }
    }

    @Override // com.spotify.eventsender.l0
    public List<c0> get() {
        Optional<String> a2 = this.f.a();
        if (this.f.b(a2)) {
            ((o0) this.d).getClass();
            if (SystemClock.elapsedRealtime() - this.i.get() >= this.h) {
                EventSenderStats a3 = this.b.apply(FluentIterable.from(this.a.a(a2.get())).filter(p.a).toList());
                if (a3.getSerializedSize() <= 102400) {
                    return Collections.singletonList(this.c.apply(a3));
                }
                g0 g0Var = this.g;
                RejectedClientEventNonAuth.b l = RejectedClientEventNonAuth.l();
                l.m("EventSenderStats");
                l.n("PAYLOAD_SIZE_LIMIT_EXCEEDED");
                g0Var.a("RejectedClientEventNonAuth", l.build().toByteArray(), false, null);
                return Collections.emptyList();
            }
        }
        return Collections.emptyList();
    }
}
