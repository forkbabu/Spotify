package com.spotify.music.features.profile.profilelist;

import com.spotify.music.libs.viewuri.c;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class ProfileListMetadataResolver$viewUri$2 extends Lambda implements cmf<c> {
    final /* synthetic */ ProfileListMetadataResolver this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ProfileListMetadataResolver$viewUri$2(ProfileListMetadataResolver profileListMetadataResolver) {
        super(0);
        this.this$0 = profileListMetadataResolver;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public c invoke() {
        String x = this.this$0.f.x();
        h.d(x, "profileListPageUriProvider.pageUri");
        h.e(x, "pageUri");
        c a = c.a(x);
        h.d(a, "ViewUri.create(pageUri)");
        return a;
    }
}
