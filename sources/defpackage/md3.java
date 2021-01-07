package defpackage;

import com.spotify.music.libs.ageverification.AgeRestrictedContentFacade;

/* renamed from: md3  reason: default package */
public final class md3 implements fjf<ld3> {
    private final wlf<AgeRestrictedContentFacade> a;
    private final wlf<jd3> b;

    public md3(wlf<AgeRestrictedContentFacade> wlf, wlf<jd3> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ld3(this.a.get(), this.b.get());
    }
}
