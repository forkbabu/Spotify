package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.base.java.logging.Logger;
import com.spotify.collection.endpoints.artist.policy.ListPolicy;
import com.spotify.collection.endpoints.artist.policy.Policy;
import com.spotify.collection.endpoints.artist.policy.a;
import com.spotify.music.libs.collection.model.f;
import com.spotify.playlist.models.b;
import com.spotify.playlist.models.i;
import io.reactivex.s;
import io.reactivex.v;
import java.util.HashMap;

/* renamed from: z9a  reason: default package */
public class z9a {
    private static final Policy c;
    private final f a = f.a("@");
    private final xg0 b;

    static {
        HashMap hashMap = new HashMap();
        Boolean bool = Boolean.TRUE;
        hashMap.put("link", bool);
        hashMap.put("name", bool);
        hashMap.put("offline", bool);
        hashMap.put("syncProgress", bool);
        hashMap.put("portraits", bool);
        hashMap.put("collectionLink", bool);
        hashMap.put("isFollowed", bool);
        hashMap.put("numTracksInCollection", bool);
        c = new Policy(new a(new ListPolicy(hashMap, ImmutableMap.of(), ImmutableMap.of(), ImmutableMap.of())));
    }

    public z9a(xg0 xg0) {
        this.b = xg0;
        Logger.b("Creating new ArtistsDataLoader", new Object[0]);
    }

    public s<i<b>> a() {
        return s.B(new f9a(this, c));
    }

    public f b() {
        return this.a;
    }

    public v c(Policy policy) {
        return this.b.b(this.a.b().e(), policy).H(io.reactivex.schedulers.a.a()).P().o0(io.reactivex.android.schedulers.a.b());
    }

    public v d(Policy policy) {
        return this.b.a(this.a.b().e(), policy).I0(io.reactivex.schedulers.a.a()).o0(io.reactivex.android.schedulers.a.b());
    }
}
