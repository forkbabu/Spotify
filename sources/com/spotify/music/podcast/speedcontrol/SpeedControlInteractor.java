package com.spotify.music.podcast.speedcontrol;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableList;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.mobile.android.video.model.ContextPlayerConfiguration;
import io.reactivex.internal.operators.observable.z;
import io.reactivex.s;
import java.util.HashMap;
import java.util.Map;

public class SpeedControlInteractor {
    private static final Map<Integer, Integer> c;
    private final fwc a;
    private final ImmutableList<Integer> b;

    /* access modifiers changed from: package-private */
    public static class SpeedControlPreference implements JacksonModel {
        private final int mValue;

        @JsonProperty(ContextPlayerConfiguration.PREFS_KEY_PLAYBACK_SPEED)
        public int getValue() {
            return this.mValue;
        }

        private SpeedControlPreference(int i) {
            this.mValue = i;
        }
    }

    static {
        HashMap hashMap = new HashMap(3);
        c = hashMap;
        hashMap.put(180, Integer.valueOf((int) AppProtocol.PlaybackSpeed.PLAYBACK_SPEED_150));
        hashMap.put(250, 200);
        hashMap.put(350, 300);
    }

    public SpeedControlInteractor(fwc fwc, ImmutableList<Integer> immutableList) {
        this.a = fwc;
        this.b = immutableList;
    }

    public static Integer b(SpeedControlInteractor speedControlInteractor, Integer num) {
        speedControlInteractor.getClass();
        Integer num2 = c.get(num);
        return (speedControlInteractor.b.contains(num) || num2 == null) ? num : num2;
    }

    public s<Integer> a() {
        return this.a.c(ContextPlayerConfiguration.PREFS_KEY_PLAYBACK_SPEED, Integer.class).j0(new a(this));
    }

    public s<Integer> c() {
        return this.a.b(ContextPlayerConfiguration.PREFS_KEY_PLAYBACK_SPEED, Integer.class).j0(new a(this));
    }

    public io.reactivex.a d(int i) {
        s<Response> d = this.a.d(new SpeedControlPreference(i));
        d.getClass();
        return new z(d);
    }
}
