package com.spotify.music.homecomponents.shortcuts;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.Collections2;
import com.google.common.collect.FluentIterable;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.util.x;
import com.spotify.music.C0707R;
import defpackage.s51;
import java.util.ArrayList;
import java.util.EnumSet;

public class g extends qk9<b> {

    static class a extends RecyclerView.l {
        private final int a;
        private final int b;

        protected a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public void j(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
            int i;
            int i2;
            if (recyclerView.getAdapter() != null) {
                int X = recyclerView.X(view);
                int i3 = this.b;
                boolean z = true;
                boolean z2 = X < i3;
                if (X % i3 != 0) {
                    z = false;
                }
                boolean n = nud.n(recyclerView);
                if (z) {
                    if (z2) {
                        i2 = 0;
                    } else {
                        i2 = this.a;
                    }
                    rect.set(0, i2, 0, 0);
                    return;
                }
                if (n) {
                    i = 0;
                } else {
                    i = this.a;
                }
                rect.set(i, z2 ? 0 : this.a, n ? this.a : 0, 0);
            }
        }
    }

    static class b extends s51.c.a<RecyclerView> {
        private final i61 b;
        private final GridLayoutManager c;
        private final int f;
        private int n;
        private a o;

        protected b(RecyclerView recyclerView, i61 i61) {
            super(recyclerView);
            this.b = i61;
            Context context = recyclerView.getContext();
            Resources resources = context.getResources();
            this.n = resources.getInteger(C0707R.integer.shortcuts_container_span_count);
            int dimensionPixelSize = resources.getDimensionPixelSize(C0707R.dimen.home_shortcuts_container_item_spacing);
            this.f = dimensionPixelSize;
            GridLayoutManager gridLayoutManager = new GridLayoutManager(context, this.n);
            this.c = gridLayoutManager;
            gridLayoutManager.D1(false);
            GridLayoutManager.a aVar = new GridLayoutManager.a();
            aVar.f(true);
            gridLayoutManager.K2(aVar);
            this.o = new a(dimensionPixelSize, this.n);
            ((RecyclerView) this.a).setLayoutManager(gridLayoutManager);
            ((RecyclerView) this.a).k(this.o, 0);
            ((RecyclerView) this.a).setAdapter(i61);
            ((RecyclerView) this.a).setNestedScrollingEnabled(false);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
        }

        /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            int i;
            ArrayList newArrayListWithCapacity = Collections2.newArrayListWithCapacity(6);
            FluentIterable.from(s81.children()).limit(6).copyInto(newArrayListWithCapacity);
            int size = newArrayListWithCapacity.size();
            boolean f2 = x.f(((RecyclerView) this.a).getContext());
            boolean g = x.g(((RecyclerView) this.a).getContext());
            switch (size) {
                case 1:
                case 3:
                case 6:
                    if (f2 || g) {
                        i = 3;
                        break;
                    }
                    i = 2;
                    break;
                case 2:
                    i = 2;
                    break;
                case 4:
                case 5:
                    if (f2 || g) {
                        i = 4;
                        break;
                    }
                    i = 2;
                    break;
                default:
                    i = this.n;
                    break;
            }
            this.n = i;
            this.c.J2(i);
            RecyclerView recyclerView = (RecyclerView) this.a;
            int itemDecorationCount = recyclerView.getItemDecorationCount();
            if (itemDecorationCount > 0) {
                recyclerView.A0(recyclerView.f0(0));
                a aVar = new a(this.f, this.n);
                this.o = aVar;
                ((RecyclerView) this.a).k(aVar, 0);
                if (size > 1 && this.n % 2 == 0 && size % 2 != 0) {
                    newArrayListWithCapacity.remove(newArrayListWithCapacity.size() - 1);
                }
                this.b.c0(newArrayListWithCapacity);
                this.b.z();
                return;
            }
            throw new IndexOutOfBoundsException("0 is an invalid index for size " + itemDecorationCount);
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        return new b((RecyclerView) je.G(viewGroup, C0707R.layout.home_shortcuts_container_layout, viewGroup, false), new i61(w51));
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.home_shortcuts_container_component;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.STACKABLE);
    }
}
