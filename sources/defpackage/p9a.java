package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.playlist.model.policy.DecorationPolicy;
import com.spotify.mobile.android.playlist.model.policy.ListPolicy;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.libs.collection.model.b;
import com.spotify.music.libs.collection.model.c;
import io.reactivex.s;
import io.reactivex.schedulers.a;
import io.reactivex.v;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: p9a  reason: default package */
public class p9a {
    private static final Policy c;
    private final p8a a;
    private final b b;

    static {
        ListPolicy listPolicy = new ListPolicy();
        HashMap hashMap = new HashMap(6);
        Boolean bool = Boolean.TRUE;
        hashMap.put("link", bool);
        hashMap.put("name", bool);
        hashMap.put("offline", bool);
        hashMap.put("playable", bool);
        hashMap.put("isExplicit", bool);
        listPolicy.setListAttributes(hashMap);
        Map<String, Boolean> singletonMap = Collections.singletonMap("name", bool);
        listPolicy.setAlbumAttributes(singletonMap);
        listPolicy.setArtistAttributes(singletonMap);
        listPolicy.setArtistsAttributes(singletonMap);
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        decorationPolicy.setListPolicy(listPolicy);
        c = new Policy(decorationPolicy);
    }

    public p9a(String str, p8a p8a) {
        this.a = p8a;
        this.b = b.a(l0.z(str).i());
        Logger.b("Creating new AlbumDataLoader", new Object[0]);
    }

    public s<c> a() {
        return s.B(new b9a(this));
    }

    public b b() {
        return this.b;
    }

    public /* synthetic */ v c() {
        return this.a.c(this.b.b(), this.b.c().e(), c).H(a.a()).e(c.class).P().o0(io.reactivex.android.schedulers.a.b());
    }
}
