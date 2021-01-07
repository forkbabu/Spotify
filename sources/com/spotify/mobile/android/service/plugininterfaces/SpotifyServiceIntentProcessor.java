package com.spotify.mobile.android.service.plugininterfaces;

import android.content.Intent;
import java.util.List;

public interface SpotifyServiceIntentProcessor {

    public enum Result {
        PROCESSED,
        NOT_PROCESSED,
        IGNORABLE
    }

    public interface a {
        void a(List<String> list);
    }

    Result a(boolean z, Intent intent);

    Result b(boolean z, Intent intent, a aVar);
}
