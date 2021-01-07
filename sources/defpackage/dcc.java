package defpackage;

import com.spotify.mobile.android.sso.k;
import com.spotify.music.libs.partnerapps.PartnerType;

/* renamed from: dcc  reason: default package */
public final /* synthetic */ class dcc implements ti0 {
    public final /* synthetic */ PartnerType a;

    public /* synthetic */ dcc(PartnerType partnerType) {
        this.a = partnerType;
    }

    @Override // defpackage.ti0
    public final Object apply(Object obj) {
        k.a aVar = (k.a) obj;
        return bdc.a(this.a, true);
    }
}
