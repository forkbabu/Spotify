package com.spotify.music.features.yourlibraryx.dataloading;

import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.music.libs.profile.proto.IdentityV3$UserProfile;
import io.reactivex.BackpressureStrategy;
import io.reactivex.functions.l;
import kotlin.jvm.internal.h;

final class a<T, R> implements l<SessionState, tpf<? extends IdentityV3$UserProfile>> {
    final /* synthetic */ YourLibraryProfileDataLoader$profileDataFlowable$2 a;

    a(YourLibraryProfileDataLoader$profileDataFlowable$2 yourLibraryProfileDataLoader$profileDataFlowable$2) {
        this.a = yourLibraryProfileDataLoader$profileDataFlowable$2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public tpf<? extends IdentityV3$UserProfile> apply(SessionState sessionState) {
        SessionState sessionState2 = sessionState;
        h.e(sessionState2, "sessionState");
        return this.a.this$0.c.a(sessionState2.currentUser()).Y0(BackpressureStrategy.LATEST);
    }
}
