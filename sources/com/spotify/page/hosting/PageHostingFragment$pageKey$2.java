package com.spotify.page.hosting;

import android.os.Bundle;
import kotlin.jvm.internal.Lambda;

final class PageHostingFragment$pageKey$2 extends Lambda implements cmf<String> {
    final /* synthetic */ PageHostingFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PageHostingFragment$pageKey$2(PageHostingFragment pageHostingFragment) {
        super(0);
        this.this$0 = pageHostingFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public String invoke() {
        String string;
        Bundle D2 = this.this$0.D2();
        if (D2 != null && (string = D2.getString("page_key")) != null) {
            return string;
        }
        throw new IllegalArgumentException();
    }
}
