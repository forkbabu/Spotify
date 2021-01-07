package defpackage;

import com.spotify.playlist.endpoints.d;
import com.spotify.playlist.endpoints.policy.playlist.CollaboratingUsersDecorationPolicy;
import io.reactivex.s;
import kotlin.jvm.internal.h;

/* renamed from: k06  reason: default package */
public final class k06 {
    private final d a;
    private final String b;
    private final CollaboratingUsersDecorationPolicy c;

    public k06(d dVar, String str, CollaboratingUsersDecorationPolicy collaboratingUsersDecorationPolicy) {
        h.e(dVar, "playlistEndpoint");
        h.e(str, "playlistUri");
        h.e(collaboratingUsersDecorationPolicy, "decorationPolicy");
        this.a = dVar;
        this.b = str;
        this.c = collaboratingUsersDecorationPolicy;
    }

    public final s<d.a> a() {
        return this.a.e(this.b, this.c);
    }
}
