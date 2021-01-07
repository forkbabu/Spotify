package defpackage;

import com.spotify.music.inappmessaging.b;
import com.spotify.music.onboarding.freetier.education.SkipLimitEducationPolicy;

/* renamed from: l9c  reason: default package */
public final class l9c implements fjf<k9c> {
    private final wlf<SkipLimitEducationPolicy> a;
    private final wlf<b> b;

    public l9c(wlf<SkipLimitEducationPolicy> wlf, wlf<b> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k9c(this.a.get(), this.b.get());
    }
}
