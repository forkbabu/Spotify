package io.netty.handler.ssl;

import javax.net.ssl.X509ExtendedKeyManager;

final class y extends a0 {
    private final X509ExtendedKeyManager d;

    y(X509ExtendedKeyManager x509ExtendedKeyManager, String str) {
        super(x509ExtendedKeyManager, str);
        this.d = x509ExtendedKeyManager;
    }

    /* access modifiers changed from: protected */
    @Override // io.netty.handler.ssl.a0
    public String a(ReferenceCountedOpenSslEngine referenceCountedOpenSslEngine, String str) {
        return this.d.chooseEngineServerAlias(str, null, referenceCountedOpenSslEngine);
    }
}
