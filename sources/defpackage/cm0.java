package defpackage;

import androidx.lifecycle.Lifecycle;
import com.spotify.facebook.authentication.login.FacebookSSOFragment;

/* renamed from: cm0  reason: default package */
public final class cm0 implements fjf<Lifecycle> {
    private final wlf<FacebookSSOFragment> a;

    public cm0(wlf<FacebookSSOFragment> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Lifecycle A = this.a.get().A();
        yif.g(A, "Cannot return null from a non-@Nullable @Provides method");
        return A;
    }
}
