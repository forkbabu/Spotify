package com.spotify.music.offlinetrials.limited.trackentity;

import com.spotify.mobile.android.ui.view.v;
import io.reactivex.disposables.b;
import io.reactivex.s;
import io.reactivex.y;

public class n {
    private final l a;
    private final y b;
    private b c;

    public n(l lVar, y yVar) {
        this.a = lVar;
        this.b = yVar;
    }

    public void a(v vVar) {
        b bVar = this.c;
        if (bVar != null) {
            bVar.dispose();
        }
        l lVar = this.a;
        lVar.getClass();
        s o0 = s.y(new e(lVar)).o0(this.b);
        vVar.getClass();
        this.c = o0.subscribe(new a(vVar));
    }

    public void b() {
        b bVar = this.c;
        if (bVar != null) {
            bVar.dispose();
        }
    }
}
