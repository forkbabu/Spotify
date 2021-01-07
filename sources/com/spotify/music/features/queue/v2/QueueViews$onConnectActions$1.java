package com.spotify.music.features.queue.v2;

import android.view.View;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class QueueViews$onConnectActions$1 extends Lambda implements nmf<View, f> {
    final /* synthetic */ QueueViews this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    QueueViews$onConnectActions$1(QueueViews queueViews) {
        super(1);
        this.this$0 = queueViews;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(View view) {
        View view2 = view;
        h.e(view2, "view");
        QueueViews.d(this.this$0, view2);
        return f.a;
    }
}
