package io.netty.handler.ssl;

import java.security.cert.CertificateException;

public final class OpenSslCertificateException extends CertificateException {
    private static final long serialVersionUID = 5542675253797129798L;
    private final int errorCode;
}
