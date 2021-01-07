package com.spotify.music.libs.partnerapps.api;

import com.google.common.collect.ImmutableMap;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.libs.partnerapps.PartnerType;
import io.reactivex.z;

public class d implements c {
    private final f a;
    private final fla b;

    public d(f fVar, fla fla) {
        this.a = fVar;
        this.b = fla;
    }

    public static ImmutableMap d(d dVar, PartnerIntegrationsResponse partnerIntegrationsResponse) {
        dVar.getClass();
        ImmutableMap.Builder builder = ImmutableMap.builder();
        for (PartnerIntegrationsEntry partnerIntegrationsEntry : partnerIntegrationsResponse.partnerIntegrations()) {
            PartnerType k = PartnerType.k(partnerIntegrationsEntry.partnerIntegrationId());
            boolean z = false;
            if (k != PartnerType.UNKNOWN) {
                if (k.i() || partnerIntegrationsEntry.isConnected()) {
                    z = true;
                }
                builder.mo51put(k, bla.a(z, dVar.b.a(k.d())));
            } else {
                Logger.d("Unknown partner type: %s", partnerIntegrationsEntry.partnerIntegrationId());
            }
        }
        return builder.build();
    }

    @Override // com.spotify.music.libs.partnerapps.api.c
    public z<ImmutableMap<PartnerType, cla>> a() {
        return this.a.a().A(a.a);
    }

    @Override // com.spotify.music.libs.partnerapps.api.c
    public z<ImmutableMap<PartnerType, bla>> b() {
        return this.a.a().A(new b(this));
    }

    @Override // com.spotify.music.libs.partnerapps.api.c
    public z<ImmutableMap<PartnerType, bla>> c() {
        return this.a.b().A(new b(this));
    }
}
