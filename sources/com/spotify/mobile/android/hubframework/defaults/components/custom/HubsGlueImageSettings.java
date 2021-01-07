package com.spotify.mobile.android.hubframework.defaults.components.custom;

import com.google.common.base.Optional;

public class HubsGlueImageSettings {

    public enum Style {
        DEFAULT,
        CIRCULAR,
        CIRCULAR_WITH_RIPPLE,
        SQUARE_WITH_RIPPLE;
        
        private final p81 mSetting = z81.a().o("style", this).d();

        private static class a {
            private static final kg0<Style> a = kg0.a(Style.class);
        }

        private Style() {
        }
    }

    public static Style a(x81 x81) {
        Object obj = x81.custom().get("style");
        if (obj instanceof Style) {
            return (Style) obj;
        }
        if (obj instanceof String) {
            return (Style) Style.a.a.f(obj.toString()).or((Optional) Style.DEFAULT);
        }
        return Style.DEFAULT;
    }

    public static p81 b(Style style) {
        return style.mSetting;
    }
}
