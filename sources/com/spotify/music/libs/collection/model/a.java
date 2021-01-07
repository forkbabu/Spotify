package com.spotify.music.libs.collection.model;

import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import com.spotify.music.libs.collection.model.g;
import java.util.Map;

public abstract class a {

    /* renamed from: com.spotify.music.libs.collection.model.a$a  reason: collision with other inner class name */
    public interface AbstractC0282a {
        a build();

        AbstractC0282a g(com.spotify.playlist.models.a aVar);

        AbstractC0282a h(Map<String, CollectionStateProvider.a> map);
    }

    public static AbstractC0282a a() {
        return new g.b();
    }

    public abstract com.spotify.playlist.models.a b();

    public abstract Map<String, CollectionStateProvider.a> c();
}
