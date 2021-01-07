package com.spotify.music.playlist.ui;

import android.content.Context;
import com.google.common.base.MoreObjects;
import com.google.common.collect.Collections2;
import com.spotify.encore.consumer.components.api.trackrow.TrackRow;
import com.spotify.encore.consumer.elements.artwork.Artwork;
import com.spotify.encore.consumer.elements.badge.contentrestriction.ContentRestriction;
import com.spotify.encore.consumer.elements.badge.download.DownloadState;
import com.spotify.encore.consumer.elements.quickactions.Action;
import com.spotify.encore.consumer.elements.quickactions.Face;
import com.spotify.encore.consumer.elements.quickactions.Initials;
import com.spotify.music.C0707R;
import com.spotify.music.playlist.ui.ItemConfiguration;
import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.l;
import com.spotify.playlist.models.o;
import com.spotify.playlist.models.p;
import com.spotify.playlist.models.q;
import java.util.ArrayList;
import java.util.List;

public final class f0 {
    private final Context a;

    public f0(Context context) {
        this.a = context;
    }

    public TrackRow.Model a(l lVar, ItemConfiguration itemConfiguration, boolean z) {
        Action action;
        o g = lVar.g();
        if (g == null && lVar.c() != null) {
            throw new UnsupportedOperationException("This mapper only supports Tracks in Playlists");
        } else if (g == null) {
            return new TrackRow.Model("", new ArrayList(0), new Artwork.ImageData(null), DownloadState.Empty, ContentRestriction.None, null, Action.None.INSTANCE, false, true, false, false);
        } else {
            Artwork.ImageData imageData = new Artwork.ImageData(q.e(g, Covers.Size.NORMAL), C0707R.id.image_on_item_in_list_loaded_with_picasso);
            String e = lVar.e();
            List<String> a2 = c0.a(g);
            DownloadState c = c0.c(g);
            ContentRestriction b = c0.b(g);
            if (itemConfiguration.g() == ItemConfiguration.AddedBy.FACE) {
                p b2 = lVar.b();
                if (b2 == null) {
                    action = Action.None.INSTANCE;
                } else {
                    action = new Action.Profile(Collections2.newArrayList(new Face(b2.c(), new Initials(com.spotify.music.libs.podcast.download.f0.a((String) MoreObjects.firstNonNull(b2.a(), "")), iqa.a(this.a, b2.f())))));
                }
            } else {
                o g2 = lVar.g();
                if (g2 == null) {
                    action = Action.None.INSTANCE;
                } else if (g2.isBanned()) {
                    action = Action.Hide.INSTANCE;
                } else if (g2.isInCollection()) {
                    action = Action.Heart.INSTANCE;
                } else {
                    action = Action.None.INSTANCE;
                }
            }
            return new TrackRow.Model(e, a2, imageData, c, b, null, action, z, !g.isBanned() && g.isCurrentlyPlayable(), !g.isCurrentlyPlayable() && g.isPremiumOnly(), itemConfiguration.i() && g.getHasLyrics());
        }
    }
}
