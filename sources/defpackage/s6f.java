package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Collections2;
import com.spotify.voice.api.l;
import com.spotify.voice.api.model.VoiceInteractionResponse;
import com.spotify.voice.api.model.m;

/* renamed from: s6f  reason: default package */
public final /* synthetic */ class s6f implements ti0 {
    public final /* synthetic */ ObjectMapper a;
    public final /* synthetic */ l b;

    public /* synthetic */ s6f(ObjectMapper objectMapper, l lVar) {
        this.a = objectMapper;
        this.b = lVar;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        ObjectMapper objectMapper = this.a;
        l lVar = this.b;
        try {
            VoiceInteractionResponse.ClientActions interactionResponse = ((VoiceInteractionResponse) objectMapper.convertValue(((m.e) obj).g(), VoiceInteractionResponse.class)).interactionResponse();
            if (interactionResponse.interactionId() == null || interactionResponse.actions() == null) {
                throw new IllegalArgumentException("Invalid actions response");
            }
            lVar.d(interactionResponse.interactionId(), interactionResponse.actions());
            return q2f.c(interactionResponse.interactionId(), Collections2.newArrayDeque(interactionResponse.actions()));
        } catch (IllegalArgumentException e) {
            return q2f.n(e);
        }
    }
}
