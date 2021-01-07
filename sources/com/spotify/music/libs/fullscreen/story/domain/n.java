package com.spotify.music.libs.fullscreen.story.domain;

import android.os.Bundle;
import kotlin.jvm.internal.h;

public final class n {
    private static final m a(String str) {
        return m.b(m.r, null, 0, str, null, 0, 0, null, false, 251);
    }

    public static final m b(Bundle bundle, String str) {
        h.e(str, "playlistUri");
        if (bundle == null) {
            return a(str);
        }
        m mVar = (m) bundle.getParcelable("fullscreen_story_model");
        return mVar != null ? mVar : a(str);
    }
}
