package com.spotify.page.hosting;

import java.util.Set;
import kotlin.jvm.internal.Lambda;

final class PageHostingFragment$pageCapabilities$2 extends Lambda implements cmf<Set<? extends atd>> {
    final /* synthetic */ PageHostingFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PageHostingFragment$pageCapabilities$2(PageHostingFragment pageHostingFragment) {
        super(0);
        this.this$0 = pageHostingFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public Set<? extends atd> invoke() {
        return PageHostingFragment.K4(this.this$0).getCapabilities();
    }
}
