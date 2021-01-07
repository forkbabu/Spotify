package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;
import okhttp3.k;

public final class b {
    private final List<k> a;
    private int b = 0;
    private boolean c;
    private boolean d;

    public b(List<k> list) {
        this.a = list;
    }

    public k a(SSLSocket sSLSocket) {
        boolean z;
        k kVar;
        int i = this.b;
        int size = this.a.size();
        while (true) {
            z = true;
            if (i >= size) {
                kVar = null;
                break;
            }
            kVar = this.a.get(i);
            if (kVar.a(sSLSocket)) {
                this.b = i + 1;
                break;
            }
            i++;
        }
        if (kVar != null) {
            int i2 = this.b;
            while (true) {
                if (i2 >= this.a.size()) {
                    z = false;
                    break;
                } else if (this.a.get(i2).a(sSLSocket)) {
                    break;
                } else {
                    i2++;
                }
            }
            this.c = z;
            pnf.a.c(kVar, sSLSocket, this.d);
            return kVar;
        }
        StringBuilder V0 = je.V0("Unable to find acceptable protocols. isFallback=");
        V0.append(this.d);
        V0.append(", modes=");
        V0.append(this.a);
        V0.append(", supported protocols=");
        V0.append(Arrays.toString(sSLSocket.getEnabledProtocols()));
        throw new UnknownServiceException(V0.toString());
    }

    public boolean b(IOException iOException) {
        this.d = true;
        if (!this.c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z = iOException instanceof SSLHandshakeException;
        if ((z && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        if (z || (iOException instanceof SSLProtocolException) || (iOException instanceof SSLException)) {
            return true;
        }
        return false;
    }
}
