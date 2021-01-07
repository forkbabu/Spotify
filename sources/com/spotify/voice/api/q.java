package com.spotify.voice.api;

import com.google.common.base.Optional;
import com.spotify.voice.api.model.j;
import com.spotify.voice.api.model.l;
import com.spotify.voice.api.qualifiers.VoiceConsumer;
import io.reactivex.z;
import java.util.Map;

public final class q implements fjf<l> {
    private final wlf<j> a;
    private final wlf<VoiceConsumer> b;
    private final wlf<z<Boolean>> c;
    private final wlf<Optional<wlf<Map<String, String>>>> d;

    public q(wlf<j> wlf, wlf<VoiceConsumer> wlf2, wlf<z<Boolean>> wlf3, wlf<Optional<wlf<Map<String, String>>>> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    public static l a(j jVar, VoiceConsumer voiceConsumer, z<Boolean> zVar, Optional<wlf<Map<String, String>>> optional) {
        return l.c(jVar, voiceConsumer, zVar, optional.or((Optional<wlf<Map<String, String>>>) a.a));
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
