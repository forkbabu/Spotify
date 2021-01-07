package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.base.java.logging.Logger;
import com.spotify.collection.endpoints.common.player.PlayPayload;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.playlist.model.policy.DecorationPolicy;
import com.spotify.mobile.android.playlist.model.policy.ListPolicy;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.music.libs.collection.model.j;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.LoggingParams;
import com.spotify.player.model.command.options.PreparePlayOptions;
import io.reactivex.a;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.z;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: faa  reason: default package */
public class faa {
    public static final /* synthetic */ int e = 0;
    private final cqe a = new aqe();
    private final j b;
    private final wh0 c;
    private final xh0 d;

    static {
        ListPolicy listPolicy = new ListPolicy();
        HashMap hashMap = new HashMap();
        Boolean bool = Boolean.TRUE;
        hashMap.put("link", bool);
        hashMap.put("name", bool);
        hashMap.put("offline", bool);
        hashMap.put("playable", bool);
        hashMap.put("available", bool);
        hashMap.put("isExplicit", bool);
        hashMap.put("inCollection", bool);
        hashMap.put("hasLyrics", bool);
        hashMap.put("trackDescriptors", bool);
        listPolicy.setListAttributes(hashMap);
        Map<String, Boolean> singletonMap = Collections.singletonMap("name", bool);
        listPolicy.setAlbumAttributes(singletonMap);
        listPolicy.setArtistAttributes(singletonMap);
        listPolicy.setArtistsAttributes(singletonMap);
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        decorationPolicy.setListPolicy(listPolicy);
        new Policy(decorationPolicy);
    }

    public faa(wh0 wh0, xh0 xh0) {
        this.c = wh0;
        this.d = xh0;
        this.b = new j();
        Logger.b("Creating new TracksDataLoader", new Object[0]);
    }

    private a g(PreparePlayOptions preparePlayOptions, PlayOrigin playOrigin, Map<String, String> map, LoggingParams loggingParams) {
        z<Response> b2 = this.c.b(this.b.a().e(), new PlayPayload(preparePlayOptions, playOrigin, map, loggingParams));
        b2.getClass();
        return new i(b2);
    }

    public s<ni0> a(ImmutableMap<String, Boolean> immutableMap) {
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        decorationPolicy.setListAttributes(immutableMap);
        decorationPolicy.setAlbumAttributes(immutableMap);
        decorationPolicy.setArtistsAttributes(immutableMap);
        return s.B(new n9a(this, new Policy(decorationPolicy)));
    }

    public j b() {
        return this.b;
    }

    public v c(Policy policy) {
        return this.d.b(this.b.b().e(), policy).H(io.reactivex.schedulers.a.a()).P().o0(io.reactivex.android.schedulers.a.b()).r0(l9a.a);
    }

    public v d(Policy policy) {
        return this.d.a(this.b.b().e(), policy).I0(io.reactivex.schedulers.a.a()).o0(io.reactivex.android.schedulers.a.b()).r0(m9a.a);
    }

    public a e(boolean z) {
        Map<String, String> e2 = this.b.a().e();
        if (z) {
            z<Response> c2 = this.c.c(e2);
            c2.getClass();
            return new i(c2);
        }
        z<Response> e3 = this.c.e(e2);
        e3.getClass();
        return new i(e3);
    }

    public a f(PreparePlayOptions preparePlayOptions, PlayOrigin playOrigin, Map<String, String> map) {
        return g(preparePlayOptions, playOrigin, map, LoggingParams.builder().commandInitiatedTime(Long.valueOf(this.a.d())).build());
    }

    public a h(PreparePlayOptions preparePlayOptions, PlayOrigin playOrigin, Map<String, String> map, String str, String str2) {
        return g(preparePlayOptions, playOrigin, map, LoggingParams.builder().interactionId(str).commandInitiatedTime(Long.valueOf(this.a.d())).pageInstanceId(str2).build());
    }
}
