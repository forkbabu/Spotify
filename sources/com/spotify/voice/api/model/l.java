package com.spotify.voice.api.model;

import com.spotify.voice.api.qualifiers.VoiceConsumer;
import io.reactivex.z;
import java.util.Map;

public abstract class l {
    public static l c(j jVar, VoiceConsumer voiceConsumer, z<Boolean> zVar, wlf<Map<String, String>> wlf) {
        return new f(jVar, voiceConsumer, zVar, wlf);
    }

    public abstract j a();

    public abstract VoiceConsumer b();

    public abstract z<Boolean> d();

    public abstract wlf<Map<String, String>> e();
}
