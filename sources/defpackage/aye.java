package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.spotify.voice.api.l;
import com.spotify.voice.api.model.VoiceInteractionResponse;
import com.spotify.voice.api.model.m;

/* renamed from: aye  reason: default package */
public final /* synthetic */ class aye implements ti0 {
    public final /* synthetic */ ObjectMapper a;
    public final /* synthetic */ l b;

    public /* synthetic */ aye(ObjectMapper objectMapper, l lVar) {
        this.a = objectMapper;
        this.b = lVar;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        ObjectMapper objectMapper = this.a;
        l lVar = this.b;
        VoiceInteractionResponse voiceInteractionResponse = (VoiceInteractionResponse) objectMapper.convertValue(((m.e) obj).g(), VoiceInteractionResponse.class);
        if (!MoreObjects.isNullOrEmpty(voiceInteractionResponse.interactionResponse().voiceModuleRedirectUri())) {
            return vue.d(voiceInteractionResponse.interactionResponse().voiceModuleRedirectUri(), voiceInteractionResponse.interactionResponse());
        }
        lVar.d(voiceInteractionResponse.interactionResponse().interactionId(), voiceInteractionResponse.interactionResponse().actions());
        return vue.b(voiceInteractionResponse);
    }
}
