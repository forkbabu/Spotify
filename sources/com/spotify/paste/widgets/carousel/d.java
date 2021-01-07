package com.spotify.paste.widgets.carousel;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

class d implements y4 {
    final /* synthetic */ RecyclerView.b0 a;
    final /* synthetic */ x4 b;
    final /* synthetic */ c c;

    d(c cVar, RecyclerView.b0 b0Var, x4 x4Var) {
        this.c = cVar;
        this.a = b0Var;
        this.b = x4Var;
    }

    private void d(View view) {
        this.b.f(null);
        int i = q4.g;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        this.c.h(this.a);
        this.c.l.remove(this.a);
        c cVar = this.c;
        if (!cVar.p()) {
            cVar.i();
        }
    }

    @Override // defpackage.y4
    public void a(View view) {
        d(view);
    }

    @Override // defpackage.y4
    public void b(View view) {
        d(view);
    }

    @Override // defpackage.y4
    public void c(View view) {
        this.c.getClass();
    }
}
