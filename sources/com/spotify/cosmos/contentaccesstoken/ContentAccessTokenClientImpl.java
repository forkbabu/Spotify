package com.spotify.cosmos.contentaccesstoken;

import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.contentaccesstoken.proto.ContentAccessRefreshToken;
import com.spotify.contentaccesstoken.proto.ContentAccessToken;
import com.spotify.contentaccesstoken.proto.ContentAccessTokenResponse;
import com.spotify.contentaccesstoken.proto.Error;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import io.reactivex.s;
import io.reactivex.y;
import io.reactivex.z;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public class ContentAccessTokenClientImpl implements ContentAccessTokenClient {
    private final Cosmonaut mCosmonaut;
    private final AtomicReference<ContentAccessTokenEndpoint> mEndpoint = new AtomicReference<>();
    private final RxResolver mRxResolver;
    private final y mScheduler;

    public ContentAccessTokenClientImpl(y yVar, Cosmonaut cosmonaut, RxResolver rxResolver) {
        this.mScheduler = yVar;
        this.mCosmonaut = cosmonaut;
        this.mRxResolver = rxResolver;
    }

    /* access modifiers changed from: private */
    public static Optional<ContentAccessToken> fromResponse(ContentAccessTokenResponse contentAccessTokenResponse) {
        if (!contentAccessTokenResponse.l()) {
            return Optional.of(contentAccessTokenResponse.h());
        }
        Error i = contentAccessTokenResponse.i();
        Logger.d("Could not obtain access token: %d - %s", Integer.valueOf(i.i()), i.l());
        return Optional.absent();
    }

    private ContentAccessTokenEndpoint getOrCreateEndpoint() {
        Cosmonaut cosmonaut = this.mCosmonaut;
        RxResolver rxResolver = this.mRxResolver;
        rxResolver.getClass();
        ContentAccessTokenEndpoint contentAccessTokenEndpoint = (ContentAccessTokenEndpoint) cosmonaut.createCosmosService(ContentAccessTokenEndpoint.class, new a(rxResolver));
        if (this.mEndpoint.compareAndSet(null, contentAccessTokenEndpoint)) {
            return contentAccessTokenEndpoint;
        }
        return this.mEndpoint.get();
    }

    @Override // com.spotify.cosmos.contentaccesstoken.ContentAccessTokenClient
    public s<Optional<ContentAccessToken>> getToken(long j) {
        return getOrCreateEndpoint().getToken().A(i.a).E(j.a).m(c.a).K(j, TimeUnit.MILLISECONDS, this.mScheduler, z.z(Optional.absent())).P();
    }

    @Override // com.spotify.cosmos.contentaccesstoken.ContentAccessTokenClient
    public s<ng0> setDisabled() {
        return getOrCreateEndpoint().setState("disable").P().j0(e.a).r0(f.a);
    }

    @Override // com.spotify.cosmos.contentaccesstoken.ContentAccessTokenClient
    public s<ng0> setEnabled() {
        return getOrCreateEndpoint().setState("enable").P().j0(d.a).r0(h.a);
    }

    @Override // com.spotify.cosmos.contentaccesstoken.ContentAccessTokenClient
    public s<ng0> setRefreshToken(ContentAccessRefreshToken contentAccessRefreshToken) {
        return getOrCreateEndpoint().setRefreshToken(contentAccessRefreshToken).P().j0(b.a).r0(g.a);
    }
}
