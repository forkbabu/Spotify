package com.spotify.mobile.android.hubframework.model.immutable;

import java.util.Arrays;
import kotlin.jvm.internal.Lambda;

final class HubsImmutableCommandModel$hashCode$2 extends Lambda implements cmf<Integer> {
    final /* synthetic */ HubsImmutableCommandModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HubsImmutableCommandModel$hashCode$2(HubsImmutableCommandModel hubsImmutableCommandModel) {
        super(0);
        this.this$0 = hubsImmutableCommandModel;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public Integer invoke() {
        return Integer.valueOf(Arrays.hashCode(new Object[]{HubsImmutableCommandModel.access$getImpl$p(this.this$0)}));
    }
}
