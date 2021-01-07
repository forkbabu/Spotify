package com.spotify.music.features.playlistentity.header;

import com.google.common.base.MoreObjects;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.spotify.libs.facepile.c;
import com.spotify.playlist.endpoints.d;
import com.spotify.playlist.endpoints.policy.playlist.CollaboratingUsersDecorationPolicy;
import io.reactivex.functions.l;

public final /* synthetic */ class b implements l {
    public final /* synthetic */ h0 a;
    public final /* synthetic */ CollaboratingUsersDecorationPolicy b;

    public /* synthetic */ b(h0 h0Var, CollaboratingUsersDecorationPolicy collaboratingUsersDecorationPolicy) {
        this.a = h0Var;
        this.b = collaboratingUsersDecorationPolicy;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        h0 h0Var = this.a;
        CollaboratingUsersDecorationPolicy collaboratingUsersDecorationPolicy = this.b;
        d.a aVar = (d.a) obj;
        h0Var.getClass();
        MoreObjects.checkState(collaboratingUsersDecorationPolicy.limit() <= 0 || aVar.a().get(0).a());
        ImmutableList list = FluentIterable.from(aVar.a()).transform(new d(h0Var)).toList();
        ImmutableList.Builder builder = new ImmutableList.Builder();
        builder.addAll((Iterable) list);
        int size = list.size();
        c a2 = c.a(null, "", 0);
        while (true) {
            int i = size + 1;
            if (size >= aVar.c()) {
                return com.spotify.libs.facepile.d.a(builder.build());
            }
            builder.mo53add((ImmutableList.Builder) a2);
            size = i;
        }
    }
}
