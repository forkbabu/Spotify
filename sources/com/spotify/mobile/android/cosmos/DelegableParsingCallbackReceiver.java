package com.spotify.mobile.android.cosmos;

import android.os.Handler;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.parser.ResponseParser;

public abstract class DelegableParsingCallbackReceiver<T> extends ParsingCallbackReceiver<T> {
    private final ResponseParser<T> mParser;

    public DelegableParsingCallbackReceiver(Handler handler, ResponseParser<T> responseParser) {
        super(handler);
        this.mParser = responseParser;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.cosmos.ParsingCallbackReceiver
    public T parseResponse(Response response) {
        return this.mParser.parseResponse(response);
    }
}
