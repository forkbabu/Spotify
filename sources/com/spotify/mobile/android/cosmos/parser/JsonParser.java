package com.spotify.mobile.android.cosmos.parser;

import android.os.SystemClock;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.ParsingCallbackReceiver;
import com.spotify.mobile.android.util.Assertion;
import java.io.IOException;

public class JsonParser<T extends JacksonModel> implements ResponseParser<T> {
    private final Class<T> mClazz;
    private final ObjectMapper mObjectMapper;

    public JsonParser(Class<T> cls, ObjectMapper objectMapper) {
        cls.getClass();
        this.mClazz = cls;
        objectMapper.getClass();
        this.mObjectMapper = objectMapper;
    }

    public static <T extends JacksonModel> JsonParser<T> forClass(Class<T> cls, ObjectMapper objectMapper) {
        return new JsonParser<>(cls, objectMapper);
    }

    @Override // com.spotify.mobile.android.cosmos.parser.ResponseParser
    public T parseResponse(Response response) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            T t = (T) ((JacksonModel) this.mObjectMapper.readValue(response.getBody(), this.mClazz));
            Logger.l("Model parse time: %s (%d ms)", this.mClazz.getSimpleName(), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
            return t;
        } catch (ArrayStoreException e) {
            Logger.d("Error parsing JSON String, response: %s", response.toString());
            Assertion.i("Caught an exception while parsing JSON string", e);
            Logger.l("Model parse time: %s (%d ms)", this.mClazz.getSimpleName(), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
            return null;
        } catch (IOException e2) {
            Logger.d("Error parsing JSON String, response: %s", response.toString());
            throw new ParsingCallbackReceiver.ParserException(e2);
        } catch (Throwable th) {
            Logger.l("Model parse time: %s (%d ms)", this.mClazz.getSimpleName(), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
            throw th;
        }
    }
}
