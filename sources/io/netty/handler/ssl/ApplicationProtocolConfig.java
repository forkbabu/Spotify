package io.netty.handler.ssl;

import java.util.List;

public final class ApplicationProtocolConfig {

    public enum Protocol {
        NONE,
        NPN,
        ALPN,
        NPN_AND_ALPN
    }

    public enum SelectedListenerFailureBehavior {
        ACCEPT,
        FATAL_ALERT,
        CHOOSE_MY_LAST_PROTOCOL
    }

    public enum SelectorFailureBehavior {
        FATAL_ALERT,
        NO_ADVERTISE,
        CHOOSE_MY_LAST_PROTOCOL
    }

    public Protocol a() {
        throw null;
    }

    public SelectedListenerFailureBehavior b() {
        throw null;
    }

    public SelectorFailureBehavior c() {
        throw null;
    }

    public List<String> d() {
        throw null;
    }
}
