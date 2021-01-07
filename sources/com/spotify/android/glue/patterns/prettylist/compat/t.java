package com.spotify.android.glue.patterns.prettylist.compat;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.spotify.android.glue.patterns.prettylist.StickyListView;
import com.spotify.android.glue.patterns.prettylist.compat.j;
import com.spotify.android.glue.patterns.prettylist.i;
import com.spotify.android.glue.patterns.prettylist.n;
import com.spotify.android.glue.patterns.toolbarmenu.a0;
import com.spotify.paste.widgets.TextHeaderView;

class t<T extends j> extends c<T> {
    private final i a;
    private final TextHeaderView b;
    private T c;
    private final Button d;

    t(e eVar, Context context, Fragment fragment, n nVar) {
        TextHeaderView textHeaderView = new TextHeaderView(context, null);
        this.b = textHeaderView;
        this.d = eVar.d;
        i b2 = b.b(eVar, fragment, textHeaderView, eVar.f, nVar);
        this.a = b2;
        b2.getPrettyHeaderView().setHeaderBackgroundIsAlwaysImage(eVar.h);
        int i = eVar.c;
        if (i == 0) {
            s(eVar, context);
            this.c = new r(this);
        } else if (i == 1) {
            s(eVar, context);
            this.c = new s(this);
        } else {
            throw new UnsupportedOperationException("not supported");
        }
    }

    private void s(e eVar, Context context) {
        if (this.d != null) {
            int i = eVar.e == 0 ? 1 : 0;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            int f = nud.f(8.0f, context.getResources());
            if (i != 0) {
                layoutParams.bottomMargin = f;
            } else {
                layoutParams.topMargin = f;
            }
            this.b.addView(this.d, i ^ 1, layoutParams);
        }
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.c
    public ImageView e() {
        return this.a.getPrettyHeaderView().getBackgroundView();
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.c
    public ImageView f() {
        return null;
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
        return this.c;
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
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.c
    public void o(int i) {
        this.a.setHeaderBackgroundColor(i);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.c
    public void p(int i) {
    }

    @Override // com.spotify.android.glue.patterns.prettylist.compat.c
    public void q(View view) {
    }
}
