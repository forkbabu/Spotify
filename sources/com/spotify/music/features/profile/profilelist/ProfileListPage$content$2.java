package com.spotify.music.features.profile.profilelist;

import com.spotify.music.features.profile.model.LoadingState;
import com.spotify.music.features.profile.model.e;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class ProfileListPage$content$2 extends FunctionReferenceImpl implements nmf<e, Boolean> {
    ProfileListPage$content$2(ProfileListPage profileListPage) {
        super(1, profileListPage, ProfileListPage.class, "isLoaded", "isLoaded(Lcom/spotify/music/features/profile/model/ProfileListData;)Z", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public Boolean invoke(e eVar) {
        e eVar2 = eVar;
        h.e(eVar2, "p1");
        ((ProfileListPage) this.receiver).getClass();
        return Boolean.valueOf(eVar2.c() == LoadingState.LOADED);
    }
}
