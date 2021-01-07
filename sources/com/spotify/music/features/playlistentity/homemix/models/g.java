package com.spotify.music.features.playlistentity.homemix.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.spotify.music.features.playlistentity.homemix.models.b;
import com.spotify.playlist.models.l;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class g {

    public interface a {
    }

    public static g b(l lVar, List<f> list) {
        b.C0244b bVar = new b.C0244b();
        bVar.c(lVar);
        bVar.a(list);
        return bVar.b();
    }

    public abstract List<f> a();

    public abstract l c();
}
