package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.music.C0707R;
import defpackage.s51;
import java.util.EnumSet;

/* renamed from: uo9  reason: default package */
public class uo9 extends qk9<a> {
    public static final q81 b = z81.d("home:carousel", "carousel");
    private final boolean a;

    /* renamed from: uo9$a */
    public static class a extends s51.c.a<RecyclerView> {
        private final LinearLayoutManager b;
        private final i61 c;
        private s81 f;
        private s51.b n;

        /* renamed from: uo9$a$a  reason: collision with other inner class name */
        class C0689a extends RecyclerView.q {
            C0689a() {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.q
            public void c(RecyclerView recyclerView, int i, int i2) {
                recyclerView.requestLayout();
                s81 s81 = a.this.f;
                s51.b bVar = a.this.n;
                if (s81 != null && bVar != null) {
                    bVar.b(s81, a.this.b.i1());
                }
            }
        }

        /* renamed from: uo9$a$b */
        class b extends RecyclerView.l {
            final /* synthetic */ int a;
            final /* synthetic */ int b;

            b(int i, int i2) {
                this.a = i;
                this.b = i2;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.l
            public void j(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
                int Z = ((RecyclerView) a.this.a).Z(view);
                int i0 = a.this.b.i0() - 1;
                boolean n = nud.n(recyclerView);
                int i = this.a;
                if (Z != 0) {
                    i /= 2;
                }
                int i2 = Z == i0 ? this.a : this.a / 2;
                int i3 = n ? i2 : i;
                int i4 = this.b;
                if (!n) {
                    i = i2;
                }
                rect.set(i3, i4, i, i4);
            }
        }

        a(ViewGroup viewGroup, RecyclerView recyclerView, LinearLayoutManager linearLayoutManager, i61 i61) {
            super(recyclerView);
            recyclerView.setNestedScrollingEnabled(viewGroup instanceof k4);
            this.b = linearLayoutManager;
            linearLayoutManager.D1(false);
            linearLayoutManager.u2(0);
            ((RecyclerView) this.a).setLayoutManager(linearLayoutManager);
            this.c = i61;
            ((RecyclerView) this.a).S0(i61, false);
            ((RecyclerView) this.a).n(new C0689a());
            ((RecyclerView) this.a).setHasFixedSize(false);
            ((RecyclerView) this.a).k(new b(viewGroup.getResources().getDimensionPixelSize(C0707R.dimen.home_carousel_item_spacing), viewGroup.getResources().getDimensionPixelSize(C0707R.dimen.home_carouse_top_padding)), -1);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
        }

        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            this.f = s81;
            this.n = bVar;
            this.c.c0(s81.children());
            this.c.z();
            this.b.h1(this.n.a(s81));
        }
    }

    public uo9(boolean z) {
        this.a = z;
    }

    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        Context context = viewGroup.getContext();
        RecyclerView recyclerView = new RecyclerView(context, null);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        if (this.a) {
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(C0707R.dimen.content_area_horizontal_margin);
            recyclerView.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
            recyclerView.setClipToPadding(false);
        }
        i61 i61 = new i61(w51);
        i61.T(new to9(this, recyclerView));
        return new a(viewGroup, recyclerView, linearLayoutManager, i61);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.home_carousel;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.STACKABLE, GlueLayoutTraits.Trait.OUTSIDE_CONTENT_AREA);
    }
}
