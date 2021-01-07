package com.spotify.cosmos.clienttoken;

import com.google.common.base.Optional;
import com.spotify.cosmos.clienttoken.model.ClientToken;
import io.reactivex.s;

public interface ClientTokenClient {
    s<Optional<String>> encryptedClientTokenSubscription();

    s<Optional<ClientToken>> getToken(long j);

    s<ng0> setDisabled();

    s<ng0> setEnabled();
}
