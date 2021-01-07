package com.spotify.music.libs.mediabrowserservice;

import android.support.v4.media.session.MediaSessionCompat;
import io.reactivex.a0;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.Iterator;

public class t2 {
    private final o2 a;
    private final MediaSessionCompat b;

    public t2(MediaSessionCompat mediaSessionCompat, o2 o2Var) {
        this.b = mediaSessionCompat;
        this.a = o2Var;
    }

    private z<n2> d(String str) {
        Iterator it = ((ArrayList) this.a.f()).iterator();
        while (it.hasNext()) {
            n2 n2Var = (n2) it.next();
            if (n2Var.i().equals(str)) {
                return z.z(n2Var);
            }
        }
        return z.g(new q0(this, str));
    }

    public /* synthetic */ void a(String str, a0 a0Var) {
        this.a.c(str, this.b, RootHintsParams.a("default"));
        this.a.a(str, new s2(this, a0Var, str));
    }

    public z<a2> b(String str, Long l) {
        return d(str).A(new p0(l, str));
    }

    public z<a2> c(String str) {
        return d(str).A(h1.a);
    }
}
