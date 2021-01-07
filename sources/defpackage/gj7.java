package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import defpackage.pk9;
import defpackage.s51;

/* renamed from: gj7  reason: default package */
public class gj7 extends pk9.a<a> {

    /* renamed from: gj7$a */
    static class a extends s51.c.a<ViewGroup> {
        private final fj7 b;
        private final TextView c;

        protected a(ViewGroup viewGroup, fj7 fj7) {
            super(viewGroup);
            this.b = fj7;
            this.c = (TextView) viewGroup.findViewById(C0707R.id.title);
            RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(C0707R.id.recycler_view);
            viewGroup.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
            recyclerView.setAdapter(fj7);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            this.c.setText(s81.text().title());
            this.b.X(s81.custom().bundleArray("items"));
            this.b.z();
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        return new a((ViewGroup) je.G(viewGroup, C0707R.layout.premium_page_benefit_list_component, viewGroup, false), new fj7());
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.hubs_premium_page_benefit_list;
    }
}
