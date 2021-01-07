package defpackage;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.json.g;
import io.reactivex.s;
import java.io.IOException;

/* renamed from: fwc  reason: default package */
public class fwc {
    private final iwc a;
    private final ObjectMapper b;

    public fwc(iwc iwc, g gVar) {
        this.a = iwc;
        this.b = gVar.b().build();
    }

    public /* synthetic */ Object a(String str, Class cls, Response response) {
        try {
            return this.b.convertValue(((JsonNode) this.b.readValue(response.getBody(), JsonNode.class)).get(str), cls);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX DEBUG: Type inference failed for r3v1. Raw type applied. Possible types: io.reactivex.s<R>, io.reactivex.s<T> */
    public <T> s<T> b(String str, Class<T> cls) {
        return (s<R>) this.a.c(str).j0(new ewc(this, str, cls));
    }

    /* JADX DEBUG: Type inference failed for r3v1. Raw type applied. Possible types: io.reactivex.s<R>, io.reactivex.s<T> */
    public <T> s<T> c(String str, Class<T> cls) {
        return (s<R>) this.a.a(str).P().j0(new ewc(this, str, cls));
    }

    public s<Response> d(JacksonModel jacksonModel) {
        return this.a.b(jacksonModel).P();
    }
}
