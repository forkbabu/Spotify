package com.spotify.mobile.android.video.drm;

import android.media.MediaDrm;
import com.google.android.exoplayer2.drm.r;
import com.google.android.exoplayer2.drm.s;
import com.spotify.mobile.android.video.drm.DrmUtil;

public final class d {
    private d() {
    }

    static r<s> a() {
        try {
            return DrmUtil.b();
        } catch (MediaDrm.MediaDrmStateException e) {
            throw new DrmUtil.UnexpectedDrmException(e);
        }
    }
}
