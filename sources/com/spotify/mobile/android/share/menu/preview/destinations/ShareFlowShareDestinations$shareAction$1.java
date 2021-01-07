package com.spotify.mobile.android.share.menu.preview.destinations;

import com.spotify.mobile.android.share.menu.preview.api.a;
import com.spotify.mobile.android.share.menu.preview.api.c;
import com.spotify.mobile.android.share.menu.preview.api.h;
import com.spotify.music.C0707R;
import com.spotify.share.sharedata.ShareCapability;
import com.spotify.share.sharedata.p;
import com.spotify.share.sharedata.q;
import com.spotify.share.sharedata.r;
import com.spotify.share.sharedata.s;
import com.spotify.share.sharedata.t;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
public final class ShareFlowShareDestinations$shareAction$1 extends Lambda implements rmf<a, c, h> {
    final /* synthetic */ o8e $this_shareAction;
    final /* synthetic */ b this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ShareFlowShareDestinations$shareAction$1(b bVar, o8e o8e) {
        super(2);
        this.this$0 = bVar;
        this.$this_shareAction = o8e;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public h invoke(a aVar, c cVar) {
        t build;
        a aVar2 = aVar;
        c cVar2 = cVar;
        ShareCapability shareCapability = ShareCapability.MESSAGE;
        kotlin.jvm.internal.h.e(aVar2, "destination");
        kotlin.jvm.internal.h.e(cVar2, "payload");
        if (this.$this_shareAction.b().contains(ShareCapability.IMAGE_STORY)) {
            q.a i = q.i(cVar2.a(), cVar2.b());
            i.a(cVar2.e());
            build = i.build();
            kotlin.jvm.internal.h.d(build, "ImageStoryShareData.buil…                 .build()");
        } else if (this.$this_shareAction.b().contains(ShareCapability.IMAGE) && (cVar2.d() == null || !this.$this_shareAction.b().contains(shareCapability))) {
            p.a i2 = p.i(cVar2.a(), cVar2.b());
            i2.setText(cVar2.c());
            i2.a(cVar2.e());
            build = i2.build();
            kotlin.jvm.internal.h.d(build, "ImageShareData.builder(\n…                 .build()");
        } else if (this.$this_shareAction.b().contains(shareCapability) && cVar2.c() != null) {
            String d = cVar2.d();
            if (d == null) {
                d = cVar2.a();
            }
            s.a h = s.h(d, cVar2.c());
            h.a(cVar2.e());
            build = h.build();
            kotlin.jvm.internal.h.d(build, "MessageShareData.builder…                 .build()");
        } else if (this.$this_shareAction.b().contains(ShareCapability.LINK)) {
            String d2 = cVar2.d();
            if (d2 == null) {
                d2 = cVar2.a();
            }
            r.a h2 = r.h(d2);
            h2.a(cVar2.e());
            build = h2.build();
            kotlin.jvm.internal.h.d(build, "LinkShareData.builder(pa…                 .build()");
        } else {
            throw new IllegalStateException("not supported capability".toString());
        }
        try {
            this.this$0.c.a(this.this$0.a, this.$this_shareAction, build, "preview-share-menu", this.this$0.e.a().toString(), this.this$0.a.getString(C0707R.string.integration_id_preview)).d();
            return new h.b(aVar2);
        } catch (Exception unused) {
            return new h.a(aVar2);
        }
    }
}
