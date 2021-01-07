package com.google.android.material.snackbar;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;

class j implements SwipeDismissBehavior.b {
    final /* synthetic */ BaseTransientBottomBar a;

    j(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior.b
    public void a(View view) {
        view.setVisibility(8);
        this.a.p(0);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior.b
    public void b(int i) {
        if (i == 0) {
            m.c().l(this.a.n);
        } else if (i == 1 || i == 2) {
            m.c().k(this.a.n);
        }
    }
}
