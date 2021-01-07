package com.spotify.voice.api;

import android.content.Context;
import com.spotify.voice.api.qualifiers.VoiceConsumer;

public final class r implements fjf<sg0<ng0, Boolean>> {
    private final wlf<Context> a;
    private final wlf<VoiceConsumer> b;

    public r(wlf<Context> wlf, wlf<VoiceConsumer> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    public static sg0<ng0, Boolean> a(Context context, VoiceConsumer voiceConsumer) {
        return voiceConsumer == VoiceConsumer.SUPERBIRD ? h.a : new g(context);
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get(), this.b.get());
    }
}
