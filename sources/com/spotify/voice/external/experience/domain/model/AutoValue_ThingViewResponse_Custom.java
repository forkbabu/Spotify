package com.spotify.voice.external.experience.domain.model;

import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.nlu.slimo.proto.SlimoProto$ParsedQuery$Intent;
import com.spotify.voice.external.experience.domain.model.ThingViewResponse;

final class AutoValue_ThingViewResponse_Custom extends C$AutoValue_ThingViewResponse_Custom {
    private volatile transient SlimoProto$ParsedQuery$Intent intent;

    AutoValue_ThingViewResponse_Custom(String str, ThingViewResponse.Custom.Slots slots, String str2, PlayerContext playerContext, ThingViewResponse.Custom.Restriction restriction, String str3, String str4, Integer num) {
        super(str, slots, str2, playerContext, restriction, str3, str4, num);
    }

    @Override // com.spotify.voice.external.experience.domain.model.ThingViewResponse.Custom
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
