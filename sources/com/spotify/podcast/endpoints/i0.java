package com.spotify.podcast.endpoints;

import com.google.common.base.Optional;
import com.spotify.playlist.models.Episode;
import com.spotify.podcast.endpoints.i;
import com.spotify.podcast.endpoints.policy.Policy;
import io.reactivex.z;
import java.util.Map;

public interface i0 {

    public static abstract class a {

        /* renamed from: com.spotify.podcast.endpoints.i0$a$a  reason: collision with other inner class name */
        public interface AbstractC0382a {
            AbstractC0382a a(Optional<Boolean> optional);

            AbstractC0382a b(Optional<Policy> optional);

            a build();

            AbstractC0382a c(Optional<Boolean> optional);

            AbstractC0382a d(Optional<r> optional);

            AbstractC0382a e(Optional<Integer> optional);

            AbstractC0382a f(Optional<Double> optional);

            AbstractC0382a g(Optional<Integer> optional);

            AbstractC0382a h(Optional<Integer> optional);

            AbstractC0382a i(Optional<Boolean> optional);
        }

        public static AbstractC0382a b() {
            i.b bVar = new i.b();
            bVar.b(Optional.absent());
            i.b bVar2 = bVar;
            bVar2.j(Optional.of(ayd.a));
            i.b bVar3 = bVar2;
            bVar3.d(Optional.absent());
            i.b bVar4 = bVar3;
            bVar4.f(Optional.absent());
            i.b bVar5 = bVar4;
            bVar5.h(Optional.absent());
            i.b bVar6 = bVar5;
            bVar6.c(Optional.of(Boolean.TRUE));
            i.b bVar7 = bVar6;
            bVar7.i(Optional.absent());
            i.b bVar8 = bVar7;
            bVar8.e(Optional.absent());
            i.b bVar9 = bVar8;
            bVar9.a(Optional.absent());
            i.b bVar10 = bVar9;
            bVar10.g(Optional.absent());
            i.b bVar11 = bVar10;
            bVar11.k(500);
            return bVar11;
        }

        public abstract Optional<Integer> a();

        public Map<String, String> c() {
            byd byd = new byd();
            byd.b("available", e());
            byd.b("hasTimeLeft", d());
            byd.b("unique", f());
            byd.e("daysLastPlayed", g());
            byd.d("timePlayed", l());
            cyd cyd = new cyd();
            cyd.c("updateThrottling", Optional.of(Integer.valueOf(m())));
            cyd.g("responseFormat", Optional.of("protobuf"));
            cyd.f("sort", k());
            cyd.d("filter", byd.g());
            cyd.b("relTimeLeftTolerance", j());
            cyd.c("absTimeLeftTolerance", a());
            cyd.e("start", "length", i());
            return cyd.h();
        }

        public abstract Optional<Boolean> d();

        public abstract Optional<Boolean> e();

        public abstract Optional<Boolean> f();

        public abstract Optional<Integer> g();

        public abstract Optional<Policy> h();

        public abstract Optional<r> i();

        public abstract Optional<Double> j();

        public abstract Optional<ane> k();

        public abstract Optional<Integer> l();

        public abstract int m();
    }

    z<com.spotify.playlist.models.i<Episode>> a(a aVar);
}
