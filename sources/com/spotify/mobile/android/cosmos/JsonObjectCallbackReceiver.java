package com.spotify.mobile.android.cosmos;

import android.os.Handler;
import com.spotify.mobile.android.cosmos.parser.JsonObjectParser;
import org.json.JSONObject;

public abstract class JsonObjectCallbackReceiver extends DelegableParsingCallbackReceiver<JSONObject> {
    public JsonObjectCallbackReceiver(Handler handler) {
        super(handler, new JsonObjectParser());
    }
}
