package com.spotify.music.features.partneraccountlinking.clientprovider.samsung;

import io.reactivex.a;
import io.reactivex.z;

public interface g {
    @zqf("external-user-accounts/v1/status")
    z<f> a();

    @irf("external-user-accounts/v1/link/samsung")
    a b(@uqf SamsungLinkingRequest samsungLinkingRequest);
}
