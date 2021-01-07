package com.google.android.exoplayer2.drm;

import android.util.Log;
import com.google.android.exoplayer2.drm.r;
import java.util.UUID;

public final /* synthetic */ class e implements r.c {
    public static final /* synthetic */ e a = new e();

    private /* synthetic */ e() {
    }

    @Override // com.google.android.exoplayer2.drm.r.c
    public final r a(UUID uuid) {
        int i = t.d;
        try {
            return t.n(uuid);
        } catch (UnsupportedDrmException unused) {
            Log.e("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new o();
        }
    }
}
