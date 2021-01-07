package com.spotify.inappmessaging.display;

import androidx.fragment.app.Fragment;
import com.spotify.mobile.android.util.Assertion;

public final class k implements fjf<gp0> {
    private final wlf<Fragment> a;

    public k(wlf<Fragment> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        Fragment fragment = this.a.get();
        if (fragment.D2() == null) {
            Assertion.g("InAppMessagingDisplayFragment must have fragment arguments");
        }
        gp0 gp0 = (gp0) fragment.D2().getParcelable("trigger_extra");
        yif.g(gp0, "Cannot return null from a non-@Nullable @Provides method");
        return gp0;
    }
}
