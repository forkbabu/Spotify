package io.netty.channel;

public final class o {
    public o(boolean z, int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(je.q0("defaultMaxMessagesPerRead: ", i, " (expected > 0)"));
        }
    }

    public int a() {
        return 16;
    }

    public boolean b() {
        return false;
    }
}
