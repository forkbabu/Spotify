package com.spotify.inappmessaging.display;

import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.util.Assertion;

public final class f implements fjf<fp0> {
    private final wlf<Fragment> a;

    public f(wlf<Fragment> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Fragment fragment = this.a.get();
        if (fragment.D2() == null) {
            Assertion.g("InAppMessagingDisplayFragment must have fragment arguments");
        }
        fp0 fp0 = (fp0) fragment.D2().getParcelable("message_extra");
        yif.g(fp0, "Cannot return null from a non-@Nullable @Provides method");
        return fp0;
    }
}
