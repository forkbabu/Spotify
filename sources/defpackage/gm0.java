package defpackage;

import androidx.lifecycle.Lifecycle;
import com.spotify.facebook.authentication.signup.CreateAccountFragment;

/* renamed from: gm0  reason: default package */
public final class gm0 implements fjf<Lifecycle> {
    private final wlf<CreateAccountFragment> a;

    public gm0(wlf<CreateAccountFragment> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Lifecycle A = this.a.get().A();
        yif.g(A, "Cannot return null from a non-@Nullable @Provides method");
        return A;
    }
}
