package com.spotify.page.hosting;

import android.os.Bundle;
import android.os.Parcelable;
import kotlin.jvm.internal.Lambda;

final class PageHostingFragment$pageParameters$2 extends Lambda implements cmf<Parcelable> {
    final /* synthetic */ PageHostingFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PageHostingFragment$pageParameters$2(PageHostingFragment pageHostingFragment) {
        super(0);
        this.this$0 = pageHostingFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public Parcelable invoke() {
        Bundle D2 = this.this$0.D2();
        if (D2 != null) {
            return D2.getParcelable("parameters");
        }
        return null;
    }
}
