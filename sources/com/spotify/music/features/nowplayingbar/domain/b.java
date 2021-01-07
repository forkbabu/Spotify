package com.spotify.music.features.nowplayingbar.domain;

import com.spotify.music.features.nowplayingbar.domain.Track;
import com.spotify.player.model.ContextTrack;
import kotlin.jvm.internal.h;

public final class b {
    private static final Track.Type a(ContextTrack contextTrack) {
        if (kxd.h(contextTrack)) {
            return Track.Type.INTERRUPTION;
        }
        if (kxd.f(contextTrack)) {
            return Track.Type.AD;
        }
        return Track.Type.TRACK;
    }

    public static final Track b(ContextTrack contextTrack) {
        String str;
        String str2;
        h.e(contextTrack, "contextTrack");
        String str3 = contextTrack.uid() + contextTrack.hashCode();
        String uri = contextTrack.uri();
        h.d(uri, "contextTrack.uri()");
        String q = kxd.q(contextTrack);
        String str4 = q != null ? q : "";
        if (a(contextTrack) == Track.Type.AD) {
            str = contextTrack.metadata().get("advertiser");
        } else {
            str = contextTrack.metadata().get(kxd.i(contextTrack) ? "album_title" : "artist_name");
        }
        if (str != null) {
            str2 = str;
        } else {
            str2 = "";
        }
        return new Track(str3, uri, str4, str2, Boolean.parseBoolean(contextTrack.metadata().get("collection.can_add")), Boolean.parseBoolean(contextTrack.metadata().get("collection.in_collection")), kxd.c(contextTrack), a(contextTrack));
    }
}
