package defpackage;

import com.google.protobuf.u;
import com.spotify.messages.ClientAuthEventFailure;
import com.spotify.messages.ClientAuthEventStart;
import com.spotify.messages.ClientAuthEventSuccess;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* renamed from: kl2  reason: default package */
public class kl2 implements jl2 {
    private final gl0<u> a;
    private final Map<String, String> b = new HashMap(1);

    public kl2(gl0<u> gl0) {
        this.a = gl0;
    }

    private String d(String str) {
        String str2 = this.b.get(str);
        if (str2 == null) {
            return UUID.randomUUID().toString();
        }
        this.b.remove(str2);
        return str2;
    }

    @Override // defpackage.jl2
    public void a(String str) {
        String d = d(str);
        ClientAuthEventSuccess.b i = ClientAuthEventSuccess.i();
        i.m(d);
        this.a.c(i.build());
    }

    @Override // defpackage.jl2
    public void b(AuthorizationRequest authorizationRequest, boolean z, boolean z2) {
        String uuid = UUID.randomUUID().toString();
        this.b.put(authorizationRequest.c().f(), uuid);
        ClientAuthEventStart.b r = ClientAuthEventStart.r();
        r.p(authorizationRequest.b());
        r.t(authorizationRequest.f().name());
        r.s(authorizationRequest.e());
        r.m(Arrays.asList(authorizationRequest.g()));
        r.r(z);
        r.n(authorizationRequest.c().f());
        r.q(z2);
        r.o(uuid);
        this.a.c(r.build());
    }

    @Override // defpackage.jl2
    public void c(String str, String str2) {
        String d = d(str);
        ClientAuthEventFailure.b m = ClientAuthEventFailure.m();
        m.o(str2);
        m.n(0);
        m.m(d);
        this.a.c(m.build());
    }
}
