package com.spotify.music.features.profile.profilelist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobius.MobiusLoop;
import com.spotify.music.features.profile.model.e;
import com.spotify.pageloader.s0;

/* access modifiers changed from: package-private */
public class s implements s0 {
    private vt7 a;
    private MobiusLoop.g<mt7, lt7> b;
    private final j c;
    private final wt7 f;
    private final mt7 n;
    private final io.reactivex.s<e> o;

    s(wt7 wt7, j jVar, mt7 mt7, io.reactivex.s<e> sVar) {
        this.f = wt7;
        this.c = jVar;
        this.n = mt7;
        this.o = sVar;
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        vt7 vt7 = this.a;
        if (vt7 != null) {
            return vt7.d();
        }
        return null;
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        this.a = this.f.b(layoutInflater, viewGroup);
        this.b = this.c.a(this.n, this.o);
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
        this.b.c(this.a);
        this.b.start();
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        MobiusLoop.g<mt7, lt7> gVar = this.b;
        if (gVar != null) {
            gVar.stop();
            this.b.d();
        }
    }
}
