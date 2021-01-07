package com.spotify.mobile.android.hubframework.model.immutable;

import java.util.Arrays;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
public final class HubsImmutableComponentIdentifier$hashCode$2 extends Lambda implements cmf<Integer> {
    final /* synthetic */ HubsImmutableComponentIdentifier this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HubsImmutableComponentIdentifier$hashCode$2(HubsImmutableComponentIdentifier hubsImmutableComponentIdentifier) {
        super(0);
        this.this$0 = hubsImmutableComponentIdentifier;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public Integer invoke() {
        return Integer.valueOf(Arrays.hashCode(new Object[]{this.this$0.id, this.this$0.category}));
    }
}
