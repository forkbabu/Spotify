package com.spotify.music.features.profile.entity;

import com.spotify.music.features.profile.entity.ProfileEntityPage;
import com.spotify.music.features.profile.model.LoadingState;
import kotlin.f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.h;

final /* synthetic */ class ProfileEntityPage$content$1 extends FunctionReferenceImpl implements nmf<np7, f> {
    ProfileEntityPage$content$1(ProfileEntityPage profileEntityPage) {
        super(1, profileEntityPage, ProfileEntityPage.class, "errorOnLoadFailed", "errorOnLoadFailed(Lcom/spotify/music/features/profile/entity/data/domain/ProfileEntityDataModel;)V", 0);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(np7 np7) {
        np7 np72 = np7;
        h.e(np72, "p1");
        ((ProfileEntityPage) this.receiver).getClass();
        if (np72.h() != LoadingState.FAILED) {
            return f.a;
        }
        throw new ProfileEntityPage.FailLoadingProfileEntityException();
    }
}
