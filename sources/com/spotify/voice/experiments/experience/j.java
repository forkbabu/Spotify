package com.spotify.voice.experiments.experience;

import android.text.TextUtils;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.libs.voice.e;
import com.spotify.voice.api.l;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public final class j implements fjf<Map<String, String>> {
    private final wlf<l> a;
    private final wlf<Set<String>> b;
    private final wlf<e> c;
    private final wlf<Random> d;

    public j(wlf<l> wlf, wlf<Set<String>> wlf2, wlf<e> wlf3, wlf<Random> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        l lVar = this.a.get();
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        builder.mo51put("iid", lVar.b());
        builder.mo51put("asr-hints", lVar.a());
        builder.mo51put("enabled_features", TextUtils.join(",", this.b.get()));
        builder.mo51put("language", "en-US");
        builder.mo51put("enable_tts", "true");
        builder.mo51put("asr", "cloudspeech");
        builder.mo51put("tts_voice", this.c.get().a(new c(this.d.get())));
        return builder.build();
    }
}
