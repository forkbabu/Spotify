package com.spotify.android.glue.patterns.prettylist.compat;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.android.glue.patterns.prettylist.StickyListView;
import com.spotify.android.glue.patterns.prettylist.compat.j;
import com.spotify.android.glue.patterns.prettylist.k;
import com.spotify.android.glue.patterns.prettylist.n;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.paste.app.c;
import com.spotify.music.C0707R;
import com.spotify.paste.widgets.HeaderView;
import com.spotify.paste.widgets.a;

class c0<T extends j> extends c<T> {
    private final k a;
    private final Button b;
    private final Context c;
    private final a d;
    private final TextView e;
    private T f;
    private final e g;

    c0(e eVar, Context context, Fragment fragment, n nVar) {
        LinearLayout linearLayout;
        this.g = eVar;
        this.c = context;
        HeaderView headerView = new HeaderView(context, null);
        this.d = headerView;
        this.b = eVar.d;
        k c2 = b.c(eVar, fragment, headerView, eVar.f, nVar);
        this.a = c2;
        c2.getStickyRecyclerView().getRecyclerView().setVerticalScrollBarEnabled(!eVar.l);
        c2.getStickyRecyclerView().setUseFastScroll(eVar.l);
        int i = eVar.c;
        if (i == 0) {
            linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            u(eVar, context, linearLayout);
            this.f = new z(this);
        } else if (i == 1) {
            linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            TextView f2 = c.f(context);
            f2.setId(16908308);
            f2.setGravity(1);
            nud.p(context, f2, C0707R.attr.pasteTextAppearanceMetadata);
            linearLayout.addView(f2, new LinearLayout.LayoutParams(-2, -2));
            u(eVar, context, linearLayout);
            ImageView imageView = new ImageView(context);
            ImageView imageView2 = new ImageView(context);
            ImageView imageView3 = new ImageView(context);
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(C0707R.dimen.header_drawables_margin);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.setMargins(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(1);
            linearLayout2.addView(imageView, layoutParams);
            linearLayout2.addView(imageView2, layoutParams2);
            linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-2, -2));
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.setMargins(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            linearLayout.addView(imageView3, layoutParams3);
            a0 a0Var = new a0(this, f2, imageView, imageView2, imageView3);
            this.f = a0Var;
            a0Var.d(false);
        } else if (i == 2) {
            linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            TextView f3 = c.f(context);
            f3.setGravity(1);
            nud.p(context, f3, C0707R.attr.pasteTextAppearanceArticle);
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
            float dimensionPixelOffset2 = (float) context.getResources().getDimensionPixelOffset(C0707R.dimen.header_drawables_margin);
            layoutParams4.topMargin = nud.f(dimensionPixelOffset2, context.getResources());
            layoutParams4.bottomMargin = nud.f(dimensionPixelOffset2, context.getResources());
            linearLayout.addView(f3, layoutParams4);
            TextView f4 = c.f(context);
            f4.setGravity(1);
            nud.p(context, f4, C0707R.attr.pasteTextAppearanceSecondary);
            linearLayout.addView(f4, new LinearLayout.LayoutParams(-2, -2));
            u(eVar, context, linearLayout);
            this.f = new b0(this, f4, f3);
        } else {
            throw new UnsupportedOperationException("not supported");
        }
        headerView.setContentView(linearLayout);
        this.e = headerView.getTextView();
    }

    private void u(e eVar, Context context, LinearLayout linearLayout) {
        if (this.b != null) {
            int i = 0;
            boolean z = eVar.e == 0;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            int f2 = nud.f(8.0f, context.getResources());
            if (z) {
                layoutParams.bottomMargin = f2;
            } else {
                layoutParams.topMargin = f2;
            }
            View view = this.b;
            if (!z) {
                i = -1;
            }
            linearLayout.addView(view, i, layoutParams);
        }
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.c
    public ImageView e() {
        return this.a.getPrettyHeaderView().getBackgroundView();
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.c
    public ImageView f() {
        return this.d.getImageView();
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.c
    public RecyclerView g() {
        return this.a.getRecyclerView();
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.c
    public StickyListView h() {
        throw new UnsupportedOperationException("ListView not supported.");
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.c
    public View i() {
        return this.a.getView();
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.c
    public T j() {
        return this.f;
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.c
    public void k(a0 a0Var, Context context) {
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.c
    public void l(boolean z) {
        this.a.b(z);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.c
    public void m(boolean z) {
        this.a.a(z);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.c
    public void n(View view) {
        this.a.setHeaderAccessory(view);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.c
    public void o(int i) {
        this.a.setHeaderBackgroundColor(0);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.c
    public void p(int i) {
        this.a.getPrettyHeaderView().setGradientColor(i);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.c
    public void q(View view) {
        this.d.setImageOverlay(view);
    }
}
