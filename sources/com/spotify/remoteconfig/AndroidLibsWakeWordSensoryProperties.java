package com.spotify.remoteconfig;

public abstract class AndroidLibsWakeWordSensoryProperties implements n0e {

    public enum OperatingPoint implements m0e {
        DEFAULT("default"),
        ONE("one"),
        TWO("two"),
        THREE("three"),
        FOUR("four"),
        FIVE("five"),
        SIX("six"),
        SEVEN("seven"),
        EIGHT("eight"),
        NINE("nine"),
        TEN("ten");
        
        final String value;

        private OperatingPoint(String str) {
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

    public abstract OperatingPoint b();

    public abstract boolean c();
}
