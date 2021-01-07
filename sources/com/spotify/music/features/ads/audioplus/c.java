package com.spotify.music.features.ads.audioplus;

import androidx.fragment.app.Fragment;
import com.spotify.music.features.ads.audioplus.topbanner.a;

public class c implements xs2 {
    private final a a;
    private String b = "";

    public c(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.xs2
    public void a(Fragment fragment, String str) {
        if (!this.b.equals(str)) {
            this.a.close();
            this.b = str;
        }
    }
}
