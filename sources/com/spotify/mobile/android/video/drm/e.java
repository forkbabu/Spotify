package com.spotify.mobile.android.video.drm;

import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import com.google.android.exoplayer2.drm.r;
import com.google.android.exoplayer2.drm.s;
import com.spotify.mobile.android.video.drm.DrmUtil;

public final class e {
    private e() {
    }

    static r<s> a() {
        try {
            return DrmUtil.b();
        } catch (MediaDrm.MediaDrmStateException | MediaDrmResetException e) {
            throw new DrmUtil.UnexpectedDrmException(e);
        }
    }
}
