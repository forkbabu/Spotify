package com.spotify.remoteconfig;

public abstract class AppsMusicFeaturesRemoteconfigurationProperties implements n0e {

    public enum ButtonColor implements m0e {
        GREEN("green"),
        WHITE("white"),
        RED("red"),
        BLUE("blue");
        
        final String value;

        private ButtonColor(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public enum Message implements m0e {
        C_O_N_T_R_O_L("CONTROL"),
        T_R_E_A_T_M_E_N_T("TREATMENT");
        
        final String value;

        private Message(String str) {
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

    public abstract ButtonColor b();

    public abstract Message c();
}
