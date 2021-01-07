package com.spotify.music.navigation;

import androidx.fragment.app.Fragment;

public class m implements j {
    private final j a;
    private final wlf<Boolean> b;

    public m(j jVar, wlf<Boolean> wlf) {
        this.a = jVar;
        this.b = wlf;
    }

    @Override // com.spotify.music.navigation.j
    public void a(f fVar, Fragment fragment, g gVar, c cVar) {
        if (this.b.get().booleanValue()) {
            this.a.a(fVar, fragment, gVar, cVar);
        }
    }
}
