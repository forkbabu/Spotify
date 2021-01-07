package com.spotify.music.features.queue.service;

import com.spotify.libs.album.AlbumDisc;
import com.spotify.libs.album.AlbumRelease;
import com.spotify.libs.album.c;
import com.spotify.player.model.ContextTrack;
import io.reactivex.functions.l;
import java.util.ArrayList;

public final /* synthetic */ class b implements l {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        AlbumRelease albumRelease = (AlbumRelease) obj;
        ArrayList arrayList = new ArrayList(albumRelease.getTrackCount());
        for (AlbumDisc albumDisc : albumRelease.getDiscs()) {
            for (c cVar : albumDisc.getTracks()) {
                arrayList.add(ContextTrack.create(cVar.d()));
            }
        }
        return arrayList;
    }
}
