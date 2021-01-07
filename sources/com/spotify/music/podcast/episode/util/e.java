package com.spotify.music.podcast.episode.util;

import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.Episode;
import com.spotify.playlist.models.Show;

public final class e {
    private static boolean a(String str, String str2) {
        return str != null && !str.isEmpty() && str2 != null && !str.equals(str2);
    }

    public String b(Episode episode) {
        Covers c = episode.c();
        Show w = episode.w();
        if (w != null) {
            Covers c2 = w.c();
            String b = c.b();
            String d = c.d();
            String b2 = c2.b();
            String d2 = c2.d();
            boolean a = a(b, b2);
            boolean a2 = a(d, d2);
            if (a) {
                return b;
            }
            if (a2) {
                return d;
            }
            return null;
        }
        String b3 = c.b();
        String d3 = c.d();
        boolean z = b3 != null && !b3.isEmpty();
        boolean isEmpty = true ^ d3.isEmpty();
        if (z) {
            return b3;
        }
        if (isEmpty) {
            return d3;
        }
        return null;
    }
}
