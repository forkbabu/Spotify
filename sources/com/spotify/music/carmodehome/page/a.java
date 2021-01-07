package com.spotify.music.carmodehome.page;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.spotify.music.C0707R;
import com.spotify.music.carmodehome.b;
import com.spotify.music.carmodehome.model.HomeShelf;
import com.spotify.music.carmodehome.view.offlinebar.CarModeOfflineBarView;
import com.spotify.music.carmodehome.view.title.HomeTitleView;
import com.spotify.pageloader.z0;
import defpackage.gr2;
import io.reactivex.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

public final class a implements z0, g {
    private final d a;
    private View b;
    private HomeTitleView c;
    private ViewPager2 f;
    private View n;
    private CarModeOfflineBarView o;
    private LayoutInflater p;
    private ViewPager2.g q;
    private hr2 r;
    private int s = -1;
    private final b t = new b(this);
    private final View.OnLayoutChangeListener u = new d(this);
    private final wlf<hr2> v;
    private final ur2 w;
    private final com.spotify.music.carmodehome.b x;

    /* renamed from: com.spotify.music.carmodehome.page.a$a  reason: collision with other inner class name */
    static final class C0208a implements m4 {
        final /* synthetic */ a a;

        C0208a(a aVar, ViewGroup viewGroup) {
            this.a = aVar;
        }

        @Override // defpackage.m4
        public final b5 onApplyWindowInsets(View view, b5 b5Var) {
            CarModeOfflineBarView g = a.g(this.a);
            h.d(b5Var, "insets");
            g.setPadding(g.getPaddingLeft(), b5Var.j(), g.getPaddingRight(), g.getPaddingBottom());
            return b5Var;
        }
    }

    public static final class b extends ViewPager2.g {
        final /* synthetic */ a a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(a aVar) {
            this.a = aVar;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g
        public void c(int i) {
            this.a.a.d(i);
        }
    }

    public static final class c implements b.a {
        final /* synthetic */ a a;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(a aVar) {
            this.a = aVar;
        }

        @Override // com.spotify.music.carmodehome.b.a
        public void a() {
            a.l(this.a).h(0, true);
        }
    }

    static final class d implements View.OnLayoutChangeListener {
        final /* synthetic */ a a;

        /* renamed from: com.spotify.music.carmodehome.page.a$d$a  reason: collision with other inner class name */
        public static final class View$OnLayoutChangeListenerC0209a implements View.OnLayoutChangeListener {
            final /* synthetic */ d a;

            public View$OnLayoutChangeListenerC0209a(d dVar) {
                this.a = dVar;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                h.f(view, "view");
                view.removeOnLayoutChangeListener(this);
                zr2.a(a.e(this.a.a), a.k(this.a.a), a.l(this.a.a));
            }
        }

        d(a aVar) {
            this.a = aVar;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (i2 != i6) {
                a.m(this.a);
                ViewPager2 l = a.l(this.a);
                if (!q4.w(l) || l.isLayoutRequested()) {
                    l.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC0209a(this));
                } else {
                    zr2.a(a.e(this.a), a.k(this.a), a.l(this.a));
                }
            } else if (i4 != i8) {
                a.m(this.a);
            }
        }
    }

    public a(e eVar, wlf<hr2> wlf, ur2 ur2, com.spotify.music.carmodehome.b bVar, s<h> sVar) {
        h.e(eVar, "presenterFactory");
        h.e(wlf, "carModeHomeAdapterProvider");
        h.e(ur2, "gradientSetter");
        h.e(bVar, "navigationTabClickedTwice");
        h.e(sVar, "dataSource");
        this.v = wlf;
        this.w = ur2;
        this.x = bVar;
        this.a = eVar.b(this, sVar);
    }

    public static final /* synthetic */ LayoutInflater e(a aVar) {
        LayoutInflater layoutInflater = aVar.p;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        h.k("layoutInflater");
        throw null;
    }

    public static final /* synthetic */ CarModeOfflineBarView g(a aVar) {
        CarModeOfflineBarView carModeOfflineBarView = aVar.o;
        if (carModeOfflineBarView != null) {
            return carModeOfflineBarView;
        }
        h.k("offlineBar");
        throw null;
    }

    public static final /* synthetic */ HomeTitleView k(a aVar) {
        HomeTitleView homeTitleView = aVar.c;
        if (homeTitleView != null) {
            return homeTitleView;
        }
        h.k("titleView");
        throw null;
    }

    public static final /* synthetic */ ViewPager2 l(a aVar) {
        ViewPager2 viewPager2 = aVar.f;
        if (viewPager2 != null) {
            return viewPager2;
        }
        h.k("viewPager");
        throw null;
    }

    public static final void m(a aVar) {
        Object obj;
        RecyclerView.m layoutManager;
        ViewPager2 viewPager2 = aVar.f;
        if (viewPager2 != null) {
            HomeTitleView homeTitleView = aVar.c;
            if (homeTitleView != null) {
                viewPager2.setPadding(viewPager2.getPaddingLeft(), homeTitleView.getBottom(), viewPager2.getPaddingRight(), viewPager2.getPaddingBottom());
                ViewPager2 viewPager22 = aVar.f;
                if (viewPager22 != null) {
                    int currentItem = viewPager22.getCurrentItem();
                    h.e(viewPager22, "$this$scrollToPosition");
                    Iterator<View> it = ((v4) e4.b(viewPager22)).iterator();
                    while (true) {
                        w4 w4Var = (w4) it;
                        if (!w4Var.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = w4Var.next();
                        if (((View) obj) instanceof RecyclerView) {
                            break;
                        }
                    }
                    if (!(obj instanceof RecyclerView)) {
                        obj = null;
                    }
                    RecyclerView recyclerView = (RecyclerView) obj;
                    if (!(recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null)) {
                        layoutManager.v1(currentItem);
                    }
                    ViewPager2 viewPager23 = aVar.f;
                    if (viewPager23 == null) {
                        h.k("viewPager");
                        throw null;
                    } else if (!q4.w(viewPager23) || viewPager23.isLayoutRequested()) {
                        viewPager23.addOnLayoutChangeListener(new b(aVar));
                    } else {
                        ViewPager2 viewPager24 = aVar.f;
                        if (viewPager24 != null) {
                            viewPager24.f();
                        } else {
                            h.k("viewPager");
                            throw null;
                        }
                    }
                } else {
                    h.k("viewPager");
                    throw null;
                }
            } else {
                h.k("titleView");
                throw null;
            }
        } else {
            h.k("viewPager");
            throw null;
        }
    }

    @Override // com.spotify.music.carmodehome.page.g
    public void a() {
        CarModeOfflineBarView carModeOfflineBarView = this.o;
        if (carModeOfflineBarView != null) {
            carModeOfflineBarView.setVisibility(0);
        } else {
            h.k("offlineBar");
            throw null;
        }
    }

    @Override // com.spotify.music.carmodehome.page.g
    public void b(h hVar) {
        Object obj;
        h.e(hVar, "viewModel");
        List<HomeShelf> c2 = hVar.c();
        ArrayList arrayList = new ArrayList(kotlin.collections.d.e(c2, 10));
        for (T t2 : c2) {
            int ordinal = t2.d().ordinal();
            if (ordinal == 0) {
                obj = new gr2.a(t2);
            } else if (ordinal == 1) {
                obj = new gr2.c(t2);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            arrayList.add(obj);
        }
        hr2 hr2 = this.r;
        if (hr2 != null) {
            hr2.b0(arrayList);
            HomeTitleView homeTitleView = this.c;
            if (homeTitleView != null) {
                String d2 = hVar.d();
                if (d2 == null) {
                    d2 = "";
                }
                homeTitleView.setTitle(d2);
                String b2 = hVar.b();
                if (b2 != null) {
                    ur2 ur2 = this.w;
                    View view = this.n;
                    if (view != null) {
                        ur2.a(view, b2);
                    } else {
                        h.k("gradientView");
                        throw null;
                    }
                }
                int i = this.s;
                if (i != -1) {
                    this.s = -1;
                    ViewPager2 viewPager2 = this.f;
                    if (viewPager2 != null) {
                        viewPager2.h(i, false);
                    } else {
                        h.k("viewPager");
                        throw null;
                    }
                }
            } else {
                h.k("titleView");
                throw null;
            }
        } else {
            h.k("adapter");
            throw null;
        }
    }

    @Override // com.spotify.music.carmodehome.page.g
    public void c() {
        CarModeOfflineBarView carModeOfflineBarView = this.o;
        if (carModeOfflineBarView != null) {
            carModeOfflineBarView.setVisibility(4);
        } else {
            h.k("offlineBar");
            throw null;
        }
    }

    @Override // com.spotify.pageloader.z0
    public void d(Bundle bundle) {
        h.e(bundle, "bundle");
        this.s = bundle.getInt("VIEW_PAGER_POSITION", -1);
    }

    @Override // com.spotify.pageloader.z0
    public Bundle f() {
        Bundle bundle = new Bundle();
        ViewPager2 viewPager2 = this.f;
        if (viewPager2 != null) {
            bundle.putInt("VIEW_PAGER_POSITION", viewPager2.getCurrentItem());
            return bundle;
        }
        h.k("viewPager");
        throw null;
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        return this.b;
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        h.e(context, "context");
        h.e(viewGroup, "parent");
        h.e(layoutInflater, "inflater");
        this.p = layoutInflater;
        View inflate = layoutInflater.inflate(C0707R.layout.fragment_car_mode_home, viewGroup, false);
        View G = q4.G(inflate, C0707R.id.title);
        h.d(G, "requireViewById(view, R.id.title)");
        this.c = (HomeTitleView) G;
        View G2 = q4.G(inflate, C0707R.id.offline_bar);
        h.d(G2, "requireViewById(view, R.id.offline_bar)");
        this.o = (CarModeOfflineBarView) G2;
        View G3 = q4.G(inflate, C0707R.id.home_view_pager);
        h.d(G3, "requireViewById(view, R.id.home_view_pager)");
        this.f = (ViewPager2) G3;
        androidx.viewpager2.widget.d dVar = new androidx.viewpager2.widget.d();
        dVar.b(new wr2());
        dVar.b(new vr2());
        dVar.b(new yr2());
        dVar.b(new xr2());
        ViewPager2 viewPager2 = this.f;
        if (viewPager2 != null) {
            viewPager2.setPageTransformer(dVar);
            ViewPager2 viewPager22 = this.f;
            if (viewPager22 != null) {
                viewPager22.setOffscreenPageLimit(1);
                View findViewById = inflate.findViewById(C0707R.id.home_gradient_view);
                h.d(findViewById, "view.findViewById(R.id.home_gradient_view)");
                this.n = findViewById;
                hr2 hr2 = this.v.get();
                h.d(hr2, "carModeHomeAdapterProvider.get()");
                hr2 hr22 = hr2;
                this.r = hr22;
                ViewPager2 viewPager23 = this.f;
                if (viewPager23 == null) {
                    h.k("viewPager");
                    throw null;
                } else if (hr22 != null) {
                    viewPager23.setAdapter(hr22);
                    ViewPager2 viewPager24 = this.f;
                    if (viewPager24 != null) {
                        HomeTitleView homeTitleView = this.c;
                        if (homeTitleView != null) {
                            this.q = new com.spotify.music.carmodehome.view.title.a(viewPager24, homeTitleView);
                            q4.P(inflate, new C0208a(this, viewGroup));
                            HomeTitleView homeTitleView2 = this.c;
                            if (homeTitleView2 != null) {
                                homeTitleView2.addOnLayoutChangeListener(this.u);
                                q4.F(viewGroup);
                                this.b = inflate;
                                return;
                            }
                            h.k("titleView");
                            throw null;
                        }
                        h.k("titleView");
                        throw null;
                    }
                    h.k("viewPager");
                    throw null;
                } else {
                    h.k("adapter");
                    throw null;
                }
            } else {
                h.k("viewPager");
                throw null;
            }
        } else {
            h.k("viewPager");
            throw null;
        }
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
        ViewPager2 viewPager2 = this.f;
        if (viewPager2 != null) {
            viewPager2.e(this.t);
            ViewPager2 viewPager22 = this.f;
            if (viewPager22 != null) {
                ViewPager2.g gVar = this.q;
                if (gVar != null) {
                    viewPager22.e(gVar);
                    this.a.e();
                    this.x.b(new c(this));
                    return;
                }
                h.k("titleAnimationPageChangeCallback");
                throw null;
            }
            h.k("viewPager");
            throw null;
        }
        h.k("viewPager");
        throw null;
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        ViewPager2 viewPager2 = this.f;
        if (viewPager2 != null) {
            viewPager2.j(this.t);
            ViewPager2 viewPager22 = this.f;
            if (viewPager22 != null) {
                ViewPager2.g gVar = this.q;
                if (gVar != null) {
                    viewPager22.j(gVar);
                    this.a.f();
                    this.x.b(null);
                    return;
                }
                h.k("titleAnimationPageChangeCallback");
                throw null;
            }
            h.k("viewPager");
            throw null;
        }
        h.k("viewPager");
        throw null;
    }
}
