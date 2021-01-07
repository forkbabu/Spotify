package com.spotify.music.sociallistening.participantlist.impl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobius.MobiusLoop;
import com.spotify.pageloader.s0;
import io.reactivex.s;

public class k implements s0 {
    private wdd a;
    private MobiusLoop.g<jed, ied> b;
    private final udd c;
    private final xdd f;
    private final s<edd> n;

    public k(udd udd, xdd xdd, s<edd> sVar) {
        this.c = udd;
        this.f = xdd;
        this.n = sVar;
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        wdd wdd = this.a;
        if (wdd != null) {
            return wdd.e();
        }
        return null;
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        this.a = this.f.b(layoutInflater, viewGroup);
        this.b = this.c.a(this.n);
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
        MobiusLoop.g<jed, ied> gVar = this.b;
        if (gVar != null) {
            gVar.c(this.a);
            if (!this.b.isRunning()) {
                this.b.start();
            }
        }
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
        MobiusLoop.g<jed, ied> gVar = this.b;
        if (gVar != null) {
            gVar.stop();
            this.b.d();
        }
    }
}
