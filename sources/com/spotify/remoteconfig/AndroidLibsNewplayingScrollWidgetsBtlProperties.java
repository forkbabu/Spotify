package com.spotify.remoteconfig;

public abstract class AndroidLibsNewplayingScrollWidgetsBtlProperties implements n0e {

    public enum BtlSnpvTreatment implements m0e {
        DISABLE_ALWAYS("disable_always"),
        ENABLE_ALWAYS("enable_always"),
        ENABLE_WHEN_LYRICS_ABSENT("enable_when_lyrics_absent");
        
        final String value;

        private BtlSnpvTreatment(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public static abstract class a {
    }

    public abstract BtlSnpvTreatment a();
}
