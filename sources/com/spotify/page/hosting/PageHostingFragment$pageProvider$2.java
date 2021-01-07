package com.spotify.page.hosting;

import android.os.Parcelable;
import kotlin.jvm.internal.Lambda;

final class PageHostingFragment$pageProvider$2 extends Lambda implements cmf<usd<Parcelable>> {
    final /* synthetic */ PageHostingFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PageHostingFragment$pageProvider$2(PageHostingFragment pageHostingFragment) {
        super(0);
        this.this$0 = pageHostingFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public usd<Parcelable> invoke() {
        usd<Parcelable> usd = (usd) PageHostingFragment.M4(this.this$0).get(this.this$0.O4());
        if (usd != null) {
            return usd;
        }
        StringBuilder V0 = je.V0("could not find ");
        V0.append(this.this$0.O4());
        V0.append(" in registry");
        throw new IllegalStateException(V0.toString().toString());
    }
}
