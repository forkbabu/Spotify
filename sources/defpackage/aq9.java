package defpackage;

import androidx.lifecycle.LiveData;
import com.spotify.encore.consumer.components.artist.api.artistcardfollow.ArtistCardFollow;
import com.spotify.music.follow.j;
import com.spotify.music.follow.m;
import com.spotify.music.follow.resolver.f;
import com.spotify.rxjava2.q;
import io.reactivex.disposables.b;
import io.reactivex.s;
import kotlin.jvm.internal.h;

/* renamed from: aq9  reason: default package */
public final class aq9 {
    private final q a = new q();
    private final m b;
    private final f c;
    private final ro9 d;

    public aq9(m mVar, f fVar, ro9 ro9) {
        h.e(mVar, "followManager");
        h.e(fVar, "rxArtistFollowDataResolver");
        h.e(ro9, "homeFollowDataHolder");
        this.b = mVar;
        this.c = fVar;
        this.d = ro9;
    }

    public final void a(j jVar) {
        h.e(jVar, "data");
        this.b.g(jVar);
    }

    public final void b(b bVar) {
        this.a.a(bVar);
    }

    public final void c() {
        this.a.c();
    }

    public final int d() {
        return this.d.a();
    }

    public final LiveData<Integer> e() {
        return this.d.b();
    }

    public final ArtistCardFollow.FollowingStatus f(String str) {
        h.e(str, "artistUri");
        h.e(str, "artistUri");
        if (this.d.c(str)) {
            return ArtistCardFollow.FollowingStatus.Following;
        }
        return ArtistCardFollow.FollowingStatus.NotFollowing;
    }

    public final s<j> g(String str) {
        h.e(str, "artistUri");
        s<j> a2 = this.c.a(str);
        h.d(a2, "rxArtistFollowDataResolver.resolve(artistUri)");
        return a2;
    }

    public final void h(String str, ArtistCardFollow.FollowingStatus followingStatus) {
        h.e(str, "artistUri");
        h.e(followingStatus, "desiredStatus");
        boolean z = followingStatus == ArtistCardFollow.FollowingStatus.Following;
        this.b.e(str, z);
        h.e(str, "artistUri");
        this.d.d(str, z);
    }
}
