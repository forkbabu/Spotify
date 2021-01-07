package com.google.android.material.bottomsheet;

import android.view.View;
import com.google.android.material.internal.o;

class b implements o.c {
    final /* synthetic */ BottomSheetBehavior a;

    b(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    @Override // com.google.android.material.internal.o.c
    public b5 a(View view, b5 b5Var, o.d dVar) {
        this.a.j = b5Var.e().d;
        this.a.G(false);
        return b5Var;
    }
}
