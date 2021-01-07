package com.spotify.music.features.queue.v2;

import kotlin.f;
import kotlin.jvm.internal.Lambda;

final class QueueViews$onDisposeActions$1 extends Lambda implements cmf<f> {
    final /* synthetic */ QueueViews this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    QueueViews$onDisposeActions$1(QueueViews queueViews) {
        super(0);
        this.this$0 = queueViews;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public f invoke() {
        QueueViews.b(this.this$0).e();
        return f.a;
    }
}
