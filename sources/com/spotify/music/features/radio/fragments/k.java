package com.spotify.music.features.radio.fragments;

import android.content.Context;
import android.view.View;

class k extends t42 {
    k(RadioFragment radioFragment, Context context) {
        super(context);
    }

    @Override // defpackage.t42, defpackage.w42
    public void b(int i, View view, String str, String str2, boolean z) {
        int i2 = e90.i;
        ia0 ia0 = (ia0) l70.o(view, ia0.class);
        ia0.setTitle(str);
        ia0.c1(str2);
        ia0.V1(z);
        ia0 ia02 = (ia0) l70.o(view, ia0.class);
        ia02.V1(z);
        ia02.i1(i == 3);
    }
}
