package com.spotify.music.features.wrapped2020.stories.share;

import android.graphics.Bitmap;
import com.google.protobuf.GeneratedMessageLite;
import com.spotify.mobile.android.share.menu.preview.api.c;
import com.spotify.mobile.android.share.menu.preview.api.d;
import com.spotify.wrapped2020.v1.proto.ConsumerShareMessaging;
import com.spotify.wrapped2020.v1.proto.ConsumerShareQueryParameter;
import com.spotify.wrapped2020.v1.proto.ConsumerShareRequest;
import com.spotify.wrapped2020.v1.proto.ConsumerShareResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class SharePayloadProviderFactory$createSharePayloadProvider$1 extends Lambda implements cmf<d> {
    final /* synthetic */ String $shareScheme;
    final /* synthetic */ String $storyType;
    final /* synthetic */ a this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SharePayloadProviderFactory$createSharePayloadProvider$1(a aVar, String str, String str2) {
        super(0);
        this.this$0 = aVar;
        this.$storyType = str;
        this.$shareScheme = str2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public d invoke() {
        Map map;
        List<ConsumerShareQueryParameter> l;
        try {
            zy8 zy8 = this.this$0.a;
            ConsumerShareRequest.b m = ConsumerShareRequest.m();
            m.o(this.$storyType);
            m.n(this.$shareScheme);
            m.m("VERTICAL");
            GeneratedMessageLite build = m.build();
            h.d(build, "ConsumerShareRequest.new…                 .build()");
            ConsumerShareResponse d = zy8.c((ConsumerShareRequest) build, false).d();
            h.d(d, "shareResponse");
            String l2 = d.l();
            h.d(l2, "shareResponse.shareUri");
            Bitmap j = this.this$0.b.m(d.h()).j();
            h.d(j, "picasso.load(shareResponse.imageUrl).get()");
            ConsumerShareMessaging i = d.i();
            String i2 = i != null ? i.i() : null;
            ConsumerShareMessaging i3 = d.i();
            String m2 = i3 != null ? i3.m() : null;
            ConsumerShareMessaging i4 = d.i();
            if (i4 == null || (l = i4.l()) == null) {
                map = EmptyMap.a;
            } else {
                ArrayList arrayList = new ArrayList(kotlin.collections.d.e(l, 10));
                for (T t : l) {
                    h.d(t, "it");
                    arrayList.add(new Pair(t.h(), t.i()));
                }
                map = kotlin.collections.d.S(arrayList);
            }
            return new d.b(new c(l2, j, i2, map, m2));
        } catch (RuntimeException unused) {
            return d.a.a;
        }
    }
}
