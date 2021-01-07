package com.spotify.music.playlist.ui;

import com.google.common.collect.ImmutableList;
import com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestriction;
import com.spotify.encore.consumer.elements.badge.download.DownloadState;
import com.spotify.playlist.models.b;
import com.spotify.playlist.models.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class c0 {
    public static List<String> a(o oVar) {
        ImmutableList<b> artists = oVar.getArtists();
        if (artists == null || artists.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(artists.size());
        for (b bVar : artists) {
            arrayList.add(bVar.f());
        }
        return arrayList;
    }

    public static ContentRestriction b(o oVar) {
        if (oVar.getIs19plus()) {
            return ContentRestriction.Over19Only;
        }
        if (oVar.isExplicit()) {
            return ContentRestriction.Explicit;
        }
        return ContentRestriction.None;
    }

    public static DownloadState c(o oVar) {
        return (DownloadState) oVar.getOfflineState().a(f.a, e.a, g.a, b.a, i.a, d.a, h.a, c.a);
    }
}
