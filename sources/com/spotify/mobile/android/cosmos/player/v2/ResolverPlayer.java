package com.spotify.mobile.android.cosmos.player.v2;

import android.os.Handler;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.FireAndForgetResolver;
import com.spotify.cosmos.android.ResolverCallbackReceiver;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.cosmos.ParsingCallbackReceiver;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.internal.ActionParameters;
import com.spotify.mobile.android.cosmos.player.v2.internal.LoggingParameters;
import com.spotify.mobile.android.cosmos.player.v2.internal.PlayParameters;
import com.spotify.mobile.android.cosmos.player.v2.internal.PlayerSessionParameters;
import com.spotify.mobile.android.cosmos.player.v2.internal.PreparePlayParameters;
import com.spotify.mobile.android.cosmos.player.v2.internal.SkipToTrackParameters;
import com.spotify.mobile.android.cosmos.player.v2.queue.PlayerV2Endpoint;
import com.spotify.mobile.android.cosmos.player.v2.rx.PlayerStateCompat;
import java.util.Set;

public class ResolverPlayer implements Player {
    private final cqe mClock;
    private final String mFeatureIdentifier;
    private final String mFeatureVersion;
    private final FireAndForgetResolver mFireAndForgetResolver;
    private final Handler mHandler;
    private final ObjectMapper mObjectMapper;
    private final wlf<PlayerStateCompat> mPlayerStateCompatProvider;
    private final PlayerV2Endpoint mPlayerV2Endpoint;
    private final String mReferrerIdentifier;
    private final String mViewUri;

    ResolverPlayer(FireAndForgetResolver fireAndForgetResolver, PlayerV2Endpoint playerV2Endpoint, String str, String str2, String str3, String str4, ObjectMapper objectMapper, wlf<PlayerStateCompat> wlf, cqe cqe) {
        this(new Handler(), fireAndForgetResolver, playerV2Endpoint, str, str2, str3, str4, objectMapper, wlf, cqe);
    }

    private void doPreparePlay(PlayerContext playerContext, PlayOptions playOptions, String str, final Player.PreparePlayCallback preparePlayCallback) {
        PreparePlayParameters preparePlayParameters = new PreparePlayParameters(playerContext, playOptions, getPlaybackOrigin(null, str, null));
        final PlayerSession playerSession = new PlayerSession(this);
        this.mFireAndForgetResolver.detached(this.mPlayerV2Endpoint.postSession(preparePlayParameters), new JsonCallbackReceiver<PlayerSessionParameters>(this.mHandler, PlayerSessionParameters.class, this.mObjectMapper) {
            /* class com.spotify.mobile.android.cosmos.player.v2.ResolverPlayer.AnonymousClass1 */

            /* access modifiers changed from: protected */
            @Override // com.spotify.mobile.android.cosmos.ParsingCallbackReceiver
            public void onError(Throwable th, ParsingCallbackReceiver.ErrorCause errorCause) {
                Logger.e(th, "Failed to prepare play: %s", errorCause);
                preparePlayCallback.onPreparePlayFailed();
            }

            /* access modifiers changed from: protected */
            public void onResolved(Response response, PlayerSessionParameters playerSessionParameters) {
                playerSession.setSessionUri(playerSessionParameters.sessionUri);
                preparePlayCallback.onPreparePlaySuccess(playerSession);
            }
        });
    }

    private PlayOrigin getPlaybackOrigin(Set<String> set, String str, String str2) {
        if (str == null) {
            str = this.mViewUri;
        }
        return new PlayOrigin(this.mFeatureIdentifier, this.mFeatureVersion, str, str2, this.mReferrerIdentifier, null, set);
    }

    private ResolverCallbackReceiver<Response> newDelegationCallback(Player.ActionCallback actionCallback) {
        return ResolverCallbackReceiver.forAny(this.mHandler, new c(actionCallback), new b(actionCallback));
    }

    private ResolverCallbackReceiver<Response> newDestroyDelegationCallback(Player.ActionCallback actionCallback) {
        return ResolverCallbackReceiver.forAny(this.mHandler, new a(actionCallback), new d(actionCallback));
    }

    private void playContext(PlayerContext playerContext, Set<String> set, PlayOptions playOptions, String str, String str2, Player.ActionCallback actionCallback) {
        PlayParameters playParameters = new PlayParameters(this.mClock);
        playParameters.context = playerContext;
        playParameters.options = playOptions;
        playParameters.playOrigin = getPlaybackOrigin(set, str, str2);
        this.mFireAndForgetResolver.detached(this.mPlayerV2Endpoint.postPlay(playParameters), newDelegationCallback(actionCallback));
    }

    /* access modifiers changed from: package-private */
    public void destroyPlayerSession(PlayerSession playerSession, Player.ActionCallback actionCallback) {
        this.mFireAndForgetResolver.detached(this.mPlayerV2Endpoint.deleteSession(playerSession.getSessionId()), newDestroyDelegationCallback(actionCallback));
    }

    @Override // com.spotify.mobile.android.cosmos.player.v2.Player
    public void fetchState(Player.PlayerStateObserver playerStateObserver) {
        this.mPlayerStateCompatProvider.get().fetch(playerStateObserver, 2, 2);
    }

    @Override // com.spotify.mobile.android.cosmos.player.v2.Player
    public LegacyPlayerState getLastPlayerState() {
        return this.mPlayerStateCompatProvider.get().getMostRecentPlayerState();
    }

    @Override // com.spotify.mobile.android.cosmos.player.v2.Player
    public String getViewUri() {
        return this.mViewUri;
    }

    @Override // com.spotify.mobile.android.cosmos.player.v2.Player
    public void pause() {
        this.mFireAndForgetResolver.detached(this.mPlayerV2Endpoint.postPause(new ActionParameters(this.mClock)), newDelegationCallback(null));
    }

    /* access modifiers changed from: package-private */
    public void play(PlayerSession playerSession) {
        this.mFireAndForgetResolver.detached(this.mPlayerV2Endpoint.postSessionPlay(playerSession.getSessionId(), LoggingParameters.createWithCustomTimestamp(this.mClock.d())));
    }

    @Override // com.spotify.mobile.android.cosmos.player.v2.Player
    public void playWithViewUri(PlayerContext playerContext, PlayOptions playOptions, String str) {
        playContext(playerContext, null, playOptions, str, null, null);
    }

    @Override // com.spotify.mobile.android.cosmos.player.v2.Player
    public void preparePlay(PlayerContext playerContext, PlayOptions playOptions, Player.PreparePlayCallback preparePlayCallback) {
        doPreparePlay(playerContext, playOptions, null, preparePlayCallback);
    }

    @Override // com.spotify.mobile.android.cosmos.player.v2.Player
    public void resume() {
        this.mFireAndForgetResolver.detached(this.mPlayerV2Endpoint.postResume(new ActionParameters(this.mClock)), newDelegationCallback(null));
    }

    @Override // com.spotify.mobile.android.cosmos.player.v2.Player
    public void seekTo(long j) {
        ActionParameters actionParameters = new ActionParameters(this.mClock);
        actionParameters.value = (T) Long.valueOf(j);
        this.mFireAndForgetResolver.detached(this.mPlayerV2Endpoint.postSeekTo(actionParameters), newDelegationCallback(null));
    }

    @Override // com.spotify.mobile.android.cosmos.player.v2.Player
    public void skipToNextTrack() {
        this.mFireAndForgetResolver.detached(this.mPlayerV2Endpoint.postSkipNext(new ActionParameters(this.mClock)), newDelegationCallback(null));
    }

    @Override // com.spotify.mobile.android.cosmos.player.v2.Player
    public void skipToPreviousTrack() {
        SkipToTrackParameters skipToTrackParameters = new SkipToTrackParameters(this.mClock);
        skipToTrackParameters.playOptions = new PlayOptions.Builder().allowSeeking(true).build();
        this.mFireAndForgetResolver.detached(this.mPlayerV2Endpoint.postSkipPrev(skipToTrackParameters), newDelegationCallback(null));
    }

    ResolverPlayer(Handler handler, FireAndForgetResolver fireAndForgetResolver, PlayerV2Endpoint playerV2Endpoint, String str, String str2, String str3, String str4, ObjectMapper objectMapper, wlf<PlayerStateCompat> wlf, cqe cqe) {
        this.mFireAndForgetResolver = fireAndForgetResolver;
        this.mPlayerV2Endpoint = playerV2Endpoint;
        this.mViewUri = str;
        this.mFeatureIdentifier = str2;
        this.mFeatureVersion = str3;
        this.mReferrerIdentifier = str4;
        this.mHandler = handler;
        this.mObjectMapper = objectMapper;
        this.mPlayerStateCompatProvider = wlf;
        this.mClock = cqe;
    }

    @Override // com.spotify.mobile.android.cosmos.player.v2.Player
    public void play(PlayerContext playerContext, PlayOptions playOptions) {
        playContext(playerContext, null, playOptions, null, null, null);
    }

    @Override // com.spotify.mobile.android.cosmos.player.v2.Player
    public void play(PlayerContext playerContext, PlayOptions playOptions, Player.ActionCallback actionCallback) {
        playContext(playerContext, null, playOptions, null, null, actionCallback);
    }
}
