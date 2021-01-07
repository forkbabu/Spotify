package com.spotify.android.glue.patterns.prettylist.compat;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.spotify.android.glue.patterns.prettylist.StickyListView;
import com.spotify.android.glue.patterns.prettylist.compat.j;
import com.spotify.android.glue.patterns.prettylist.i;
import com.spotify.android.glue.patterns.prettylist.n;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.paste.app.c;
import com.spotify.music.C0707R;
import com.spotify.paste.widgets.HeaderView;
import com.spotify.paste.widgets.a;

class q<T extends j> extends c<T> {
    private final i a;
    private final Button b;
    private final a c;
    private final TextView d;
    private T e;

    q(e eVar, Context context, Fragment fragment, n nVar) {
        LinearLayout linearLayout;
        HeaderView headerView = new HeaderView(context, null);
        this.c = headerView;
        this.b = eVar.d;
        this.a = b.b(eVar, fragment, headerView, eVar.f, nVar);
        int i = eVar.c;
        if (i == 0) {
            linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            u(eVar, context, linearLayout);
            this.e = new o(this);
        } else if (i == 1) {
            linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            TextView f = c.f(context);
            f.setId(16908308);
            f.setGravity(1);
            nud.p(context, f, C0707R.attr.pasteTextAppearanceMetadata);
            linearLayout.addView(f, new LinearLayout.LayoutParams(-2, -2));
            u(eVar, context, linearLayout);
            this.e = new p(this, f);
        } else {
            throw new UnsupportedOperationException("not supported");
        }
        headerView.setContentView(linearLayout);
        this.d = headerView.getTextView();
    }

    private void u(e eVar, Context context, LinearLayout linearLayout) {
        if (this.b != null) {
            int i = 0;
            boolean z = eVar.e == 0;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            int f = nud.f(8.0f, context.getResources());
            if (z) {
                layoutParams.bottomMargin = f;
            } else {
                layoutParams.topMargin = f;
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
        return this.c.getImageView();
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.c
    public StickyListView h() {
        return this.a.getStickyListView();
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.c
    public View i() {
        return this.a.getView();
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.c
    public T j() {
        return this.e;
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
        this.c.setImageOverlay(view);
    }
}
