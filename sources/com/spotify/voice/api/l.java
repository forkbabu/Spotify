package com.spotify.voice.api;

import android.text.TextUtils;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.voice.api.model.VoiceInteractionResponse;

public class l {
    private String a = "";
    private String b;
    private Optional<Integer> c = Optional.absent();

    public String a() {
        return MoreObjects.nullToEmpty(this.b);
    }

    public String b() {
        return MoreObjects.nullToEmpty(this.a);
    }

    public Optional<Integer> c() {
        return this.c;
    }

    public void d(String str, Iterable<VoiceInteractionResponse.Action> iterable) {
        Optional<Integer> optional;
        this.a = str;
        this.b = null;
        this.c = Optional.absent();
        if (iterable != null) {
            for (VoiceInteractionResponse.Action action : iterable) {
                int ordinal = action.action().ordinal();
                if (ordinal == 26) {
                    VoiceInteractionResponse.Listen listen = (VoiceInteractionResponse.Listen) action;
                    if (listen.seconds() > 0) {
                        optional = Optional.of(Integer.valueOf(listen.seconds()));
                    } else {
                        optional = Optional.absent();
                    }
                    this.c = optional;
                } else if (ordinal == 31) {
                    VoiceInteractionResponse.Wait wait = (VoiceInteractionResponse.Wait) action;
                    if (wait.getHintPhrases() != null) {
                        this.b = TextUtils.join(",", wait.getHintPhrases());
                    }
                }
            }
        }
    }
}
