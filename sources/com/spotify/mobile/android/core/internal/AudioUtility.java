package com.spotify.mobile.android.core.internal;

import com.spotify.base.java.logging.Logger;

public final class AudioUtility {
    public static final int CORE_AUDIO_CONTENT_TYPE_MUSIC = 0;
    public static final int CORE_AUDIO_CONTENT_TYPE_SPEECH = 1;
    public static final int CORE_SAMPLE_FORMAT_16_BITS_PER_SAMPLE = 16;
    public static final int CORE_SAMPLE_FORMAT_IEEE_FLOAT = 17;
    public static final int CORE_STREAM_TYPE_ALARM = 1;
    public static final int CORE_STREAM_TYPE_MUSIC = 0;

    private AudioUtility() {
    }

    public static int mapCoreAudioContentTypeToAndroidAudioContentType(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 1;
        }
        Logger.n("Unknown core AudioContentType %d provided. Falling back to default action.", Integer.valueOf(i));
        return 2;
    }

    public static int mapCoreStreamTypeToAndroidStreamType(int i) {
        if (i == 0) {
            return 3;
        }
        if (i == 1) {
            return 4;
        }
        Logger.n("Unknown core AudioStreamType %d provided. Falling back to default action.", Integer.valueOf(i));
        return 3;
    }
}
