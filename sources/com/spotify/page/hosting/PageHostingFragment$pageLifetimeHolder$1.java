package com.spotify.page.hosting;

import android.os.Parcelable;
import com.spotify.page.lifetime.a;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class PageHostingFragment$pageLifetimeHolder$1 extends Lambda implements cmf<a> {
    final /* synthetic */ PageHostingFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PageHostingFragment$pageLifetimeHolder$1(PageHostingFragment pageHostingFragment) {
        super(0);
        this.this$0 = pageHostingFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public a invoke() {
        return new a(new nmf<etd, psd>() {
            /* class com.spotify.page.hosting.PageHostingFragment$pageLifetimeHolder$1.AnonymousClass1 */

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // defpackage.nmf
            public psd invoke(etd etd) {
                etd etd2 = etd;
                h.e(etd2, "context");
                usd L4 = PageHostingFragment.L4(PageHostingFragment$pageLifetimeHolder$1.this.this$0);
                Parcelable Q4 = PageHostingFragment$pageLifetimeHolder$1.this.this$0.Q4();
                if (Q4 == null) {
                    Q4 = new wsd();
                }
                return L4.a(Q4, etd2);
            }
        });
    }
}
