package com.spotify.music.marquee;

import androidx.fragment.app.c;
import com.spotify.mobile.android.util.x;

public class j {
    private final c a;
    private final boolean b;

    public j(c cVar, boolean z) {
        this.a = cVar;
        this.b = z;
    }

    public void a() {
        c cVar = this.a;
        if (cVar != null && this.b) {
            cVar.setRequestedOrientation(1);
        }
    }

    public void b() {
        c cVar = this.a;
        if (cVar != null && this.b && x.h(cVar)) {
            this.a.setRequestedOrientation(-1);
        }
    }
}
