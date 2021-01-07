package com.spotify.nowplaying.core.immersive;

import android.os.Build;
import com.spotify.rxjava2.p;
import io.reactivex.g;

public class c {
    private final f a;
    private final p b = new p();

    public c(f fVar) {
        this.a = fVar;
    }

    public static void a(c cVar, ImmersiveMode immersiveMode) {
        cVar.getClass();
        int ordinal = immersiveMode.ordinal();
        if (ordinal == 0) {
            cVar.a.b();
        } else if (ordinal == 1) {
            cVar.a.c();
        } else if (ordinal == 2) {
            cVar.a.a();
        } else {
            throw new IllegalArgumentException("Unknown immersive mode.");
        }
    }

    public void b(g<ImmersiveMode> gVar) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.b.b(gVar.subscribe(new a(this)));
        }
    }

    public void c() {
        this.b.a();
    }
}
