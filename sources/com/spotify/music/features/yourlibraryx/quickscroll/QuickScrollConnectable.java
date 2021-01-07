package com.spotify.music.features.yourlibraryx.quickscroll;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobius.g;
import com.spotify.music.C0707R;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXSortOption;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXViewMode;
import com.spotify.music.features.yourlibraryx.domain.f;
import com.spotify.music.yourlibrary.quickscroll.QuickScrollView;
import com.spotify.music.yourlibrary.quickscroll.a0;
import com.spotify.music.yourlibrary.quickscroll.x;
import com.spotify.music.yourlibrary.quickscroll.z;
import io.reactivex.functions.l;
import io.reactivex.functions.n;
import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;
import io.reactivex.y;
import java.util.Set;
import kotlin.jvm.internal.h;

public final class QuickScrollConnectable implements g<f, YourLibraryXEvent> {
    private static final Set<YourLibraryXSortOption> t = kotlin.collections.d.H(YourLibraryXSortOption.ALPHABETICAL, YourLibraryXSortOption.CREATOR, YourLibraryXSortOption.RECENTLY_ADDED);
    private static final gnf<Float> u = knf.d(2.4f, 3.6f);
    private static final d v = new d(null);
    private QuickScrollView a;
    private RecyclerView b;
    private final io.reactivex.subjects.c<Boolean> c;
    private final io.reactivex.subjects.c<YourLibraryXSortOption> f;
    private final io.reactivex.subjects.c<Float> n;
    private final s<Boolean> o;
    private int p;
    private final a0 q;
    private final z r;
    private final y s;

    /* access modifiers changed from: private */
    public enum QuickScrollTheme {
        LIGHT(C0707R.color.your_library_quickscroll_background_light, C0707R.color.your_library_quickscroll_textcolor_light, C0707R.color.your_library_quickscroll_arrows_light),
        DARK(C0707R.color.your_library_quickscroll_background_dark, C0707R.color.your_library_quickscroll_textcolor_dark, C0707R.color.your_library_quickscroll_arrows_dark);
        
        private final int arrowsRes;
        private final int backgroundRes;
        private final int textRes;

        private QuickScrollTheme(int i, int i2, int i3) {
            this.backgroundRes = i;
            this.textRes = i2;
            this.arrowsRes = i3;
        }

        public final int d() {
            return this.arrowsRes;
        }

        public final int g() {
            return this.backgroundRes;
        }

        public final int h() {
            return this.textRes;
        }
    }

    static final class a<T> implements n<Float> {
        public static final a a = new a();

        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.n
        public boolean test(Float f) {
            Float f2 = f;
            h.e(f2, "it");
            d unused = QuickScrollConnectable.v;
            return !QuickScrollConnectable.u.a(f2);
        }
    }

    static final class b<T, R> implements l<Float, Boolean> {
        public static final b a = new b();

        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public Boolean apply(Float f) {
            Float f2 = f;
            h.e(f2, "it");
            float floatValue = f2.floatValue();
            d unused = QuickScrollConnectable.v;
            return Boolean.valueOf(Float.compare(floatValue, 3.0f) >= 0);
        }
    }

    static final class c<T1, T2, R> implements io.reactivex.functions.c<Boolean, Boolean, Boolean> {
        public static final c a = new c();

        c() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // io.reactivex.functions.c
        public Boolean a(Boolean bool, Boolean bool2) {
            Boolean bool3 = bool;
            Boolean bool4 = bool2;
            h.e(bool3, "supportedSortOption");
            h.e(bool4, "enoughScreens");
            return Boolean.valueOf(bool3.booleanValue() && bool4.booleanValue());
        }
    }

    /* access modifiers changed from: private */
    public static final class d {
        public d(kotlin.jvm.internal.f fVar) {
        }
    }

    public static final class e implements com.spotify.mobius.h<f> {
        final /* synthetic */ QuickScrollConnectable a;
        final /* synthetic */ io.reactivex.disposables.a b;

        e(QuickScrollConnectable quickScrollConnectable, io.reactivex.disposables.a aVar) {
            this.a = quickScrollConnectable;
            this.b = aVar;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            f fVar = (f) obj;
            h.e(fVar, "model");
            this.a.c.onNext(Boolean.valueOf(fVar.h()));
            this.a.f.onNext(fVar.n());
            this.a.n.onNext(Float.valueOf(QuickScrollConnectable.i(this.a, fVar)));
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            this.b.f();
        }
    }

    public QuickScrollConnectable(a0 a0Var, z zVar, y yVar) {
        h.e(a0Var, "labelProvider");
        h.e(zVar, "ignoredItemProvider");
        h.e(yVar, "mainScheduler");
        this.q = a0Var;
        this.r = zVar;
        this.s = yVar;
        PublishSubject h1 = PublishSubject.h1();
        h.d(h1, "PublishSubject.create()");
        this.c = h1;
        PublishSubject h12 = PublishSubject.h1();
        h.d(h12, "PublishSubject.create()");
        this.f = h12;
        PublishSubject h13 = PublishSubject.h1();
        h.d(h13, "PublishSubject.create()");
        this.n = h13;
        s<Boolean> n2 = s.n(h12.j0(new c(new nmf<YourLibraryXSortOption, Boolean>(t) {
            /* class com.spotify.music.features.yourlibraryx.quickscroll.QuickScrollConnectable.AnonymousClass1 */

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // defpackage.nmf
            public Boolean invoke(YourLibraryXSortOption yourLibraryXSortOption) {
                YourLibraryXSortOption yourLibraryXSortOption2 = yourLibraryXSortOption;
                h.e(yourLibraryXSortOption2, "p1");
                return Boolean.valueOf(((Set) this.receiver).contains(yourLibraryXSortOption2));
            }
        })).E(), h13.Q(a.a).j0(b.a).E(), c.a);
        h.d(n2, "Observable.combineLatest…Option && enoughScreens }");
        this.o = n2;
    }

    public static final int b(QuickScrollConnectable quickScrollConnectable) {
        RecyclerView recyclerView = quickScrollConnectable.b;
        LinearLayoutManager linearLayoutManager = null;
        RecyclerView.m layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = layoutManager;
        }
        LinearLayoutManager linearLayoutManager2 = linearLayoutManager;
        if (linearLayoutManager2 != null) {
            return linearLayoutManager2.Y1();
        }
        return 0;
    }

    public static final String d(QuickScrollConnectable quickScrollConnectable, int i) {
        QuickScrollView quickScrollView = quickScrollConnectable.a;
        h.c(quickScrollView);
        if (quickScrollView.getVisibility() == 0) {
            return quickScrollConnectable.q.a(i);
        }
        return null;
    }

    public static final float i(QuickScrollConnectable quickScrollConnectable, f fVar) {
        int i;
        quickScrollConnectable.getClass();
        if (fVar.o() == YourLibraryXViewMode.b) {
            QuickScrollView quickScrollView = quickScrollConnectable.a;
            h.c(quickScrollView);
            Context context = quickScrollView.getContext();
            h.d(context, "quickScrollView!!.context");
            i = context.getResources().getInteger(C0707R.integer.your_library_span_size);
        } else {
            i = 1;
        }
        int e2 = (fVar.p().e() - 1) - fVar.p().d();
        if (e2 < 0) {
            e2 = 0;
        }
        int i2 = ((e2 % i) + e2) / i;
        if (e2 == 0) {
            return 0.0f;
        }
        int g = fVar.f().g();
        return ((float) (((g % i) + g) / i)) / ((float) i2);
    }

    public static final void j(QuickScrollConnectable quickScrollConnectable, boolean z) {
        QuickScrollView quickScrollView = quickScrollConnectable.a;
        h.c(quickScrollView);
        quickScrollView.setVisibility(z ? 0 : 4);
    }

    public static final void k(QuickScrollConnectable quickScrollConnectable, boolean z) {
        QuickScrollTheme quickScrollTheme = z ? QuickScrollTheme.DARK : QuickScrollTheme.LIGHT;
        QuickScrollView quickScrollView = quickScrollConnectable.a;
        h.c(quickScrollView);
        quickScrollView.setHandlerBackgroundColor(quickScrollConnectable.l(quickScrollTheme.g()));
        QuickScrollView quickScrollView2 = quickScrollConnectable.a;
        h.c(quickScrollView2);
        quickScrollView2.setIndicatorBackgroundColor(quickScrollConnectable.l(quickScrollTheme.g()));
        QuickScrollView quickScrollView3 = quickScrollConnectable.a;
        h.c(quickScrollView3);
        quickScrollView3.setIndicatorTextColor(quickScrollConnectable.l(quickScrollTheme.h()));
        QuickScrollView quickScrollView4 = quickScrollConnectable.a;
        h.c(quickScrollView4);
        quickScrollView4.setHandlerArrowsColor(quickScrollConnectable.l(quickScrollTheme.d()));
    }

    private final int l(int i) {
        QuickScrollView quickScrollView = this.a;
        h.c(quickScrollView);
        return androidx.core.content.a.b(quickScrollView.getContext(), i);
    }

    public final int m() {
        return this.p;
    }

    public final void n(QuickScrollView quickScrollView, RecyclerView recyclerView) {
        h.e(quickScrollView, "quickScroll");
        h.e(recyclerView, "recycler");
        this.a = quickScrollView;
        this.b = recyclerView;
        vpd vpd = new vpd(recyclerView, new a(new QuickScrollConnectable$setupAdapter$adapter$1(this)), this.r);
        QuickScrollView quickScrollView2 = this.a;
        if (quickScrollView2 != null) {
            quickScrollView2.a(x.a(vpd, 1));
        }
        RecyclerView recyclerView2 = this.b;
        h.c(recyclerView2);
        recyclerView2.n(new d(this));
    }

    public final void o(int i) {
        this.p = i;
    }

    @Override // com.spotify.mobius.g
    public com.spotify.mobius.h<f> t(da2<YourLibraryXEvent> da2) {
        h.e(da2, "output");
        return new e(this, new io.reactivex.disposables.a(this.c.E().subscribe(new b(new QuickScrollConnectable$connect$disposable$1(this))), this.o.o0(this.s).subscribe(new b(new QuickScrollConnectable$connect$disposable$2(this)))));
    }
}
