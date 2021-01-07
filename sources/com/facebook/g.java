package com.facebook;

import android.view.View;

/* access modifiers changed from: package-private */
public class g implements View.OnClickListener {
    final /* synthetic */ h a;

    g(h hVar) {
        this.a = hVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (!uf.c(this)) {
            try {
                h hVar = this.a;
                h.a(hVar, hVar.getContext());
                if (this.a.f != null) {
                    this.a.f.onClick(view);
                } else if (this.a.c != null) {
                    this.a.c.onClick(view);
                }
            } catch (Throwable th) {
                uf.b(th, this);
            }
        }
    }
}
