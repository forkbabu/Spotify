package com.spotify.music.features.findfriends;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableListIterator;
import com.spotify.music.features.findfriends.model.FindFriendsModel;
import com.spotify.music.features.findfriends.model.UserModel;
import com.spotify.music.follow.j;
import com.spotify.music.follow.l;
import com.spotify.music.follow.m;
import com.spotify.music.libs.facebook.t;
import io.reactivex.s;
import io.reactivex.v;

public class q0 {
    private final t a;
    private final n15 b;
    private final m c;

    public q0(t tVar, n15 n15, m mVar) {
        this.a = tVar;
        this.b = n15;
        this.c = mVar;
    }

    public static s b(q0 q0Var, p0 p0Var) {
        q0Var.getClass();
        if (!p0Var.c().isPresent() || !p0Var.c().get().enabled()) {
            return s.i0(p0Var);
        }
        return q0Var.b.a().P().q(new k(q0Var)).j0(new g(p0Var)).q0(new j(p0Var));
    }

    public s<p0> a() {
        return this.a.a().j0(m.a).J0(new i(this)).Q(m0.a);
    }

    public v c(FindFriendsModel findFriendsModel) {
        ImmutableList copyOf = ImmutableList.copyOf(Collections2.transform((Iterable) findFriendsModel.results(), (Function) k0.a));
        int i = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (UserModel userModel : findFriendsModel.results()) {
            String uri = userModel.uri();
            j c2 = this.c.c(uri);
            if (c2 == null) {
                c2 = j.b(uri, 0, 0, userModel.isFollowing(), false);
            }
            UserModel.a builder2 = userModel.toBuilder();
            builder2.c(c2.g());
            builder.mo53add((ImmutableList.Builder) builder2.a());
        }
        FindFriendsModel create = FindFriendsModel.create(builder.build());
        return s.y(new f(this, new FindFriendsModel[]{create}, copyOf)).G0(create);
    }

    public void d(ImmutableList immutableList, l lVar) {
        UnmodifiableListIterator listIterator = immutableList.listIterator();
        while (listIterator.hasNext()) {
            this.c.d((String) listIterator.next(), lVar);
        }
    }

    public void e(FindFriendsModel[] findFriendsModelArr, ImmutableList immutableList, io.reactivex.t tVar) {
        o oVar = new o(this, findFriendsModelArr, tVar);
        UnmodifiableListIterator listIterator = immutableList.listIterator();
        while (listIterator.hasNext()) {
            this.c.b((String) listIterator.next(), oVar);
        }
        tVar.e(new h(this, immutableList, oVar));
    }
}
