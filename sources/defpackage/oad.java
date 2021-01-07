package defpackage;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.collect.ImmutableList;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.sociallistening.models.Session;
import com.spotify.music.sociallistening.nearby.medium.NearbyMediumWifi;
import io.reactivex.e;
import io.reactivex.functions.g;
import io.reactivex.functions.l;
import io.reactivex.functions.n;
import io.reactivex.internal.functions.Functions;
import io.reactivex.s;
import io.reactivex.v;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;

/* renamed from: oad  reason: default package */
public final class oad implements lad {
    private final Cache<String, Session> a;
    private final io.reactivex.disposables.a b = new io.reactivex.disposables.a();
    private final NearbyMediumWifi c;
    private final tad d;
    private final w7d e;
    private final f4d f;

    /* renamed from: oad$a */
    static final class a<T, R> implements l<ImmutableList<String>, v<? extends ImmutableList<Session>>> {
        final /* synthetic */ oad a;

        a(oad oad) {
            this.a = oad;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public v<? extends ImmutableList<Session>> apply(ImmutableList<String> immutableList) {
            ImmutableList<String> immutableList2 = immutableList;
            h.e(immutableList2, "tokens");
            s d0 = s.d0(immutableList2);
            oad oad = this.a;
            oad.getClass();
            return d0.q(new rad(oad)).Z0().A(nad.a).P();
        }
    }

    /* renamed from: oad$b */
    static final class b<T> implements g<Throwable> {
        final /* synthetic */ oad a;

        b(oad oad) {
            this.a = oad;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Throwable th) {
            oad.e(this.a, th.getMessage());
        }
    }

    /* renamed from: oad$c */
    static final class c<T> implements n<List<com.spotify.music.sociallistening.models.b>> {
        public static final c a = new c();

        c() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.n
        public boolean test(List<com.spotify.music.sociallistening.models.b> list) {
            List<com.spotify.music.sociallistening.models.b> list2 = list;
            h.e(list2, "it");
            if (list2.size() != 2 || !(!h.a(list2.get(0).b(), list2.get(1).b()))) {
                return false;
            }
            return list2.get(0).h() || list2.get(1).h();
        }
    }

    /* renamed from: oad$d */
    static final class d<T, R> implements l<List<com.spotify.music.sociallistening.models.b>, e> {
        final /* synthetic */ oad a;

        d(oad oad) {
            this.a = oad;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public e apply(List<com.spotify.music.sociallistening.models.b> list) {
            List<com.spotify.music.sociallistening.models.b> list2 = list;
            h.e(list2, "it");
            com.spotify.music.sociallistening.models.b bVar = list2.get(0);
            com.spotify.music.sociallistening.models.b bVar2 = list2.get(1);
            oad oad = this.a;
            StringBuilder V0 = je.V0("Token changed: ");
            V0.append(bVar.b());
            V0.append(" -> ");
            V0.append(bVar2.b());
            String sb = V0.toString();
            oad.getClass();
            if (sb != null) {
                Logger.b(je.x0("social listening nearby: ", sb), new Object[0]);
            }
            if (bVar.h()) {
                oad.f(this.a);
            }
            if (bVar2.h()) {
                return oad.b(this.a, bVar2.b());
            }
            return io.reactivex.internal.operators.completable.b.a;
        }
    }

    public oad(NearbyMediumWifi nearbyMediumWifi, tad tad, w7d w7d, f4d f4d) {
        h.e(nearbyMediumWifi, "nearbyMediumWifi");
        h.e(tad, "properties");
        h.e(w7d, "socialConnectEndpoint");
        h.e(f4d, "socialListening");
        this.c = nearbyMediumWifi;
        this.d = tad;
        this.e = w7d;
        this.f = f4d;
        CacheBuilder<Object, Object> newBuilder = CacheBuilder.newBuilder();
        newBuilder.expireAfterWrite(60000, TimeUnit.MILLISECONDS);
        Cache<K1, V1> build = newBuilder.build();
        h.d(build, "CacheBuilder\n        .ne…SECONDS)\n        .build()");
        this.a = build;
    }

    public static final io.reactivex.a b(oad oad, String str) {
        oad.getClass();
        ArrayList arrayList = new ArrayList();
        if (oad.d.a()) {
            arrayList.add(oad.c.h(str));
        }
        io.reactivex.a q = io.reactivex.a.y(arrayList).q(new mad(oad));
        h.d(q, "Completable.merge(comple…le.message)\n            }");
        return q;
    }

    public static final void e(oad oad, String str) {
        oad.getClass();
        if (str != null) {
            Logger.d(je.x0("social listening nearby: ", str), new Object[0]);
        }
    }

    public static final void f(oad oad) {
        if (oad.d.a()) {
            oad.c.k();
        }
    }

    @Override // defpackage.lad
    public s<ImmutableList<Session>> a() {
        ArrayList arrayList = new ArrayList();
        if (this.d.a()) {
            s<R> J0 = this.c.i().J0(new a(this));
            h.d(J0, "nearbyMediumWifi\n       …e()\n                    }");
            arrayList.add(J0);
        }
        s<ImmutableList<Session>> L = s.d0(arrayList).W(Functions.g(), false, Integer.MAX_VALUE).L(new b(this));
        h.d(L, "Observable.merge(observa…le.message)\n            }");
        return L;
    }

    @Override // defpackage.lad
    public void start() {
        this.b.b(this.f.a().G0(com.spotify.music.sociallistening.models.b.n).e(2, 1).Q(c.a).Y(new d(this)).subscribe());
    }

    @Override // defpackage.lad
    public void stop() {
        this.b.f();
    }
}
