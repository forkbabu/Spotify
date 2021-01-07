package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.playlist.model.policy.DecorationPolicy;
import com.spotify.mobile.android.playlist.model.policy.Policy;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.music.libs.collection.model.d;
import defpackage.o1e;
import io.reactivex.s;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

/* renamed from: sg5  reason: default package */
public class sg5 {
    private final s9a a;
    private final y b;

    sg5(s9a s9a, y yVar) {
        this.a = s9a;
        this.b = yVar;
    }

    public s<d> a() {
        o1e a2 = new o1e.b(d.a().build(), this.b).a();
        DecorationPolicy decorationPolicy = new DecorationPolicy();
        ImmutableMap.Builder builder = ImmutableMap.builder();
        Boolean bool = Boolean.TRUE;
        builder.mo51put("addTime", bool);
        builder.mo51put("name", bool);
        builder.mo51put("link", bool);
        builder.mo51put("covers", bool);
        decorationPolicy.setAlbumAttributes(builder.build());
        Policy policy = new Policy(decorationPolicy);
        this.a.a().g(new SortOption("recentlyPlayedRank"));
        this.a.a().d(false, true, false);
        this.a.a().e(true);
        this.a.a().f(0, 20);
        s9a s9a = this.a;
        s9a.getClass();
        return s.B(new c9a(s9a, policy)).z(200, TimeUnit.MILLISECONDS, this.b).q(a2);
    }
}
