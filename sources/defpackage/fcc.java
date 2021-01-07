package defpackage;

import com.spotify.mobile.android.sso.k;
import com.spotify.music.libs.partnerapps.PartnerType;

/* renamed from: fcc  reason: default package */
public final /* synthetic */ class fcc implements ti0 {
    public final /* synthetic */ PartnerType a;

    public /* synthetic */ fcc(PartnerType partnerType) {
        this.a = partnerType;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        k.d dVar = (k.d) obj;
        return bdc.a(this.a, false);
    }
}
