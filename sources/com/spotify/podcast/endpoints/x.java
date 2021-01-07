package com.spotify.podcast.endpoints;

import com.google.common.base.Optional;
import com.spotify.podcast.endpoints.h;
import com.spotify.podcast.endpoints.policy.ShowPolicy;
import io.reactivex.s;
import java.util.Map;

public interface x {

    public static abstract class a {

        /* renamed from: com.spotify.podcast.endpoints.x$a$a  reason: collision with other inner class name */
        public interface AbstractC0383a {
            AbstractC0383a a(Optional<ane> optional);

            AbstractC0383a b(Optional<ShowPolicy> optional);

            a build();

            AbstractC0383a c(Optional<Boolean> optional);

            AbstractC0383a d(Optional<r> optional);

            AbstractC0383a e(Optional<String> optional);

            AbstractC0383a f(Optional<Boolean> optional);

            AbstractC0383a g(Optional<Boolean> optional);

            AbstractC0383a h(Optional<Integer> optional);

            AbstractC0383a i(Optional<Boolean> optional);

            AbstractC0383a j(Optional<Boolean> optional);
        }

        public static AbstractC0383a b() {
            h.b bVar = new h.b();
            bVar.p(500);
            h.b bVar2 = bVar;
            bVar2.b(Optional.absent());
            h.b bVar3 = bVar2;
            bVar3.c(Optional.absent());
            h.b bVar4 = bVar3;
            bVar4.i(Optional.absent());
            h.b bVar5 = bVar4;
            bVar5.f(Optional.absent());
            h.b bVar6 = bVar5;
            bVar6.j(Optional.absent());
            h.b bVar7 = bVar6;
            bVar7.g(Optional.absent());
            h.b bVar8 = bVar7;
            bVar8.a(Optional.absent());
            h.b bVar9 = bVar8;
            bVar9.l(Optional.absent());
            h.b bVar10 = bVar9;
            bVar10.m(Optional.absent());
            h.b bVar11 = bVar10;
            bVar11.n(Optional.absent());
            h.b bVar12 = bVar11;
            bVar12.k(Optional.absent());
            h.b bVar13 = bVar12;
            bVar13.e(Optional.absent());
            h.b bVar14 = bVar13;
            bVar14.h(Optional.absent());
            h.b bVar15 = bVar14;
            bVar15.o(Optional.absent());
            h.b bVar16 = bVar15;
            bVar16.d(Optional.absent());
            return bVar16;
        }

        public abstract Optional<Integer> a();

        public Map<String, String> c() {
            byd byd = new byd();
            byd.b("available", h());
            byd.b("hasTimeLeft", d());
            byd.e("daysLastPlayed", j());
            byd.d("timePlayed", p());
            byd.b("availableOffline", i());
            byd.b("inCollection", e());
            byd.f("startedPlaying", r());
            byd.f("isPlayed", r());
            byd.b("videoEpisode", t());
            byd.a("text", o());
            cyd cyd = new cyd();
            cyd.c("updateThrottling", Optional.of(Integer.valueOf(s())));
            cyd.g("responseFormat", Optional.of("protobuf"));
            cyd.f("sort", n());
            cyd.d("filter", byd.g());
            cyd.b("relTimeLeftTolerance", m());
            cyd.c("absTimeLeftTolerance", a());
            cyd.e("start", "length", l());
            cyd.g("includeInRange", f());
            cyd.c("includeInRangeContext", g());
            return cyd.h();
        }

        public abstract Optional<Boolean> d();

        public abstract Optional<Boolean> e();

        public abstract Optional<String> f();

        public abstract Optional<Integer> g();

        public abstract Optional<Boolean> h();

        public abstract Optional<Boolean> i();

        public abstract Optional<Integer> j();

        public abstract Optional<ShowPolicy> k();

        public abstract Optional<r> l();

        public abstract Optional<Double> m();

        public abstract Optional<ane> n();

        public abstract Optional<String> o();

        public abstract Optional<Integer> p();

        public abstract AbstractC0383a q();

        public abstract Optional<Boolean> r();

        public abstract int s();

        public abstract Optional<Boolean> t();
    }

    s<qyd> a(String str, a aVar);
}
