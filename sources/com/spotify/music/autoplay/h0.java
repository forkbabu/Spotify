package com.spotify.music.autoplay;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.libs.viewuri.c;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

public class h0 implements Callable<Boolean> {
    private final RadioSeedBundle a;
    private final WeakReference<Context> b;
    private final nfd c;
    private final jz1 f;
    private final cqe n;

    public h0(RadioSeedBundle radioSeedBundle, Context context, nfd nfd, jz1 jz1, cqe cqe) {
        this.a = radioSeedBundle;
        this.b = new WeakReference<>(context);
        this.c = nfd;
        this.f = jz1;
        this.n = cqe;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0048: APUT  (r2v9 java.lang.String[]), (0 ??[int, short, byte, char]), (r7v5 java.lang.String) */
    @Override // java.util.concurrent.Callable
    public Boolean call() {
        String[] strArr;
        if (this.b.get() == null) {
            return Boolean.FALSE;
        }
        String playbackId = this.a.getPlaybackId();
        String radioSeed = this.a.getRadioSeed();
        String radioSeed2 = this.a.getRadioSeed();
        PlayOrigin playOrigin = this.a.getPlayOrigin();
        ifd ifd = kfd.w0;
        if (radioSeed.contains(":track:")) {
            strArr = new String[1];
            int i = agd.b;
            strArr[0] = radioSeed.startsWith("spotify:station:track") ? radioSeed.replace("station:", "") : radioSeed;
        } else {
            strArr = null;
        }
        String referrerIdentifier = playOrigin.referrerIdentifier();
        if (TextUtils.isEmpty(referrerIdentifier)) {
            referrerIdentifier = ifd.getName();
        }
        nfd nfd = this.c;
        String[] strArr2 = {radioSeed};
        String viewUri = playOrigin.viewUri();
        nfd.c(strArr2, !MoreObjects.isNullOrEmpty(viewUri) ? c.a(viewUri) : ViewUris.c, false, false, -1, ifd, yn0.a(new ifd(referrerIdentifier)), strArr);
        this.f.a(new da1(playbackId, "autoplay", radioSeed, null, 0, radioSeed2, "AUTOPLAY_TRIGGERED", null, (double) this.n.d()));
        return Boolean.TRUE;
    }
}
