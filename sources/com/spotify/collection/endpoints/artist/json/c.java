package com.spotify.collection.endpoints.artist.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.router.Response;
import kotlin.jvm.internal.h;

public final class c implements b {
    private final ObjectMapper a;

    public c(ObjectMapper objectMapper) {
        h.e(objectMapper, "objectMapper");
        this.a = objectMapper;
    }

    @Override // com.spotify.collection.endpoints.artist.json.b
    public li0 a(Response response) {
        h.e(response, "response");
        return ((ArtistEntityJacksonModel) this.a.readValue(response.getBody(), ArtistEntityJacksonModel.class)).toArtistEntity();
    }
}
