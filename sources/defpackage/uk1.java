package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.playlist.model.policy.DecorationPolicy;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.libs.collection.model.d;
import io.reactivex.s;

/* renamed from: uk1  reason: default package */
public final class uk1 implements fjf<s<d>> {
    private final wlf<s9a> a;

    public uk1(wlf<s9a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        s9a s9a = this.a.get();
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        ImmutableMap.Builder builder = ImmutableMap.builder();
        Boolean bool = Boolean.TRUE;
        builder.mo51put("addTime", bool);
        builder.mo51put("name", bool);
        builder.mo51put("link", bool);
        builder.mo51put("covers", bool);
        decorationPolicy.setAlbumAttributes(builder.build());
        Policy policy = new Policy(decorationPolicy);
        s9a.a().g(new SortOption("recentlyPlayedRank"));
        s9a.a().d(false, true, false);
        return s.B(new c9a(s9a, policy));
    }
}
