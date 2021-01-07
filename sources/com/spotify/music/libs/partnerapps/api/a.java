package com.spotify.music.libs.partnerapps.api;

import com.google.common.collect.ImmutableMap;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.libs.partnerapps.PartnerType;
import io.reactivex.functions.l;

public final /* synthetic */ class a implements l {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        for (PartnerIntegrationsEntry partnerIntegrationsEntry : ((PartnerIntegrationsResponse) obj).partnerIntegrations()) {
            PartnerType k = PartnerType.k(partnerIntegrationsEntry.partnerIntegrationId());
            if (k != PartnerType.UNKNOWN) {
                builder.mo51put(k, cla.create(partnerIntegrationsEntry.isConnected(), partnerIntegrationsEntry.clientId(), partnerIntegrationsEntry.partnerIntegrationId()));
            } else {
                Logger.d("Unknown partner type: %s", partnerIntegrationsEntry.partnerIntegrationId());
            }
        }
        return builder.build();
    }
}
