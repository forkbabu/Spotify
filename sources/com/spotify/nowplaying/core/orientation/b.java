package com.spotify.nowplaying.core.orientation;

import android.os.Build;
import androidx.fragment.app.c;
import com.spotify.rxjava2.p;
import io.reactivex.g;

public class b {
    private final g<OrientationMode> a;
    private final c b;
    private final p c = new p();

    public b(g<OrientationMode> gVar, c cVar) {
        this.a = gVar;
        this.b = cVar;
    }

    public static void a(b bVar, OrientationMode orientationMode) {
        bVar.getClass();
        int ordinal = orientationMode.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                bVar.b.setRequestedOrientation(-1);
            } else if (Build.VERSION.SDK_INT >= 18) {
                bVar.b.setRequestedOrientation(11);
            } else {
                bVar.b.setRequestedOrientation(6);
            }
        } else if (Build.VERSION.SDK_INT >= 18) {
            bVar.b.setRequestedOrientation(12);
        } else {
            bVar.b.setRequestedOrientation(7);
        }
    }

    public void b() {
        this.c.b(this.a.subscribe(new a(this)));
    }

    public void c() {
        this.c.a();
    }
}
