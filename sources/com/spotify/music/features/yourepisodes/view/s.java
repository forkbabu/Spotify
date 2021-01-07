package com.spotify.music.features.yourepisodes.view;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.spotify.encore.consumer.components.yourepisodes.api.yourepisodesheader.YourEpisodesHeader;
import com.spotify.music.features.yourepisodes.a0;
import com.spotify.music.features.yourepisodes.domain.e;
import com.spotify.music.features.yourepisodes.domain.l;
import com.spotify.paste.widgets.recyclerview.fastscroll.RecyclerViewFastScroller;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

public final class s implements o {
    private final Context a;
    private final i09 b;
    private final a0 c;
    private final YourEpisodesHeader d;
    private final a0 e;

    public s(a0 a0Var, YourEpisodesHeader yourEpisodesHeader, a0 a0Var2, k09 k09) {
        h.e(a0Var, "views");
        h.e(yourEpisodesHeader, "headerViews");
        h.e(a0Var2, "logger");
        h.e(k09, "adapterProvider");
        this.c = a0Var;
        this.d = yourEpisodesHeader;
        this.e = a0Var2;
        Context context = a0Var.i().getContext();
        h.d(context, "views.root.context");
        this.a = context;
        this.b = k09.a();
    }

    @Override // com.spotify.music.features.yourepisodes.view.o
    public void a(l lVar) {
        h.e(lVar, "model");
        e e2 = lVar.e();
        if (e2 instanceof e.a) {
            this.e.c();
            this.b.X((e.a) e2);
            this.c.getRecyclerView().setVisibility(0);
            this.c.a().setVisibility(8);
        } else if (e2 instanceof e.b) {
            this.e.b();
            this.c.getRecyclerView().setVisibility(8);
            this.c.a().setVisibility(0);
        } else if (!(e2 instanceof e.c)) {
            throw new NoWhenBranchMatchedException();
        }
        this.b.Y(lVar.d());
    }

    @Override // com.spotify.music.features.yourepisodes.view.o
    public void b() {
        this.c.c().addView(this.d.getView());
        a0 a0Var = this.c;
        a0Var.getRecyclerView().setLayoutManager(new LinearLayoutManager(this.a));
        a0Var.getRecyclerView().setAdapter(this.b);
        RecyclerViewFastScroller b2 = a0Var.b();
        b2.setEnabled(true);
        b2.setVerticalScrollBarEnabled(true);
        b2.setRecyclerView(a0Var.getRecyclerView());
    }
}
