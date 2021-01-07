package com.spotify.saveaccountinfo;

import com.spotify.music.libs.profile.proto.IdentityV3$UserProfile;
import io.reactivex.functions.l;

public final /* synthetic */ class b implements l {
    public final /* synthetic */ SaveAccountInfoWorker a;

    public /* synthetic */ b(SaveAccountInfoWorker saveAccountInfoWorker) {
        this.a = saveAccountInfoWorker;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return SaveAccountInfoWorker.q(this.a, (IdentityV3$UserProfile) obj);
    }
}
