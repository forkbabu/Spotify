package com.spotify.music.features.languagepicker.presenter;

import androidx.fragment.app.DialogFragment;
import com.spotify.music.features.languagepicker.logger.d;

public class h {
    private final d a;
    private km5 b;

    public h(d dVar) {
        this.a = dVar;
    }

    public void a() {
        this.a.a();
        this.a.c();
    }

    public void b() {
        this.a.b();
        ((DialogFragment) this.b).M4();
    }

    public void c(km5 km5) {
        this.b = km5;
    }

    public void d() {
        this.b = null;
    }
}
