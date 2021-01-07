package defpackage;

import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.player.model.Context;
import com.spotify.player.model.ContextPage;
import com.spotify.player.model.ContextTrack;
import com.spotify.playlist.models.Episode;
import io.reactivex.functions.l;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: bjc  reason: default package */
public final /* synthetic */ class bjc implements l {
    public final /* synthetic */ String a;

    public /* synthetic */ bjc(String str) {
        this.a = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        String str = this.a;
        Episode[] episodeArr = (Episode[]) ((qyd) obj).getItems().toArray(new Episode[0]);
        ArrayList newArrayListWithCapacity = Collections2.newArrayListWithCapacity(episodeArr.length);
        for (Episode episode : episodeArr) {
            newArrayListWithCapacity.add(ContextTrack.builder(episode.getUri()).metadata(ImmutableMap.builder().putAll(episode.m()).mo51put("added_at", Integer.toString(episode.u())).build()).build());
        }
        return Context.builder(str).pages(ImmutableList.of(ContextPage.builder().tracks(newArrayListWithCapacity).build())).metadata((Map<String, String>) ImmutableMap.of("sorting.criteria", String.format("%s ASC", "added_at"))).build();
    }
}
