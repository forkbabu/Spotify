package defpackage;

import com.spotify.mobile.android.rx.w;
import com.spotify.music.libs.ageverification.AgeRestrictedContentFacade;
import io.reactivex.s;

/* renamed from: t78  reason: default package */
public final class t78 implements fjf<s<d5b>> {
    private final wlf<w> a;
    private final wlf<AgeRestrictedContentFacade> b;

    public t78(wlf<w> wlf, wlf<AgeRestrictedContentFacade> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    public static s<d5b> a(w wVar, AgeRestrictedContentFacade ageRestrictedContentFacade) {
        return s.n(wVar.a("catalogue"), ageRestrictedContentFacade.c(), b78.a);
    }

    @Override // defpackage.wlf
    public Object get() {
        return a(this.a.get(), this.b.get());
    }
}
