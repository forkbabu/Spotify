package com.spotify.music.podcast.freetierlikes.tabs.followed.loadedpage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import com.spotify.music.podcast.freetierlikes.tabs.c;
import com.spotify.music.podcast.freetierlikes.tabs.f;
import com.spotify.music.podcast.freetierlikes.tabs.followed.x;
import com.spotify.playlist.models.Show;
import java.util.List;

public final class h implements g {
    private View a;
    private View b;
    private RecyclerView c;
    private final f d;
    private final c e;
    private final x f;

    public h(f fVar, c cVar, x xVar) {
        kotlin.jvm.internal.h.e(fVar, "tabsEmptyViewFactory");
        kotlin.jvm.internal.h.e(cVar, "podcastPage");
        kotlin.jvm.internal.h.e(xVar, "listAdapter");
        this.d = fVar;
        this.e = cVar;
        this.f = xVar;
    }

    @Override // com.spotify.music.podcast.freetierlikes.tabs.followed.loadedpage.g
    public void a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        kotlin.jvm.internal.h.e(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(C0707R.layout.fragment_tab_list, viewGroup, false);
        kotlin.jvm.internal.h.d(inflate, "inflated");
        Context context = inflate.getContext();
        f fVar = this.d;
        kotlin.jvm.internal.h.d(context, "context");
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        View a2 = fVar.a(context, viewGroup2, this.e);
        a2.setVisibility(8);
        viewGroup2.addView(a2);
        this.b = a2;
        View G = q4.G(inflate, C0707R.id.list);
        kotlin.jvm.internal.h.d(G, "requireViewById<RecyclerView>(inflated, R.id.list)");
        RecyclerView recyclerView = (RecyclerView) G;
        recyclerView.setAdapter(this.f);
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setVisibility(0);
        this.c = recyclerView;
        this.a = inflate;
    }

    @Override // com.spotify.music.podcast.freetierlikes.tabs.followed.loadedpage.g
    public void c() {
        RecyclerView recyclerView = this.c;
        if (recyclerView != null) {
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                RecyclerView recyclerView2 = this.c;
                if (recyclerView2 != null) {
                    layoutManager.I1(recyclerView2, null, 0);
                } else {
                    kotlin.jvm.internal.h.k("recyclerView");
                    throw null;
                }
            }
        } else {
            kotlin.jvm.internal.h.k("recyclerView");
            throw null;
        }
    }

    @Override // com.spotify.music.podcast.freetierlikes.tabs.followed.loadedpage.g
    public void f() {
        RecyclerView recyclerView = this.c;
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
            View view = this.b;
            if (view != null) {
                view.setVisibility(0);
            } else {
                kotlin.jvm.internal.h.k("emptyView");
                throw null;
            }
        } else {
            kotlin.jvm.internal.h.k("recyclerView");
            throw null;
        }
    }

    @Override // com.spotify.music.podcast.freetierlikes.tabs.followed.loadedpage.g
    public void g(String str) {
        this.f.Y(str);
    }

    @Override // com.spotify.music.podcast.freetierlikes.tabs.followed.loadedpage.g
    public View getView() {
        return this.a;
    }

    @Override // com.spotify.music.podcast.freetierlikes.tabs.followed.loadedpage.g
    public void h() {
        RecyclerView recyclerView = this.c;
        if (recyclerView != null) {
            recyclerView.setVisibility(0);
            View view = this.b;
            if (view != null) {
                view.setVisibility(8);
            } else {
                kotlin.jvm.internal.h.k("emptyView");
                throw null;
            }
        } else {
            kotlin.jvm.internal.h.k("recyclerView");
            throw null;
        }
    }

    @Override // com.spotify.music.podcast.freetierlikes.tabs.followed.loadedpage.g
    public void i(List<Show> list) {
        kotlin.jvm.internal.h.e(list, "list");
        this.f.Z(list);
    }
}
