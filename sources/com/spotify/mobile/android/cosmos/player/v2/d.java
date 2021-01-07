package com.spotify.mobile.android.cosmos.player.v2;

import com.google.common.collect.Collections2;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import io.reactivex.functions.g;

public final /* synthetic */ class d implements g {
    public final /* synthetic */ Player.ActionCallback a;

    public /* synthetic */ d(Player.ActionCallback actionCallback) {
        this.a = actionCallback;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Player.ActionCallback actionCallback = this.a;
        Throwable th = (Throwable) obj;
        if (actionCallback != null) {
            actionCallback.onActionForbidden(Collections2.newArrayList("android.internal-error"));
        }
    }
}
