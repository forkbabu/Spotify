package com.facebook.internal;

import android.view.View;

class j0 implements View.OnClickListener {
    final /* synthetic */ i0 a;

    j0(i0 i0Var) {
        this.a = i0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (!uf.c(this)) {
            try {
                this.a.cancel();
            } catch (Throwable th) {
                uf.b(th, this);
            }
        }
    }
}
