package com.spotify.android.glue.patterns.prettylist.compat;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.spotify.android.glue.patterns.prettylist.StickyListView;
import com.spotify.android.glue.patterns.prettylist.compat.j;
import com.spotify.android.glue.patterns.prettylist.i;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.android.paste.app.c;
import com.spotify.music.C0707R;
import com.spotify.paste.widgets.a;

class n<T extends j> extends c<T> {
    private final i a;
    private final Button b;
    private final a c;
    private T d;

    n(e eVar, Context context, Fragment fragment, a aVar, com.spotify.android.glue.patterns.prettylist.n nVar) {
        this.c = aVar;
        this.b = eVar.d;
        this.a = b.b(eVar, fragment, aVar.getHeaderView(), eVar.f, nVar);
        int i = eVar.c;
        if (i == 0) {
            LinearLayout u = u(context);
            t(u, eVar, context);
            aVar.setContentView(u);
            this.d = new k(this);
        } else if (i == 1) {
            LinearLayout u2 = u(context);
            TextView f = c.f(context);
            f.setId(16908308);
            nud.p(context, f, C0707R.attr.pasteTextAppearanceMetadata);
            u2.addView(f, new LinearLayout.LayoutParams(-2, -2));
            t(u2, eVar, context);
            this.d = new l(this, f);
            aVar.setContentView(u2);
        } else if (i == 2) {
            LinearLayout u3 = u(context);
            TextView f2 = c.f(context);
            f2.setId(C0707R.id.metadata);
            nud.p(context, f2, C0707R.attr.pasteTextAppearance);
            TextView f3 = c.f(context);
            f3.setId(16908308);
            nud.p(context, f3, C0707R.attr.pasteTextAppearanceMetadata);
            u3.addView(f3, new LinearLayout.LayoutParams(-2, -2));
            u3.addView(f2, new LinearLayout.LayoutParams(-2, -2));
            t(u3, eVar, context);
            this.d = new m(this, f2, f3);
            aVar.setContentView(u3);
        } else {
            throw new UnsupportedOperationException("not supported");
        }
    }

    private void t(ViewGroup viewGroup, e eVar, Context context) {
        if (this.b != null) {
            int i = 0;
            boolean z = eVar.e == 0;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            int f = nud.f((float) 8, context.getResources());
            if (z) {
                layoutParams.bottomMargin = f;
            } else {
                layoutParams.topMargin = f;
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
        return this.d;
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
