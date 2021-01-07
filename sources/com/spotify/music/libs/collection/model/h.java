package com.spotify.music.libs.collection.model;

import com.spotify.music.libs.collection.model.c;
import com.spotify.playlist.models.o;
import java.util.List;

final class h implements c.a {
    private List<o> a;

    h() {
    }

    public c.a a(List<o> list) {
        if (list != null) {
            this.a = list;
            return this;
        }
        throw new NullPointerException("Null items");
    }
}
