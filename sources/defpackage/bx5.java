package defpackage;

import com.spotify.signup.api.services.model.SignupConfigurationResponse;
import io.reactivex.functions.g;

/* renamed from: bx5  reason: default package */
public final /* synthetic */ class bx5 implements g {
    public final /* synthetic */ fx5 a;

    public /* synthetic */ bx5(fx5 fx5) {
        this.a = fx5;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.z((SignupConfigurationResponse) obj);
    }
}
