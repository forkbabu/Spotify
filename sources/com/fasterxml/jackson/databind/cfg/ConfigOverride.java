package com.fasterxml.jackson.databind.cfg;

public abstract class ConfigOverride {

    /* access modifiers changed from: package-private */
    public static final class Empty extends ConfigOverride {
        static final Empty INSTANCE = new Empty();

        private Empty() {
        }
    }

    protected ConfigOverride() {
    }
}
