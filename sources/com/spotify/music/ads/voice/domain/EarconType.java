package com.spotify.music.ads.voice.domain;

import com.spotify.music.C0707R;

public enum EarconType {
    LISTEN(C0707R.raw.audio_interaction_listening),
    PLAY(C0707R.raw.audio_confirm_playing_now),
    SAVE(C0707R.raw.audio_confirm_adding_to_saved_ads),
    NEXT(C0707R.raw.audio_no_confirm_on_to_next),
    ERROR(C0707R.raw.audio_error_on_to_next);
    
    private final int mEarconRes;

    private EarconType(int i) {
        this.mEarconRes = i;
    }

    public int d() {
        return this.mEarconRes;
    }
}
