package com.spotify.remoteconfig;

public abstract class AppsMusicLibsRemoteconfigProperties implements n0e {

    public enum RcAaTestProperty implements m0e {
        POOH("Pooh"),
        TIGGER("Tigger"),
        PIGLET("Piglet");
        
        final String value;

        private RcAaTestProperty(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public enum SettingsDebugLabel implements m0e {
        DEBUG_TOOLING("debug-tooling"),
        DEBUG_TOOLS("debug-tools"),
        QA_TOOLS("qa-tools");
        
        final String value;

        private SettingsDebugLabel(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public enum SimpleMessageTest implements m0e {
        C_O_N_T_R_O_L("CONTROL"),
        T_R_E_A_T_M_E_N_T("TREATMENT"),
        DEFAULT("Default");
        
        final String value;

        private SimpleMessageTest(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public static abstract class a {
    }

    public abstract RcAaTestProperty a();

    public abstract SettingsDebugLabel b();

    public abstract SimpleMessageTest c();
}
