package defpackage;

import com.adjust.sdk.Constants;
import com.google.common.base.Optional;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableSet;
import com.google.protobuf.GeneratedMessageLite;
import com.spotify.common.uri.SpotifyUri;
import com.spotify.playlist.ondemand.proto.SetRequest;
import com.spotify.playlist.ondemand.proto.TemporaryRequest;
import io.reactivex.e;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;

/* renamed from: wxd  reason: default package */
public final class wxd implements sxd {
    private static final long f;
    private static final long g;
    private Set<a> a;
    private Optional<b> b = Optional.absent();
    private final cqe c;
    private final txd d;
    private final y e;

    /* access modifiers changed from: private */
    /* renamed from: wxd$a */
    public static final class a {
        private final SpotifyUri a;

        public a(String str) {
            h.e(str, "uri");
            this.a = new SpotifyUri(str);
        }

        public final SpotifyUri a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            return ((a) obj).a.k(this.a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: wxd$b */
    public static final class b {
        private final a a;
        private final long b;

        public b(a aVar, long j) {
            h.e(aVar, "mContextUri");
            this.a = aVar;
            this.b = j;
        }

        public final a a() {
            return this.a;
        }

        public final long b() {
            return this.b;
        }
    }

    /* renamed from: wxd$c */
    static final class c<V> implements Callable<e> {
        final /* synthetic */ wxd a;
        final /* synthetic */ Set b;

        c(wxd wxd, Set set) {
            this.a = wxd;
            this.b = set;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public e call() {
            wxd wxd = this.a;
            Set<String> set = this.b;
            ArrayList arrayList = new ArrayList(kotlin.collections.d.e(set, 10));
            for (String str : set) {
                arrayList.add(new a(str));
            }
            wxd.a = kotlin.collections.d.Z(arrayList);
            this.a.b = Optional.absent();
            return io.reactivex.internal.operators.completable.b.a;
        }
    }

    /* renamed from: wxd$d */
    static final class d<V> implements Callable<e> {
        final /* synthetic */ wxd a;
        final /* synthetic */ String b;

        d(wxd wxd, String str) {
            this.a = wxd;
            this.b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public e call() {
            this.a.b = Optional.of(new b(new a(this.b), wxd.f + this.a.c.b()));
            return io.reactivex.internal.operators.completable.b.a;
        }
    }

    static {
        long millis = TimeUnit.HOURS.toMillis(1);
        f = millis;
        g = millis / ((long) Constants.ONE_SECOND);
    }

    public wxd(cqe cqe, txd txd, y yVar) {
        h.e(cqe, "clock");
        h.e(txd, "onDemandSetEndpointV1");
        h.e(yVar, "mainThreadScheduler");
        this.c = cqe;
        this.d = txd;
        this.e = yVar;
    }

    @Override // defpackage.vxd
    public Optional<Boolean> a(String str) {
        h.e(str, "playlistUri");
        Optional<b> optional = this.b;
        h.d(optional, "temporaryOnDemandSet");
        if (optional.isPresent()) {
            b bVar = this.b.get();
            if (h.a(new a(str), bVar.a()) && bVar.b() > this.c.b()) {
                Optional<Boolean> of = Optional.of(Boolean.TRUE);
                h.d(of, "Optional.of(true)");
                return of;
            }
        }
        Set<a> set = this.a;
        if (set == null) {
            Optional<Boolean> absent = Optional.absent();
            h.d(absent, "Optional.absent()");
            return absent;
        }
        h.c(set);
        Optional<Boolean> of2 = Optional.of(Boolean.valueOf(set.contains(new a(str))));
        h.d(of2, "Optional.of(\n           …          )\n            )");
        return of2;
    }

    @Override // defpackage.vxd
    public Set<String> b() {
        Set<a> set = this.a;
        if (set == null) {
            ImmutableSet of = ImmutableSet.of();
            h.d(of, "ImmutableSet.of()");
            return of;
        }
        h.c(set);
        ArrayList arrayList = new ArrayList(kotlin.collections.d.e(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a().toString());
        }
        return kotlin.collections.d.Z(arrayList);
    }

    @Override // defpackage.sxd
    public io.reactivex.a c(Set<String> set) {
        h.e(set, "onDemandSet");
        txd txd = this.d;
        SetRequest.b i = SetRequest.i();
        i.m(Collections2.newArrayList(set));
        GeneratedMessageLite build = i.build();
        h.d(build, "SetRequest.newBuilder().…ist(onDemandSet)).build()");
        io.reactivex.a d2 = txd.b((SetRequest) build).A(this.e).d(io.reactivex.a.n(new c(this, set)));
        h.d(d2, "onDemandSetEndpointV1\n  …          }\n            )");
        return d2;
    }

    @Override // defpackage.sxd
    public io.reactivex.a d(String str) {
        h.e(str, "playlistUri");
        txd txd = this.d;
        TemporaryRequest.b l = TemporaryRequest.l();
        l.n(str);
        l.m(g);
        GeneratedMessageLite build = l.build();
        h.d(build, "TemporaryRequest.newBuil…                 .build()");
        io.reactivex.a d2 = txd.a((TemporaryRequest) build).A(this.e).d(io.reactivex.a.n(new d(this, str)));
        h.d(d2, "onDemandSetEndpointV1\n  …          }\n            )");
        return d2;
    }

    @Override // defpackage.vxd
    public boolean isEmpty() {
        Set<a> set = this.a;
        if (set != null) {
            h.c(set);
            if (!set.isEmpty()) {
                return false;
            }
        }
        return true;
    }
}
