package com.spotify.libs.connect.nudge;

import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class DefaultConnectNudgeAttacher$createConnectNudge$1 extends Lambda implements nmf<ov0, f> {
    final /* synthetic */ DefaultConnectNudgeAttacher this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultConnectNudgeAttacher$createConnectNudge$1(DefaultConnectNudgeAttacher defaultConnectNudgeAttacher) {
        super(1);
        this.this$0 = defaultConnectNudgeAttacher;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(ov0 ov0) {
        ov0 ov02 = ov0;
        h.e(ov02, "it");
        DefaultConnectNudgeAttacher.d(this.this$0).b();
        DefaultConnectNudgeAttacher.f(this.this$0).a().a();
        ov02.dismiss();
        return f.a;
    }
}
