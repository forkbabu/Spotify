package defpackage;

import android.os.Parcelable;
import com.spotify.facebook.authentication.signup.CreateAccountFragment;
import com.spotify.loginflow.navigation.a;

/* renamed from: fm0  reason: default package */
public final class fm0 implements fjf<a> {
    private final wlf<CreateAccountFragment> a;

    public fm0(wlf<CreateAccountFragment> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Parcelable parcelable = this.a.get().k4().getParcelable("KEY_FACEBOOK_USER");
        parcelable.getClass();
        return (a) parcelable;
    }
}
