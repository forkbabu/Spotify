package com.spotify.music.appprotocol.superbird.presets;

import com.fasterxml.jackson.databind.JsonNode;
import com.spotify.music.appprotocol.superbird.presets.model.PresetsAppProtocol;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

final class a<T, R> implements l<JsonNode, PresetsAppProtocol.DevicePresets> {
    public static final a a = new a();

    a() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public PresetsAppProtocol.DevicePresets apply(JsonNode jsonNode) {
        JsonNode jsonNode2 = jsonNode;
        h.e(jsonNode2, "it");
        return new PresetsAppProtocol.DevicePresets(jsonNode2);
    }
}
