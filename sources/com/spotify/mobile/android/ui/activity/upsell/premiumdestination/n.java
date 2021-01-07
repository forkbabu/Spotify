package com.spotify.mobile.android.ui.activity.upsell.premiumdestination;

import android.graphics.Rect;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.spotlets.common.recyclerview.e;
import com.spotify.music.C0707R;

public class n extends RecyclerView.e<RecyclerView.b0> {
    private CharSequence c;
    private String f;
    private l[] n;

    class a extends RecyclerView.b0 {
        a(n nVar, View view) {
            super(view);
        }
    }

    class b extends RecyclerView.b0 {
        b(n nVar, View view) {
            super(view);
        }
    }

    public static class c extends RecyclerView.l {
        @Override // androidx.recyclerview.widget.RecyclerView.l
        public void j(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
            ((RecyclerView.LayoutParams) view.getLayoutParams()).b();
            rect.set(0, 0, 0, 0);
            if (recyclerView.X(view) == 0) {
                rect.bottom = view.getResources().getDimensionPixelSize(C0707R.dimen.std_16dp);
            } else {
                rect.bottom = (int) TypedValue.applyDimension(1, 32.0f, view.getResources().getDisplayMetrics());
            }
        }
    }

    public static class d extends e<l> {
        private final TextView C;
        private final TextView D = ((TextView) this.a.findViewById(C0707R.id.feature_description));

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public d(android.view.ViewGroup r2) {
            /*
                r1 = this;
                r0 = 2131624506(0x7f0e023a, float:1.8876194E38)
                android.view.View r2 = com.spotify.mobile.android.spotlets.common.recyclerview.e.j0(r0, r2)
                r1.<init>(r2)
                r0 = 2131428473(0x7f0b0479, float:1.8478591E38)
                android.view.View r2 = r2.findViewById(r0)
                android.widget.TextView r2 = (android.widget.TextView) r2
                r1.C = r2
                android.view.View r2 = r1.a
                r0 = 2131428471(0x7f0b0477, float:1.8478587E38)
                android.view.View r2 = r2.findViewById(r0)
                android.widget.TextView r2 = (android.widget.TextView) r2
                r1.D = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.ui.activity.upsell.premiumdestination.n.d.<init>(android.view.ViewGroup):void");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
        @Override // com.spotify.mobile.android.spotlets.common.recyclerview.e
        public /* bridge */ /* synthetic */ void h0(l lVar, int i) {
            u0(lVar);
        }

        public void u0(l lVar) {
            this.C.setCompoundDrawablesWithIntrinsicBounds(0, lVar.b(), 0, 0);
            this.C.setText(lVar.c());
            this.D.setText(lVar.a());
        }
    }

    private boolean X() {
        return !TextUtils.isEmpty(this.c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(RecyclerView.b0 b0Var, int i) {
        int w = w(i);
        if (w == 0) {
            ((TextView) b0Var.a).setText(this.f);
        } else if (w == 1) {
            ((TextView) b0Var.a).setText(this.c);
            ((TextView) b0Var.a).setMovementMethod(new LinkMovementMethod());
        } else if (w == 2) {
            ((d) b0Var).u0(this.n[(i - 1) - (X() ? 1 : 0)]);
        } else {
            throw new IllegalArgumentException(String.format("Invalid view type: %s for position: %s", Integer.valueOf(w), Integer.valueOf(i)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new a(this, je.G(viewGroup, C0707R.layout.item_premium_destination_header, viewGroup, false));
        }
        if (i == 1) {
            return new b(this, je.G(viewGroup, C0707R.layout.item_premium_destination_legal_text, viewGroup, false));
        }
        if (i == 2) {
            return new d(viewGroup);
        }
        throw new IllegalArgumentException(je.p0("No viewType: ", i));
    }

    public void Y(String str, CharSequence charSequence, l[] lVarArr) {
        this.n = lVarArr;
        this.c = charSequence;
        this.f = str;
        z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        if (this.n == null) {
            return 0;
        }
        return this.n.length + 1 + (X() ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int w(int i) {
        if (!X()) {
            return i == 0 ? 0 : 2;
        }
        if (i == 0) {
            return 1;
        }
        return i == 1 ? 0 : 2;
    }
}
