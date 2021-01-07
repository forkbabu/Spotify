package com.spotify.encore.consumer.elements.quickactions;

import com.spotify.encore.Element;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface QuickAction extends Element<Action, Events> {

    public static final class DefaultImpls {
        public static void onEvent(QuickAction quickAction, nmf<? super Events, f> nmf) {
            h.e(nmf, "event");
            Element.DefaultImpls.onEvent(quickAction, nmf);
        }
    }
}
