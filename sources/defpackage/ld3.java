package defpackage;

import com.spotify.music.libs.ageverification.AgeRestrictedContentFacade;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: ld3  reason: default package */
public class ld3 implements w<b91, b91> {
    private final AgeRestrictedContentFacade a;
    private final jd3 b;

    public ld3(AgeRestrictedContentFacade ageRestrictedContentFacade, jd3 jd3) {
        this.a = ageRestrictedContentFacade;
        this.b = jd3;
    }

    public static b91 a(ld3 ld3, b91 b91, boolean z) {
        ld3.getClass();
        return z ? ld3.b.a(b91, hd3.a) : b91;
    }

    @Override // io.reactivex.w
    public v<b91> apply(s<b91> sVar) {
        return s.n(sVar, this.a.c(), new id3(this));
    }
}
