package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import com.google.android.material.appbar.AppBarLayout;
import com.spotify.music.C0707R;
import com.spotify.music.features.podcast.entity.d;
import com.spotify.music.features.podcast.entity.e;
import com.spotify.music.util.filterheader.c;
import defpackage.ohc;
import io.doist.recyclerviewext.sticky_headers.StickyHeadersLinearLayoutManager;
import kotlin.jvm.internal.h;

/* renamed from: z47  reason: default package */
public final class z47 implements y47 {
    private AppBarLayout a;
    private RecyclerView b;
    private j47 c;
    private View d;
    private c e;
    private final n47 f;
    private final gsc g;
    private final d h;
    private final ajf<e> i;
    private final RecyclerView.q j;

    /* renamed from: z47$a */
    static final class a implements Runnable {
        final /* synthetic */ z47 a;

        a(z47 z47) {
            this.a = z47;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.a.a();
        }
    }

    public z47(n47 n47, gsc gsc, d dVar, ajf<e> ajf, RecyclerView.q qVar) {
        h.e(n47, "headerProvider");
        h.e(gsc, "adapter");
        h.e(dVar, "filterSortPopupFactory");
        h.e(ajf, "filterSortPopupListener");
        h.e(qVar, "paginatingScrollListener");
        this.f = n47;
        this.g = gsc;
        this.h = dVar;
        this.i = ajf;
        this.j = qVar;
    }

    public void a() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            esc b0 = this.g.b0();
            h.d(b0, "adapter.segments");
            int size = this.g.b0().d().size() + b0.e().size();
            boolean z = true;
            int i2 = size - 1;
            if (linearLayoutManager == null || linearLayoutManager.Z1() == i2) {
                z = false;
            }
            if (z) {
                AppBarLayout appBarLayout = this.a;
                if (appBarLayout != null) {
                    appBarLayout.i(false, false);
                } else {
                    h.k("appBarLayout");
                    throw null;
                }
            }
        } else {
            h.k("recyclerView");
            throw null;
        }
    }

    @Override // defpackage.y47
    public void b() {
        this.g.z();
    }

    @Override // defpackage.y47
    public void c(g57 g57) {
        h.e(g57, "state");
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.h1(g57.a());
                return;
            }
            return;
        }
        h.k("recyclerView");
        throw null;
    }

    @Override // defpackage.y47
    public void d() {
        c cVar = this.e;
        if (cVar != null) {
            cVar.f();
        } else {
            h.k("filterSortPopup");
            throw null;
        }
    }

    @Override // defpackage.y47
    public void e(View view) {
        h.e(view, "container");
        c cVar = this.e;
        if (cVar != null) {
            cVar.j(view);
        } else {
            h.k("filterSortPopup");
            throw null;
        }
    }

    @Override // defpackage.y47
    public void f(String str) {
        h.e(str, "lastPlayedEpisodeUri");
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.post(new a(this));
            h.e(str, "episodeUri");
            int Y = this.g.Y(str);
            if (Y > -1) {
                RecyclerView recyclerView2 = this.b;
                if (recyclerView2 != null) {
                    recyclerView2.I0(Y);
                } else {
                    h.k("recyclerView");
                    throw null;
                }
            }
        } else {
            h.k("recyclerView");
            throw null;
        }
    }

    @Override // defpackage.y47
    public void g(boa boa) {
        h.e(boa, "coverArtModel");
        j47 j47 = this.c;
        if (j47 != null) {
            ((a47) j47).w(boa);
        } else {
            h.k("header");
            throw null;
        }
    }

    @Override // defpackage.y47
    public View getView() {
        return this.d;
    }

    @Override // defpackage.y47
    public void h() {
        AppBarLayout appBarLayout = this.a;
        if (appBarLayout != null) {
            appBarLayout.i(true, true);
        } else {
            h.k("appBarLayout");
            throw null;
        }
    }

    @Override // defpackage.y47
    public void i(com.spotify.music.features.podcast.entity.c cVar) {
        h.e(cVar, "model");
        c cVar2 = this.e;
        if (cVar2 != null) {
            cVar2.h(cVar.b());
            c cVar3 = this.e;
            if (cVar3 != null) {
                cVar3.i(cVar.c(), cVar.a());
            } else {
                h.k("filterSortPopup");
                throw null;
            }
        } else {
            h.k("filterSortPopup");
            throw null;
        }
    }

    @Override // defpackage.y47
    public void j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.e(layoutInflater, "layoutInflater");
        h.e(viewGroup, "parent");
        View inflate = layoutInflater.inflate(C0707R.layout.fragment_podcast_entity_v3, viewGroup, false);
        View G = q4.G(inflate, C0707R.id.header_view);
        h.d(G, "requireViewById(it, R.id.header_view)");
        this.a = (AppBarLayout) G;
        View G2 = q4.G(inflate, C0707R.id.coordinator_layout);
        h.d(G2, "requireViewById(it, R.id.coordinator_layout)");
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) G2;
        Context context = viewGroup.getContext();
        h.d(context, "parent.context");
        n47 n47 = this.f;
        AppBarLayout appBarLayout = this.a;
        if (appBarLayout != null) {
            this.c = n47.a(layoutInflater, context, appBarLayout);
            View G3 = q4.G(inflate, C0707R.id.recycler_view);
            h.d(G3, "requireViewById(it, R.id.recycler_view)");
            RecyclerView recyclerView = (RecyclerView) G3;
            this.b = recyclerView;
            gsc gsc = this.g;
            recyclerView.setLayoutManager(new StickyHeadersLinearLayoutManager(recyclerView.getContext()));
            g gVar = new g();
            gVar.z(false);
            recyclerView.setItemAnimator(gVar);
            recyclerView.k(new fsc(), -1);
            recyclerView.setVisibility(0);
            recyclerView.setAdapter(gsc);
            RecyclerView recyclerView2 = this.b;
            if (recyclerView2 != null) {
                recyclerView2.n(this.j);
                AppBarLayout appBarLayout2 = this.a;
                if (appBarLayout2 != null) {
                    h.d(inflate, "it");
                    appBarLayout2.setPadding(0, com.spotify.android.paste.app.d.c(inflate.getContext()), 0, 0);
                    this.d = inflate;
                    d dVar = this.h;
                    Context context2 = viewGroup.getContext();
                    h.d(context2, "parent.context");
                    e eVar = this.i.get();
                    h.d(eVar, "filterSortPopupListener.get()");
                    this.e = dVar.a(context2, eVar);
                    return;
                }
                h.k("appBarLayout");
                throw null;
            }
            h.k("recyclerView");
            throw null;
        }
        h.k("appBarLayout");
        throw null;
    }

    @Override // defpackage.y47
    public void k() {
        int Z = this.g.Z(ohc.a.class);
        if (Z >= 0) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.I0(Z);
            } else {
                h.k("recyclerView");
                throw null;
            }
        }
    }

    @Override // defpackage.y47
    public void l(esc esc) {
        h.e(esc, "dataset");
        this.g.c0(esc);
    }

    @Override // defpackage.y47
    public void m(String str) {
        h.e(str, "episodeUri");
        gsc gsc = this.g;
        int Y = gsc.Y(str);
        if (Y > -1) {
            gsc.A(Y);
        }
    }

    @Override // defpackage.y47
    public void n(Class<? extends csc> cls) {
        h.e(cls, "segmentClass");
        gsc gsc = this.g;
        int Z = gsc.Z(cls);
        if (Z > -1) {
            gsc.A(Z);
        }
    }

    @Override // defpackage.y47
    public void o(r67 r67) {
        h.e(r67, "headerViewModel");
        j47 j47 = this.c;
        if (j47 != null) {
            ((a47) j47).b(r67);
        } else {
            h.k("header");
            throw null;
        }
    }

    @Override // defpackage.y47
    public g57 p() {
        RecyclerView recyclerView = this.b;
        Parcelable parcelable = null;
        if (recyclerView != null) {
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                parcelable = layoutManager.i1();
            }
            return new g57(parcelable);
        }
        h.k("recyclerView");
        throw null;
    }
}
