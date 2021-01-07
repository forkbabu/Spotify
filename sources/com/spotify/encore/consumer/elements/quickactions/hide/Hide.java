package com.spotify.encore.consumer.elements.quickactions.hide;

import com.spotify.encore.Element;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface Hide extends Element<Boolean, Boolean> {

    public static final class DefaultImpls {
        public static void onEvent(Hide hide, nmf<? super Boolean, f> nmf) {
            h.e(nmf, "event");
            Element.DefaultImpls.onEvent(hide, nmf);
        }
    }
}
