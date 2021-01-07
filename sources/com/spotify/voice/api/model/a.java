package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.api.model.VoiceInteractionResponse;

/* access modifiers changed from: package-private */
public abstract class a extends VoiceInteractionResponse.a {
    private final int a;

    a(int i) {
        this.a = i;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VoiceInteractionResponse.a) || this.a != ((VoiceInteractionResponse.a) obj).seconds()) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.a ^ 1000003;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.a
    @JsonProperty("seconds")
    public int seconds() {
        return this.a;
    }

    @Override // java.lang.Object
    public String toString() {
        return je.B0(je.V0("Duration{seconds="), this.a, "}");
    }
}
