package com.spotify.android.dac.engine.view.binders.common;

import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.dac.api.components.proto.NotFoundComponent;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.h;

final class NotFoundComponentBinder$builder$1 extends Lambda implements smf<ViewGroup, NotFoundComponent, Boolean, TextView> {
    public static final NotFoundComponentBinder$builder$1 a = new NotFoundComponentBinder$builder$1();

    NotFoundComponentBinder$builder$1() {
        super(3);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // defpackage.smf
    public TextView c(ViewGroup viewGroup, NotFoundComponent notFoundComponent, Boolean bool) {
        ViewGroup viewGroup2 = viewGroup;
        bool.booleanValue();
        h.e(viewGroup2, "parent");
        h.e(notFoundComponent, "<anonymous parameter 1>");
        TextView textView = new TextView(viewGroup2.getContext());
        textView.setVisibility(8);
        return textView;
    }
}
