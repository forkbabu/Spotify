package com.google.common.base;

public abstract class Ticker {
    private static final Ticker SYSTEM_TICKER = new Ticker() {
        /* class com.google.common.base.Ticker.AnonymousClass1 */

        @Override // com.google.common.base.Ticker
        public long read() {
            int i = Platform.a;
            return System.nanoTime();
        }
    };

    protected Ticker() {
    }

    public static Ticker systemTicker() {
        return SYSTEM_TICKER;
    }

    public abstract long read();
}
