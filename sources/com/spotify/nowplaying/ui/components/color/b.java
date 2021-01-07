package com.spotify.nowplaying.ui.components.color;

import android.graphics.Color;
import com.spotify.player.model.ContextTrack;
import io.reactivex.d0;
import io.reactivex.functions.l;
import io.reactivex.z;
import kotlin.jvm.internal.h;

final class b<T, R> implements l<ContextTrack, d0<? extends Integer>> {
    final /* synthetic */ f a;

    b(f fVar) {
        this.a = fVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public d0<? extends Integer> apply(ContextTrack contextTrack) {
        z zVar;
        ContextTrack contextTrack2 = contextTrack;
        h.e(contextTrack2, "it");
        if (kxd.l(contextTrack2)) {
            z z = z.z(Integer.valueOf(this.a.d()));
            h.d(z, "Single.just(videoTrackColor)");
            return z;
        }
        f fVar = this.a;
        fVar.getClass();
        String str = contextTrack2.metadata().get("primary_color");
        Integer num = null;
        if (str != null) {
            try {
                num = Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
            }
        }
        if (num != null) {
            zVar = z.z(Integer.valueOf(num.intValue()));
        } else {
            zVar = z.g(new e(fVar, kxd.c(contextTrack2)));
        }
        h.d(zVar, "colorFromMetadata(track)…lor(track.coverArtUri()))");
        return zVar;
    }
}
