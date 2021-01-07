package com.spotify.cosmos.clienttoken;

import com.google.common.base.Optional;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.cosmos.clienttoken.model.ClientToken;
import io.reactivex.s;
import io.reactivex.y;
import io.reactivex.z;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public class ClientTokenClientImpl implements ClientTokenClient {
    private final Cosmonaut mCosmonaut;
    private final AtomicReference<ClientTokenEndpoint> mEndpoint = new AtomicReference<>();
    private final RxResolver mRxResolver;
    private final y mScheduler;

    public ClientTokenClientImpl(y yVar, Cosmonaut cosmonaut, RxResolver rxResolver) {
        this.mScheduler = yVar;
        this.mCosmonaut = cosmonaut;
        this.mRxResolver = rxResolver;
    }

    private ClientTokenEndpoint getOrCreateEndpoint() {
        Cosmonaut cosmonaut = this.mCosmonaut;
        RxResolver rxResolver = this.mRxResolver;
        rxResolver.getClass();
        ClientTokenEndpoint clientTokenEndpoint = (ClientTokenEndpoint) cosmonaut.createCosmosService(ClientTokenEndpoint.class, new a(rxResolver));
        if (this.mEndpoint.compareAndSet(null, clientTokenEndpoint)) {
            return clientTokenEndpoint;
        }
        return this.mEndpoint.get();
    }

    @Override // com.spotify.cosmos.clienttoken.ClientTokenClient
    public s<Optional<String>> encryptedClientTokenSubscription() {
        return getOrCreateEndpoint().encryptedClientToken().j0(f.a).r0(c.a).L(h.a);
    }

    @Override // com.spotify.cosmos.clienttoken.ClientTokenClient
    public s<Optional<ClientToken>> getToken(long j) {
        return getOrCreateEndpoint().getToken().A(k.a).E(i.a).m(e.a).K(j, TimeUnit.MILLISECONDS, this.mScheduler, z.z(Optional.absent())).P();
    }

    @Override // com.spotify.cosmos.clienttoken.ClientTokenClient
    public s<ng0> setDisabled() {
        return getOrCreateEndpoint().setState("disable").P().j0(g.a).r0(j.a);
    }

    @Override // com.spotify.cosmos.clienttoken.ClientTokenClient
    public s<ng0> setEnabled() {
        return getOrCreateEndpoint().setState("enable").P().j0(b.a).r0(d.a);
    }
}
