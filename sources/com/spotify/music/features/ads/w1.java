package com.spotify.music.features.ads;

import androidx.fragment.app.Fragment;

public class w1 implements xs2 {
    private final mv3 a;
    private String b;

    w1(mv3 mv3) {
        this.a = mv3;
    }

    @Override // defpackage.xs2
    public void a(Fragment fragment, String str) {
        boolean z = !str.equals(this.b);
        this.b = str;
        if (z) {
            this.a.a("view_uri", str);
        }
    }
}
