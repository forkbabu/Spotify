package com.spotify.music.features.playlistentity.viewbinder;

import android.os.Bundle;
import com.spotify.music.features.playlistentity.j;
import com.spotify.music.features.playlistentity.t;
import java.util.List;

/* access modifiers changed from: package-private */
public class f0 {
    private final j a;
    private boolean b;
    private boolean c;
    private boolean d;
    private Bundle e;

    public f0(j jVar) {
        this.a = jVar;
    }

    public void a(List<t> list, t.b bVar) {
        if (!this.b) {
            this.b = true;
            if (this.d) {
                c(list, this.e);
            }
            if (this.c) {
                e(list, bVar);
            }
        }
    }

    public void b() {
        this.b = false;
        this.c = false;
        this.d = false;
    }

    public void c(List<t> list, Bundle bundle) {
        this.d = true;
        this.e = bundle;
        if (this.b) {
            for (t tVar : list) {
                tVar.d(bundle);
            }
        }
    }

    public void d(List<t> list, Bundle bundle) {
        this.d = false;
        for (t tVar : list) {
            tVar.c(bundle);
        }
    }

    public void e(List<t> list, t.b bVar) {
        this.c = true;
        if (this.b && bVar != null) {
            for (t tVar : list) {
                tVar.l(bVar);
            }
        }
        if (this.b) {
            this.a.c();
        }
    }

    public void f(List<t> list) {
        this.c = false;
        for (t tVar : list) {
            tVar.onStop();
        }
        this.a.a();
    }
}
