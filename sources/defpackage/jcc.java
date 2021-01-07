package defpackage;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.music.libs.partnerapps.PartnerType;
import io.reactivex.functions.l;

/* renamed from: jcc  reason: default package */
public final /* synthetic */ class jcc implements l {
    public final /* synthetic */ mcc a;
    public final /* synthetic */ PartnerType b;

    public /* synthetic */ jcc(mcc mcc, PartnerType partnerType) {
        this.a = mcc;
        this.b = partnerType;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.c(this.b, (AuthorizationRequest) obj);
    }
}
