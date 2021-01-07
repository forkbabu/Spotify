package com.spotify.android.dac.engine.view.binders.containers.list;

import android.view.View;
import com.spotify.dac.api.components.proto.HorizontalListComponent;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class HorizontalListComponentBinder$binder$1 extends Lambda implements rmf<View, HorizontalListComponent, f> {
    final /* synthetic */ HorizontalListComponentBinder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HorizontalListComponentBinder$binder$1(HorizontalListComponentBinder horizontalListComponentBinder) {
        super(2);
        this.this$0 = horizontalListComponentBinder;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public f invoke(View view, HorizontalListComponent horizontalListComponent) {
        HorizontalListComponent horizontalListComponent2 = horizontalListComponent;
        h.e(view, "<anonymous parameter 0>");
        h.e(horizontalListComponent2, "comp");
        HorizontalListComponentBinder.a(this.this$0).b0(horizontalListComponent2.h());
        return f.a;
    }
}
