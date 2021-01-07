package com.spotify.music.behindthelyrics.view;

import android.animation.Animator;
import com.spotify.music.behindthelyrics.view.i;

public abstract class c implements e {
    private final d a;

    public c(d dVar) {
        this.a = dVar;
    }

    public Animator b(e eVar, i.f fVar) {
        return this.a.c(eVar.a(), fVar, a());
    }
}
