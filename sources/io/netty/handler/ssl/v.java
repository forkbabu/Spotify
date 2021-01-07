package io.netty.handler.ssl;

import io.netty.handler.ssl.ApplicationProtocolConfig;
import java.util.List;

public final class v implements s {
    private final ApplicationProtocolConfig a;

    public v(ApplicationProtocolConfig applicationProtocolConfig) {
        this.a = applicationProtocolConfig;
    }

    @Override // io.netty.handler.ssl.s
    public ApplicationProtocolConfig.SelectorFailureBehavior a() {
        return this.a.c();
    }

    @Override // io.netty.handler.ssl.s
    public ApplicationProtocolConfig.Protocol b() {
        return this.a.a();
    }

    @Override // io.netty.handler.ssl.a
    public List<String> c() {
        return this.a.d();
    }

    @Override // io.netty.handler.ssl.s
    public ApplicationProtocolConfig.SelectedListenerFailureBehavior e() {
        return this.a.b();
    }
}
