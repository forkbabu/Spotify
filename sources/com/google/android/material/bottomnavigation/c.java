package com.google.android.material.bottomnavigation;

import android.view.View;
import com.google.android.material.internal.o;

class c implements o.c {
    c(BottomNavigationView bottomNavigationView) {
    }

    @Override // com.google.android.material.internal.o.c
    public b5 a(View view, b5 b5Var, o.d dVar) {
        int g = b5Var.g() + dVar.d;
        dVar.d = g;
        q4.Q(view, dVar.a, dVar.b, dVar.c, g);
        return b5Var;
    }
}
