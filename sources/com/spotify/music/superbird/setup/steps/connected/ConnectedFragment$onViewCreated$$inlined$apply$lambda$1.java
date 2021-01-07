package com.spotify.music.superbird.setup.steps.connected;

import com.spotify.music.superbird.setup.m;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class ConnectedFragment$onViewCreated$$inlined$apply$lambda$1 extends Lambda implements cmf<f> {
    final /* synthetic */ ConnectedFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ConnectedFragment$onViewCreated$$inlined$apply$lambda$1(ConnectedFragment connectedFragment) {
        super(0);
        this.this$0 = connectedFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public f invoke() {
        m mVar = this.this$0.h0;
        if (mVar != null) {
            mVar.c();
            return f.a;
        }
        h.k("delegate");
        throw null;
    }
}
