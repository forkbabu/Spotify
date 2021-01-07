package com.spotify.mobile.android.storytelling.container.view;

import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.o;
import androidx.fragment.app.x;
import com.spotify.mobile.android.storytelling.story.StoryFragment;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.C0707R;
import defpackage.gx1;
import defpackage.px1;
import defpackage.rx1;

public final class StorytellingContainerViews implements g<tx1, rx1> {
    private final ConstraintLayout a;
    private View b;
    private View c;
    private final View f;
    private final View n;
    private final hj0<tx1> o;
    private final pj0<rx1> p;
    private final o q;
    private final nx1 r;

    public static final class a implements h<tx1> {
        final /* synthetic */ StorytellingContainerViews a;
        final /* synthetic */ oj0 b;

        a(StorytellingContainerViews storytellingContainerViews, oj0 oj0) {
            this.a = storytellingContainerViews;
            this.b = oj0;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            tx1 tx1 = (tx1) obj;
            kotlin.jvm.internal.h.e(tx1, "model");
            this.a.o.e(tx1);
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            this.b.dispose();
        }
    }

    static final class b<A> implements wi0<rx1> {
        final /* synthetic */ da2 a;

        b(da2 da2) {
            this.a = da2;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.wi0
        public void a(rx1 rx1) {
            this.a.accept(rx1);
        }
    }

    static final class c<T, R> implements xi0<View, rx1.a> {
        public static final c a = new c();

        c() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.xi0
        public /* bridge */ /* synthetic */ rx1.a apply(View view) {
            return rx1.a.a;
        }
    }

    static final class d<T, R> implements xi0<ox1, rx1.g> {
        public static final d a = new d();

        d() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.xi0
        public rx1.g apply(ox1 ox1) {
            ox1 ox12 = ox1;
            kotlin.jvm.internal.h.d(ox12, "userRequest");
            return new rx1.g(ox12);
        }
    }

    static final class e<A> implements qj0<ox1> {
        final /* synthetic */ StorytellingContainerViews a;

        static final class a implements oj0 {
            final /* synthetic */ io.reactivex.disposables.b a;

            a(io.reactivex.disposables.b bVar) {
                this.a = bVar;
            }

            @Override // defpackage.oj0
            public final void dispose() {
                this.a.dispose();
            }
        }

        static final class b<T> implements io.reactivex.functions.g<ox1> {
            final /* synthetic */ wi0 a;

            b(wi0 wi0) {
                this.a = wi0;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: wi0 */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.g
            public void accept(ox1 ox1) {
                this.a.a(ox1);
            }
        }

        static final class c<T> implements io.reactivex.functions.g<Throwable> {
            public static final c a = new c();

            c() {
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // io.reactivex.functions.g
            public void accept(Throwable th) {
            }
        }

        e(StorytellingContainerViews storytellingContainerViews) {
            this.a = storytellingContainerViews;
        }

        @Override // defpackage.qj0
        public final oj0 a(wi0<ox1> wi0) {
            return new a(this.a.r.d().subscribe(new b(wi0), c.a));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.spotify.mobile.android.storytelling.container.view.b] */
    /* JADX WARN: Type inference failed for: r3v6, types: [com.spotify.mobile.android.storytelling.container.view.b] */
    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x006d: APUT  
      (r1v0 hj0[])
      (0 ??[int, short, byte, char])
      (wrap: hj0 : 0x0069: INVOKE  (r2v3 hj0) = 
      (wrap: xi0 : 0x0059: CHECK_CAST (r2v2 xi0) = (xi0) (r2v1 kotlin.reflect.g))
      (wrap: hj0 : 0x0065: INVOKE  (r3v1 hj0) = 
      (wrap: com.spotify.mobile.android.storytelling.container.view.a : 0x0062: CONSTRUCTOR  (r4v0 com.spotify.mobile.android.storytelling.container.view.a) = 
      (wrap: com.spotify.mobile.android.storytelling.container.view.StorytellingContainerViews$diffuser$2 : 0x005d: CONSTRUCTOR  (r3v0 com.spotify.mobile.android.storytelling.container.view.StorytellingContainerViews$diffuser$2) = (r5v0 'this' com.spotify.mobile.android.storytelling.container.view.StorytellingContainerViews A[IMMUTABLE_TYPE, THIS]) call: com.spotify.mobile.android.storytelling.container.view.StorytellingContainerViews$diffuser$2.<init>(com.spotify.mobile.android.storytelling.container.view.StorytellingContainerViews):void type: CONSTRUCTOR)
     call: com.spotify.mobile.android.storytelling.container.view.a.<init>(nmf):void type: CONSTRUCTOR)
     type: STATIC call: hj0.a(wi0):hj0)
     type: STATIC call: hj0.d(xi0, hj0):hj0)
     */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public StorytellingContainerViews(android.view.LayoutInflater r6, android.view.ViewGroup r7, androidx.fragment.app.o r8, defpackage.nx1 r9) {
        /*
            r5 = this;
            java.lang.String r0 = "inflater"
            kotlin.jvm.internal.h.e(r6, r0)
            java.lang.String r0 = "fragmentManager"
            kotlin.jvm.internal.h.e(r8, r0)
            java.lang.String r0 = "controls"
            kotlin.jvm.internal.h.e(r9, r0)
            r5.<init>()
            r5.q = r8
            r5.r = r9
            r8 = 2131624999(0x7f0e0427, float:1.8877194E38)
            r0 = 0
            android.view.View r6 = r6.inflate(r8, r7, r0)
            if (r6 == 0) goto L_0x00d9
            androidx.constraintlayout.widget.ConstraintLayout r6 = (androidx.constraintlayout.widget.ConstraintLayout) r6
            r5.a = r6
            r7 = 2131430332(0x7f0b0bbc, float:1.8482362E38)
            android.view.View r7 = defpackage.q4.G(r6, r7)
            java.lang.String r8 = "requireViewById<View>(root, R.id.loading)"
            kotlin.jvm.internal.h.d(r7, r8)
            r5.b = r7
            r7 = 2131431114(0x7f0b0eca, float:1.8483948E38)
            android.view.View r7 = defpackage.q4.G(r6, r7)
            java.lang.String r8 = "requireViewById<View>(root, R.id.retry)"
            kotlin.jvm.internal.h.d(r7, r8)
            r5.c = r7
            android.view.View r7 = r9.c()
            r5.f = r7
            android.view.View r8 = r9.a()
            r5.n = r8
            r9 = 2
            hj0[] r1 = new defpackage.hj0[r9]
            kotlin.reflect.g r2 = com.spotify.mobile.android.storytelling.container.view.StorytellingContainerViews$diffuser$1.a
            if (r2 == 0) goto L_0x0059
            com.spotify.mobile.android.storytelling.container.view.b r3 = new com.spotify.mobile.android.storytelling.container.view.b
            r3.<init>(r2)
            r2 = r3
        L_0x0059:
            xi0 r2 = (defpackage.xi0) r2
            com.spotify.mobile.android.storytelling.container.view.StorytellingContainerViews$diffuser$2 r3 = new com.spotify.mobile.android.storytelling.container.view.StorytellingContainerViews$diffuser$2
            r3.<init>(r5)
            com.spotify.mobile.android.storytelling.container.view.a r4 = new com.spotify.mobile.android.storytelling.container.view.a
            r4.<init>(r3)
            hj0 r3 = defpackage.hj0.a(r4)
            hj0 r2 = defpackage.hj0.d(r2, r3)
            r1[r0] = r2
            kotlin.reflect.g r2 = com.spotify.mobile.android.storytelling.container.view.StorytellingContainerViews$diffuser$3.a
            if (r2 == 0) goto L_0x0079
            com.spotify.mobile.android.storytelling.container.view.b r3 = new com.spotify.mobile.android.storytelling.container.view.b
            r3.<init>(r2)
            r2 = r3
        L_0x0079:
            xi0 r2 = (defpackage.xi0) r2
            com.spotify.mobile.android.storytelling.container.view.StorytellingContainerViews$diffuser$4 r3 = new com.spotify.mobile.android.storytelling.container.view.StorytellingContainerViews$diffuser$4
            r3.<init>(r5)
            com.spotify.mobile.android.storytelling.container.view.a r4 = new com.spotify.mobile.android.storytelling.container.view.a
            r4.<init>(r3)
            hj0 r3 = defpackage.hj0.a(r4)
            hj0 r2 = defpackage.hj0.d(r2, r3)
            r3 = 1
            r1[r3] = r2
            hj0 r1 = defpackage.hj0.b(r1)
            r5.o = r1
            pj0[] r9 = new defpackage.pj0[r9]
            com.spotify.mobile.android.storytelling.container.view.StorytellingContainerViews$c r1 = com.spotify.mobile.android.storytelling.container.view.StorytellingContainerViews.c.a
            android.view.View r2 = r5.c
            pj0 r2 = defpackage.bj0.a(r2)
            pj0 r1 = defpackage.pj0.b(r1, r2)
            r9[r0] = r1
            com.spotify.mobile.android.storytelling.container.view.StorytellingContainerViews$d r1 = com.spotify.mobile.android.storytelling.container.view.StorytellingContainerViews.d.a
            com.spotify.mobile.android.storytelling.container.view.StorytellingContainerViews$e r2 = new com.spotify.mobile.android.storytelling.container.view.StorytellingContainerViews$e
            r2.<init>(r5)
            pj0 r2 = defpackage.pj0.c(r2)
            pj0 r1 = defpackage.pj0.b(r1, r2)
            r9[r3] = r1
            pj0 r1 = new pj0
            r1.<init>(r9)
            r5.p = r1
            r5.g(r7)
            r6.addView(r7, r0)
            r5.f(r7)
            r9 = 8
            r7.setVisibility(r9)
            r5.g(r8)
            r6.addView(r8)
            r5.f(r8)
            r8.setVisibility(r9)
            return
        L_0x00d9:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.storytelling.container.view.StorytellingContainerViews.<init>(android.view.LayoutInflater, android.view.ViewGroup, androidx.fragment.app.o, nx1):void");
    }

    public static final void c(StorytellingContainerViews storytellingContainerViews, boolean z) {
        storytellingContainerViews.r.b(z ? gx1.b.a : gx1.c.a);
    }

    public static final void d(StorytellingContainerViews storytellingContainerViews, px1 px1) {
        storytellingContainerViews.getClass();
        if (px1 instanceof px1.b) {
            storytellingContainerViews.b.setVisibility(8);
            storytellingContainerViews.c.setVisibility(8);
        } else if (px1 instanceof px1.c) {
            storytellingContainerViews.b.setVisibility(0);
            storytellingContainerViews.c.setVisibility(8);
        } else if (px1 instanceof px1.a) {
            storytellingContainerViews.b.setVisibility(8);
            storytellingContainerViews.c.setVisibility(0);
        } else if (px1 instanceof px1.d) {
            storytellingContainerViews.b.setVisibility(8);
            storytellingContainerViews.c.setVisibility(8);
            storytellingContainerViews.n.setVisibility(0);
            storytellingContainerViews.f.setVisibility(0);
        }
    }

    private final void f(View view) {
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.i(this.a);
        bVar.l(view.getId(), 6, 0, 6);
        bVar.l(view.getId(), 7, 0, 7);
        bVar.l(view.getId(), 3, 0, 3);
        bVar.l(view.getId(), 4, 0, 4);
        bVar.c(this.a);
    }

    private final void g(View view) {
        if (view.getId() == -1) {
            view.setId(q4.f());
        }
        view.setLayoutParams(new ConstraintLayout.LayoutParams(0, 0));
    }

    public final ConstraintLayout e() {
        return this.a;
    }

    public final void h(int i) {
        x i2 = this.q.i();
        StoryFragment storyFragment = new StoryFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("story_index", i);
        storyFragment.r4(bundle);
        i2.q(C0707R.id.story_fragment, storyFragment, null);
        i2.i();
    }

    @Override // com.spotify.mobius.g
    public h<tx1> t(da2<rx1> da2) {
        kotlin.jvm.internal.h.e(da2, "eventConsumer");
        return new a(this, this.p.a(new b(da2)));
    }
}
