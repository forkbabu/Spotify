package com.spotify.mobile.android.cosmos.player.v2.rx;

import android.os.Looper;
import com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import io.reactivex.android.schedulers.a;
import io.reactivex.disposables.b;
import io.reactivex.functions.g;
import io.reactivex.s;
import io.reactivex.y;
import java.util.HashMap;
import java.util.Map;

@Deprecated
public class PlayerStateCompat {
    private static final g<Throwable> DEFAULT_ERROR_HANDLER = c.a;
    public static final /* synthetic */ int a = 0;
    private final y mComputationScheduler;
    private final Map<Player.PlayerStateObserver, b> mPlayerStateObservers = new HashMap();
    private final RxPlayerState mRxPlayerState;

    public PlayerStateCompat(RxPlayerState rxPlayerState, y yVar) {
        this.mRxPlayerState = rxPlayerState;
        this.mComputationScheduler = yVar;
    }

    private y callingThreadScheduler() {
        Looper myLooper = Looper.myLooper();
        return myLooper == null ? this.mComputationScheduler : a.a(myLooper);
    }

    public void fetch(Player.PlayerStateObserver playerStateObserver, int i, int i2) {
        s<LegacyPlayerState> o0 = this.mRxPlayerState.getPlayerState(i, i2).N0(1).o0(callingThreadScheduler());
        playerStateObserver.getClass();
        o0.subscribe(new a(playerStateObserver), DEFAULT_ERROR_HANDLER);
    }

    public LegacyPlayerState getMostRecentPlayerState() {
        return this.mRxPlayerState.getMostRecentPlayerState();
    }

    public void subscribe(Player.PlayerStateObserver playerStateObserver, int i, int i2) {
        synchronized (this.mPlayerStateObservers) {
            if (!this.mPlayerStateObservers.containsKey(playerStateObserver)) {
                s<LegacyPlayerState> o0 = this.mRxPlayerState.getPlayerState(i, i2).o0(callingThreadScheduler());
                playerStateObserver.getClass();
                this.mPlayerStateObservers.put(playerStateObserver, o0.subscribe(new a(playerStateObserver), new b(this, playerStateObserver)));
            }
        }
    }

    public void unsubscribe(Player.PlayerStateObserver playerStateObserver) {
        synchronized (this.mPlayerStateObservers) {
            b remove = this.mPlayerStateObservers.remove(playerStateObserver);
            if (remove != null) {
                remove.dispose();
            }
        }
    }
}
