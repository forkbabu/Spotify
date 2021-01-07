package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.playlist.endpoints.d;
import com.spotify.playlist.endpoints.policy.playlist.DecorationPolicy;
import com.spotify.playlist.endpoints.policy.playlist.HeaderPolicy;
import com.spotify.playlist.endpoints.policy.playlist.ListPolicy;
import com.spotify.playlist.endpoints.policy.playlist.Policy;
import com.spotify.playlist.models.k;
import com.spotify.playlist.models.l;
import com.spotify.rxjava2.p;
import io.reactivex.functions.g;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.s;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: gfc  reason: default package */
public final class gfc implements ffc {
    private static final HeaderPolicy l;
    private static final ImmutableMap<String, Boolean> m;
    private static final ImmutableMap<String, Boolean> n;
    private static final ListPolicy o;
    private static final DecorationPolicy p;
    private static final Policy q;
    private int a;
    private int b;
    private final efc c;
    private final p d = new p();
    private final p e = new p();
    private List<l> f;
    private final p g = new p();
    private List<l> h;
    private final io.reactivex.subjects.a<List<l>> i;
    private final com.spotify.playlist.endpoints.d j;
    private final String k;

    /* access modifiers changed from: package-private */
    /* renamed from: gfc$a */
    public static final class a<T> implements g<io.reactivex.disposables.b> {
        final /* synthetic */ gfc a;
        final /* synthetic */ d.b b;
        final /* synthetic */ s c;

        a(gfc gfc, d.b bVar, s sVar) {
            this.a = gfc;
            this.b = bVar;
            this.c = sVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(io.reactivex.disposables.b bVar) {
            gfc.k(this.a, this.b, this.c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: gfc$b */
    public static final class b implements io.reactivex.functions.a {
        final /* synthetic */ gfc a;

        b(gfc gfc) {
            this.a = gfc;
        }

        @Override // io.reactivex.functions.a
        public final void run() {
            this.a.q();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: gfc$c */
    public static final class c<T> implements g<k> {
        final /* synthetic */ gfc a;
        final /* synthetic */ efc b;
        final /* synthetic */ int c;

        c(gfc gfc, efc efc, int i) {
            this.a = gfc;
            this.b = efc;
            this.c = i;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: io.reactivex.subjects.a */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.g
        public void accept(k kVar) {
            k kVar2 = kVar;
            h.e(kVar2, "playlistEntity");
            this.b.d(kVar2.getUnrangedLength());
            if (this.a.h == null) {
                this.a.f = kVar2.getItems();
                this.a.b = this.c;
                this.a.a = kVar2.getUnrangedLength();
                return;
            }
            io.reactivex.subjects.a aVar = this.a.i;
            gfc gfc = this.a;
            List list = gfc.h;
            h.c(list);
            List<l> items = kVar2.getItems();
            int i = this.c;
            int unrangedLength = kVar2.getUnrangedLength();
            gfc.getClass();
            h.e(list, "limitedItems");
            h.e(items, "items");
            aVar.onNext(new dfc(list, items, i, unrangedLength));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: gfc$d */
    public static final class d<T> implements g<Throwable> {
        final /* synthetic */ gfc a;

        d(gfc gfc) {
            this.a = gfc;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(Throwable th) {
            Throwable th2 = th;
            h.e(th2, "t");
            this.a.i.onError(th2);
        }
    }

    static {
        HeaderPolicy.a a2 = HeaderPolicy.Companion.a();
        ImmutableMap of = ImmutableMap.of();
        h.d(of, "ImmutableMap.of()");
        a2.a(of);
        ImmutableMap of2 = ImmutableMap.of();
        h.d(of2, "ImmutableMap.of()");
        a2.e(of2);
        ImmutableMap of3 = ImmutableMap.of();
        h.d(of3, "ImmutableMap.of()");
        a2.d(of3);
        HeaderPolicy b2 = a2.b();
        l = b2;
        Boolean bool = Boolean.TRUE;
        ImmutableMap<String, Boolean> of4 = ImmutableMap.of("name", bool);
        m = of4;
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.mo51put("link", bool);
        builder.mo51put("name", bool);
        builder.mo51put("rowId", bool);
        ImmutableMap<String, Boolean> build = builder.build();
        n = build;
        ListPolicy.a a3 = ListPolicy.Companion.a();
        h.d(build, "listAttributes");
        a3.d(build);
        ImmutableMap of5 = ImmutableMap.of();
        h.d(of5, "ImmutableMap.of()");
        a3.b(of5);
        h.d(of4, "nameAttribute");
        a3.c(of4);
        h.d(of4, "nameAttribute");
        a3.g(of4);
        ListPolicy e2 = a3.e();
        o = e2;
        DecorationPolicy.a a4 = DecorationPolicy.Companion.a();
        a4.c(e2);
        a4.b(b2);
        DecorationPolicy a5 = a4.a();
        p = a5;
        q = new Policy(a5);
    }

    public gfc(com.spotify.playlist.endpoints.d dVar, String str) {
        h.e(dVar, "mPlaylistEndpoint");
        h.e(str, "mPlaylistUri");
        this.j = dVar;
        this.k = str;
        io.reactivex.subjects.a<List<l>> h1 = io.reactivex.subjects.a.h1();
        h.d(h1, "BehaviorSubject.create()");
        this.i = h1;
        this.c = new efc(100, 15);
    }

    public static final void k(gfc gfc, d.b bVar, s sVar) {
        gfc.q();
        d.b.a p2 = bVar.p();
        p2.g(q);
        gfc.e.b(gfc.j.d(gfc.k, p2.b()).subscribe(new kfc(gfc), new lfc(gfc)));
        gfc.p(bVar, gfc.c);
        gfc.g.b(sVar.Q(new hfc(gfc)).subscribe(new ifc(gfc, bVar), jfc.a));
    }

    public static final void n(gfc gfc) {
        gfc.f = null;
        gfc.d.b(EmptyDisposable.INSTANCE);
    }

    /* access modifiers changed from: private */
    public final void p(d.b bVar, efc efc) {
        d.b.a p2 = bVar.p();
        p2.i(new qxd(efc.b(), efc.a()));
        this.d.b(this.j.a(this.k, p2.b()).subscribe(new c(this, efc, efc.b()), new d(this)));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void q() {
        p pVar = this.g;
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        pVar.b(emptyDisposable);
        this.h = null;
        this.e.b(emptyDisposable);
        this.f = null;
        this.d.b(emptyDisposable);
    }

    public s<List<l>> o(d.b bVar, s<Integer> sVar) {
        h.e(bVar, "configuration");
        h.e(sVar, "positionObservable");
        s<List<l>> M = this.i.M(new a(this, bVar, sVar), Functions.c).M(Functions.f(), new b(this));
        h.d(M, "behaviorSubject\n        …  .doOnDispose { stop() }");
        return M;
    }
}
