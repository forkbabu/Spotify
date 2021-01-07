package com.spotify.mobile.android.cosmos.parser;

import com.google.common.base.Charsets;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.HttpCallbackReceiver;
import com.spotify.mobile.android.cosmos.ParsingCallbackReceiver;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonObjectParser implements ResponseParser<JSONObject> {
    private static final Charset DEFAULT_CHARSET = Charsets.UTF_8;

    @Override // com.spotify.mobile.android.cosmos.parser.ResponseParser
    public JSONObject parseResponse(Response response) {
        try {
            HttpCallbackReceiver.defaultVerifyResponse(response);
            return new JSONObject(new String(response.getBody(), DEFAULT_CHARSET));
        } catch (JSONException e) {
            throw new ParsingCallbackReceiver.ParserException(e);
        }
    }
}
