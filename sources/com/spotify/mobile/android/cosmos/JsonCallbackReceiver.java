package com.spotify.mobile.android.cosmos;

import android.os.Handler;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.parser.JsonParser;

public abstract class JsonCallbackReceiver<T extends JacksonModel> extends DelegableParsingCallbackReceiver<T> {
    public JsonCallbackReceiver(Handler handler, Class<T> cls, ObjectMapper objectMapper) {
        super(handler, new JsonParser(cls, objectMapper));
    }
}
