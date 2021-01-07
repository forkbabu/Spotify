package defpackage;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.voice.api.VoiceSessionException;
import com.spotify.voice.api.model.AsrResponse;
import com.spotify.voice.api.model.ErrorDomain;
import com.spotify.voice.api.model.i;
import com.spotify.voice.api.model.m;
import io.reactivex.functions.l;

/* renamed from: gre  reason: default package */
public class gre implements l {
    private final ObjectMapper a;

    gre(ObjectMapper objectMapper) {
        this.a = objectMapper;
    }

    @Override // io.reactivex.functions.l
    public Object apply(Object obj) {
        JsonNode jsonNode = (JsonNode) obj;
        if (!jsonNode.has("transcript")) {
            return m.f(jsonNode);
        }
        try {
            AsrResponse asrResponse = (AsrResponse) this.a.convertValue(jsonNode, AsrResponse.class);
            if (asrResponse.isFinal()) {
                return m.a(asrResponse);
            }
            return m.b(asrResponse);
        } catch (IllegalArgumentException e) {
            throw new VoiceSessionException(ErrorDomain.CONNECTION, i.c, e);
        }
    }
}
