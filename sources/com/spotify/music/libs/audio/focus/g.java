package com.spotify.music.libs.audio.focus;

import com.spotify.mobile.android.observablestates.localspeaker.LocalSpeakerStatus;

public final /* synthetic */ class g implements io.reactivex.functions.g {
    public final /* synthetic */ u a;

    public /* synthetic */ g(u uVar) {
        this.a = uVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.e((LocalSpeakerStatus) obj);
    }
}
