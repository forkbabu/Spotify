package com.spotify.android.dac.engine.view.binders.containers.list;

import android.view.View;
import com.spotify.dac.api.components.proto.VerticalListComponent;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class VerticalListComponentBinder$binder$1 extends Lambda implements rmf<View, VerticalListComponent, f> {
    final /* synthetic */ VerticalListComponentBinder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    VerticalListComponentBinder$binder$1(VerticalListComponentBinder verticalListComponentBinder) {
        super(2);
        this.this$0 = verticalListComponentBinder;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public f invoke(View view, VerticalListComponent verticalListComponent) {
        VerticalListComponent verticalListComponent2 = verticalListComponent;
        h.e(view, "<anonymous parameter 0>");
        h.e(verticalListComponent2, "comp");
        VerticalListComponentBinder.a(this.this$0).b0(verticalListComponent2.h());
        return f.a;
    }
}
