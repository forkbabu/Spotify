package com.spotify.music;

import android.net.Uri;
import androidx.fragment.app.Fragment;
import defpackage.wod;

public final /* synthetic */ class n implements wod.b {
    public final /* synthetic */ MainActivity a;

    public /* synthetic */ n(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    public final Uri a() {
        Fragment u = this.a.j0.u();
        if (!(u instanceof yod)) {
            return null;
        }
        return ((yod) u).L0();
    }
}
