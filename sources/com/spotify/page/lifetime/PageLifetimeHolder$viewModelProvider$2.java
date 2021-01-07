package com.spotify.page.lifetime;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.g0;
import com.spotify.page.lifetime.PageLifetimeHolder;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
public final class PageLifetimeHolder$viewModelProvider$2 extends Lambda implements cmf<g0> {
    final /* synthetic */ PageLifetimeHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PageLifetimeHolder$viewModelProvider$2(PageLifetimeHolder pageLifetimeHolder) {
        super(0);
        this.this$0 = pageLifetimeHolder;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public g0 invoke() {
        Fragment fragment = this.this$0.d;
        return new g0(fragment.Z(), new PageLifetimeHolder.b());
    }
}
