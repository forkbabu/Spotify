package com.spotify.mobile.android.hubframework.model.immutable;

import java.util.Arrays;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
public final class HubsImmutableViewModel$hashCode$2 extends Lambda implements cmf<Integer> {
    final /* synthetic */ HubsImmutableViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HubsImmutableViewModel$hashCode$2(HubsImmutableViewModel hubsImmutableViewModel) {
        super(0);
        this.this$0 = hubsImmutableViewModel;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public Integer invoke() {
        return Integer.valueOf(Arrays.hashCode(new Object[]{this.this$0.impl}));
    }
}
