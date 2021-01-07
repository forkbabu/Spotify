package com.spotify.encore;

import kotlin.f;
import kotlin.jvm.internal.h;

public interface Item<Model, Event> {

    public static final class DefaultImpls {
        public static <Model, Event> void onEvent(Item<Model, Event> item, nmf<? super Event, f> nmf) {
            h.e(nmf, "event");
        }
    }

    void onEvent(nmf<? super Event, f> nmf);

    void render(Model model);
}
