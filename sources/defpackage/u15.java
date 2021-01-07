package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.android.glue.components.toolbar.e;
import com.spotify.android.glue.patterns.prettylist.u;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarManager;
import com.spotify.music.C0707R;
import io.reactivex.functions.l;
import io.reactivex.functions.n;
import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.h;

/* renamed from: u15  reason: default package */
public final class u15 extends r51 {
    private ViewGroup a;
    private final RecyclerView b;
    private final RecyclerView c;
    private final ViewStub d;
    private final AppBarLayout e;
    private u f;
    private View g;
    private final PublishSubject<Boolean> h;
    private final PublishSubject<jnf> i;
    private Set<Integer> j;
    private final Activity k;
    private final Runnable l;

    /* access modifiers changed from: package-private */
    /* renamed from: u15$a */
    /* compiled from: java-style lambda group */
    public static final class a implements View.OnTouchListener {
        public static final a b = new a(0);
        public static final a c = new a(1);
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            int i = this.a;
            if (i == 0 || i == 1) {
                return true;
            }
            throw null;
        }
    }

    /* renamed from: u15$b */
    static final class b<T1, T2, R> implements io.reactivex.functions.c<jnf, jnf, jnf> {
        final /* synthetic */ u15 a;

        b(u15 u15) {
            this.a = u15;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // io.reactivex.functions.c
        public jnf a(jnf jnf, jnf jnf2) {
            jnf jnf3 = jnf;
            jnf jnf4 = jnf2;
            h.e(jnf3, "previous");
            h.e(jnf4, "current");
            this.a.j = com.spotify.music.features.followfeed.c.b(jnf3, jnf4);
            return jnf4;
        }
    }

    /* renamed from: u15$c */
    static final class c<T, R> implements l<jnf, Set<? extends Integer>> {
        final /* synthetic */ u15 a;

        c(u15 u15) {
            this.a = u15;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.l
        public Set<? extends Integer> apply(jnf jnf) {
            h.e(jnf, "it");
            return this.a.j;
        }
    }

    /* renamed from: u15$d */
    static final class d<T> implements n<Set<? extends Integer>> {
        public static final d a = new d();

        d() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.n
        public boolean test(Set<? extends Integer> set) {
            Set<? extends Integer> set2 = set;
            h.e(set2, "indexes");
            return !set2.isEmpty();
        }
    }

    public u15(Activity activity, ViewGroup viewGroup, Runnable runnable) {
        h.e(activity, "activity");
        h.e(viewGroup, "container");
        h.e(runnable, "closeFragmentAction");
        this.k = activity;
        this.l = runnable;
        View inflate = LayoutInflater.from(activity).inflate(C0707R.layout.follow_feed_view, viewGroup, false);
        if (inflate != null) {
            this.a = (ViewGroup) inflate;
            RecyclerView E = r51.E(activity);
            h.d(E, "createDefaultOverlay(activity)");
            this.c = E;
            PublishSubject<Boolean> h1 = PublishSubject.h1();
            h.d(h1, "PublishSubject.create<Boolean>()");
            this.h = h1;
            PublishSubject<jnf> h12 = PublishSubject.h1();
            h.d(h12, "PublishSubject.create<IntRange>()");
            this.i = h12;
            this.j = EmptySet.a;
            View G = q4.G(this.a, C0707R.id.feed_body_recycler);
            h.d(G, "ViewCompat.requireViewBy… R.id.feed_body_recycler)");
            RecyclerView recyclerView = (RecyclerView) G;
            this.b = recyclerView;
            recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
            recyclerView.setHasFixedSize(true);
            recyclerView.setItemAnimator(null);
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                h12.onNext(new jnf(linearLayoutManager.U1(), linearLayoutManager.Z1()));
                recyclerView.n(new y15(this, linearLayoutManager));
                View G2 = q4.G(this.a, C0707R.id.appbar_layout);
                h.d(G2, "ViewCompat.requireViewBy…root, R.id.appbar_layout)");
                AppBarLayout appBarLayout = (AppBarLayout) G2;
                this.e = appBarLayout;
                appBarLayout.setPadding(0, nud.l(activity, C0707R.attr.actionBarSize) + com.spotify.android.goldenpath.a.f(activity), 0, 0);
                v15 v15 = new v15(activity, appBarLayout);
                View view = v15.getView();
                h.d(view, "headerViewBinder.view");
                appBarLayout.addView(v15.getView());
                appBarLayout.a(new z15(this, view, v15));
                View G3 = q4.G(this.a, C0707R.id.toolbar_wrapper);
                h.d(G3, "ViewCompat.requireViewBy…ot, R.id.toolbar_wrapper)");
                ViewGroup viewGroup2 = (ViewGroup) G3;
                com.spotify.android.goldenpath.a.b(activity);
                com.spotify.android.glue.components.toolbar.c c2 = l70.c(activity, viewGroup2);
                h.d(c2, "GlueToolbars.createGlueT…bar(this, toolbarWrapper)");
                e eVar = (e) c2;
                com.spotify.android.paste.app.d.d(eVar.getView(), activity);
                viewGroup2.addView(eVar.getView(), 0);
                ToolbarManager toolbarManager = new ToolbarManager(activity, c2, new a25(this));
                toolbarManager.h(true);
                toolbarManager.g(true);
                this.f = toolbarManager;
                toolbarManager.setTitle(activity.getString(C0707R.string.follow_feed_feature_title));
                u uVar = this.f;
                if (uVar != null) {
                    uVar.o(0.0f);
                    u uVar2 = this.f;
                    if (uVar2 != null) {
                        uVar2.a(1.0f);
                        this.a.addView(E);
                        View G4 = q4.G(this.a, C0707R.id.empty_state_view_stub);
                        h.d(G4, "ViewCompat.requireViewBy…id.empty_state_view_stub)");
                        this.d = (ViewStub) G4;
                        return;
                    }
                    h.k("toolbarUpdater");
                    throw null;
                }
                h.k("toolbarUpdater");
                throw null;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public static final /* synthetic */ u M(u15 u15) {
        u uVar = u15.f;
        if (uVar != null) {
            return uVar;
        }
        h.k("toolbarUpdater");
        throw null;
    }

    private final void O(View view, boolean z) {
        a aVar = null;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
            view.setOnTouchListener(z ? a.b : null);
        }
        ViewGroup viewGroup = this.a;
        if (z) {
            aVar = a.c;
        }
        viewGroup.setOnTouchListener(aVar);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.r51
    public RecyclerView F() {
        return this.b;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.r51
    public RecyclerView G() {
        return this.c;
    }

    public final void P() {
        this.b.u();
    }

    public final void Q() {
        this.e.setExpanded(false);
    }

    public final s<Set<Integer>> R() {
        s<R> Q = this.i.E().z(250, TimeUnit.MILLISECONDS, io.reactivex.schedulers.a.a()).y0(new jnf(0, 0), new b(this)).j0(new c(this)).Q(d.a);
        h.d(Q, "newlyVisibleSubject\n    …-> indexes.isNotEmpty() }");
        return Q;
    }

    public final s<Boolean> S() {
        s<Boolean> E = this.h.E();
        h.d(E, "scrollNearBottomSubject.distinctUntilChanged()");
        return E;
    }

    public final void T(boolean z) {
        if (z) {
            if (this.g == null) {
                this.g = this.d.inflate();
            }
            O(this.g, z);
            return;
        }
        View view = this.g;
        if (view != null) {
            O(view, z);
        }
    }

    @Override // defpackage.e61
    public View b() {
        return this.a;
    }
}
