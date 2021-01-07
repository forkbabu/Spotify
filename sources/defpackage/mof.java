package defpackage;

import android.net.ssl.SSLSockets;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import okhttp3.Protocol;

/* renamed from: mof  reason: default package */
class mof extends nof {
    mof(Class<?> cls) {
        super(cls, null, null, null, null);
    }

    @Override // defpackage.nof, defpackage.sof
    public void f(SSLSocket sSLSocket, String str, List<Protocol> list) {
        if (SSLSockets.isSupportedSocket(sSLSocket)) {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
        }
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        sSLParameters.setApplicationProtocols((String[]) ((ArrayList) sof.b(list)).toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // defpackage.nof, defpackage.sof
    public String j(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.isEmpty()) {
            return null;
        }
        return applicationProtocol;
    }
}
