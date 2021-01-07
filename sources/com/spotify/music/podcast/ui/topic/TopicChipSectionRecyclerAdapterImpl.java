package com.spotify.music.podcast.ui.topic;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.podcast.ui.topic.o;
import com.spotify.music.podcast.ui.topic.p;
import java.util.List;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class TopicChipSectionRecyclerAdapterImpl extends r {
    private p.c c;
    private nmf<? super p.a, f> f = TopicChipSectionRecyclerAdapterImpl$event$1.a;
    private final o.b n;

    public static final class a extends RecyclerView.b0 {
        private final o C;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(o oVar) {
            super(((l) oVar).b());
            h.e(oVar, "topicChip");
            this.C = oVar;
        }

        public final o h0() {
            return this.C;
        }
    }

    public TopicChipSectionRecyclerAdapterImpl(o.b bVar) {
        h.e(bVar, "topicChipFactory");
        this.n = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(RecyclerView.b0 b0Var, int i) {
        h.e(b0Var, "holder");
        p.c cVar = this.c;
        if (cVar != null) {
            a aVar = (a) b0Var;
            ((l) aVar.h0()).d(cVar.a().get(i));
            ((l) aVar.h0()).c(new TopicChipSectionRecyclerAdapterImpl$onBindViewHolder$1(this));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
        h.e(viewGroup, "parent");
        return new a(this.n.a(viewGroup));
    }

    @Override // com.spotify.music.podcast.ui.topic.r
    public void X(nmf<? super p.a, f> nmf) {
        h.e(nmf, "event");
        this.f = nmf;
        z();
    }

    @Override // com.spotify.music.podcast.ui.topic.r
    public void Y(p.c cVar) {
        h.e(cVar, "model");
        this.c = cVar;
        z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        List<o.c> a2;
        p.c cVar = this.c;
        if (cVar == null || (a2 = cVar.a()) == null) {
            return 0;
        }
        return a2.size();
    }
}
