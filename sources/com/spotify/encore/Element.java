package com.spotify.encore;

import com.spotify.encore.Item;
import kotlin.f;
import kotlin.jvm.internal.h;

public interface Element<Model, Event> extends Item<Model, Event> {

    public static final class DefaultImpls {
        public static <Model, Event> void onEvent(Element<Model, Event> element, nmf<? super Event, f> nmf) {
            h.e(nmf, "event");
            Item.DefaultImpls.onEvent(element, nmf);
        }
    }
}
