package com.spotify.music.features.profile.saveprofile.effecthandlers;

import com.spotify.music.features.profile.saveprofile.domain.n;
import com.spotify.music.libs.profile.proto.IdentityV3$UserProfile;
import io.reactivex.functions.l;
import io.reactivex.s;

public final /* synthetic */ class m implements l {
    public final /* synthetic */ bqa a;

    public /* synthetic */ m(bqa bqa) {
        this.a = bqa;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        n.b bVar = (n.b) obj;
        s<IdentityV3$UserProfile> a2 = this.a.a(bVar.b());
        if (!bVar.a()) {
            a2 = a2.N0(1);
        }
        return a2.j0(w.a).r0(e.a);
    }
}
