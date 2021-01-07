package okhttp3;

import java.io.IOException;

public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    
    private final String protocol;

    private Protocol(String str) {
        this.protocol = str;
    }

    public static Protocol d(String str) {
        Protocol protocol2 = HTTP_1_0;
        if (str.equals(protocol2.protocol)) {
            return protocol2;
        }
        Protocol protocol3 = HTTP_1_1;
        if (str.equals(protocol3.protocol)) {
            return protocol3;
        }
        Protocol protocol4 = H2_PRIOR_KNOWLEDGE;
        if (str.equals(protocol4.protocol)) {
            return protocol4;
        }
        Protocol protocol5 = HTTP_2;
        if (str.equals(protocol5.protocol)) {
            return protocol5;
        }
        Protocol protocol6 = SPDY_3;
        if (str.equals(protocol6.protocol)) {
            return protocol6;
        }
        Protocol protocol7 = QUIC;
        if (str.equals(protocol7.protocol)) {
            return protocol7;
        }
        throw new IOException(je.x0("Unexpected protocol: ", str));
    }

    @Override // java.lang.Enum, java.lang.Object
    public String toString() {
        return this.protocol;
    }
}
