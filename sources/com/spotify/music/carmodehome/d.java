package com.spotify.music.carmodehome;

import java.util.Map;
import kotlin.jvm.internal.h;

public final class d {
    public static final String a(s81 s81) {
        o81 o81;
        p81 data;
        h.e(s81, "$this$contextUri");
        Map<String, ? extends o81> events = s81.events();
        if (events == null || (o81 = (o81) events.get("click")) == null || (data = o81.data()) == null) {
            return null;
        }
        return data.string("uri");
    }
}
