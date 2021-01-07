package com.spotify.music.superbird.setup.steps.downloaded;

import com.spotify.music.superbird.setup.m;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class DownloadedFragment$onViewCreated$$inlined$apply$lambda$1 extends Lambda implements cmf<f> {
    final /* synthetic */ DownloadedFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DownloadedFragment$onViewCreated$$inlined$apply$lambda$1(DownloadedFragment downloadedFragment) {
        super(0);
        this.this$0 = downloadedFragment;
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
