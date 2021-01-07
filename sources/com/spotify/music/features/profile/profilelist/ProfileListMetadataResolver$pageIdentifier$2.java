package com.spotify.music.features.profile.profilelist;

import com.spotify.instrumentation.PageIdentifiers;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
public final class ProfileListMetadataResolver$pageIdentifier$2 extends Lambda implements cmf<PageIdentifiers> {
    final /* synthetic */ ProfileListMetadataResolver this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ProfileListMetadataResolver$pageIdentifier$2(ProfileListMetadataResolver profileListMetadataResolver) {
        super(0);
        this.this$0 = profileListMetadataResolver;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public PageIdentifiers invoke() {
        return ProfileListMetadataResolver.g.d(ProfileListMetadataResolver.b(this.this$0));
    }
}
