package com.spotify.music.superbird.setup.steps.connecttocar;

import com.spotify.music.superbird.setup.m;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class ConnectToCarFragment$onViewCreated$$inlined$apply$lambda$2 extends Lambda implements cmf<f> {
    final /* synthetic */ ConnectToCarFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ConnectToCarFragment$onViewCreated$$inlined$apply$lambda$2(ConnectToCarFragment connectToCarFragment) {
        super(0);
        this.this$0 = connectToCarFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public f invoke() {
        m mVar = this.this$0.h0;
        if (mVar != null) {
            mVar.g();
            return f.a;
        }
        h.k("delegate");
        throw null;
    }
}
