package com.spotify.mobile.android.cosmos;

import android.os.Handler;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JacksonModel;

public abstract class JsonHttpCallbackReceiver<T extends JacksonModel> extends JsonCallbackReceiver<T> {
    public JsonHttpCallbackReceiver(Handler handler, Class<T> cls, ObjectMapper objectMapper) {
        super(handler, cls, objectMapper);
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.cosmos.ParsingCallbackReceiver
    public void verifyResponse(Response response) {
        HttpCallbackReceiver.defaultVerifyResponse(response);
    }
}
