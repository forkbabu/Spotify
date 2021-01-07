package com.spotify.mobile.android.cosmos.parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.ParsingCallbackReceiver;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import io.reactivex.y;

public class JacksonResponseParser<T extends JacksonModel> implements w<Response, T> {
    private final y mComputationScheduler;
    private final JsonParser<T> mParser;

    public JacksonResponseParser(Class<T> cls, ObjectMapper objectMapper, y yVar) {
        this.mParser = JsonParser.forClass(cls, objectMapper);
        this.mComputationScheduler = yVar;
    }

    public static <T extends JacksonModel> JacksonResponseParser<T> forClass(Class<T> cls, ObjectMapper objectMapper, y yVar) {
        return new JacksonResponseParser<>(cls, objectMapper, yVar);
    }

    public /* synthetic */ JacksonModel a(Response response) {
        try {
            return this.mParser.parseResponse(response);
        } catch (ParsingCallbackReceiver.ParserException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // io.reactivex.w
    public v<T> apply(s<Response> sVar) {
        return sVar.o0(this.mComputationScheduler).j0(new a(this));
    }
}
