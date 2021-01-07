package com.spotify.libs.connect.nudge;

import com.spotify.libs.connect.nudge.DefaultConnectNudgeAttacher;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class DefaultConnectNudgeAttacher$onStart$2$$special$$inlined$let$lambda$1 extends Lambda implements nmf<ov0, f> {
    final /* synthetic */ DefaultConnectNudgeAttacher.b this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultConnectNudgeAttacher$onStart$2$$special$$inlined$let$lambda$1(DefaultConnectNudgeAttacher.b bVar) {
        super(1);
        this.this$0 = bVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(ov0 ov0) {
        h.e(ov0, "it");
        DefaultConnectNudgeAttacher.e(this.this$0.a).b();
        DefaultConnectNudgeAttacher.f(this.this$0.a).b().a();
        return f.a;
    }
}
