package com.spotify.music.features.partneraccountlinking.clientprovider.samsung;

import io.reactivex.z;

public class h {
    private final g a;

    h(g gVar) {
        this.a = gVar;
    }

    public z<Boolean> a() {
        return this.a.a().s(a.a);
    }

    public z<Boolean> b(SamsungLinkingRequest samsungLinkingRequest) {
        return this.a.b(samsungLinkingRequest).P(Boolean.TRUE);
    }
}
