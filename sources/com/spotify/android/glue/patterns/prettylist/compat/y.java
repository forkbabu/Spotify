package com.spotify.android.glue.patterns.prettylist.compat;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
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
import com.spotify.paste.widgets.a;

class y<T extends j> extends c<T> {
    private final k a;
    private final Button b;
    private final Context c;
    private final e d;
    private final a e;
    private T f;

    y(e eVar, Context context, Fragment fragment, a aVar, n nVar) {
        this.c = context;
        this.e = aVar;
        this.d = eVar;
        this.b = eVar.d;
        k c2 = b.c(eVar, fragment, aVar.getHeaderView(), eVar.f, nVar);
        this.a = c2;
        c2.getStickyRecyclerView().setUseFastScroll(eVar.l);
        int i = eVar.c;
        if (i == 0) {
            LinearLayout u = u(context);
            t(u, eVar, context);
            aVar.setContentView(u);
            this.f = new u(this);
        } else if (i == 1) {
            LinearLayout u2 = u(context);
            TextView f2 = c.f(context);
            f2.setId(16908308);
            nud.p(context, f2, C0707R.attr.pasteTextAppearanceMetadata);
            u2.addView(f2, new LinearLayout.LayoutParams(-2, -2));
            t(u2, eVar, context);
            ImageView imageView = new ImageView(context);
            ImageView imageView2 = new ImageView(context);
            ImageView imageView3 = new ImageView(context);
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(C0707R.dimen.header_drawables_margin);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams2.setMargins(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setGravity(1);
            linearLayout.addView(imageView, layoutParams);
            linearLayout.addView(imageView2, layoutParams2);
            u2.addView(linearLayout, new LinearLayout.LayoutParams(-2, -2));
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.setMargins(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            u2.addView(imageView3, layoutParams3);
            v vVar = new v(this, f2, imageView, imageView2, imageView3);
            this.f = vVar;
            vVar.d(false);
            aVar.setContentView(u2);
        } else if (i == 2) {
            LinearLayout u3 = u(context);
            TextView f3 = c.f(context);
            f3.setId(16908308);
            nud.p(context, f3, C0707R.attr.pasteTextAppearanceMetadata);
            u3.addView(f3, new LinearLayout.LayoutParams(-2, -2));
            TextView f4 = c.f(context);
            f4.setId(C0707R.id.metadata);
            nud.p(context, f4, C0707R.attr.pasteTextAppearanceHeadingSmall);
            u3.addView(f4, new LinearLayout.LayoutParams(-2, -2));
            t(u3, eVar, context);
            this.f = new w(this, f4, f3);
            aVar.setContentView(u3);
        } else if (i == 3 || i == 4 || i == 5) {
            LinearLayout u4 = u(context);
            TextView f5 = c.f(context);
            f5.setId(16908308);
            nud.p(context, f5, C0707R.attr.pasteTextAppearanceMetadata);
            u4.addView(f5, new LinearLayout.LayoutParams(-2, -2));
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(17);
            u4.addView(linearLayout2, new LinearLayout.LayoutParams(-2, -2));
            t(u4, eVar, context);
            this.f = new x(this, linearLayout2);
            aVar.setContentView(u4);
        } else {
            throw new UnsupportedOperationException("not supported");
        }
    }

    private void t(ViewGroup viewGroup, e eVar, Context context) {
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
                i = viewGroup.getChildCount();
            }
            viewGroup.addView(view, i, layoutParams);
        }
    }

    private LinearLayout u(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        return linearLayout;
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.c
    public ImageView e() {
        return this.a.getPrettyHeaderView().getBackgroundView();
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.c
    public ImageView f() {
        return this.e.getImageView();
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
        this.e.setImageOverlay(view);
    }
}
