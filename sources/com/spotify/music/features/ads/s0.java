package com.spotify.music.features.ads;

import android.content.ContentResolver;
import androidx.lifecycle.Lifecycle;
import com.spotify.libs.connect.volume.controllers.n;
import com.spotify.music.features.ads.api.a;
import com.spotify.music.features.ads.screensaver.n0;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.y;

public final class s0 implements fjf<r0> {
    public static r0 a(r1 r1Var, dv3 dv3, ku3 ku3, p0 p0Var, n0 n0Var, x1 x1Var) {
        return new r0(r1Var, dv3, ku3, p0Var, n0Var, x1Var);
    }

    public static AdsPlaybackPlugin b(r1 r1Var, ContentResolver contentResolver, g<PlayerState> gVar, y yVar, fv3 fv3, n nVar, xp1 xp1, Object obj, a aVar, Lifecycle lifecycle) {
        return new AdsPlaybackPlugin(r1Var, contentResolver, gVar, yVar, fv3, nVar, xp1, (r0) obj, aVar, lifecycle);
    }

    public static w1 c(mv3 mv3) {
        return new w1(mv3);
    }
}
