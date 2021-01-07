package com.spotify.cosmos.contentaccesstoken;

import com.google.common.base.Optional;
import com.spotify.contentaccesstoken.proto.ContentAccessRefreshToken;
import com.spotify.contentaccesstoken.proto.ContentAccessToken;
import io.reactivex.s;

public interface ContentAccessTokenClient {
    s<Optional<ContentAccessToken>> getToken(long j);

    s<ng0> setDisabled();

    s<ng0> setEnabled();

    s<ng0> setRefreshToken(ContentAccessRefreshToken contentAccessRefreshToken);
}
