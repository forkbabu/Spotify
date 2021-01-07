package com.spotify.music.playlist.extender;

import android.widget.ImageButton;
import com.spotify.music.playlist.extender.g0;

public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ c0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ImageButton f;

    public /* synthetic */ i(c0 c0Var, String str, int i, ImageButton imageButton) {
        this.a = c0Var;
        this.b = str;
        this.c = i;
        this.f = imageButton;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c0 c0Var = this.a;
        String str = this.b;
        int i = this.c;
        ImageButton imageButton = this.f;
        if (c0Var.f.n != null) {
            ((g0.b) c0Var.f.n).a(str, i, new h(c0Var, imageButton));
        }
    }
}
