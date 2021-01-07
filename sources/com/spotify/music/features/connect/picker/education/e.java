package com.spotify.music.features.connect.picker.education;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.base.MoreObjects;

public class e {
    private final g a;

    public e(g gVar) {
        this.a = gVar;
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, zn4 zn4) {
        View V0 = this.a.V0(layoutInflater, viewGroup);
        this.a.v0(zn4.g());
        String e = zn4.e();
        if (MoreObjects.isNullOrEmpty(e)) {
            this.a.P1();
        } else {
            this.a.o1(e);
        }
        this.a.k1(zn4);
        this.a.N0();
        return V0;
    }
}
