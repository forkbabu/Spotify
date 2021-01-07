package com.spotify.music.podcastinteractivity.qna.datasource;

import com.google.common.base.MoreObjects;
import com.google.common.base.Supplier;
import defpackage.xtc;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.y;
import kotlin.jvm.internal.h;

public final class c implements b {
    private final PublishSubject<xtc> a;
    private final io.reactivex.subjects.a<ztc> b;
    private final Supplier<s<ztc>> c;
    private io.reactivex.disposables.b d;
    private boolean e;
    private boolean f;
    private final y g;
    private final y h;
    private final y i;
    private final jvc j;
    private final j k;
    private final vuc l;

    static final class a implements Runnable {
        final /* synthetic */ c a;

        a(c cVar) {
            this.a = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.a.onNext(xtc.a.a);
        }
    }

    static final class b implements Runnable {
        final /* synthetic */ c a;

        b(c cVar) {
            this.a = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.a.onNext(xtc.c.a);
        }
    }

    /* renamed from: com.spotify.music.podcastinteractivity.qna.datasource.c$c  reason: collision with other inner class name */
    static final class RunnableC0335c implements Runnable {
        final /* synthetic */ c a;

        RunnableC0335c(c cVar) {
            this.a = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.a.onNext(xtc.b.a);
        }
    }

    static final class d implements Runnable {
        final /* synthetic */ c a;
        final /* synthetic */ String b;

        d(c cVar, String str) {
            this.a = cVar;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.a.onNext(new xtc.f(this.b));
        }
    }

    static final class e implements Runnable {
        final /* synthetic */ c a;
        final /* synthetic */ String b;

        e(c cVar, String str) {
            this.a = cVar;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.a.onNext(new xtc.g(this.b));
        }
    }

    static final class f<T> implements Supplier<s<ztc>> {
        final /* synthetic */ c a;

        f(c cVar) {
            this.a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.google.common.base.Supplier
        public s<ztc> get() {
            return this.a.b.M(new e(this), Functions.c).M(Functions.f(), new f(this)).v0(1).h1().E();
        }
    }

    public c(y yVar, y yVar2, y yVar3, jvc jvc, j jVar, vuc vuc) {
        h.e(yVar, "mainScheduler");
        h.e(yVar2, "computationScheduler");
        h.e(yVar3, "ioScheduler");
        h.e(jvc, "podcastQnAEndpoint");
        h.e(jVar, "qnAEventConsumer");
        h.e(vuc, "profileDataSource");
        this.g = yVar;
        this.h = yVar2;
        this.i = yVar3;
        this.j = jvc;
        this.k = jVar;
        this.l = vuc;
        PublishSubject<xtc> h1 = PublishSubject.h1();
        h.d(h1, "PublishSubject.create<PodcastQnAEvent>()");
        this.a = h1;
        io.reactivex.subjects.a<ztc> h12 = io.reactivex.subjects.a.h1();
        h.d(h12, "BehaviorSubject.create<PodcastQnAModel>()");
        this.b = h12;
        Supplier<s<ztc>> memoize = MoreObjects.memoize(new f(this));
        h.d(memoize, "Suppliers.memoize<Observ…tUntilChanged()\n        }");
        this.c = memoize;
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        h.d(emptyDisposable, "Disposables.disposed()");
        this.d = emptyDisposable;
    }

    public static final void m(c cVar, boolean z) {
        cVar.e = z;
        cVar.n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.spotify.music.podcastinteractivity.qna.datasource.d] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void n() {
        /*
            r9 = this;
            boolean r0 = r9.f
            if (r0 == 0) goto L_0x008e
            boolean r1 = r9.e
            if (r1 == 0) goto L_0x008e
            io.reactivex.disposables.b r0 = r9.d
            boolean r0 = r0.d()
            if (r0 == 0) goto L_0x009d
            io.reactivex.s<java.lang.Object> r0 = io.reactivex.internal.operators.observable.e0.a
            io.reactivex.subjects.PublishSubject<xtc> r1 = r9.a
            com.spotify.music.podcastinteractivity.qna.datasource.PodcastQnADataSourceImpl$createLoopFactory$1 r2 = com.spotify.music.podcastinteractivity.qna.datasource.PodcastQnADataSourceImpl$createLoopFactory$1.a
            if (r2 == 0) goto L_0x001e
            com.spotify.music.podcastinteractivity.qna.datasource.d r3 = new com.spotify.music.podcastinteractivity.qna.datasource.d
            r3.<init>(r2)
            r2 = r3
        L_0x001e:
            com.spotify.mobius.g0 r2 = (com.spotify.mobius.g0) r2
            jvc r3 = r9.j
            com.spotify.music.podcastinteractivity.qna.datasource.j r4 = r9.k
            vuc r5 = r9.l
            io.reactivex.w r3 = defpackage.buc.a(r3, r4, r5)
            com.spotify.mobius.MobiusLoop$f r2 = com.spotify.mobius.rx2.i.c(r2, r3)
            java.lang.String r3 = "eventSubject"
            kotlin.jvm.internal.h.e(r1, r3)
            r3 = 1
            io.reactivex.v[] r4 = new io.reactivex.v[r3]
            r5 = 0
            r4[r5] = r1
            com.spotify.mobius.q r1 = com.spotify.mobius.rx2.i.a(r4)
            com.spotify.mobius.MobiusLoop$f r1 = r2.h(r1)
            com.spotify.music.podcastinteractivity.qna.datasource.a r2 = new com.spotify.music.podcastinteractivity.qna.datasource.a
            r2.<init>(r5, r9)
            com.spotify.mobius.MobiusLoop$f r1 = r1.b(r2)
            com.spotify.music.podcastinteractivity.qna.datasource.a r2 = new com.spotify.music.podcastinteractivity.qna.datasource.a
            r2.<init>(r3, r9)
            com.spotify.mobius.MobiusLoop$f r1 = r1.d(r2)
            com.spotify.mobius.android.e r2 = new com.spotify.mobius.android.e
            java.lang.String r3 = "PodcastQnA"
            r2.<init>(r3)
            com.spotify.mobius.MobiusLoop$f r1 = r1.f(r2)
            java.lang.String r2 = "RxMobius.loop(\n         …Logger.tag(\"PodcastQnA\"))"
            kotlin.jvm.internal.h.d(r1, r2)
            ztc r2 = new ztc
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 15
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            io.reactivex.w r1 = com.spotify.mobius.rx2.i.d(r1, r2)
            io.reactivex.s r0 = r0.q(r1)
            io.reactivex.y r1 = r9.g
            io.reactivex.s r0 = r0.o0(r1)
            com.spotify.music.podcastinteractivity.qna.datasource.g r1 = new com.spotify.music.podcastinteractivity.qna.datasource.g
            r1.<init>(r9)
            io.reactivex.disposables.b r0 = r0.subscribe(r1)
            java.lang.String r1 = "Observable.never<Podcast…Next(model)\n            }"
            kotlin.jvm.internal.h.d(r0, r1)
            r9.d = r0
            goto L_0x009d
        L_0x008e:
            if (r0 != 0) goto L_0x009d
            io.reactivex.disposables.b r0 = r9.d
            boolean r0 = r0.d()
            if (r0 != 0) goto L_0x009d
            io.reactivex.disposables.b r0 = r9.d
            r0.dispose()
        L_0x009d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.podcastinteractivity.qna.datasource.c.n():void");
    }

    @Override // com.spotify.music.podcastinteractivity.qna.datasource.b
    public void a(boolean z) {
        this.f = z;
        n();
    }

    @Override // com.spotify.music.podcastinteractivity.qna.datasource.b
    public void b(String str) {
        h.e(str, "episodeUri");
        this.g.b(new d(this, str));
    }

    @Override // com.spotify.music.podcastinteractivity.qna.datasource.b
    public void c() {
        this.g.b(new a(this));
    }

    @Override // com.spotify.music.podcastinteractivity.qna.datasource.b
    public void d(String str) {
        h.e(str, "draft");
        this.a.onNext(new xtc.e(str));
    }

    @Override // com.spotify.music.podcastinteractivity.qna.datasource.b
    public void e() {
        this.g.b(new b(this));
    }

    @Override // com.spotify.music.podcastinteractivity.qna.datasource.b
    public s<ztc> f() {
        s<ztc> sVar = this.c.get();
        h.d(sVar, "sharedQnAObservableSupplier.get()");
        return sVar;
    }

    @Override // com.spotify.music.podcastinteractivity.qna.datasource.b
    public void g(String str) {
        h.e(str, "responseToSend");
        this.g.b(new e(this, str));
    }

    @Override // com.spotify.music.podcastinteractivity.qna.datasource.b
    public void h() {
        this.g.b(new RunnableC0335c(this));
    }
}
