package defpackage;

import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.onboarding.freetier.education.SkipLimitEducationPolicy;

/* renamed from: p9c  reason: default package */
public final class p9c implements fjf<o9c> {
    private final wlf<SnackbarManager> a;
    private final wlf<SkipLimitEducationPolicy> b;

    public p9c(wlf<SnackbarManager> wlf, wlf<SkipLimitEducationPolicy> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o9c(this.a.get(), this.b.get());
    }
}
