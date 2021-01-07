package com.spotify.effortlesslogin.backend;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Request;
import com.spotify.http.w;
import com.spotify.music.json.g;
import io.reactivex.s;
import okhttp3.a0;
import okhttp3.c0;
import okhttp3.y;
import org.json.JSONObject;

public class e {
    private final w a;
    private final g b;

    public e(w wVar, g gVar) {
        this.a = wVar;
        this.b = gVar;
    }

    private s<String> d(String str, String str2) {
        Optional optional;
        Optional optional2;
        try {
            optional = Optional.of(c0.d(okhttp3.w.d("application/json"), new JSONObject().put("client_id", "dc9ecfcb91814373acd159bbdfeca5e9").put("jwt", str).toString()));
        } catch (Exception e) {
            Logger.e(e, "Failed to make request", new Object[0]);
            optional = Optional.absent();
        }
        if (optional.isPresent()) {
            y a2 = this.a.a();
            a0.a aVar = new a0.a();
            aVar.j(str2);
            aVar.e("Content-Encoding", "identity");
            aVar.g(Request.POST, (c0) optional.get());
            optional2 = Optional.of(a2.b(aVar.b()));
        } else {
            optional2 = Optional.absent();
        }
        if (optional2.isPresent()) {
            return s.y(new c(this, optional2));
        }
        return s.P(new Exception("Failed to create request"));
    }

    public /* synthetic */ EffortlessLoginNameResponse a(String str) {
        return (EffortlessLoginNameResponse) this.b.a().readValue(str, EffortlessLoginNameResponse.class);
    }

    public /* synthetic */ EffortlessLoginTokenResponse b(String str) {
        return (EffortlessLoginTokenResponse) this.b.a().readValue(str, EffortlessLoginTokenResponse.class);
    }

    public s<EffortlessLoginNameResponse> c(String str) {
        return d(str, "https://partner-accounts.spotify.com/v0/login/user-profile").j0(new a(this));
    }

    public s<EffortlessLoginTokenResponse> e(String str) {
        return d(str, "https://partner-accounts.spotify.com/v0/login/token").j0(new b(this));
    }
}
