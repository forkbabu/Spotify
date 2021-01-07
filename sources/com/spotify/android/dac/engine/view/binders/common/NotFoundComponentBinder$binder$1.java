package com.spotify.android.dac.engine.view.binders.common;

import android.view.View;
import com.spotify.base.java.logging.Logger;
import com.spotify.dac.api.components.proto.NotFoundComponent;
import kotlin.f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class NotFoundComponentBinder$binder$1 extends Lambda implements rmf<View, NotFoundComponent, f> {
    public static final NotFoundComponentBinder$binder$1 a = new NotFoundComponentBinder$binder$1();

    NotFoundComponentBinder$binder$1() {
        super(2);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // defpackage.rmf
    public f invoke(View view, NotFoundComponent notFoundComponent) {
        NotFoundComponent notFoundComponent2 = notFoundComponent;
        h.e(view, "errorView");
        h.e(notFoundComponent2, "notFoundComponent");
        Logger.b("[DAC] Component not found: " + notFoundComponent2.i(), new Object[0]);
        return f.a;
    }
}
