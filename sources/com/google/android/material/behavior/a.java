package com.google.android.material.behavior;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import defpackage.f5;

class a implements f5 {
    final /* synthetic */ SwipeDismissBehavior a;

    a(SwipeDismissBehavior swipeDismissBehavior) {
        this.a = swipeDismissBehavior;
    }

    @Override // defpackage.f5
    public boolean a(View view, f5.a aVar) {
        boolean z = false;
        if (!this.a.a(view)) {
            return false;
        }
        boolean z2 = q4.o(view) == 1;
        int i = this.a.d;
        if ((i == 0 && z2) || (i == 1 && !z2)) {
            z = true;
        }
        int width = view.getWidth();
        if (z) {
            width = -width;
        }
        q4.z(view, width);
        view.setAlpha(0.0f);
        SwipeDismissBehavior.b bVar = this.a.b;
        if (bVar != null) {
            bVar.a(view);
        }
        return true;
    }
}
