package com.spotify.music.features.yourlibrary.container.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableSortedMap;
import com.spotify.mobius.g;
import com.spotify.music.C0707R;
import com.spotify.music.features.yourlibrary.container.e;
import com.spotify.music.features.yourlibrary.container.h;
import com.spotify.music.features.yourlibrary.container.utils.j;
import com.spotify.music.yourlibrary.interfaces.YourLibraryPageId;
import com.spotify.music.yourlibrary.interfaces.YourLibraryTabsCollapseState;
import com.spotify.music.yourlibrary.interfaces.f;
import com.spotify.music.yourlibrary.interfaces.i;
import io.reactivex.subjects.PublishSubject;

public class x implements w, g<q19, o19>, ws2 {
    private final View a;
    private final LockableViewPager b;
    private final GroupedTabLayout c;
    private final AppBarLayout f;
    private final h n;
    private final s o;
    private final u p;
    private final b29 q;
    private final LockableAppBarBehavior r;
    private ViewPager.i s;
    private final e t;
    private final j u;
    private final int v;

    class a extends AppBarLayout.Behavior.a {
        a(x xVar) {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior.a
        public boolean a(AppBarLayout appBarLayout) {
            return false;
        }
    }

    class b implements com.spotify.mobius.h<q19> {
        final /* synthetic */ PublishSubject a;
        final /* synthetic */ AppBarLayout.c b;
        final /* synthetic */ io.reactivex.disposables.b c;

        b(PublishSubject publishSubject, AppBarLayout.c cVar, io.reactivex.disposables.b bVar) {
            this.a = publishSubject;
            this.b = cVar;
            this.c = bVar;
        }

        @Override // com.spotify.mobius.h, defpackage.da2
        public void accept(Object obj) {
            q19 q19 = (q19) obj;
            if (x.this.c.getVisibility() == 4 && q19.a().isPresent() && q19.a().get() == YourLibraryPageId.MUSIC_PLAYLISTS) {
                x.this.c.setVisibility(0);
            }
            this.a.onNext(q19);
            x.this.n.a(q19.g());
        }

        @Override // com.spotify.mobius.h, defpackage.w92
        public void dispose() {
            x.this.b.w(x.this.s);
            x.this.f.g(this.b);
            this.c.dispose();
            x.this.p.b();
        }
    }

    public x(LayoutInflater layoutInflater, ViewGroup viewGroup, Context context, h hVar, s sVar, b29 b29, u uVar, e eVar, j jVar) {
        this.n = hVar;
        this.o = sVar;
        this.p = uVar;
        this.q = b29;
        this.u = jVar;
        sVar.C(nud.m(context));
        View inflate = layoutInflater.inflate(C0707R.layout.fragment_your_library, viewGroup, false);
        this.a = inflate;
        GroupedTabLayout groupedTabLayout = (GroupedTabLayout) inflate.findViewById(C0707R.id.tab_layout);
        this.c = groupedTabLayout;
        groupedTabLayout.setYourLibraryDelegator(hVar);
        groupedTabLayout.setLogger(b29);
        this.t = eVar;
        if (eVar.a()) {
            groupedTabLayout.setVisibility(4);
        }
        this.b = (LockableViewPager) inflate.findViewById(C0707R.id.view_pager);
        this.f = (AppBarLayout) inflate.findViewById(C0707R.id.appbar_layout);
        LockableAppBarBehavior lockableAppBarBehavior = new LockableAppBarBehavior();
        this.r = lockableAppBarBehavior;
        lockableAppBarBehavior.x(new a(this));
        this.v = groupedTabLayout.getMinimumHeight();
    }

    public static void o(x xVar) {
        xVar.c.setAlpha(0.0f);
        xVar.c.setVisibility(0);
        xVar.c.animate().alpha(1.0f).setDuration(100);
    }

    @Override // defpackage.ws2
    public boolean b() {
        int currentItem = this.b.getCurrentItem();
        if (currentItem >= this.o.d()) {
            return false;
        }
        f orNull = this.o.A(this.o.x(currentItem)).orNull();
        if (orNull instanceof ws2) {
            return ((ws2) orNull).b();
        }
        return false;
    }

    public void j(YourLibraryPageId yourLibraryPageId, boolean z, boolean z2) {
        this.b.post(new p(this, yourLibraryPageId, z, z2));
    }

    public View k() {
        return this.a;
    }

    public int l() {
        return this.r.a();
    }

    public /* synthetic */ void m(AppBarLayout.c cVar, ImmutableSortedMap immutableSortedMap) {
        this.o.D(immutableSortedMap);
        this.b.setAdapter(this.o);
        this.c.setupWithViewPager(this.b);
        this.f.a(cVar);
    }

    public /* synthetic */ void n(da2 da2) {
        da2.accept(o19.c());
        this.q.c();
    }

    public void p(YourLibraryPageId yourLibraryPageId, boolean z, boolean z2) {
        int z3 = this.o.z(yourLibraryPageId);
        if (!z2 || this.b.getCurrentItem() != z3) {
            this.b.A(z3, z);
        } else {
            this.s.g(z3);
        }
        if (this.c.getVisibility() == 4) {
            this.c.post(new n(this));
        }
    }

    public void q(YourLibraryPageId yourLibraryPageId, boolean z) {
        Optional<f> A = this.o.A(yourLibraryPageId);
        if (A.isPresent()) {
            A.get().H(z);
        }
    }

    public void r(i iVar) {
        this.r.B(iVar.c());
        this.b.setSwipingLocked(iVar.b());
    }

    public void s(YourLibraryPageId yourLibraryPageId) {
        f B = this.o.B(yourLibraryPageId);
        if (B != null) {
            B.c();
        }
    }

    @Override // com.spotify.mobius.g
    public com.spotify.mobius.h<q19> t(da2<o19> da2) {
        PublishSubject h1 = PublishSubject.h1();
        y yVar = new y(this, da2);
        this.s = yVar;
        this.b.c(yVar);
        CoordinatorLayout.e eVar = (CoordinatorLayout.e) this.f.getLayoutParams();
        eVar.j(this.r);
        this.f.setLayoutParams(eVar);
        z zVar = new z(da2);
        io.reactivex.disposables.b subscribe = h1.j0(a.a).Q(m.a).N0(1).subscribe(new k(this, zVar), o.a);
        FrameLayout frameLayout = (FrameLayout) this.a.findViewById(C0707R.id.content_container);
        ListenableScrollingViewBehavior listenableScrollingViewBehavior = new ListenableScrollingViewBehavior();
        FloatingContainerLayout floatingContainerLayout = (FloatingContainerLayout) frameLayout.findViewById(C0707R.id.floating_view_container);
        floatingContainerLayout.setupWithFloatingViewProvider(this.o);
        listenableScrollingViewBehavior.l(floatingContainerLayout);
        listenableScrollingViewBehavior.l(this.c);
        floatingContainerLayout.setupWithViewPager(this.b);
        CoordinatorLayout.e eVar2 = (CoordinatorLayout.e) frameLayout.getLayoutParams();
        eVar2.j(listenableScrollingViewBehavior);
        frameLayout.setLayoutParams(eVar2);
        this.p.a();
        if (this.t.c()) {
            ImageView imageView = new ImageView(this.c.getContext());
            this.u.b(imageView).c();
            this.c.k(imageView, new l(this, da2));
        }
        return new b(h1, zVar, subscribe);
    }

    public void u(boolean z) {
        this.b.setSwipingLocked(z);
    }

    public void v(boolean z) {
        this.r.B(z);
    }

    public void w(YourLibraryTabsCollapseState yourLibraryTabsCollapseState, boolean z) {
        int ordinal = yourLibraryTabsCollapseState.ordinal();
        if (ordinal == 0) {
            this.c.setMinimumHeight(this.v);
            this.f.i(true, z);
        } else if (ordinal == 1) {
            this.c.setMinimumHeight(0);
            this.f.i(false, z);
        } else if (ordinal == 2) {
            this.c.setMinimumHeight(this.v);
            this.f.i(false, z);
        }
    }

    public void x(int i) {
        this.r.c(i);
    }
}
