package com.spotify.music.artist.dac.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.protobuf.Any;
import com.spotify.dac.api.proto.DacResponse;
import com.spotify.pageloader.s0;
import kotlin.jvm.internal.h;

public final class a implements s0 {
    private View a;
    private final t80 b;

    public a(DacResponse dacResponse, s80 s80) {
        h.e(dacResponse, "dacResponse");
        h.e(s80, "dacResolver");
        Any h = dacResponse.h();
        h.d(h, "dacResponse.component");
        this.b = s80.a(h);
    }

    @Override // com.spotify.pageloader.s0
    public View getView() {
        return this.a;
    }

    @Override // com.spotify.pageloader.s0
    public void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater) {
        h.e(context, "context");
        h.e(viewGroup, "parent");
        h.e(layoutInflater, "inflater");
        this.a = this.b.b(viewGroup, false);
    }

    @Override // com.spotify.pageloader.s0
    public void start() {
        this.b.c();
    }

    @Override // com.spotify.pageloader.s0
    public void stop() {
    }
}
