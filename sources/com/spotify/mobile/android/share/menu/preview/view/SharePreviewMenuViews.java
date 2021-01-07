package com.spotify.mobile.android.share.menu.preview.view;

import android.content.res.Resources;
import android.view.View;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.spotify.mobile.android.share.menu.preview.domain.SharePreviewMenuModel;
import com.spotify.mobile.android.share.menu.preview.domain.a;
import com.spotify.mobile.android.share.menu.preview.domain.b;
import com.spotify.mobile.android.share.menu.preview.domain.d;
import com.spotify.mobius.g;
import com.spotify.mobius.h;
import com.spotify.music.C0707R;
import io.reactivex.subjects.PublishSubject;
import java.util.List;

public final class SharePreviewMenuViews implements g<SharePreviewMenuModel, com.spotify.mobile.android.share.menu.preview.domain.d> {
    private final View a;
    private final View b;
    private final View c;
    private final SharePayloadView f;
    private final ViewPager2 n;
    private final ViewPagerDotsIndicator o;
    private final PublishSubject<Integer> p;
    private final c q;
    private final Guideline r;
    private final Guideline s;
    private final Guideline t;
    private final PublishSubject<com.spotify.mobile.android.share.menu.preview.api.a> u;
    private final b v;
    private final hj0<SharePreviewMenuModel> w;
    private final pj0<com.spotify.mobile.android.share.menu.preview.domain.d> x;

    public static final class a implements h<SharePreviewMenuModel> {
        final /* synthetic */ SharePreviewMenuViews a;
        final /* synthetic */ oj0 b;

        a(SharePreviewMenuViews sharePreviewMenuViews, oj0 oj0) {
            this.a = sharePreviewMenuViews;
            this.b = oj0;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            SharePreviewMenuModel sharePreviewMenuModel = (SharePreviewMenuModel) obj;
            kotlin.jvm.internal.h.e(sharePreviewMenuModel, "model");
            this.a.w.e(sharePreviewMenuModel);
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            this.b.dispose();
            this.a.o.e(this.a.n);
        }
    }

    static final class b<A> implements wi0<com.spotify.mobile.android.share.menu.preview.domain.a> {
        final /* synthetic */ SharePreviewMenuViews a;

        b(SharePreviewMenuViews sharePreviewMenuViews) {
            this.a = sharePreviewMenuViews;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.wi0
        public void a(com.spotify.mobile.android.share.menu.preview.domain.a aVar) {
            com.spotify.mobile.android.share.menu.preview.domain.a aVar2 = aVar;
            if (aVar2 instanceof a.b) {
                a.b bVar = (a.b) aVar2;
                SharePreviewMenuViews.i(this.a, bVar.a().size());
                this.a.v.X(bVar.a());
            }
        }
    }

    static final class c<T, R> implements xi0<View, d.a> {
        public static final c a = new c();

        c() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.xi0
        public /* bridge */ /* synthetic */ d.a apply(View view) {
            return d.a.a;
        }
    }

    static final class d<T, R> implements xi0<Integer, d.c> {
        public static final d a = new d();

        d() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.xi0
        public d.c apply(Integer num) {
            Integer num2 = num;
            kotlin.jvm.internal.h.d(num2, "payloadIndex");
            return new d.c(num2.intValue());
        }
    }

    static final class e<T, R> implements xi0<com.spotify.mobile.android.share.menu.preview.api.a, d.e> {
        final /* synthetic */ SharePreviewMenuViews a;

        e(SharePreviewMenuViews sharePreviewMenuViews) {
            this.a = sharePreviewMenuViews;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.xi0
        public d.e apply(com.spotify.mobile.android.share.menu.preview.api.a aVar) {
            com.spotify.mobile.android.share.menu.preview.api.a aVar2 = aVar;
            if (this.a.n.getVisibility() == 0) {
                kotlin.jvm.internal.h.d(aVar2, "shareDestination");
                return new d.e(aVar2, this.a.n.getCurrentItem());
            }
            kotlin.jvm.internal.h.d(aVar2, "shareDestination");
            return new d.e(aVar2, 0);
        }
    }

    static final class f<A> implements qj0<com.spotify.mobile.android.share.menu.preview.api.a> {
        final /* synthetic */ SharePreviewMenuViews a;

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

        static final class b<T> implements io.reactivex.functions.g<com.spotify.mobile.android.share.menu.preview.api.a> {
            final /* synthetic */ wi0 a;

            b(wi0 wi0) {
                this.a = wi0;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: wi0 */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.g
            public void accept(com.spotify.mobile.android.share.menu.preview.api.a aVar) {
                this.a.a(aVar);
            }
        }

        f(SharePreviewMenuViews sharePreviewMenuViews) {
            this.a = sharePreviewMenuViews;
        }

        @Override // defpackage.qj0
        public final oj0 a(wi0<com.spotify.mobile.android.share.menu.preview.api.a> wi0) {
            return new a(this.a.u.subscribe(new b(wi0)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [com.spotify.mobile.android.share.menu.preview.view.e] */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.spotify.mobile.android.share.menu.preview.view.e] */
    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x00d0: APUT  
      (r11v1 hj0[])
      (0 ??[int, short, byte, char])
      (wrap: hj0 : 0x00cc: INVOKE  (r2v19 hj0) = 
      (wrap: xi0 : 0x00bc: CHECK_CAST (r2v18 xi0) = (xi0) (r2v17 kotlin.reflect.g))
      (wrap: hj0 : 0x00c8: INVOKE  (r4v2 hj0) = 
      (wrap: com.spotify.mobile.android.share.menu.preview.view.d : 0x00c5: CONSTRUCTOR  (r7v1 com.spotify.mobile.android.share.menu.preview.view.d) = 
      (wrap: com.spotify.mobile.android.share.menu.preview.view.SharePreviewMenuViews$diffuser$2 : 0x00c0: CONSTRUCTOR  (r4v1 com.spotify.mobile.android.share.menu.preview.view.SharePreviewMenuViews$diffuser$2) = (r8v0 'this' com.spotify.mobile.android.share.menu.preview.view.SharePreviewMenuViews A[IMMUTABLE_TYPE, THIS]) call: com.spotify.mobile.android.share.menu.preview.view.SharePreviewMenuViews$diffuser$2.<init>(com.spotify.mobile.android.share.menu.preview.view.SharePreviewMenuViews):void type: CONSTRUCTOR)
     call: com.spotify.mobile.android.share.menu.preview.view.d.<init>(nmf):void type: CONSTRUCTOR)
     type: STATIC call: hj0.a(wi0):hj0)
     type: STATIC call: hj0.d(xi0, hj0):hj0)
     */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SharePreviewMenuViews(android.view.LayoutInflater r9, android.view.ViewGroup r10, java.util.Map<java.lang.String, com.spotify.mobile.android.share.menu.preview.api.b> r11) {
        /*
        // Method dump skipped, instructions count: 319
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.share.menu.preview.view.SharePreviewMenuViews.<init>(android.view.LayoutInflater, android.view.ViewGroup, java.util.Map):void");
    }

    public static final void h(SharePreviewMenuViews sharePreviewMenuViews, List list) {
        sharePreviewMenuViews.getClass();
        if (list.size() > 1) {
            sharePreviewMenuViews.f.setVisibility(8);
            sharePreviewMenuViews.n.setVisibility(0);
            sharePreviewMenuViews.o.setVisibility(0);
        } else {
            sharePreviewMenuViews.f.setVisibility(0);
            sharePreviewMenuViews.n.setVisibility(8);
            sharePreviewMenuViews.o.setVisibility(8);
        }
        int size = list.size();
        if (size == 0) {
            sharePreviewMenuViews.f.D(b.c.a);
        } else if (size != 1) {
            sharePreviewMenuViews.q.X(list);
            sharePreviewMenuViews.o.invalidate();
        } else {
            sharePreviewMenuViews.f.D((com.spotify.mobile.android.share.menu.preview.domain.b) kotlin.collections.d.j(list));
        }
    }

    public static final void i(SharePreviewMenuViews sharePreviewMenuViews, int i) {
        int i2;
        int dimensionPixelSize = sharePreviewMenuViews.a.getResources().getDimensionPixelSize(C0707R.dimen.share_list_destination_height);
        int dimensionPixelSize2 = sharePreviewMenuViews.a.getResources().getDimensionPixelSize(C0707R.dimen.share_list_header_height);
        int bottom = sharePreviewMenuViews.a.getBottom() - sharePreviewMenuViews.t.getBottom();
        Resources resources = sharePreviewMenuViews.a.getResources();
        kotlin.jvm.internal.h.d(resources, "root.resources");
        if (resources.getConfiguration().orientation == 2 || ((double) i) < 3.5d) {
            i2 = i * dimensionPixelSize;
        } else {
            double d2 = (double) dimensionPixelSize;
            Double.isNaN(d2);
            Double.isNaN(d2);
            i2 = (int) (d2 * 3.5d);
        }
        int min = Math.min(i2 + dimensionPixelSize2, bottom);
        Resources resources2 = sharePreviewMenuViews.a.getResources();
        kotlin.jvm.internal.h.d(resources2, "root.resources");
        if (resources2.getConfiguration().orientation != 2) {
            sharePreviewMenuViews.s.setGuidelineEnd(min);
            BottomSheetBehavior o2 = BottomSheetBehavior.o(sharePreviewMenuViews.b);
            kotlin.jvm.internal.h.d(o2, "BottomSheetBehavior.from(destinationsContainer)");
            o2.v(min);
            o2.x(4);
            View view = sharePreviewMenuViews.b;
            kotlin.jvm.internal.h.d(view, "destinationsContainer");
            CoordinatorLayout.e eVar = new CoordinatorLayout.e(view.getLayoutParams());
            eVar.j(o2);
            View view2 = sharePreviewMenuViews.b;
            kotlin.jvm.internal.h.d(view2, "destinationsContainer");
            view2.setLayoutParams(eVar);
            return;
        }
        sharePreviewMenuViews.r.setGuidelineEnd(Math.min(i2, bottom - dimensionPixelSize2));
    }

    public final View j() {
        return this.a;
    }

    @Override // com.spotify.mobius.g
    public h<SharePreviewMenuModel> t(da2<com.spotify.mobile.android.share.menu.preview.domain.d> da2) {
        kotlin.jvm.internal.h.e(da2, "eventConsumer");
        oj0 a2 = this.x.a(new d(new SharePreviewMenuViews$connect$disposable$1(da2)));
        this.o.d(this.n);
        return new a(this, a2);
    }
}
