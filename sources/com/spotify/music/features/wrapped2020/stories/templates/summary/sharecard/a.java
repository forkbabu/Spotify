package com.spotify.music.features.wrapped2020.stories.templates.summary.sharecard;

import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class a extends RecyclerView.e<C0258a> {
    private int c = -16777216;
    private int f = -65536;
    private final List<b> n;

    /* renamed from: com.spotify.music.features.wrapped2020.stories.templates.summary.sharecard.a$a  reason: collision with other inner class name */
    public static final class C0258a extends RecyclerView.b0 {
        private TextView C;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C0258a(android.view.ViewGroup r4) {
            /*
                r3 = this;
                java.lang.String r0 = "parent"
                kotlin.jvm.internal.h.e(r4, r0)
                android.content.Context r0 = r4.getContext()
                android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                r1 = 2131625098(0x7f0e048a, float:1.8877394E38)
                r2 = 0
                android.view.View r4 = r0.inflate(r1, r4, r2)
                r3.<init>(r4)
                r0 = 2131430247(0x7f0b0b67, float:1.848219E38)
                android.view.View r4 = r4.findViewById(r0)
                java.lang.String r0 = "itemView.findViewById(R.id.listRow)"
                kotlin.jvm.internal.h.d(r4, r0)
                android.widget.TextView r4 = (android.widget.TextView) r4
                r3.C = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.wrapped2020.stories.templates.summary.sharecard.a.C0258a.<init>(android.view.ViewGroup):void");
        }

        public final void h0(CharSequence charSequence) {
            h.e(charSequence, "data");
            this.C.setText(charSequence);
        }
    }

    public a(List<b> list) {
        h.e(list, "dataList");
        this.n = list;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(C0258a aVar, int i) {
        C0258a aVar2 = aVar;
        h.e(aVar2, "holder");
        b bVar = this.n.get(i);
        StringBuilder V0 = je.V0("$1 ");
        V0.append(bVar.a());
        aVar2.h0(new a09(V0.toString(), d.t(bVar.b()), this.c, this.f).b());
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public C0258a M(ViewGroup viewGroup, int i) {
        h.e(viewGroup, "parent");
        return new C0258a(viewGroup);
    }

    public final void X(int i, int i2) {
        this.c = i;
        this.f = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.n.size();
    }
}
