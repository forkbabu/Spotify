package defpackage;

import com.spotify.http.u;
import com.spotify.music.internal.parnerid.PartnerUserIdEndpoint;

/* renamed from: vc3  reason: default package */
public final class vc3 implements fjf<PartnerUserIdEndpoint> {
    private final wlf<u> a;

    public vc3(wlf<u> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        PartnerUserIdEndpoint partnerUserIdEndpoint = (PartnerUserIdEndpoint) this.a.get().c(PartnerUserIdEndpoint.class);
        yif.g(partnerUserIdEndpoint, "Cannot return null from a non-@Nullable @Provides method");
        return partnerUserIdEndpoint;
    }
}
