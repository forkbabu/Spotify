package defpackage;

import android.app.Activity;
import com.spotify.libs.signup.validators.PasswordValidator;

/* renamed from: hbe  reason: default package */
public final class hbe implements fjf<PasswordValidator> {
    private final wlf<Activity> a;

    public hbe(wlf<Activity> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new PasswordValidator(new a01(this.a.get()));
    }
}
