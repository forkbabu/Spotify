package com.spotify.music.podcast.ui.topic;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import com.spotify.music.podcast.ui.topic.p;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class i implements p {
    private final RecyclerView a;
    private final r b;

    public i(ViewGroup viewGroup, r rVar) {
        h.e(viewGroup, "parent");
        h.e(rVar, "adapter");
        this.b = rVar;
        View G = je.G(viewGroup, C0707R.layout.recycler_view_topic_chip_section, viewGroup, false);
        if (G != null) {
            RecyclerView recyclerView = (RecyclerView) G;
            this.a = recyclerView;
            viewGroup.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
            recyclerView.k(new q(new b()), -1);
            recyclerView.setAdapter(rVar);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
    }

    public View a() {
        return this.a;
    }

    public void b(nmf<? super p.a, f> nmf) {
        h.e(nmf, "event");
        this.b.X(nmf);
    }

    public void c(p.c cVar) {
        h.e(cVar, "model");
        this.b.Y(cVar);
    }
}
