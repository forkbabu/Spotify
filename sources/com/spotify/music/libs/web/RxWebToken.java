package com.spotify.music.libs.web;

import android.net.Uri;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import io.reactivex.s;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

public class RxWebToken {
    private final h a;
    private final y b;

    /* access modifiers changed from: package-private */
    public static abstract class TokenResponse implements JacksonModel {
        TokenResponse() {
        }

        @JsonCreator
        public static TokenResponse create(@JsonProperty("token") String str) {
            return new AutoValue_RxWebToken_TokenResponse(str);
        }

        public abstract String token();
    }

    public RxWebToken(h hVar, y yVar) {
        this.a = hVar;
        this.b = yVar;
    }

    public s<Uri> a(Uri uri) {
        return this.a.a(Uri.encode(uri.toString())).P().j0(new a(uri)).U0(3, TimeUnit.SECONDS, this.b, s.i0(uri));
    }
}
