package com.spotify.mobile.android.storytelling.story.view;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.storytelling.common.PauseState;
import com.spotify.mobile.android.storytelling.common.g;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import defpackage.vy1;
import defpackage.wy1;
import kotlin.f;

public final class StoryViews implements g<yy1, vy1> {
    private final ViewGroup a;
    private View b;
    private View c;
    private hx1 f;
    private final hj0<yy1> n;
    private final pj0<vy1.a> o;
    private final nmf<Integer, com.spotify.mobile.android.storytelling.common.g> p;
    private final nmf<kx1, f> q;
    private final ix1 r;
    private final mx1 s;

    public static final class a implements h<yy1> {
        final /* synthetic */ StoryViews a;
        final /* synthetic */ oj0 b;

        a(StoryViews storyViews, oj0 oj0) {
            this.a = storyViews;
            this.b = oj0;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            yy1 yy1 = (yy1) obj;
            kotlin.jvm.internal.h.e(yy1, "model");
            this.a.n.e(yy1);
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            this.b.dispose();
        }
    }

    static final class b<A> implements wi0<vy1.a> {
        final /* synthetic */ da2 a;

        b(da2 da2) {
            this.a = da2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.wi0
        public void a(vy1.a aVar) {
            this.a.accept(aVar);
        }
    }

    static final class c<A> implements gj0<yy1> {
        public static final c a = new c();

        c() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // defpackage.gj0
        public boolean a(yy1 yy1, yy1 yy12) {
            return !kotlin.jvm.internal.h.a(yy1.e(), yy12.e());
        }
    }

    static final class d<A> implements wi0<yy1> {
        final /* synthetic */ StoryViews a;

        d(StoryViews storyViews) {
            this.a = storyViews;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.wi0
        public void a(yy1 yy1) {
            yy1 yy12 = yy1;
            StoryViews storyViews = this.a;
            kotlin.jvm.internal.h.d(yy12, "model");
            StoryViews.b(storyViews, yy12);
        }
    }

    static final class e<T, R> implements xi0<View, vy1.a> {
        public static final e a = new e();

        e() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.xi0
        public /* bridge */ /* synthetic */ vy1.a apply(View view) {
            return vy1.a.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v9, types: [com.spotify.mobile.android.storytelling.story.view.b] */
    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x007d: APUT  
      (r2v6 hj0[])
      (1 ??[boolean, int, float, short, byte, char])
      (wrap: hj0 : 0x0078: INVOKE  (r3v11 hj0) = 
      (wrap: xi0 : 0x0068: CHECK_CAST (r3v10 xi0) = (xi0) (r3v9 kotlin.reflect.g))
      (wrap: hj0 : 0x0074: INVOKE  (r4v5 hj0) = 
      (wrap: com.spotify.mobile.android.storytelling.story.view.a : 0x0071: CONSTRUCTOR  (r6v1 com.spotify.mobile.android.storytelling.story.view.a) = 
      (wrap: com.spotify.mobile.android.storytelling.story.view.StoryViews$diffuser$4 : 0x006c: CONSTRUCTOR  (r4v4 com.spotify.mobile.android.storytelling.story.view.StoryViews$diffuser$4) = (r1v0 'this' com.spotify.mobile.android.storytelling.story.view.StoryViews A[IMMUTABLE_TYPE, THIS]) call: com.spotify.mobile.android.storytelling.story.view.StoryViews$diffuser$4.<init>(com.spotify.mobile.android.storytelling.story.view.StoryViews):void type: CONSTRUCTOR)
     call: com.spotify.mobile.android.storytelling.story.view.a.<init>(nmf):void type: CONSTRUCTOR)
     type: STATIC call: hj0.a(wi0):hj0)
     type: STATIC call: hj0.d(xi0, hj0):hj0)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public StoryViews(android.view.LayoutInflater r2, android.view.ViewGroup r3, defpackage.nmf<java.lang.Integer, com.spotify.mobile.android.storytelling.common.g> r4, defpackage.nmf<defpackage.kx1, kotlin.f> r5, defpackage.ix1 r6, defpackage.mx1 r7) {
        /*
            r1 = this;
            java.lang.String r0 = "inflater"
            kotlin.jvm.internal.h.e(r2, r0)
            java.lang.String r0 = "storyStateProvider"
            kotlin.jvm.internal.h.e(r4, r0)
            java.lang.String r0 = "storyStartConsumer"
            kotlin.jvm.internal.h.e(r5, r0)
            java.lang.String r0 = "storyContainerControl"
            kotlin.jvm.internal.h.e(r6, r0)
            java.lang.String r0 = "storyPlayer"
            kotlin.jvm.internal.h.e(r7, r0)
            r1.<init>()
            r1.p = r4
            r1.q = r5
            r1.r = r6
            r1.s = r7
            r4 = 2131624979(0x7f0e0413, float:1.8877153E38)
            r5 = 0
            android.view.View r2 = r2.inflate(r4, r3, r5)
            if (r2 == 0) goto L_0x009d
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r1.a = r2
            r3 = 2131430332(0x7f0b0bbc, float:1.8482362E38)
            android.view.View r3 = defpackage.q4.G(r2, r3)
            java.lang.String r4 = "requireViewById<View>(root, R.id.loading)"
            kotlin.jvm.internal.h.d(r3, r4)
            r1.b = r3
            r3 = 2131431114(0x7f0b0eca, float:1.8483948E38)
            android.view.View r2 = defpackage.q4.G(r2, r3)
            java.lang.String r3 = "requireViewById<View>(root, R.id.retry)"
            kotlin.jvm.internal.h.d(r2, r3)
            r1.c = r2
            r2 = 2
            hj0[] r2 = new defpackage.hj0[r2]
            com.spotify.mobile.android.storytelling.story.view.StoryViews$c r3 = com.spotify.mobile.android.storytelling.story.view.StoryViews.c.a
            com.spotify.mobile.android.storytelling.story.view.StoryViews$d r4 = new com.spotify.mobile.android.storytelling.story.view.StoryViews$d
            r4.<init>(r1)
            hj0 r3 = defpackage.hj0.c(r3, r4)
            r2[r5] = r3
            kotlin.reflect.g r3 = com.spotify.mobile.android.storytelling.story.view.StoryViews$diffuser$3.a
            if (r3 == 0) goto L_0x0068
            com.spotify.mobile.android.storytelling.story.view.b r4 = new com.spotify.mobile.android.storytelling.story.view.b
            r4.<init>(r3)
            r3 = r4
        L_0x0068:
            xi0 r3 = (defpackage.xi0) r3
            com.spotify.mobile.android.storytelling.story.view.StoryViews$diffuser$4 r4 = new com.spotify.mobile.android.storytelling.story.view.StoryViews$diffuser$4
            r4.<init>(r1)
            com.spotify.mobile.android.storytelling.story.view.a r6 = new com.spotify.mobile.android.storytelling.story.view.a
            r6.<init>(r4)
            hj0 r4 = defpackage.hj0.a(r6)
            hj0 r3 = defpackage.hj0.d(r3, r4)
            r4 = 1
            r2[r4] = r3
            hj0 r2 = defpackage.hj0.b(r2)
            r1.n = r2
            pj0[] r2 = new defpackage.pj0[r4]
            com.spotify.mobile.android.storytelling.story.view.StoryViews$e r3 = com.spotify.mobile.android.storytelling.story.view.StoryViews.e.a
            android.view.View r4 = r1.c
            pj0 r4 = defpackage.bj0.a(r4)
            pj0 r3 = defpackage.pj0.b(r3, r4)
            r2[r5] = r3
            pj0 r3 = new pj0
            r3.<init>(r2)
            r1.o = r3
            return
        L_0x009d:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "null cannot be cast to non-null type android.view.ViewGroup"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.storytelling.story.view.StoryViews.<init>(android.view.LayoutInflater, android.view.ViewGroup, nmf, nmf, ix1, mx1):void");
    }

    public static final void b(StoryViews storyViews, yy1 yy1) {
        storyViews.getClass();
        wy1 e2 = yy1.e();
        if (e2 instanceof wy1.b) {
            storyViews.b.setVisibility(0);
            storyViews.c.setVisibility(8);
        } else if (e2 instanceof wy1.a) {
            storyViews.b.setVisibility(8);
            storyViews.c.setVisibility(0);
        } else if (e2 instanceof wy1.c) {
            int c2 = yy1.c();
            PauseState b2 = yy1.b();
            com.spotify.mobile.android.storytelling.common.g invoke = storyViews.p.invoke(Integer.valueOf(c2));
            if (invoke instanceof g.a) {
                storyViews.e(c2, ((g.a) invoke).a(), storyViews.q, b2);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void f(PauseState pauseState) {
        hx1 hx1;
        int ordinal = pauseState.ordinal();
        if (ordinal == 0) {
            hx1 hx12 = this.f;
            if (hx12 != null) {
                hx12.pause();
            }
        } else if (ordinal == 1 && (hx1 = this.f) != null) {
            hx1.resume();
        }
    }

    public final ViewGroup d() {
        return this.a;
    }

    public final void e(int i, hx1 hx1, nmf<kx1, f> nmf, PauseState pauseState) {
        kotlin.jvm.internal.h.e(hx1, "story");
        kotlin.jvm.internal.h.e(nmf, "storyStartConsumer");
        kotlin.jvm.internal.h.e(pauseState, "pauseState");
        if (this.f == null) {
            this.f = hx1;
            this.b.setVisibility(8);
            this.c.setVisibility(8);
            this.a.addView(hx1.c(this.s, this.r));
            hx1.start();
            nmf.invoke(new kx1(i, hx1.e(), hx1.d()));
            f(pauseState);
        }
    }

    @Override // com.spotify.mobius.g
    public h<yy1> t(da2<vy1> da2) {
        kotlin.jvm.internal.h.e(da2, "eventConsumer");
        return new a(this, this.o.a(new b(da2)));
    }
}
