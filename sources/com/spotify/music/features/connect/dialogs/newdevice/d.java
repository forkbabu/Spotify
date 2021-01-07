package com.spotify.music.features.connect.dialogs.newdevice;

import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.router.Response;
import io.reactivex.functions.g;

public final /* synthetic */ class d implements g {
    public final /* synthetic */ String a;

    public /* synthetic */ d(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        String str = this.a;
        Response response = (Response) obj;
        int i = NewDeviceFragment.s0;
        Logger.g("Spotify Connect: Reporting onboarding flow as %s", str);
    }
}
