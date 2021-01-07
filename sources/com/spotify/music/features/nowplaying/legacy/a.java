package com.spotify.music.features.nowplaying.legacy;

import androidx.fragment.app.Fragment;
import com.spotify.android.flags.c;
import com.spotify.android.flags.d;
import com.spotify.music.features.nowplaying.NowPlayingFragment;
import com.spotify.music.nowplaying.drivingmode.view.DrivingModeFragment;
import kotlin.jvm.internal.h;

/* compiled from: java-style lambda group */
public final class a<T> implements wlf<Fragment> {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.wlf
    public final Fragment get() {
        int i = this.a;
        if (i == 0) {
            DrivingModeFragment drivingModeFragment = new DrivingModeFragment();
            d.a(drivingModeFragment, (c) this.b);
            return drivingModeFragment;
        } else if (i == 1) {
            c cVar = (c) this.b;
            h.e(cVar, "flags");
            NowPlayingFragment nowPlayingFragment = new NowPlayingFragment();
            d.a(nowPlayingFragment, cVar);
            return nowPlayingFragment;
        } else {
            throw null;
        }
    }
}
