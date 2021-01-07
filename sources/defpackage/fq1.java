package defpackage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.mobile.android.spotlets.appprotocol.t3;
import com.spotify.mobile.android.util.u;
import com.spotify.music.builtinauth.authenticator.h0;
import com.spotify.music.builtinauth.model.a;
import com.spotify.music.json.e;
import com.spotify.music.json.g;
import io.reactivex.b;

/* renamed from: fq1  reason: default package */
public class fq1 implements h0 {
    private final t3 a;
    private final cqe b;
    private final ObjectMapper c;

    public fq1(t3 t3Var, cqe cqe, g gVar) {
        this.a = t3Var;
        this.b = cqe;
        e b2 = gVar.b();
        b2.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        this.c = b2.build();
    }

    @Override // com.spotify.music.builtinauth.authenticator.h0
    public void a(a aVar) {
    }

    @Override // com.spotify.music.builtinauth.authenticator.h0
    public io.reactivex.a b(a aVar) {
        return io.reactivex.a.m(new eq1(this, aVar));
    }

    public void c(a aVar, b bVar) {
        AppProtocol.ChallengeDetails challengeDetails = new AppProtocol.ChallengeDetails();
        AppProtocol.Challenge challenge = new AppProtocol.Challenge();
        challenge.nonce = "dummy_nonce";
        challenge.timestamp = u.a(this.b.e());
        challenge.authid = aVar.d();
        challenge.authmethod = aVar.c().get(0);
        try {
            challengeDetails.challenge = this.c.writeValueAsString(challenge);
            this.a.a(aVar.c().get(0), challengeDetails);
        } catch (JsonProcessingException unused) {
            bVar.onError(new RuntimeException(String.format("%s [%s]", "Could not create challenge", "com.spotify.error.client_authentication_failed")));
        }
    }
}
