package com.spotify.voice.api.model;

import com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent;
import com.spotify.voice.api.model.VoiceViewResponse;

final class AutoValue_VoiceViewResponse_Custom extends C$AutoValue_VoiceViewResponse_Custom {
    private volatile transient SlimoProto$ParsedQuery$Intent intent;

    AutoValue_VoiceViewResponse_Custom(String str, String str2, VoiceViewResponse.Custom.Restriction restriction, String str3, String str4, String str5) {
        super(str, str2, restriction, str3, str4, str5);
    }

    @Override // com.spotify.voice.api.model.VoiceViewResponse.Custom
    public SlimoProto$ParsedQuery$Intent intent() {
        if (this.intent == null) {
            synchronized (this) {
                if (this.intent == null) {
                    this.intent = super.intent();
                    if (this.intent == null) {
                        throw new NullPointerException("intent() cannot return null");
                    }
                }
            }
        }
        return this.intent;
    }
}
