package com.spotify.music.json;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;

public enum CustomFeature {
    FIELD_VISIBILITY_ANY {
        @Override // com.spotify.music.json.CustomFeature
        public void d(ObjectMapper objectMapper) {
            objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        }
    };

    CustomFeature(AnonymousClass1 r3) {
    }

    public abstract void d(ObjectMapper objectMapper);
}
