package com.spotify.remoteconfig;

public abstract class AndroidFeatureHomeProperties implements n0e {

    public enum HomePageloader implements m0e {
        CONTROL("control"),
        SPINNER("spinner"),
        SKELETON("skeleton");
        
        final String value;

        private HomePageloader(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public enum InlineOnboardingSearchCardPosition implements m0e {
        FIRST("first"),
        LAST("last"),
        BOTH("both"),
        NONE("none");
        
        final String value;

        private InlineOnboardingSearchCardPosition(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public enum VoiceMicPermissionPrompt implements m0e {
        CONTROL("control"),
        AD("ad"),
        SINGLE("single"),
        DOUBLE("double");
        
        final String value;

        private VoiceMicPermissionPrompt(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public static abstract class a {
    }

    public abstract boolean a();

    public abstract int b();

    public abstract HomePageloader c();

    public abstract boolean d();

    public abstract InlineOnboardingSearchCardPosition e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract VoiceMicPermissionPrompt i();
}
