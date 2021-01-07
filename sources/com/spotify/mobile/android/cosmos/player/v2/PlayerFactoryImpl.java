package com.spotify.mobile.android.cosmos.player.v2;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.mobile.android.cosmos.player.v2.queue.PlayerV2Endpoint;
import com.spotify.mobile.android.cosmos.player.v2.rx.PlayerStateCompat;

public class PlayerFactoryImpl implements PlayerFactory {
    private final cqe mClock;
    private final ObjectMapper mObjectMapper;
    private final wlf<PlayerStateCompat> mPlayerStateCompatProvider;
    private final PlayerV2Endpoint mPlayerV2Endpoint;
    private final FireAndForgetResolver mResolver;
    private final String mVersionName;

    public PlayerFactoryImpl(String str, ObjectMapper objectMapper, wlf<PlayerStateCompat> wlf, FireAndForgetResolver fireAndForgetResolver, PlayerV2Endpoint playerV2Endpoint, cqe cqe) {
        this.mResolver = fireAndForgetResolver;
        this.mPlayerV2Endpoint = playerV2Endpoint;
        this.mVersionName = str;
        this.mObjectMapper = objectMapper;
        this.mPlayerStateCompatProvider = wlf;
        this.mClock = cqe;
    }

    @Override // com.spotify.mobile.android.cosmos.player.v2.PlayerFactory
    public Player create(String str, ifd ifd, String str2, yn0 yn0) {
        return new ResolverPlayer(this.mResolver, this.mPlayerV2Endpoint, str, ifd.getName(), str2, yn0.getName(), this.mObjectMapper, this.mPlayerStateCompatProvider, this.mClock);
    }

    @Override // com.spotify.mobile.android.cosmos.player.v2.PlayerFactory
    public Player create(String str, ifd ifd, yn0 yn0) {
        return create(str, ifd, this.mVersionName, yn0);
    }
}
