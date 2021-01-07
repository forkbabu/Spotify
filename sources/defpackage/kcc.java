package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.music.libs.partnerapps.PartnerType;
import io.reactivex.functions.l;

/* renamed from: kcc  reason: default package */
public final /* synthetic */ class kcc implements l {
    public final /* synthetic */ mcc a;
    public final /* synthetic */ PartnerType b;

    public /* synthetic */ kcc(mcc mcc, PartnerType partnerType) {
        this.a = mcc;
        this.b = partnerType;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.b(this.b, (ImmutableMap) obj);
    }
}
