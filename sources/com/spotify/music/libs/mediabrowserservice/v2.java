package com.spotify.music.libs.mediabrowserservice;

import android.net.Uri;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.image.provider.MediaUriUtil;
import com.spotify.mediaitem.a;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerQueue;
import java.util.ArrayList;
import java.util.List;

public class v2 {
    public static final v2 b = new v2();
    private final List<MediaSessionCompat.QueueItem> a;

    private v2() {
        this.a = new ArrayList(0);
    }

    private static MediaSessionCompat.QueueItem a(MediaUriUtil mediaUriUtil, ContextTrack contextTrack, long j) {
        Uri c = mediaUriUtil.c(MoreObjects.nullToEmpty(kxd.e(contextTrack)), MediaUriUtil.Transformation.NONE);
        MediaDescriptionCompat.b bVar = new MediaDescriptionCompat.b();
        bVar.e(c);
        bVar.i(contextTrack.metadata().get("title"));
        bVar.h(contextTrack.metadata().get("artist_name"));
        a aVar = new a();
        aVar.l(kxd.g(contextTrack));
        bVar.c(aVar.b());
        bVar.f(contextTrack.uri());
        return new MediaSessionCompat.QueueItem(bVar.a(), j);
    }

    public List<MediaSessionCompat.QueueItem> b(int i) {
        if (this.a.size() <= i) {
            return new ArrayList(this.a);
        }
        return this.a.subList(0, i);
    }

    public v2(MediaUriUtil mediaUriUtil, boolean z, PlayerQueue playerQueue) {
        int i = 1;
        int i2 = z ? 2 : 1;
        Optional<ContextTrack> track = playerQueue.track();
        ImmutableList<ContextTrack> nextTracks = playerQueue.nextTracks();
        int i3 = 0;
        ArrayList arrayList = new ArrayList(track.transform(r0.a).or((Optional<V>) ((V) 0)).intValue() + nextTracks.size());
        this.a = arrayList;
        if (track.isPresent()) {
            arrayList.add(a(mediaUriUtil, track.get(), (long) 0));
        } else {
            i = 0;
        }
        for (ContextTrack contextTrack : nextTracks) {
            if (contextTrack.isDelimiter()) {
                i3++;
                if (i3 >= i2) {
                    return;
                }
            } else {
                this.a.add(a(mediaUriUtil, contextTrack, (long) i));
                i++;
            }
        }
    }
}
