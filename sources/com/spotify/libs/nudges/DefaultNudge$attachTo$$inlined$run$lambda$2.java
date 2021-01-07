package com.spotify.libs.nudges;

import android.graphics.Rect;
import android.view.View;
import kotlin.f;
import kotlin.jvm.internal.Lambda;

final class DefaultNudge$attachTo$$inlined$run$lambda$2 extends Lambda implements cmf<f> {
    final /* synthetic */ View $anchorView$inlined;
    final /* synthetic */ Rect $anchorViewRect$inlined;
    final /* synthetic */ DefaultNudge this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultNudge$attachTo$$inlined$run$lambda$2(DefaultNudge defaultNudge, Rect rect, View view) {
        super(0);
        this.this$0 = defaultNudge;
        this.$anchorViewRect$inlined = rect;
        this.$anchorView$inlined = view;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.cmf
    public f invoke() {
        nmf e = DefaultNudge.e(this.this$0);
        if (e != null) {
            f fVar = (f) e.invoke(this.this$0);
        }
        return f.a;
    }
}
