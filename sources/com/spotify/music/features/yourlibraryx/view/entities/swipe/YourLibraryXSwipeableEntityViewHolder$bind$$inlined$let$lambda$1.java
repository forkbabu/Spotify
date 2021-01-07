package com.spotify.music.features.yourlibraryx.view.entities.swipe;

import com.spotify.mobile.android.spotlets.yourlibrary.proto.YourLibraryResponseProto$YourLibraryEntityInfo;
import com.spotify.music.features.yourlibraryx.domain.YourLibraryXEvent;
import com.spotify.music.features.yourlibraryx.view.y;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class YourLibraryXSwipeableEntityViewHolder$bind$$inlined$let$lambda$1 extends Lambda implements cmf<f> {
    final /* synthetic */ y $item$inlined;
    final /* synthetic */ nmf $output$inlined;
    final /* synthetic */ YourLibraryXSwipeableEntityViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    YourLibraryXSwipeableEntityViewHolder$bind$$inlined$let$lambda$1(YourLibraryXSwipeableEntityViewHolder yourLibraryXSwipeableEntityViewHolder, y yVar, nmf nmf) {
        super(0);
        this.this$0 = yourLibraryXSwipeableEntityViewHolder;
        this.$item$inlined = yVar;
        this.$output$inlined = nmf;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public f invoke() {
        Object obj;
        nmf nmf = this.$output$inlined;
        YourLibraryXSwipeableEntityViewHolder yourLibraryXSwipeableEntityViewHolder = this.this$0;
        YourLibraryResponseProto$YourLibraryEntityInfo m = ((y.a) this.$item$inlined).b().m();
        h.d(m, "item.entity.entityInfo");
        int i = YourLibraryXSwipeableEntityViewHolder.G;
        yourLibraryXSwipeableEntityViewHolder.getClass();
        if (m.o()) {
            String p = m.p();
            h.d(p, "entityInfo.uri");
            obj = new YourLibraryXEvent.z(p);
        } else {
            String p2 = m.p();
            h.d(p2, "entityInfo.uri");
            obj = new YourLibraryXEvent.y(p2);
        }
        nmf.invoke(obj);
        return f.a;
    }
}
