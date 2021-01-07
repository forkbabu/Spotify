package com.spotify.voice.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.voice.api.model.VoiceInteractionResponse;

/* access modifiers changed from: package-private */
public abstract class b extends VoiceInteractionResponse.b {
    private final String a;

    b(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null uri");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof VoiceInteractionResponse.b) {
            return this.a.equals(((VoiceInteractionResponse.b) obj).uri());
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override // java.lang.Object
    public String toString() {
        return je.I0(je.V0("PlayContext{uri="), this.a, "}");
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.voice.api.model.VoiceInteractionResponse.b
    @JsonProperty("uri")
    public String uri() {
        return this.a;
    }
}
