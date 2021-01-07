package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import java.io.IOException;

public interface HlsPlaylistTracker {

    public static final class PlaylistResetException extends IOException {
        public final Uri url;

        public PlaylistResetException(Uri uri) {
            this.url = uri;
        }
    }

    public static final class PlaylistStuckException extends IOException {
        public final Uri url;

        public PlaylistStuckException(Uri uri) {
            this.url = uri;
        }
    }

    public interface a {
    }

    public interface b {
        void d();

        boolean g(Uri uri, long j);
    }

    public interface c {
    }
}
