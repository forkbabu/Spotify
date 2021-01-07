package com.spotify.music.features.quicksilver.utils;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import java.util.List;

class i implements Player.ActionCallback {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ QuicksilverPlaybackService c;

    i(QuicksilverPlaybackService quicksilverPlaybackService, int i, String str) {
        this.c = quicksilverPlaybackService;
        this.a = i;
        this.b = str;
    }

    @Override // com.spotify.mobile.android.cosmos.player.v2.Player.ActionCallback
    public void onActionForbidden(List<String> list) {
        Logger.d("Unable to Play Song: %s ... because of %s", this.b, list);
        QuicksilverPlaybackService.e(this.c, this.a);
    }

    @Override // com.spotify.mobile.android.cosmos.player.v2.Player.ActionCallback
    public void onActionSuccess() {
        QuicksilverPlaybackService.e(this.c, this.a);
    }
}
