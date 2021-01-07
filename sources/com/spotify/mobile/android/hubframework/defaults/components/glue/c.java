package com.spotify.mobile.android.hubframework.defaults.components.glue;

import android.graphics.Rect;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.d;
import defpackage.s51;
import java.util.EnumSet;

public final class c extends d.a<a> {
    private final boolean a;

    static class a extends s51.c.a<RecyclerView> {
        private final LinearLayoutManager b;
        private final i61 c;
        private s81 f;
        private s51.b n;

        /* renamed from: com.spotify.mobile.android.hubframework.defaults.components.glue.c$a$a  reason: collision with other inner class name */
        class C0176a extends RecyclerView.l {
            final /* synthetic */ int a;
            final /* synthetic */ boolean b;

            C0176a(int i, boolean z) {
                this.a = i;
                this.b = z;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.l
            public void j(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null && layoutParams.width == -1 && layoutParams.height == -2) {
                    layoutParams.width = -2;
                    layoutParams.height = -1;
                }
                int Z = ((RecyclerView) a.this.a).Z(view);
                int i0 = a.this.b.i0() - 1;
                int i = this.a;
                if (Z != 0) {
                    i /= 2;
                }
                int i2 = Z == i0 ? this.a : this.a / 2;
                boolean z = this.b;
                int i3 = z ? i2 : i;
                if (!z) {
                    i = i2;
                }
                rect.set(i3, 0, i, 0);
            }
        }

        class b extends RecyclerView.q {
            b() {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.q
            public void c(RecyclerView recyclerView, int i, int i2) {
                if (a.this.f != null && a.this.n != null) {
                    a.this.n.b(a.this.f, a.this.b.i1());
                }
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        a(android.view.ViewGroup r6, defpackage.w51 r7, boolean r8) {
            /*
                r5 = this;
                com.spotify.mobile.android.hubframework.defaults.components.glue.HubsCarouselView r0 = new com.spotify.mobile.android.hubframework.defaults.components.glue.HubsCarouselView
                android.content.Context r1 = r6.getContext()
                r2 = 0
                r0.<init>(r1, r2)
                r5.<init>(r0)
                boolean r1 = r6 instanceof defpackage.k4
                r0.setNestedScrollingEnabled(r1)
                androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
                android.content.Context r1 = r6.getContext()
                r0.<init>(r1)
                r5.b = r0
                r1 = 0
                r0.D1(r1)
                r0.u2(r1)
                android.content.res.Resources r3 = r6.getResources()
                r4 = 2131166088(0x7f070388, float:1.7946411E38)
                int r4 = r3.getDimensionPixelSize(r4)
                if (r8 == 0) goto L_0x004b
                r8 = 2131165633(0x7f0701c1, float:1.7945489E38)
                int r8 = r3.getDimensionPixelOffset(r8)
                int r8 = r8 - r4
                int r8 = java.lang.Math.max(r8, r1)
                V extends android.view.View r3 = r5.a
                androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
                r3.setPadding(r8, r1, r8, r1)
                V extends android.view.View r8 = r5.a
                androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
                r8.setClipToPadding(r1)
            L_0x004b:
                V extends android.view.View r8 = r5.a
                androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
                r8.setLayoutManager(r0)
                V extends android.view.View r8 = r5.a
                androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
                r8.setItemAnimator(r2)
                boolean r6 = defpackage.nud.n(r6)
                V extends android.view.View r8 = r5.a
                androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
                com.spotify.mobile.android.hubframework.defaults.components.glue.c$a$a r0 = new com.spotify.mobile.android.hubframework.defaults.components.glue.c$a$a
                r0.<init>(r4, r6)
                r6 = -1
                r8.k(r0, r6)
                i61 r6 = new i61
                r6.<init>(r7)
                r5.c = r6
                V extends android.view.View r7 = r5.a
                androidx.recyclerview.widget.RecyclerView r7 = (androidx.recyclerview.widget.RecyclerView) r7
                r7.S0(r6, r1)
                V extends android.view.View r6 = r5.a
                androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
                com.spotify.mobile.android.hubframework.defaults.components.glue.c$a$b r7 = new com.spotify.mobile.android.hubframework.defaults.components.glue.c$a$b
                r7.<init>()
                r6.n(r7)
                V extends android.view.View r6 = r5.a
                androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
                r6.setHasFixedSize(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.hubframework.defaults.components.glue.c.a.<init>(android.view.ViewGroup, w51, boolean):void");
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
            g91.b((RecyclerView) this.a, aVar, iArr);
        }

        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            ((RecyclerView) this.a).R0();
            this.f = s81;
            this.n = bVar;
            this.c.c0(s81.children());
            Parcelable a = bVar.a(s81);
            if (a != null) {
                this.b.h1(a);
            } else {
                this.b.t2(0, 0);
            }
            this.c.z();
        }
    }

    public c(boolean z) {
        this.a = z;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        return new a(viewGroup, w51, this.a);
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.d
    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.STACKABLE, GlueLayoutTraits.Trait.SPACED_VERTICALLY, GlueLayoutTraits.Trait.OUTSIDE_CONTENT_AREA);
    }
}
