package defpackage;

import com.spotify.music.libs.partnerapps.PartnerType;

/* renamed from: ab2  reason: default package */
class ab2 {
    private final wlf<jb2> a;
    private final wlf<pb2> b;

    ab2(wlf<jb2> wlf, wlf<pb2> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    /* access modifiers changed from: package-private */
    public za2 a(PartnerType partnerType) {
        if (partnerType == PartnerType.GOOGLE_MAPS) {
            return this.a.get();
        }
        if (partnerType == PartnerType.WAZE) {
            return this.b.get();
        }
        throw new IllegalArgumentException(partnerType + "not implemented");
    }
}
