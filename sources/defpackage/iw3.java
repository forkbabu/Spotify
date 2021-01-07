package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.z;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.music.C0707R;
import defpackage.s51;
import java.util.EnumSet;

/* renamed from: iw3  reason: default package */
public class iw3 extends qk9<a> {

    /* renamed from: iw3$a */
    static class a extends s51.c.a<RecyclerView> {
        private final i61 b;

        public a(RecyclerView recyclerView, i61 i61) {
            super(recyclerView);
            this.b = i61;
            recyclerView.setAdapter(i61);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            this.b.c0(s81.children());
            this.b.z();
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        RecyclerView recyclerView = new RecyclerView(viewGroup.getContext(), null);
        viewGroup.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
        i61 i61 = new i61(w51);
        new z().a(recyclerView);
        recyclerView.setLayoutManager(linearLayoutManager);
        int dimensionPixelSize = recyclerView.getContext().getResources().getDimensionPixelSize(C0707R.dimen.information_card_inset);
        int dimensionPixelSize2 = recyclerView.getContext().getResources().getDimensionPixelSize(C0707R.dimen.information_card_margin);
        recyclerView.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        recyclerView.setClipToPadding(false);
        recyclerView.k(new kw3(dimensionPixelSize2), -1);
        recyclerView.n(new lw3());
        return new a(recyclerView, i61);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.information_card_group;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.STACKABLE, GlueLayoutTraits.Trait.SPACED_VERTICALLY);
    }
}
