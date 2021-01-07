package com.spotify.music.features.profile.profilelist;

import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.profile.profilelist.ProfileListMetadataResolver;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class ProfileListMetadataResolver$spotifyLink$2 extends Lambda implements cmf<l0> {
    final /* synthetic */ ProfileListMetadataResolver this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ProfileListMetadataResolver$spotifyLink$2(ProfileListMetadataResolver profileListMetadataResolver) {
        super(0);
        this.this$0 = profileListMetadataResolver;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public l0 invoke() {
        ProfileListMetadataResolver.a aVar = ProfileListMetadataResolver.g;
        String x = this.this$0.f.x();
        h.d(x, "profileListPageUriProvider.pageUri");
        return aVar.g(x);
    }
}
