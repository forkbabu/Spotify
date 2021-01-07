package com.spotify.music.features.findfriends;

import com.google.common.base.Optional;
import com.spotify.music.features.findfriends.model.FindFriendsModel;
import com.spotify.music.features.findfriends.o0;
import com.spotify.music.libs.facebook.SocialState;

public abstract class p0 {
    public static final p0 a;

    public static abstract class a {
        public abstract p0 a();

        public abstract a b(Optional<FindFriendsModel> optional);

        public abstract a c(Optional<Boolean> optional);

        public abstract a d(Optional<SocialState> optional);
    }

    static {
        o0.b bVar = new o0.b();
        bVar.d(Optional.absent());
        bVar.b(Optional.absent());
        bVar.c(Optional.absent());
        a = bVar.a();
    }

    public abstract Optional<FindFriendsModel> a();

    public abstract Optional<Boolean> b();

    public abstract Optional<SocialState> c();

    public abstract a d();
}
