package com.spotify.collection.endpoints.listenlater.models;

import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;
import kotlin.jvm.internal.h;

public final class EpisodeUriList implements JacksonModel {
    private final List<String> items;

    public EpisodeUriList(List<String> list) {
        h.e(list, "items");
        this.items = list;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.spotify.collection.endpoints.listenlater.models.EpisodeUriList */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EpisodeUriList copy$default(EpisodeUriList episodeUriList, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = episodeUriList.items;
        }
        return episodeUriList.copy(list);
    }

    public final List<String> component1() {
        return this.items;
    }

    public final EpisodeUriList copy(List<String> list) {
        h.e(list, "items");
        return new EpisodeUriList(list);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof EpisodeUriList) && h.a(this.items, ((EpisodeUriList) obj).items);
        }
        return true;
    }

    public final List<String> getItems() {
        return this.items;
    }

    public int hashCode() {
        List<String> list = this.items;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        return je.L0(je.V0("EpisodeUriList(items="), this.items, ")");
    }
}
