package com.spotify.mobile.android.cosmos.player.v2.rx;

import com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState;
import com.spotify.rxjava2.y;
import io.reactivex.s;
import java.util.List;

@Deprecated
public interface RxPlayerState {
    LegacyPlayerState getMostRecentPlayerState();

    s<LegacyPlayerState> getPlayerState();

    s<LegacyPlayerState> getPlayerState(int i, int i2);

    List<y> unsubscribeAndReturnLeaks();
}
