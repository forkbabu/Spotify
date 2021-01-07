package defpackage;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.router.Response;
import com.spotify.http.wg.TokenResponse;
import com.spotify.mobile.android.cosmos.parser.JacksonResponseParser;
import io.reactivex.w;
import io.reactivex.y;

/* renamed from: wb3  reason: default package */
public final class wb3 implements fjf<w<Response, TokenResponse>> {
    private final wlf<ObjectMapper> a;
    private final wlf<y> b;

    public wb3(wlf<ObjectMapper> wlf, wlf<y> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        JacksonResponseParser forClass = JacksonResponseParser.forClass(TokenResponse.class, this.a.get(), this.b.get());
        yif.g(forClass, "Cannot return null from a non-@Nullable @Provides method");
        return forClass;
    }
}
