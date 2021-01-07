package com.spotify.libs.nudges;

import android.graphics.Rect;
import android.view.View;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class DefaultNudge$attachTo$$inlined$run$lambda$3 extends Lambda implements nmf<View, f> {
    final /* synthetic */ View $anchorView$inlined;
    final /* synthetic */ Rect $anchorViewRect$inlined;
    final /* synthetic */ DefaultNudge this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DefaultNudge$attachTo$$inlined$run$lambda$3(DefaultNudge defaultNudge, Rect rect, View view) {
        super(1);
        this.this$0 = defaultNudge;
        this.$anchorViewRect$inlined = rect;
        this.$anchorView$inlined = view;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.nmf
    public f invoke(View view) {
        View view2 = view;
        h.e(view2, "arrow");
        Rect f = DefaultNudge.f(this.this$0, view2);
        view2.setPivotX(((float) view2.getWidth()) / 2.0f);
        view2.setPivotY(((float) view2.getHeight()) / 2.0f);
        view2.setTranslationY(-(((float) view2.getHeight()) / 2.0f));
        view2.setTranslationX(((float) this.$anchorViewRect$inlined.centerX()) - ((float) f.centerX()));
        view2.setRotation(45.0f);
        return f.a;
    }
}
