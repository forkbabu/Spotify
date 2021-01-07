package com.spotify.mobile.android.cosmos.player.v2;

import com.google.common.collect.Collections2;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import io.reactivex.functions.g;
import java.util.Arrays;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ Player.ActionCallback a;

    public /* synthetic */ c(Player.ActionCallback actionCallback) {
        this.a = actionCallback;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        Player.ActionCallback actionCallback = this.a;
        Response response = (Response) obj;
        if (actionCallback != null) {
            if (response.getStatus() == 200) {
                actionCallback.onActionSuccess();
            } else if (response.getStatus() == 403) {
                actionCallback.onActionForbidden(Arrays.asList(response.getHeaders().get("forbidden-reasons").split(",")));
            } else {
                StringBuilder V0 = je.V0("android.unknown-error-");
                V0.append(response.getStatus());
                actionCallback.onActionForbidden(Collections2.newArrayList(V0.toString()));
            }
        }
    }
}
