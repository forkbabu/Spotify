package com.spotify.music.libs.podcast.loader;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.playlist.model.policy.DecorationPolicy;
import com.spotify.mobile.android.playlist.model.policy.ListPolicy;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import io.reactivex.s;
import java.util.HashMap;

@Deprecated
public class t {
    private static final Policy c;
    private final u a;
    private final k b;

    static {
        ListPolicy listPolicy = new ListPolicy();
        HashMap hashMap = new HashMap(0);
        Boolean bool = Boolean.TRUE;
        hashMap.put("link", bool);
        hashMap.put("name", bool);
        hashMap.put("covers", bool);
        hashMap.put("publisher", bool);
        hashMap.put("latestPublishedEpisodeDate", bool);
        hashMap.put("hasNewEpisodes", bool);
        listPolicy.setListAttributes(hashMap);
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        decorationPolicy.setListPolicy(listPolicy);
        c = new Policy(decorationPolicy);
    }

    public t(k kVar, String str) {
        this.a = u.a(str);
        this.b = kVar;
        Logger.b("Creating new ShowsDataLoader", new Object[0]);
    }

    public s<ryd> a() {
        return this.b.a(this.a.d(), this.a.c().e(), c).A(f.a).P();
    }

    public u b() {
        return this.a;
    }
}
