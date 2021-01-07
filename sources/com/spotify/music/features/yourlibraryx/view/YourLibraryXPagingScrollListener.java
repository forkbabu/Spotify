package com.spotify.music.features.yourlibraryx.view;

import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import com.spotify.music.features.yourlibraryx.domain.f;
import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;

public final class YourLibraryXPagingScrollListener extends RecyclerView.q implements g<f, YourLibraryXEvent> {
    private final PublishSubject<YourLibraryXEvent.n> a;
    private final PublishSubject<YourLibraryXEvent.a0> b;
    private jnf c;
    private jnf f;
    private int n;
    private int o;
    private final cmf<Integer> p;

    public static final class a implements h<f> {
        final /* synthetic */ YourLibraryXPagingScrollListener a;
        final /* synthetic */ io.reactivex.disposables.b b;

        a(YourLibraryXPagingScrollListener yourLibraryXPagingScrollListener, io.reactivex.disposables.b bVar) {
            this.a = yourLibraryXPagingScrollListener;
            this.b = bVar;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            jnf jnf;
            f fVar = (f) obj;
            kotlin.jvm.internal.h.e(fVar, "value");
            this.a.f = fVar.f().f();
            this.a.n = fVar.f().g();
            YourLibraryXPagingScrollListener yourLibraryXPagingScrollListener = this.a;
            if (yourLibraryXPagingScrollListener.n == 0) {
                jnf jnf2 = jnf.n;
                jnf = jnf.f;
            } else {
                jnf = knf.e(0, this.a.n);
            }
            yourLibraryXPagingScrollListener.c = jnf;
            this.a.o = fVar.j();
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            this.b.dispose();
        }
    }

    static final class b<T> implements io.reactivex.functions.g<YourLibraryXEvent> {
        final /* synthetic */ da2 a;

        b(da2 da2) {
            this.a = da2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(YourLibraryXEvent yourLibraryXEvent) {
            this.a.accept(yourLibraryXEvent);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ YourLibraryXPagingScrollListener(cmf cmf, int i) {
        this((i & 1) != 0 ? AnonymousClass1.a : null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView.q
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(androidx.recyclerview.widget.RecyclerView r5, int r6, int r7) {
        /*
            r4 = this;
            java.lang.String r6 = "recyclerView"
            kotlin.jvm.internal.h.e(r5, r6)
            androidx.recyclerview.widget.RecyclerView$m r5 = r5.getLayoutManager()
            cmf<java.lang.Integer> r6 = r4.p
            java.lang.Object r6 = r6.invoke()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            boolean r0 = r5 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L_0x00bb
            androidx.recyclerview.widget.LinearLayoutManager r5 = (androidx.recyclerview.widget.LinearLayoutManager) r5
            int r0 = r5.Y1()
            int r5 = r5.b2()
            r1 = -1
            if (r0 == r1) goto L_0x00ba
            if (r5 == r1) goto L_0x00ba
            int r0 = r0 - r6
            r1 = 0
            int r0 = java.lang.Math.max(r1, r0)
            int r5 = r5 - r6
            int r5 = java.lang.Math.max(r1, r5)
            jnf r6 = new jnf
            r6.<init>(r0, r5)
            io.reactivex.subjects.PublishSubject<com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent$a0> r2 = r4.b
            com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent$a0 r3 = new com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent$a0
            r3.<init>(r6)
            r2.onNext(r3)
            jnf r2 = r4.f
            jnf r3 = r4.c
            boolean r2 = kotlin.jvm.internal.h.a(r2, r3)
            if (r2 == 0) goto L_0x0055
            jnf r2 = r4.f
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0055
            return
        L_0x0055:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r7 < 0) goto L_0x0081
            jnf r7 = r4.f
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x0063
            goto L_0x00ac
        L_0x0063:
            jnf r7 = r4.f
            boolean r7 = r7.i(r5)
            if (r7 == 0) goto L_0x00ac
            jnf r7 = r4.f
            int r7 = r7.e()
            jnf r0 = r4.c
            int r0 = r0.e()
            if (r7 != r0) goto L_0x007a
            goto L_0x00a0
        L_0x007a:
            jnf r7 = r4.f
            int r0 = r7.e()
            goto L_0x00aa
        L_0x0081:
            jnf r5 = r4.f
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x008a
            goto L_0x00ac
        L_0x008a:
            jnf r5 = r4.f
            boolean r5 = r5.i(r0)
            if (r5 == 0) goto L_0x00ac
            jnf r5 = r4.f
            int r5 = r5.d()
            jnf r7 = r4.c
            int r7 = r7.d()
            if (r5 != r7) goto L_0x00a4
        L_0x00a0:
            r1 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x00ac
        L_0x00a4:
            jnf r5 = r4.f
            int r5 = r5.d()
        L_0x00aa:
            int r1 = r0 - r5
        L_0x00ac:
            int r5 = r4.o
            if (r1 >= r5) goto L_0x00ba
            io.reactivex.subjects.PublishSubject<com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent$n> r5 = r4.a
            com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent$n r7 = new com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent$n
            r7.<init>(r6, r1)
            r5.onNext(r7)
        L_0x00ba:
            return
        L_0x00bb:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Invalid layout manager, "
            r7.append(r0)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.yourlibraryx.view.YourLibraryXPagingScrollListener.c(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    @Override // com.spotify.mobius.g
    public h<f> t(da2<YourLibraryXEvent> da2) {
        kotlin.jvm.internal.h.e(da2, "output");
        return new a(this, s.k0(this.a.E(), this.b.E()).subscribe(new b(da2)));
    }

    public YourLibraryXPagingScrollListener(cmf<Integer> cmf) {
        kotlin.jvm.internal.h.e(cmf, "offsetSource");
        this.p = cmf;
        PublishSubject<YourLibraryXEvent.n> h1 = PublishSubject.h1();
        kotlin.jvm.internal.h.d(h1, "PublishSubject.create<LoadedRangeEdgeApproached>()");
        this.a = h1;
        PublishSubject<YourLibraryXEvent.a0> h12 = PublishSubject.h1();
        kotlin.jvm.internal.h.d(h12, "PublishSubject.create<VisibleRangeChanged>()");
        this.b = h12;
        jnf jnf = jnf.n;
        this.c = jnf.f;
        this.f = jnf.f;
        this.n = -1;
    }
}
