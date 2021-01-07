package com.spotify.music.libs.audio.focus;

import com.spotify.mobile.android.observablestates.localspeaker.LocalSpeakerStatus;
import io.reactivex.functions.n;

public final /* synthetic */ class f implements n {
    public static final /* synthetic */ f a = new f();

    private /* synthetic */ f() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((LocalSpeakerStatus) obj) == LocalSpeakerStatus.NOT_CONNECTED;
    }
}
