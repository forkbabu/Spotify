package com.spotify.music.features.profile.entity;

import com.spotify.music.features.profile.model.LoadingState;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class ProfileEntityPage$content$2 extends FunctionReferenceImpl implements nmf<np7, Boolean> {
    ProfileEntityPage$content$2(ProfileEntityPage profileEntityPage) {
        super(1, profileEntityPage, ProfileEntityPage.class, "isLoaded", "isLoaded(Lcom/spotify/music/features/profile/entity/data/domain/ProfileEntityDataModel;)Z", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public Boolean invoke(np7 np7) {
        np7 np72 = np7;
        h.e(np72, "p1");
        ((ProfileEntityPage) this.receiver).getClass();
        return Boolean.valueOf(np72.h() == LoadingState.LOADED);
    }
}
