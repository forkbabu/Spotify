package io.netty.handler.ssl;

import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLEngine;

public interface h extends a {

    public interface a {
    }

    public interface b {
        a a(SSLEngine sSLEngine, List<String> list);
    }

    public interface c {
    }

    public interface d {
        c a(SSLEngine sSLEngine, Set<String> set);
    }

    public interface e {
        SSLEngine a(SSLEngine sSLEngine, h hVar, boolean z);
    }

    b d();

    d f();

    e g();
}
