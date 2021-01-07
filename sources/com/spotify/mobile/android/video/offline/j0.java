package com.spotify.mobile.android.video.offline;

import com.google.android.exoplayer2.drm.s;
import com.google.android.exoplayer2.drm.v;
import com.spotify.mobile.android.video.drm.DrmUtil;
import com.spotify.mobile.android.video.drm.j;
import okhttp3.y;

public class j0 {
    private final y a;

    public j0(y yVar) {
        this.a = yVar;
    }

    public v<s> a(String str) {
        return new v<>(DrmUtil.b, k.a, new j(l.a, this.a, str), null);
    }
}
