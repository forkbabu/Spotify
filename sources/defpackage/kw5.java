package defpackage;

import com.spotify.signup.api.services.model.SignupConfigurationResponse;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.observable.f0;
import io.reactivex.s;

/* renamed from: kw5  reason: default package */
public final class kw5 implements fjf<s<SignupConfigurationResponse>> {
    private final wlf<iae> a;

    public kw5(wlf<iae> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new f0(this.a.get().b().P().z0().L(bw5.a), Functions.j(s.i0(SignupConfigurationResponse.DEFAULT)), true);
    }
}
