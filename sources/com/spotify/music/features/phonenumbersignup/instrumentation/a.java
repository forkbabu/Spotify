package com.spotify.music.features.phonenumbersignup.instrumentation;

import com.spotify.base.java.logging.Logger;
import java.util.EnumSet;
import java.util.Set;

public class a {
    private final Set<InstrumentationInputField> a = EnumSet.noneOf(InstrumentationInputField.class);
    private final b b;

    public a(b bVar) {
        this.b = bVar;
    }

    public void a(InstrumentationInputField instrumentationInputField, InstrumentationScreen instrumentationScreen) {
        if (!this.a.contains(instrumentationInputField)) {
            this.a.add(instrumentationInputField);
            Logger.l("FieldTracker - Tracking interaction %s:%s", instrumentationScreen, instrumentationInputField);
            this.b.w(instrumentationScreen, instrumentationInputField);
        }
    }

    public void b() {
        this.a.clear();
    }
}
