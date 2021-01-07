package com.spotify.mobile.android.spotlets.bixbyhomecards.logging;

import com.spotify.base.java.logging.Logger;

public class a {
    private final jz1 a;

    a(jz1 jz1) {
        this.a = jz1;
    }

    /* access modifiers changed from: package-private */
    public void a(int i, String str, String str2, String str3, String str4) {
        this.a.a(new t91(Integer.toString(i), str, str2, str3, str4));
        Logger.l("Log Bixby Home Cards Event: \n cardId: %s\n eventType: %s\n element: %s\n uri: %s\n currentlyPlaying: %s", Integer.valueOf(i), str, str2, str3, str4);
    }
}
