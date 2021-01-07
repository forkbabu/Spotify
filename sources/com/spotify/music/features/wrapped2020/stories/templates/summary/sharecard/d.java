package com.spotify.music.features.wrapped2020.stories.templates.summary.sharecard;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.h;

public final class d extends RecyclerView.e<a> {
    private final c c;
    private final List<e> f;

    public static final class a extends RecyclerView.b0 {
        private final SummaryShareCardView C;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(android.view.ViewGroup r4) {
            /*
                r3 = this;
                java.lang.String r0 = "parent"
                kotlin.jvm.internal.h.e(r4, r0)
                android.content.Context r0 = r4.getContext()
                android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                r1 = 2131624510(0x7f0e023e, float:1.8876202E38)
                r2 = 0
                android.view.View r4 = r0.inflate(r1, r4, r2)
                r3.<init>(r4)
                r0 = 2131431359(0x7f0b0fbf, float:1.8484445E38)
                android.view.View r4 = r4.findViewById(r0)
                java.lang.String r0 = "itemView.findViewById(R.id.share_preview)"
                kotlin.jvm.internal.h.d(r4, r0)
                com.spotify.music.features.wrapped2020.stories.templates.summary.sharecard.SummaryShareCardView r4 = (com.spotify.music.features.wrapped2020.stories.templates.summary.sharecard.SummaryShareCardView) r4
                r3.C = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.wrapped2020.stories.templates.summary.sharecard.d.a.<init>(android.view.ViewGroup):void");
        }

        public final void h0(c cVar, e eVar) {
            h.e(cVar, "card");
            h.e(eVar, "color");
            this.C.a(cVar, eVar);
        }
    }

    public d(c cVar, List<e> list) {
        h.e(cVar, "card");
        h.e(list, "colors");
        this.c = cVar;
        this.f = list;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(a aVar, int i) {
        a aVar2 = aVar;
        h.e(aVar2, "holder");
        aVar2.h0(this.c, this.f.get(i));
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public a M(ViewGroup viewGroup, int i) {
        h.e(viewGroup, "parent");
        return new a(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.f.size();
    }
}
