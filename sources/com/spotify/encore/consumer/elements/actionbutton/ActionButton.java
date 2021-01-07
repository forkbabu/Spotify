package com.spotify.encore.consumer.elements.actionbutton;

import com.spotify.encore.Element;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface ActionButton extends Element<String, f> {

    public static final class DefaultImpls {
        public static void onEvent(ActionButton actionButton, nmf<? super f, f> nmf) {
            h.e(nmf, "event");
            Element.DefaultImpls.onEvent(actionButton, nmf);
        }
    }
}
