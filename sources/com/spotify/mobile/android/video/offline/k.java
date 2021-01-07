package com.spotify.mobile.android.video.offline;

import com.google.android.exoplayer2.drm.r;
import com.spotify.mobile.android.video.drm.DrmUtil;
import java.util.UUID;

public final /* synthetic */ class k implements r.c {
    public static final /* synthetic */ k a = new k();

    private /* synthetic */ k() {
    }

    @Override // com.google.android.exoplayer2.drm.r.c
    public final r a(UUID uuid) {
        return DrmUtil.a();
    }
}
