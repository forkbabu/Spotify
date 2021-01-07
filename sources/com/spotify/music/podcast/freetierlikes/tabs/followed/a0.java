package com.spotify.music.podcast.freetierlikes.tabs.followed;

import android.view.View;
import com.google.common.base.MoreObjects;
import com.spotify.playlist.models.Show;
import java.util.ArrayList;
import java.util.List;

public class a0 implements z {
    private List<Show> a = new ArrayList();
    private final alc b;
    private final s c;
    private final v d;
    private String e;

    a0(alc alc, s sVar, v vVar) {
        this.b = alc;
        this.c = sVar;
        this.d = vVar;
    }

    @Override // com.spotify.music.podcast.freetierlikes.tabs.followed.z
    public void a(String str) {
        this.e = str;
    }

    @Override // com.spotify.music.podcast.freetierlikes.tabs.followed.z
    public void b(int i, View view) {
        Show show = this.a.get(i);
        this.d.a(show, view, !MoreObjects.isNullOrEmpty(this.e) && rw.equal(this.e, show.getUri()));
    }

    @Override // com.spotify.music.podcast.freetierlikes.tabs.followed.z
    public void c(List<Show> list) {
        this.a = list;
    }

    @Override // com.spotify.music.podcast.freetierlikes.tabs.followed.z
    public void d(int i) {
        Show show = this.a.get(i);
        this.b.a(show.getUri(), i);
        this.c.a(show);
    }

    @Override // com.spotify.music.podcast.freetierlikes.tabs.followed.z
    public String e() {
        return this.e;
    }

    @Override // com.spotify.music.podcast.freetierlikes.tabs.followed.z
    public int f() {
        return this.a.size();
    }
}
