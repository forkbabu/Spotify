package com.spotify.music.behindthelyrics.service;

import android.content.Context;
import android.content.Intent;
import android.view.ViewGroup;
import androidx.core.app.f;

public class d implements ahb {
    private final Context a;
    private boolean b;

    public d(Context context) {
        this.a = context;
    }

    @Override // defpackage.ahb
    public void a() {
        if (!this.b) {
            this.b = true;
            Context context = this.a;
            int i = BehindTheLyricsResourcesAndTracksFetcher.s;
            f.a(context, BehindTheLyricsResourcesAndTracksFetcher.class, 2314, new Intent());
        }
    }

    @Override // defpackage.ahb
    public void c() {
    }

    @Override // defpackage.ahb
    public void e() {
    }

    @Override // defpackage.ahb
    public void f(ViewGroup viewGroup) {
    }
}
