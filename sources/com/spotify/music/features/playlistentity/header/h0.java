package com.spotify.music.features.playlistentity.header;

import android.content.Context;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.libs.facepile.c;
import com.spotify.music.C0707R;
import com.spotify.music.features.playlistentity.header.g0;
import com.spotify.playlist.endpoints.d;
import com.spotify.playlist.endpoints.policy.playlist.CollaboratingUsersDecorationPolicy;
import com.spotify.playlist.models.j;
import com.spotify.playlist.models.p;
import io.reactivex.s;

class h0 {
    private final Context a;
    private final d b;

    public static abstract class a {

        /* renamed from: com.spotify.music.features.playlistentity.header.h0$a$a  reason: collision with other inner class name */
        public interface AbstractC0243a {
        }

        public abstract Optional<Integer> a();

        public abstract Optional<com.spotify.libs.facepile.d> b();
    }

    h0(Context context, d dVar) {
        this.a = context;
        this.b = dVar;
    }

    private com.spotify.libs.facepile.d a(h76 h76) {
        p m = h76.l().m();
        if (m == null) {
            return com.spotify.libs.facepile.d.a(ImmutableList.of(c.a(null, "", 0)));
        }
        return com.spotify.libs.facepile.d.a(ImmutableList.of(j0.a(this.a, m)));
    }

    public c b(d.a.C0369a aVar) {
        return j0.a(this.a, aVar.d());
    }

    public s<a> c(h76 h76, int i, boolean z) {
        j l = h76.l();
        if (l.r()) {
            String uri = l.getUri();
            CollaboratingUsersDecorationPolicy.Collaborator.a builder = CollaboratingUsersDecorationPolicy.Collaborator.builder();
            builder.b(true);
            Boolean bool = Boolean.TRUE;
            builder.e(ImmutableMap.of("username", bool, "name", bool, "image", bool, "thumbnail", bool));
            CollaboratingUsersDecorationPolicy.Collaborator a2 = builder.a();
            CollaboratingUsersDecorationPolicy.a builder2 = CollaboratingUsersDecorationPolicy.builder();
            builder2.b(a2);
            builder2.c(true);
            builder2.d(i);
            CollaboratingUsersDecorationPolicy a3 = builder2.a();
            s<R> j0 = this.b.e(uri, a3).j0(new b(this, a3)).j0(c.a);
            g0.b bVar = new g0.b();
            bVar.c(a(h76));
            return j0.G0((R) bVar.a());
        } else if (!z) {
            return s.i0(new g0.b().a());
        } else {
            g0.b bVar2 = new g0.b();
            bVar2.c(a(h76));
            return s.i0(bVar2.a());
        }
    }

    public int d() {
        return this.a.getResources().getInteger(C0707R.integer.header_info_view_face_count);
    }
}
