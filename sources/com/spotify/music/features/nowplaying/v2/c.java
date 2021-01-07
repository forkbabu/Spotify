package com.spotify.music.features.nowplaying.v2;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.x;
import com.spotify.music.C0707R;
import io.reactivex.functions.g;

public final /* synthetic */ class c implements g {
    public final /* synthetic */ NowPlayingActivity a;

    public /* synthetic */ c(NowPlayingActivity nowPlayingActivity) {
        this.a = nowPlayingActivity;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        NowPlayingActivity nowPlayingActivity = this.a;
        Fragment fragment = (Fragment) obj;
        Fragment U = nowPlayingActivity.I.U("NowPlayingFragment");
        if (U == null || U.getClass() != fragment.getClass()) {
            if (fragment.D2() == null) {
                fragment.r4(new Bundle());
            }
            x i = nowPlayingActivity.I.i();
            i.q(C0707R.id.container, fragment, "NowPlayingFragment");
            i.k();
            q4.F(nowPlayingActivity.findViewById(C0707R.id.container));
        }
    }
}
