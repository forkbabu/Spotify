package com.spotify.mobile.android.glue;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.SparseIntArray;
import com.spotify.mobile.android.ui.layout_traits.a;
import com.spotify.music.C0707R;
import java.util.Set;

public final class GlueLayoutTraits {

    public enum Trait {
        BIG_CARD,
        CARD,
        HEADER,
        ONE_COLUMN,
        OUTSIDE_CONTENT_AREA,
        SPACED_VERTICALLY,
        SPINNER,
        STACKABLE,
        THREE_COLUMN,
        TOP_ITEM,
        TWO_COLUMN
    }

    /* access modifiers changed from: private */
    public static final class a implements a.d<Trait> {
        private final a a;
        private final SparseIntArray b = new SparseIntArray();
        private final SparseIntArray c = new SparseIntArray();
        private final int d;
        private final int e;
        private final int f;
        private final int g;
        private final int h;
        private final int i;
        private final boolean j;

        a(Context context, boolean z) {
            this.j = z;
            context.getClass();
            Resources resources = context.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(C0707R.dimen.hugs_card_row_gap);
            this.d = dimensionPixelSize;
            this.e = resources.getDimensionPixelSize(C0707R.dimen.hub_big_card_top_padding);
            this.f = resources.getDimensionPixelSize(C0707R.dimen.hub_big_card_bottom_padding);
            this.h = resources.getDimensionPixelSize(C0707R.dimen.hugs_spinner_padding_top_bottom);
            this.g = dimensionPixelSize / 4;
            int dimensionPixelSize2 = z ? resources.getDimensionPixelSize(C0707R.dimen.content_area_horizontal_margin) : 0;
            this.i = dimensionPixelSize2;
            this.a = new a(dimensionPixelSize, dimensionPixelSize2, nud.m(context));
        }

        @Override // com.spotify.mobile.android.ui.layout_traits.a.d
        public int a(Set<Trait> set, int i2, int i3, int i4) {
            if (set.contains(Trait.ONE_COLUMN)) {
                return 1;
            }
            if (set.contains(Trait.TWO_COLUMN)) {
                return 2;
            }
            if (set.contains(Trait.THREE_COLUMN)) {
                return 3;
            }
            return i4;
        }

        @Override // com.spotify.mobile.android.ui.layout_traits.a.d
        public void b(Rect rect, Set<Trait> set, Set<Trait> set2, Set<Trait> set3, int i2, int i3, a.b bVar) {
            Trait trait = Trait.STACKABLE;
            Trait trait2 = Trait.HEADER;
            Trait trait3 = Trait.CARD;
            if (set2.contains(trait3)) {
                int c2 = this.a.c(i2, bVar);
                int i4 = this.b.get(i2, -1);
                if (i4 < 0) {
                    i4 = bVar.a(i2);
                    this.b.put(i2, i4);
                }
                rect.set(c2, i4 == 0 ? this.d : 0, this.a.d(i2, bVar), this.d);
            } else {
                if (!set2.contains(Trait.OUTSIDE_CONTENT_AREA) && this.j) {
                    int i5 = this.c.get(i2, -1);
                    if (i5 < 0) {
                        i5 = bVar.c(i2);
                        this.c.put(i2, i5);
                    }
                    int b2 = bVar.b();
                    if (i5 == 0) {
                        rect.left += this.i;
                        if (bVar.d(i2) == b2) {
                            rect.right += this.i;
                        }
                    } else if (i5 == b2 - 1) {
                        rect.right += this.i;
                    }
                }
                if (set3.contains(trait3)) {
                    if (set2.contains(trait2)) {
                        rect.bottom = this.g;
                        if (this.i > 0) {
                            rect.left -= this.d;
                        }
                    } else {
                        rect.bottom = this.d;
                    }
                }
            }
            if (set2.contains(Trait.SPACED_VERTICALLY)) {
                if (!set.contains(trait2)) {
                    rect.top += this.d;
                }
                if (!set3.contains(trait) && !set3.contains(trait2)) {
                    rect.bottom += this.d;
                }
            }
            if (set2.contains(Trait.SPINNER)) {
                int i6 = this.h;
                rect.top = i6;
                rect.bottom = i6;
            }
            if (set2.contains(Trait.BIG_CARD)) {
                rect.top = this.e;
                if (!set3.contains(trait)) {
                    rect.bottom = this.f;
                }
            }
            if (set2.contains(Trait.TOP_ITEM) && set.isEmpty()) {
                rect.top += this.d;
            }
        }

        @Override // com.spotify.mobile.android.ui.layout_traits.a.d
        public void invalidate() {
            this.a.a();
            this.b.clear();
        }
    }

    public static com.spotify.mobile.android.ui.layout_traits.a a(Context context, a.c<Trait> cVar, boolean z) {
        return com.spotify.mobile.android.ui.layout_traits.a.a(cVar, new a(context, z));
    }
}
