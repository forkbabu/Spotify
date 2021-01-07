package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import com.spotify.music.C0707R;
import com.spotify.music.podcast.freetierlikes.tabs.c;
import com.spotify.music.podcast.freetierlikes.tabs.f;
import io.reactivex.a;
import io.reactivex.subjects.CompletableSubject;
import kotlin.jvm.internal.h;

/* renamed from: slc  reason: default package */
public final class slc implements rlc {
    private final CompletableSubject a;
    private View b;
    private RecyclerView c;
    private View d;
    private final klc e;
    private final opa f;
    private final f g;
    private final c h;

    public slc(klc klc, opa opa, f fVar, c cVar) {
        h.e(klc, "adapterInteractor");
        h.e(opa, "scrollListener");
        h.e(fVar, "tabsEmptyViewFactory");
        h.e(cVar, "podcastPage");
        this.e = klc;
        this.f = opa;
        this.g = fVar;
        this.h = cVar;
        CompletableSubject R = CompletableSubject.R();
        h.d(R, "CompletableSubject.create()");
        this.a = R;
    }

    @Override // defpackage.rlc
    public void a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        h.e(layoutInflater, "inflater");
        h.e(viewGroup, "container");
        View inflate = layoutInflater.inflate(C0707R.layout.fragment_tab_list, viewGroup, false);
        View G = q4.G(inflate, C0707R.id.list);
        h.d(G, "ViewCompat.requireViewBy…lerView>(view, R.id.list)");
        RecyclerView recyclerView = (RecyclerView) G;
        h.d(inflate, "view");
        inflate.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        g gVar = new g();
        gVar.z(false);
        recyclerView.setItemAnimator(gVar);
        recyclerView.setVisibility(0);
        recyclerView.setAdapter(this.e.e());
        recyclerView.n(this.f);
        this.c = recyclerView;
        f fVar = this.g;
        Context context = inflate.getContext();
        h.d(context, "view.context");
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        View a2 = fVar.a(context, viewGroup2, this.h);
        a2.setVisibility(8);
        viewGroup2.addView(a2);
        this.d = a2;
        this.b = inflate;
        this.a.onComplete();
    }

    @Override // defpackage.rlc
    public void b() {
        this.e.b();
    }

    @Override // defpackage.rlc
    public void c() {
        RecyclerView recyclerView = this.c;
        if (recyclerView != null) {
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                RecyclerView recyclerView2 = this.c;
                if (recyclerView2 != null) {
                    layoutManager.I1(recyclerView2, null, 0);
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

    @Override // defpackage.rlc
    public void d(Bundle bundle) {
        RecyclerView recyclerView = this.c;
        if (recyclerView != null) {
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                h.d(layoutManager, "recyclerView.layoutManager ?: return");
                layoutManager.h1(bundle.getParcelable("recycler_view_layout_manager_state"));
                return;
            }
            return;
        }
        h.k("recyclerView");
        throw null;
    }

    @Override // defpackage.rlc
    public Bundle e() {
        Bundle bundle = new Bundle();
        RecyclerView recyclerView = this.c;
        if (recyclerView != null) {
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                h.d(layoutManager, "recyclerView.layoutManager ?: return bundle");
                bundle.putParcelable("recycler_view_layout_manager_state", layoutManager.i1());
            }
            return bundle;
        }
        h.k("recyclerView");
        throw null;
    }

    @Override // defpackage.rlc
    public void f() {
        View view = this.d;
        if (view != null) {
            view.setVisibility(0);
            RecyclerView recyclerView = this.c;
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            } else {
                h.k("recyclerView");
                throw null;
            }
        } else {
            h.k("emptyView");
            throw null;
        }
    }

    @Override // defpackage.rlc
    public a g() {
        return this.a;
    }

    @Override // defpackage.rlc
    public View getView() {
        return this.b;
    }

    @Override // defpackage.rlc
    public void h(esc esc) {
        h.e(esc, "blueprint");
        this.e.a(esc);
    }

    @Override // defpackage.rlc
    public void i() {
        View view = this.d;
        if (view != null) {
            view.setVisibility(8);
            RecyclerView recyclerView = this.c;
            if (recyclerView != null) {
                recyclerView.setVisibility(0);
            } else {
                h.k("recyclerView");
                throw null;
            }
        } else {
            h.k("emptyView");
            throw null;
        }
    }
}
