package io.netty.handler.ssl;

import io.netty.buffer.j;
import io.netty.buffer.j0;
import io.netty.buffer.k;
import io.netty.handler.ssl.ApplicationProtocolConfig;
import io.netty.handler.ssl.f0;
import io.netty.util.ResourceLeakDetector;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.e;
import io.netty.util.internal.logging.c;
import io.netty.util.o;
import io.netty.util.p;
import io.netty.util.q;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import java.security.AlgorithmConstraints;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionBindingEvent;
import javax.net.ssl.SSLSessionBindingListener;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;
import org.apache.tomcat.jni.Buffer;
import org.apache.tomcat.jni.SSL;

public class ReferenceCountedOpenSslEngine extends SSLEngine implements o {
    private static final io.netty.util.internal.logging.b K = c.b(ReferenceCountedOpenSslEngine.class.getName());
    private static final SSLException L;
    private static final SSLException M;
    private static final SSLException N;
    private static final SSLException O;
    private static final Class<?> P;
    private static final Method Q;
    private static final Method R;
    private static final Method S;
    private static final Method T;
    private static final Method U;
    private static final ResourceLeakDetector<ReferenceCountedOpenSslEngine> V = q.b().c(ReferenceCountedOpenSslEngine.class, 128, Long.MAX_VALUE);
    private static final AtomicIntegerFieldUpdater<ReferenceCountedOpenSslEngine> W;
    private static final long X = Buffer.address(j0.b.O0());
    private static final SSLEngineResult Y = new SSLEngineResult(SSLEngineResult.Status.OK, SSLEngineResult.HandshakeStatus.NEED_UNWRAP, 0, 0);
    private static final SSLEngineResult Z = new SSLEngineResult(SSLEngineResult.Status.CLOSED, SSLEngineResult.HandshakeStatus.NEED_UNWRAP, 0, 0);
    private static final SSLEngineResult a0 = new SSLEngineResult(SSLEngineResult.Status.OK, SSLEngineResult.HandshakeStatus.NEED_WRAP, 0, 0);
    private static final SSLEngineResult b0 = new SSLEngineResult(SSLEngineResult.Status.CLOSED, SSLEngineResult.HandshakeStatus.NEED_WRAP, 0, 0);
    private static final SSLEngineResult c0 = new SSLEngineResult(SSLEngineResult.Status.CLOSED, SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING, 0, 0);
    private final k A;
    private final x B;
    private final s C;
    private final boolean D;
    private final b E;
    private final Certificate[] F;
    private final ByteBuffer[] G;
    private final ByteBuffer[] H;
    private final a0 I;
    SSLHandshakeException J;
    private long a;
    private long b;
    private boolean c;
    private HandshakeState f = HandshakeState.NOT_STARTED;
    private boolean n;
    private volatile int o;
    private final p p;
    private final io.netty.util.b q = new a();
    private volatile ClientAuth r;
    private volatile long s;
    private String t;
    private Object u;
    private List<?> v;
    private boolean w;
    private boolean x;
    private boolean y;
    private final boolean z;

    /* access modifiers changed from: private */
    public enum HandshakeState {
        NOT_STARTED,
        STARTED_IMPLICITLY,
        STARTED_EXPLICITLY,
        FINISHED
    }

    class a extends io.netty.util.b {
        a() {
        }

        /* access modifiers changed from: protected */
        @Override // io.netty.util.b
        public void a() {
            ReferenceCountedOpenSslEngine.this.H();
            if (ReferenceCountedOpenSslEngine.this.p != null) {
                ReferenceCountedOpenSslEngine.this.p.close();
            }
        }

        @Override // io.netty.util.o
        public o z(Object obj) {
            if (ReferenceCountedOpenSslEngine.this.p != null) {
                ReferenceCountedOpenSslEngine.this.p.a(obj);
            }
            return ReferenceCountedOpenSslEngine.this;
        }
    }

    /* access modifiers changed from: private */
    public final class b implements SSLSession {
        private final b0 a;
        private X509Certificate[] b;
        private String c;
        private Certificate[] d;
        private String e;
        private byte[] f;
        private long g;
        private Map<String, Object> h;

        b(b0 b0Var) {
            this.a = b0Var;
        }

        private void b() {
            byte[][] peerCertChain = SSL.getPeerCertChain(ReferenceCountedOpenSslEngine.this.a);
            byte[] peerCertificate = !ReferenceCountedOpenSslEngine.this.z ? SSL.getPeerCertificate(ReferenceCountedOpenSslEngine.this.a) : null;
            int i2 = 0;
            if (peerCertChain == null || peerCertChain.length == 0) {
                if (peerCertificate == null || peerCertificate.length == 0) {
                    this.d = io.netty.util.internal.c.f;
                    this.b = io.netty.util.internal.c.g;
                    return;
                }
                Certificate[] certificateArr = new Certificate[1];
                this.d = certificateArr;
                this.b = new X509Certificate[1];
                certificateArr[0] = new OpenSslX509Certificate(peerCertificate);
                this.b[0] = new z(peerCertificate);
            } else if (peerCertificate == null || peerCertificate.length == 0) {
                this.d = new Certificate[peerCertChain.length];
                this.b = new X509Certificate[peerCertChain.length];
                while (i2 < peerCertChain.length) {
                    byte[] bArr = peerCertChain[i2];
                    this.d[i2] = new OpenSslX509Certificate(bArr);
                    this.b[i2] = new z(bArr);
                    i2++;
                }
            } else {
                int length = peerCertificate.length + 1;
                Certificate[] certificateArr2 = new Certificate[length];
                this.d = certificateArr2;
                this.b = new X509Certificate[length];
                certificateArr2[0] = new OpenSslX509Certificate(peerCertificate);
                this.b[0] = new z(peerCertificate);
                int i3 = 1;
                while (i2 < peerCertChain.length) {
                    byte[] bArr2 = peerCertChain[i2];
                    this.d[i3] = new OpenSslX509Certificate(bArr2);
                    this.b[i3] = new z(bArr2);
                    i2++;
                    i3++;
                }
            }
        }

        private String c(List<String> list, ApplicationProtocolConfig.SelectedListenerFailureBehavior selectedListenerFailureBehavior, String str) {
            if (selectedListenerFailureBehavior == ApplicationProtocolConfig.SelectedListenerFailureBehavior.ACCEPT) {
                return str;
            }
            int size = list.size();
            if (list.contains(str)) {
                return str;
            }
            if (selectedListenerFailureBehavior == ApplicationProtocolConfig.SelectedListenerFailureBehavior.CHOOSE_MY_LAST_PROTOCOL) {
                return list.get(size - 1);
            }
            throw new SSLException(je.x0("unknown protocol ", str));
        }

        private void d() {
            ApplicationProtocolConfig.SelectedListenerFailureBehavior e2 = ReferenceCountedOpenSslEngine.this.C.e();
            List<String> c2 = ReferenceCountedOpenSslEngine.this.C.c();
            int ordinal = ReferenceCountedOpenSslEngine.this.C.b().ordinal();
            if (ordinal == 0) {
                return;
            }
            if (ordinal == 1) {
                String nextProtoNegotiated = SSL.getNextProtoNegotiated(ReferenceCountedOpenSslEngine.this.a);
                if (nextProtoNegotiated != null) {
                    c(c2, e2, nextProtoNegotiated);
                }
            } else if (ordinal == 2) {
                String alpnSelected = SSL.getAlpnSelected(ReferenceCountedOpenSslEngine.this.a);
                if (alpnSelected != null) {
                    c(c2, e2, alpnSelected);
                }
            } else if (ordinal == 3) {
                String alpnSelected2 = SSL.getAlpnSelected(ReferenceCountedOpenSslEngine.this.a);
                if (alpnSelected2 == null) {
                    alpnSelected2 = SSL.getNextProtoNegotiated(ReferenceCountedOpenSslEngine.this.a);
                }
                if (alpnSelected2 != null) {
                    c(c2, e2, alpnSelected2);
                }
            } else {
                throw new Error();
            }
        }

        /* access modifiers changed from: package-private */
        public void a() {
            synchronized (ReferenceCountedOpenSslEngine.this) {
                if (!ReferenceCountedOpenSslEngine.this.s()) {
                    this.f = SSL.getSessionId(ReferenceCountedOpenSslEngine.this.a);
                    ReferenceCountedOpenSslEngine referenceCountedOpenSslEngine = ReferenceCountedOpenSslEngine.this;
                    this.e = referenceCountedOpenSslEngine.M(SSL.getCipherForSSL(referenceCountedOpenSslEngine.a));
                    this.c = SSL.getVersion(ReferenceCountedOpenSslEngine.this.a);
                    b();
                    d();
                    ReferenceCountedOpenSslEngine.this.f = HandshakeState.FINISHED;
                } else {
                    throw new SSLException("Already closed");
                }
            }
        }

        @Override // javax.net.ssl.SSLSession
        public int getApplicationBufferSize() {
            return 16384;
        }

        @Override // javax.net.ssl.SSLSession
        public String getCipherSuite() {
            synchronized (ReferenceCountedOpenSslEngine.this) {
                String str = this.e;
                if (str == null) {
                    return "SSL_NULL_WITH_NULL_NULL";
                }
                return str;
            }
        }

        @Override // javax.net.ssl.SSLSession
        public long getCreationTime() {
            synchronized (ReferenceCountedOpenSslEngine.this) {
                if (this.g == 0 && !ReferenceCountedOpenSslEngine.this.s()) {
                    this.g = SSL.getTime(ReferenceCountedOpenSslEngine.this.a) * 1000;
                }
            }
            return this.g;
        }

        @Override // javax.net.ssl.SSLSession
        public byte[] getId() {
            synchronized (ReferenceCountedOpenSslEngine.this) {
                byte[] bArr = this.f;
                if (bArr == null) {
                    return io.netty.util.internal.c.a;
                }
                return (byte[]) bArr.clone();
            }
        }

        @Override // javax.net.ssl.SSLSession
        public long getLastAccessedTime() {
            long j = ReferenceCountedOpenSslEngine.this.s;
            return j == -1 ? getCreationTime() : j;
        }

        @Override // javax.net.ssl.SSLSession
        public Certificate[] getLocalCertificates() {
            if (ReferenceCountedOpenSslEngine.this.F == null) {
                return null;
            }
            return (Certificate[]) ReferenceCountedOpenSslEngine.this.F.clone();
        }

        @Override // javax.net.ssl.SSLSession
        public Principal getLocalPrincipal() {
            Certificate[] certificateArr = ReferenceCountedOpenSslEngine.this.F;
            if (certificateArr == null || certificateArr.length == 0) {
                return null;
            }
            return ((java.security.cert.X509Certificate) certificateArr[0]).getIssuerX500Principal();
        }

        @Override // javax.net.ssl.SSLSession
        public int getPacketBufferSize() {
            return 18713;
        }

        @Override // javax.net.ssl.SSLSession
        public X509Certificate[] getPeerCertificateChain() {
            X509Certificate[] x509CertificateArr;
            synchronized (ReferenceCountedOpenSslEngine.this) {
                X509Certificate[] x509CertificateArr2 = this.b;
                if (x509CertificateArr2 == null || x509CertificateArr2.length == 0) {
                    throw new SSLPeerUnverifiedException("peer not verified");
                }
                x509CertificateArr = (X509Certificate[]) x509CertificateArr2.clone();
            }
            return x509CertificateArr;
        }

        @Override // javax.net.ssl.SSLSession
        public Certificate[] getPeerCertificates() {
            Certificate[] certificateArr;
            synchronized (ReferenceCountedOpenSslEngine.this) {
                Certificate[] certificateArr2 = this.d;
                if (certificateArr2 == null || certificateArr2.length == 0) {
                    throw new SSLPeerUnverifiedException("peer not verified");
                }
                certificateArr = (Certificate[]) certificateArr2.clone();
            }
            return certificateArr;
        }

        @Override // javax.net.ssl.SSLSession
        public String getPeerHost() {
            return ReferenceCountedOpenSslEngine.this.getPeerHost();
        }

        @Override // javax.net.ssl.SSLSession
        public int getPeerPort() {
            return ReferenceCountedOpenSslEngine.this.getPeerPort();
        }

        @Override // javax.net.ssl.SSLSession
        public Principal getPeerPrincipal() {
            return ((java.security.cert.X509Certificate) getPeerCertificates()[0]).getSubjectX500Principal();
        }

        @Override // javax.net.ssl.SSLSession
        public String getProtocol() {
            String str = this.c;
            if (str == null) {
                synchronized (ReferenceCountedOpenSslEngine.this) {
                    str = !ReferenceCountedOpenSslEngine.this.s() ? SSL.getVersion(ReferenceCountedOpenSslEngine.this.a) : "";
                }
            }
            return str;
        }

        @Override // javax.net.ssl.SSLSession
        public SSLSessionContext getSessionContext() {
            return this.a;
        }

        @Override // javax.net.ssl.SSLSession
        public Object getValue(String str) {
            if (str != null) {
                Map<String, Object> map = this.h;
                if (map == null) {
                    return null;
                }
                return map.get(str);
            }
            throw new NullPointerException("name");
        }

        @Override // javax.net.ssl.SSLSession
        public String[] getValueNames() {
            Map<String, Object> map = this.h;
            if (map == null || map.isEmpty()) {
                return io.netty.util.internal.c.e;
            }
            return (String[]) map.keySet().toArray(new String[map.size()]);
        }

        @Override // javax.net.ssl.SSLSession
        public void invalidate() {
            synchronized (ReferenceCountedOpenSslEngine.this) {
                if (!ReferenceCountedOpenSslEngine.this.s()) {
                    SSL.setTimeout(ReferenceCountedOpenSslEngine.this.a, 0);
                }
            }
        }

        @Override // javax.net.ssl.SSLSession
        public boolean isValid() {
            synchronized (ReferenceCountedOpenSslEngine.this) {
                boolean z = false;
                if (ReferenceCountedOpenSslEngine.this.s()) {
                    return false;
                }
                if (System.currentTimeMillis() - (SSL.getTimeout(ReferenceCountedOpenSslEngine.this.a) * 1000) < SSL.getTime(ReferenceCountedOpenSslEngine.this.a) * 1000) {
                    z = true;
                }
                return z;
            }
        }

        @Override // javax.net.ssl.SSLSession
        public void putValue(String str, Object obj) {
            if (str == null) {
                throw new NullPointerException("name");
            } else if (obj != null) {
                Map map = this.h;
                if (map == null) {
                    map = new HashMap(2);
                    this.h = map;
                }
                Object put = map.put(str, obj);
                if (obj instanceof SSLSessionBindingListener) {
                    ((SSLSessionBindingListener) obj).valueBound(new SSLSessionBindingEvent(this, str));
                }
                if (put instanceof SSLSessionBindingListener) {
                    ((SSLSessionBindingListener) put).valueUnbound(new SSLSessionBindingEvent(this, str));
                }
            } else {
                throw new NullPointerException("value");
            }
        }

        @Override // javax.net.ssl.SSLSession
        public void removeValue(String str) {
            if (str != null) {
                Map<String, Object> map = this.h;
                if (map != null) {
                    Object remove = map.remove(str);
                    if (remove instanceof SSLSessionBindingListener) {
                        ((SSLSessionBindingListener) remove).valueUnbound(new SSLSessionBindingEvent(this, str));
                        return;
                    }
                    return;
                }
                return;
            }
            throw new NullPointerException("name");
        }
    }

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Class<?> cls;
        Method method5;
        int i = c.b;
        SSLException sSLException = new SSLException("engine closed");
        yif.Z(sSLException, ReferenceCountedOpenSslEngine.class, "beginHandshake()");
        L = sSLException;
        SSLException sSLException2 = new SSLException("engine closed");
        yif.Z(sSLException2, ReferenceCountedOpenSslEngine.class, "handshake()");
        M = sSLException2;
        SSLException sSLException3 = new SSLException("renegotiation unsupported");
        yif.Z(sSLException3, ReferenceCountedOpenSslEngine.class, "beginHandshake()");
        N = sSLException3;
        SSLException sSLException4 = new SSLException("encrypted packet oversized");
        yif.Z(sSLException4, ReferenceCountedOpenSslEngine.class, "unwrap(...)");
        O = sSLException4;
        AtomicIntegerFieldUpdater<ReferenceCountedOpenSslEngine> M2 = PlatformDependent.M(ReferenceCountedOpenSslEngine.class, "destroyed");
        if (M2 == null) {
            M2 = AtomicIntegerFieldUpdater.newUpdater(ReferenceCountedOpenSslEngine.class, "o");
        }
        W = M2;
        Method method6 = null;
        if (PlatformDependent.J() >= 8) {
            try {
                method5 = SSLParameters.class.getDeclaredMethod("getUseCipherSuitesOrder", new Class[0]);
                SSLParameters sSLParameters = new SSLParameters();
                Boolean bool = (Boolean) method5.invoke(sSLParameters, new Object[0]);
                method4 = SSLParameters.class.getDeclaredMethod("setUseCipherSuitesOrder", Boolean.TYPE);
                method4.invoke(sSLParameters, Boolean.TRUE);
            } catch (Throwable unused) {
                method5 = null;
                method4 = null;
            }
            try {
                cls = Class.forName("javax.net.ssl.SNIHostName", false, PlatformDependent.o(ReferenceCountedOpenSslEngine.class));
                Object newInstance = cls.getConstructor(String.class).newInstance("netty.io");
                method2 = cls.getDeclaredMethod("getAsciiName", new Class[0]);
                String str = (String) method2.invoke(newInstance, new Object[0]);
                method3 = SSLParameters.class.getDeclaredMethod("getServerNames", new Class[0]);
                method = SSLParameters.class.getDeclaredMethod("setServerNames", List.class);
                SSLParameters sSLParameters2 = new SSLParameters();
                List list = (List) method3.invoke(sSLParameters2, new Object[0]);
                method.invoke(sSLParameters2, Collections.emptyList());
            } catch (Throwable unused2) {
                cls = null;
                method3 = null;
                method2 = null;
                method = null;
            }
            method6 = method5;
        } else {
            cls = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        T = method6;
        U = method4;
        P = cls;
        S = method2;
        Q = method3;
        R = method;
    }

    ReferenceCountedOpenSslEngine(f0 f0Var, k kVar, String str, int i, boolean z2) {
        super(str, i);
        ClientAuth clientAuth = ClientAuth.NONE;
        this.r = clientAuth;
        this.s = -1;
        this.G = new ByteBuffer[1];
        this.H = new ByteBuffer[1];
        q.b();
        this.p = z2 ? V.i(this) : null;
        if (kVar != null) {
            this.A = kVar;
            this.C = (s) f0Var.m();
            this.a = SSL.newSSL(f0Var.c, !f0Var.c());
            this.E = new b(f0Var.w());
            this.b = SSL.makeNetworkBIO(this.a);
            boolean c2 = f0Var.c();
            this.z = c2;
            this.B = f0Var.u;
            this.D = f0Var.v;
            this.F = f0Var.s;
            G(!c2 ? f0Var.t : clientAuth);
            if (c2 && str != null) {
                SSL.setTlsExtHostName(this.a, str);
            }
            this.I = f0Var.s();
            return;
        }
        throw new NullPointerException("alloc");
    }

    private static SSLEngineResult.HandshakeStatus A(int i) {
        return i > 0 ? SSLEngineResult.HandshakeStatus.NEED_WRAP : SSLEngineResult.HandshakeStatus.NEED_UNWRAP;
    }

    private int B(ByteBuffer byteBuffer, int i) {
        int i2;
        if (!byteBuffer.isDirect() || byteBuffer.remaining() < i) {
            j h = this.A.h(i);
            try {
                i2 = SSL.readFromBIO(this.b, q.g(h), i);
                if (i2 > 0) {
                    int limit = byteBuffer.limit();
                    byteBuffer.limit(byteBuffer.position() + i2);
                    h.h0(0, byteBuffer);
                    byteBuffer.limit(limit);
                    return i2;
                }
                h.d();
            } finally {
                h.d();
            }
        } else {
            int position = byteBuffer.position();
            i2 = SSL.readFromBIO(this.b, Buffer.address(byteBuffer) + ((long) position), i);
            if (i2 > 0) {
                byteBuffer.position(position + i2);
                return i2;
            }
        }
        return i2;
    }

    private SSLEngineResult C(ByteBuffer byteBuffer, int i, int i2, SSLEngineResult.HandshakeStatus handshakeStatus) {
        int pendingWrittenBytesInBIO = SSL.pendingWrittenBytesInBIO(this.b);
        if (pendingWrittenBytesInBIO <= 0) {
            return null;
        }
        if (byteBuffer.remaining() < pendingWrittenBytesInBIO) {
            SSLEngineResult.Status status = SSLEngineResult.Status.BUFFER_OVERFLOW;
            if (handshakeStatus != SSLEngineResult.HandshakeStatus.FINISHED) {
                handshakeStatus = v() ? A(pendingWrittenBytesInBIO) : SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
            }
            return new SSLEngineResult(status, t(handshakeStatus), i, i2);
        }
        int B2 = B(byteBuffer, pendingWrittenBytesInBIO);
        if (B2 <= 0) {
            SSL.clearError();
        } else {
            i2 += B2;
            pendingWrittenBytesInBIO -= B2;
        }
        if (this.x) {
            H();
        }
        SSLEngineResult.Status q2 = q();
        if (handshakeStatus != SSLEngineResult.HandshakeStatus.FINISHED) {
            handshakeStatus = v() ? A(pendingWrittenBytesInBIO) : SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
        }
        return new SSLEngineResult(q2, t(handshakeStatus), i, i2);
    }

    private int D(ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            int position = byteBuffer.position();
            int readFromSSL = SSL.readFromSSL(this.a, Buffer.address(byteBuffer) + ((long) position), byteBuffer.limit() - position);
            if (readFromSSL <= 0) {
                return readFromSSL;
            }
            byteBuffer.position(position + readFromSSL);
            return readFromSSL;
        }
        int position2 = byteBuffer.position();
        int limit = byteBuffer.limit();
        int min = Math.min(18713, limit - position2);
        j h = this.A.h(min);
        try {
            int readFromSSL2 = SSL.readFromSSL(this.a, q.g(h), min);
            if (readFromSSL2 > 0) {
                byteBuffer.limit(position2 + readFromSSL2);
                h.h0(0, byteBuffer);
                byteBuffer.limit(limit);
            }
            return readFromSSL2;
        } finally {
            h.d();
        }
    }

    private void E() {
        if (this.D && SSL.getHandshakeCount(this.a) > 1) {
            H();
            throw new SSLHandshakeException("remote-initiated renegotation not allowed");
        }
    }

    private void F() {
        this.G[0] = null;
    }

    private void G(ClientAuth clientAuth) {
        if (!this.z) {
            synchronized (this) {
                if (this.r != clientAuth) {
                    int ordinal = clientAuth.ordinal();
                    if (ordinal == 0) {
                        SSL.setVerify(this.a, 0, 10);
                    } else if (ordinal == 1) {
                        SSL.setVerify(this.a, 1, 10);
                    } else if (ordinal == 2) {
                        SSL.setVerify(this.a, 2, 10);
                    } else {
                        throw new Error(clientAuth.toString());
                    }
                    this.r = clientAuth;
                }
            }
        }
    }

    private SSLException I(String str) {
        return J(str, SSL.getLastError());
    }

    private SSLException J(String str, String str2) {
        io.netty.util.internal.logging.b bVar = K;
        if (bVar.c()) {
            bVar.b("{} failed: OpenSSL error: {}", str, str2);
        }
        H();
        if (this.f == HandshakeState.FINISHED) {
            return new SSLException(str2);
        }
        return new SSLHandshakeException(str2);
    }

    private SSLEngineResult L(int i, int i2, int i3) {
        String errorString = SSL.getErrorString((long) i);
        if (SSL.pendingWrittenBytesInBIO(this.b) > 0) {
            if (this.J == null && this.f != HandshakeState.FINISHED) {
                this.J = new SSLHandshakeException(errorString);
            }
            return new SSLEngineResult(SSLEngineResult.Status.OK, SSLEngineResult.HandshakeStatus.NEED_WRAP, i2, i3);
        }
        throw J("SSL_read", errorString);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private String M(String str) {
        if (str == null) {
            return null;
        }
        String version = SSL.getVersion(this.a);
        char c2 = 0;
        if (!(version == null || version.length() == 0)) {
            c2 = version.charAt(0);
        }
        return c.a(str, c2 != 'S' ? c2 != 'T' ? "UNKNOWN" : "TLS" : "SSL");
    }

    private int P(ByteBuffer byteBuffer) {
        int i;
        int position = byteBuffer.position();
        int remaining = byteBuffer.remaining();
        if (byteBuffer.isDirect()) {
            i = SSL.writeToBIO(this.b, Buffer.address(byteBuffer) + ((long) position), remaining);
            if (i >= 0) {
                byteBuffer.position(position + i);
            }
        } else {
            j h = this.A.h(remaining);
            try {
                long g = q.g(h);
                h.z1(0, byteBuffer);
                i = SSL.writeToBIO(this.b, g, remaining);
                if (i >= 0) {
                    byteBuffer.position(position + i);
                } else {
                    byteBuffer.position(position);
                }
            } finally {
                h.d();
            }
        }
        return i;
    }

    private int Q(ByteBuffer byteBuffer) {
        int i;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int min = Math.min(limit - position, 16384);
        if (byteBuffer.isDirect()) {
            i = SSL.writeToSSL(this.a, Buffer.address(byteBuffer) + ((long) position), min);
            if (i > 0) {
                byteBuffer.position(position + i);
            }
        } else {
            j h = this.A.h(min);
            try {
                long g = q.g(h);
                byteBuffer.limit(position + min);
                h.z1(0, byteBuffer);
                byteBuffer.limit(limit);
                i = SSL.writeToSSL(this.a, g, min);
                if (i > 0) {
                    byteBuffer.position(position + i);
                } else {
                    byteBuffer.position(position);
                }
            } finally {
                h.d();
            }
        }
        return i;
    }

    private void p() {
        this.n = true;
        closeOutbound();
        closeInbound();
    }

    private SSLEngineResult.Status q() {
        return this.y ? SSLEngineResult.Status.CLOSED : SSLEngineResult.Status.OK;
    }

    private SSLEngineResult.HandshakeStatus r() {
        a0 a0Var;
        if (this.f == HandshakeState.FINISHED) {
            return SSLEngineResult.HandshakeStatus.FINISHED;
        }
        SSLException sSLException = M;
        if (this.y || s()) {
            throw sSLException;
        }
        SSLHandshakeException sSLHandshakeException = this.J;
        if (sSLHandshakeException == null) {
            ((f0.f) this.B).a(this);
            if (this.s == -1) {
                this.s = System.currentTimeMillis();
            }
            if (!this.c && (a0Var = this.I) != null) {
                this.c = true;
                a0Var.c(this);
            }
            int doHandshake = SSL.doHandshake(this.a);
            if (doHandshake <= 0) {
                SSLHandshakeException sSLHandshakeException2 = this.J;
                if (sSLHandshakeException2 == null) {
                    int error = SSL.getError(this.a, doHandshake);
                    if (error == 2 || error == 3) {
                        return A(SSL.pendingWrittenBytesInBIO(this.b));
                    }
                    throw I("SSL_do_handshake");
                }
                this.J = null;
                H();
                throw sSLHandshakeException2;
            }
            this.E.a();
            ((f0.f) this.B).b(this.a);
            return SSLEngineResult.HandshakeStatus.FINISHED;
        } else if (SSL.pendingWrittenBytesInBIO(this.b) > 0) {
            return SSLEngineResult.HandshakeStatus.NEED_WRAP;
        } else {
            this.J = null;
            H();
            throw sSLHandshakeException;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean s() {
        return this.o != 0;
    }

    private SSLEngineResult.HandshakeStatus t(SSLEngineResult.HandshakeStatus handshakeStatus) {
        return (handshakeStatus != SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING || this.f == HandshakeState.FINISHED) ? handshakeStatus : r();
    }

    private boolean v() {
        return this.f != HandshakeState.NOT_STARTED && !s() && (this.f != HandshakeState.FINISHED || this.y);
    }

    private SSLEngineResult w(int i, int i2, SSLEngineResult.HandshakeStatus handshakeStatus) {
        SSLEngineResult.Status q2 = q();
        if (handshakeStatus != SSLEngineResult.HandshakeStatus.FINISHED) {
            handshakeStatus = getHandshakeStatus();
        }
        return new SSLEngineResult(q2, t(handshakeStatus), i, i2);
    }

    private int y() {
        if (this.f == HandshakeState.FINISHED) {
            return SSL.pendingReadableBytesInSSL(this.a);
        }
        return 0;
    }

    public final synchronized void H() {
        if (W.compareAndSet(this, 0, 1)) {
            ((f0.f) this.B).b(this.a);
            SSL.freeSSL(this.a);
            SSL.freeBIO(this.b);
            this.b = 0;
            this.a = 0;
            this.y = true;
            this.x = true;
            this.w = true;
        }
        SSL.clearError();
    }

    public final synchronized long K() {
        return this.a;
    }

    public final SSLEngineResult N(ByteBuffer[] byteBufferArr, int i, int i2, ByteBuffer[] byteBufferArr2, int i3, int i4) {
        int i5;
        int i6;
        if (byteBufferArr == null) {
            throw new NullPointerException("srcs");
        } else if (i >= byteBufferArr.length || (i5 = i + i2) > byteBufferArr.length) {
            throw new IndexOutOfBoundsException(je.B0(je.X0("offset: ", i, ", length: ", i2, " (expected: offset <= offset + length <= srcs.length ("), byteBufferArr.length, "))"));
        } else if (byteBufferArr2 == null) {
            throw new IllegalArgumentException("dsts is null");
        } else if (i3 >= byteBufferArr2.length || (i6 = i3 + i4) > byteBufferArr2.length) {
            throw new IndexOutOfBoundsException(je.B0(je.X0("offset: ", i3, ", length: ", i4, " (expected: offset <= offset + length <= dsts.length ("), byteBufferArr2.length, "))"));
        } else {
            long j = 0;
            for (int i7 = i3; i7 < i6; i7++) {
                ByteBuffer byteBuffer = byteBufferArr2[i7];
                if (byteBuffer == null) {
                    throw new IllegalArgumentException(je.q0("dsts[", i7, "] is null"));
                } else if (!byteBuffer.isReadOnly()) {
                    j += (long) byteBuffer.remaining();
                } else {
                    throw new ReadOnlyBufferException();
                }
            }
            long j2 = 0;
            for (int i8 = i; i8 < i5; i8++) {
                ByteBuffer byteBuffer2 = byteBufferArr[i8];
                if (byteBuffer2 != null) {
                    j2 += (long) byteBuffer2.remaining();
                } else {
                    throw new IllegalArgumentException(je.q0("srcs[", i8, "] is null"));
                }
            }
            synchronized (this) {
                if (s()) {
                    return c0;
                }
                if (j2 <= 18713) {
                    SSLEngineResult.HandshakeStatus handshakeStatus = SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
                    HandshakeState handshakeState = this.f;
                    if (handshakeState != HandshakeState.FINISHED) {
                        if (handshakeState != HandshakeState.STARTED_EXPLICITLY) {
                            this.f = HandshakeState.STARTED_IMPLICITLY;
                        }
                        handshakeStatus = r();
                        if (handshakeStatus == SSLEngineResult.HandshakeStatus.NEED_WRAP) {
                            return a0;
                        }
                        if (this.y) {
                            return b0;
                        }
                    }
                    int i9 = 0;
                    int i10 = 0;
                    if (i < i5) {
                        while (true) {
                            ByteBuffer byteBuffer3 = byteBufferArr[i];
                            int remaining = byteBuffer3.remaining();
                            if (remaining != 0) {
                                int P2 = P(byteBuffer3);
                                if (P2 <= 0) {
                                    SSL.clearError();
                                    break;
                                }
                                i10 += P2;
                                if (P2 != remaining) {
                                    break;
                                }
                            }
                            i++;
                            if (i >= i5) {
                                break;
                            }
                        }
                    }
                    if (j > 0) {
                        while (i3 < i6) {
                            ByteBuffer byteBuffer4 = byteBufferArr2[i3];
                            if (byteBuffer4.hasRemaining()) {
                                int D2 = D(byteBuffer4);
                                E();
                                if (D2 > 0) {
                                    i9 += D2;
                                    if (byteBuffer4.hasRemaining()) {
                                        return w(i10, i9, handshakeStatus);
                                    }
                                } else {
                                    int error = SSL.getError(this.a, D2);
                                    if (!(error == 2 || error == 3)) {
                                        if (error != 6) {
                                            return L(SSL.getLastErrorNumber(), i10, i9);
                                        }
                                        if (!this.n) {
                                            p();
                                        }
                                    }
                                    return w(i10, i9, handshakeStatus);
                                }
                            }
                            i3++;
                        }
                    } else if (SSL.readFromSSL(this.a, X, 0) <= 0) {
                        int lastErrorNumber = SSL.getLastErrorNumber();
                        Set<String> set = q.c;
                        if (((long) lastErrorNumber) != 0) {
                            return L(lastErrorNumber, i10, 0);
                        }
                    }
                    if (y() > 0) {
                        SSLEngineResult.Status status = SSLEngineResult.Status.BUFFER_OVERFLOW;
                        if (handshakeStatus != SSLEngineResult.HandshakeStatus.FINISHED) {
                            handshakeStatus = getHandshakeStatus();
                        }
                        return new SSLEngineResult(status, t(handshakeStatus), i10, i9);
                    }
                    if (!this.n && (SSL.getShutdown(this.a) & 2) == 2) {
                        p();
                    }
                    return w(i10, i9, handshakeStatus);
                }
                this.w = true;
                this.x = true;
                this.y = true;
                H();
                throw O;
            }
        }
    }

    public final SSLEngineResult O(ByteBuffer[] byteBufferArr, ByteBuffer[] byteBufferArr2) {
        return N(byteBufferArr, 0, byteBufferArr.length, byteBufferArr2, 0, byteBufferArr2.length);
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized void beginHandshake() {
        HandshakeState handshakeState = HandshakeState.STARTED_EXPLICITLY;
        synchronized (this) {
            int ordinal = this.f.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    SSLException sSLException = L;
                    if (this.y || s()) {
                        throw sSLException;
                    }
                    this.f = handshakeState;
                } else if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new Error();
                    } else if (this.z) {
                        throw N;
                    } else if (SSL.renegotiate(this.a) == 1 && SSL.doHandshake(this.a) == 1) {
                        SSL.setState(this.a, 8192);
                        this.s = System.currentTimeMillis();
                    } else {
                        throw I("renegotiation failed");
                    }
                }
            }
            this.f = handshakeState;
            r();
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized void closeInbound() {
        if (!this.w) {
            this.w = true;
            this.y = true;
            H();
            if (this.f != HandshakeState.NOT_STARTED && !this.n) {
                throw new SSLException("Inbound closed before receiving peer's close_notify: possible truncation attack?");
            }
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized void closeOutbound() {
        int shutdownSSL;
        if (!this.x) {
            this.x = true;
            this.y = true;
            if (this.f != HandshakeState.NOT_STARTED && !s()) {
                if ((SSL.getShutdown(this.a) & 1) != 1 && (shutdownSSL = SSL.shutdownSSL(this.a)) < 0) {
                    switch (SSL.getError(this.a, shutdownSSL)) {
                        case 0:
                        case 2:
                        case 3:
                        case 4:
                        case 6:
                        case 7:
                        case 8:
                            break;
                        case 1:
                        case 5:
                            io.netty.util.internal.logging.b bVar = K;
                            if (bVar.c()) {
                                bVar.r("SSL_shutdown failed: OpenSSL error: {}", SSL.getLastError());
                            }
                            H();
                            break;
                        default:
                            SSL.clearError();
                            break;
                    }
                }
            } else {
                H();
            }
        }
    }

    @Override // io.netty.util.o
    public final boolean d() {
        return this.q.d();
    }

    @Override // javax.net.ssl.SSLEngine
    public final Runnable getDelegatedTask() {
        return null;
    }

    @Override // javax.net.ssl.SSLEngine
    public final boolean getEnableSessionCreation() {
        return false;
    }

    @Override // javax.net.ssl.SSLEngine
    public final String[] getEnabledCipherSuites() {
        String[] ciphers;
        String[] strArr = io.netty.util.internal.c.e;
        synchronized (this) {
            if (s()) {
                return strArr;
            }
            ciphers = SSL.getCiphers(this.a);
        }
        if (ciphers == null) {
            return strArr;
        }
        synchronized (this) {
            for (int i = 0; i < ciphers.length; i++) {
                String M2 = M(ciphers[i]);
                if (M2 != null) {
                    ciphers[i] = M2;
                }
            }
        }
        return ciphers;
    }

    @Override // javax.net.ssl.SSLEngine
    public final String[] getEnabledProtocols() {
        int options;
        e.e();
        ArrayList arrayList = new ArrayList(8);
        arrayList.add("SSLv2Hello");
        synchronized (this) {
            if (!s()) {
                options = SSL.getOptions(this.a);
            } else {
                return (String[]) arrayList.toArray(new String[1]);
            }
        }
        if ((67108864 & options) == 0) {
            arrayList.add("TLSv1");
        }
        if ((268435456 & options) == 0) {
            arrayList.add("TLSv1.1");
        }
        if ((134217728 & options) == 0) {
            arrayList.add("TLSv1.2");
        }
        if ((16777216 & options) == 0) {
            arrayList.add("SSLv2");
        }
        if ((options & 33554432) == 0) {
            arrayList.add("SSLv3");
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized SSLSession getHandshakeSession() {
        int ordinal = this.f.ordinal();
        if (ordinal == 0 || ordinal == 3) {
            return null;
        }
        return this.E;
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized SSLEngineResult.HandshakeStatus getHandshakeStatus() {
        return v() ? A(SSL.pendingWrittenBytesInBIO(this.b)) : SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
    }

    @Override // javax.net.ssl.SSLEngine
    public final boolean getNeedClientAuth() {
        return this.r == ClientAuth.REQUIRE;
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0059: APUT  
      (r4v1 java.lang.Object[])
      (0 ??[int, short, byte, char])
      (wrap: java.lang.Boolean : 0x0055: INVOKE  (r3v2 java.lang.Boolean) = (r3v1 boolean) type: STATIC call: java.lang.Boolean.valueOf(boolean):java.lang.Boolean)
     */
    @Override // javax.net.ssl.SSLEngine
    public final synchronized SSLParameters getSSLParameters() {
        SSLParameters sSLParameters;
        List<?> list;
        sSLParameters = super.getSSLParameters();
        int J2 = PlatformDependent.J();
        if (J2 >= 7) {
            sSLParameters.setEndpointIdentificationAlgorithm(this.t);
            sSLParameters.setAlgorithmConstraints((AlgorithmConstraints) this.u);
            if (J2 >= 8) {
                Method method = R;
                boolean z2 = true;
                if (!(method == null || (list = this.v) == null)) {
                    try {
                        method.invoke(sSLParameters, list);
                    } catch (IllegalAccessException e) {
                        throw new Error(e);
                    } catch (InvocationTargetException e2) {
                        throw new Error(e2);
                    }
                }
                Method method2 = U;
                if (method2 != null && !s()) {
                    try {
                        Object[] objArr = new Object[1];
                        if ((SSL.getOptions(this.a) & 4194304) == 0) {
                            z2 = false;
                        }
                        objArr[0] = Boolean.valueOf(z2);
                        method2.invoke(sSLParameters, objArr);
                    } catch (IllegalAccessException e3) {
                        throw new Error(e3);
                    } catch (InvocationTargetException e4) {
                        throw new Error(e4);
                    }
                }
            }
        }
        return sSLParameters;
    }

    @Override // javax.net.ssl.SSLEngine
    public final SSLSession getSession() {
        return this.E;
    }

    @Override // javax.net.ssl.SSLEngine
    public final String[] getSupportedCipherSuites() {
        Set<String> set = q.c;
        return (String[]) set.toArray(new String[set.size()]);
    }

    @Override // javax.net.ssl.SSLEngine
    public final String[] getSupportedProtocols() {
        Set<String> set = q.h;
        return (String[]) set.toArray(new String[set.size()]);
    }

    @Override // javax.net.ssl.SSLEngine
    public final boolean getUseClientMode() {
        return this.z;
    }

    @Override // javax.net.ssl.SSLEngine
    public final boolean getWantClientAuth() {
        return this.r == ClientAuth.OPTIONAL;
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized boolean isInboundDone() {
        return this.w || this.y;
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized boolean isOutboundDone() {
        return this.x;
    }

    @Override // io.netty.util.o
    public final int n() {
        return this.q.n();
    }

    @Override // javax.net.ssl.SSLEngine
    public final void setEnableSessionCreation(boolean z2) {
        if (z2) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public final void setEnabledCipherSuites(String[] strArr) {
        if (strArr != null) {
            StringBuilder sb = new StringBuilder();
            for (String str : strArr) {
                if (str == null) {
                    break;
                }
                String c2 = c.c(str);
                if (c2 == null) {
                    c2 = str;
                }
                if (q.e(c2)) {
                    sb.append(c2);
                    sb.append(':');
                } else {
                    throw new IllegalArgumentException("unsupported cipher suite: " + str + '(' + c2 + ')');
                }
            }
            if (sb.length() != 0) {
                sb.setLength(sb.length() - 1);
                String sb2 = sb.toString();
                synchronized (this) {
                    if (!s()) {
                        try {
                            SSL.setCipherSuites(this.a, sb2);
                        } catch (Exception e) {
                            throw new IllegalStateException("failed to enable cipher suites: " + sb2, e);
                        }
                    } else {
                        throw new IllegalStateException("failed to enable cipher suites: " + sb2);
                    }
                }
                return;
            }
            throw new IllegalArgumentException("empty cipher suites");
        }
        throw new NullPointerException("cipherSuites");
    }

    @Override // javax.net.ssl.SSLEngine
    public final void setEnabledProtocols(String[] strArr) {
        if (strArr != null) {
            int i = 0;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            for (String str : strArr) {
                if (q.h.contains(str)) {
                    if (str.equals("SSLv2")) {
                        z2 = true;
                    } else if (str.equals("SSLv3")) {
                        z3 = true;
                    } else if (str.equals("TLSv1")) {
                        z4 = true;
                    } else if (str.equals("TLSv1.1")) {
                        z5 = true;
                    } else if (str.equals("TLSv1.2")) {
                        z6 = true;
                    }
                } else {
                    throw new IllegalArgumentException(je.y0("Protocol ", str, " is not supported."));
                }
            }
            synchronized (this) {
                if (!s()) {
                    SSL.setOptions(this.a, 4095);
                    SSL.clearOptions(this.a, 520093696);
                    if (!z2) {
                        i = 16777216;
                    }
                    if (!z3) {
                        i |= 33554432;
                    }
                    if (!z4) {
                        i |= 67108864;
                    }
                    if (!z5) {
                        i |= 268435456;
                    }
                    if (!z6) {
                        i |= 134217728;
                    }
                    SSL.setOptions(this.a, i);
                } else {
                    throw new IllegalStateException("failed to enable protocols: " + Arrays.asList(strArr));
                }
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // javax.net.ssl.SSLEngine
    public final void setNeedClientAuth(boolean z2) {
        G(z2 ? ClientAuth.REQUIRE : ClientAuth.NONE);
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized void setSSLParameters(SSLParameters sSLParameters) {
        super.setSSLParameters(sSLParameters);
        int J2 = PlatformDependent.J();
        if (J2 >= 7) {
            this.t = sSLParameters.getEndpointIdentificationAlgorithm();
            this.u = sSLParameters.getAlgorithmConstraints();
            if (J2 >= 8) {
                if (P != null && this.z && !s()) {
                    try {
                        List<?> list = (List) Q.invoke(sSLParameters, new Object[0]);
                        if (list != null) {
                            for (Object obj : list) {
                                Class<?> cls = P;
                                if (cls.isInstance(obj)) {
                                    SSL.setTlsExtHostName(this.a, (String) S.invoke(obj, new Object[0]));
                                } else {
                                    throw new IllegalArgumentException("Only " + cls.getName() + " instances are supported, but found: " + obj);
                                }
                            }
                        }
                        this.v = list;
                    } catch (IllegalAccessException e) {
                        throw new Error(e);
                    } catch (InvocationTargetException e2) {
                        throw new Error(e2);
                    }
                }
                Method method = T;
                if (method != null && !s()) {
                    try {
                        if (((Boolean) method.invoke(sSLParameters, new Object[0])).booleanValue()) {
                            SSL.setOptions(this.a, 4194304);
                        } else {
                            SSL.clearOptions(this.a, 4194304);
                        }
                    } catch (IllegalAccessException e3) {
                        throw new Error(e3);
                    } catch (InvocationTargetException e4) {
                        throw new Error(e4);
                    }
                }
            }
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public final void setUseClientMode(boolean z2) {
        if (z2 != this.z) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // javax.net.ssl.SSLEngine
    public final void setWantClientAuth(boolean z2) {
        G(z2 ? ClientAuth.OPTIONAL : ClientAuth.NONE);
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        ByteBuffer[] byteBufferArr;
        ByteBuffer[] byteBufferArr2;
        try {
            byteBufferArr = this.G;
            byteBufferArr[0] = byteBuffer;
            byteBufferArr2 = this.H;
            byteBufferArr2[0] = byteBuffer2;
        } finally {
            F();
            this.H[0] = null;
        }
        return O(byteBufferArr, byteBufferArr2);
    }

    @Override // javax.net.ssl.SSLEngine
    public final SSLEngineResult wrap(ByteBuffer[] byteBufferArr, int i, int i2, ByteBuffer byteBuffer) {
        int i3;
        SSLEngineResult C2;
        if (byteBufferArr == null) {
            throw new IllegalArgumentException("srcs is null");
        } else if (byteBuffer == null) {
            throw new IllegalArgumentException("dst is null");
        } else if (i >= byteBufferArr.length || (i3 = i + i2) > byteBufferArr.length) {
            throw new IndexOutOfBoundsException(je.B0(je.X0("offset: ", i, ", length: ", i2, " (expected: offset <= offset + length <= srcs.length ("), byteBufferArr.length, "))"));
        } else if (!byteBuffer.isReadOnly()) {
            synchronized (this) {
                if (s()) {
                    return c0;
                }
                SSLEngineResult.HandshakeStatus handshakeStatus = SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
                HandshakeState handshakeState = this.f;
                if (handshakeState != HandshakeState.FINISHED) {
                    if (handshakeState != HandshakeState.STARTED_EXPLICITLY) {
                        this.f = HandshakeState.STARTED_IMPLICITLY;
                    }
                    handshakeStatus = r();
                    if (handshakeStatus == SSLEngineResult.HandshakeStatus.NEED_UNWRAP) {
                        return Y;
                    }
                    if (this.y) {
                        return Z;
                    }
                }
                int i4 = 0;
                int i5 = 0;
                while (i < i3) {
                    ByteBuffer byteBuffer2 = byteBufferArr[i];
                    if (byteBuffer2 != null) {
                        while (byteBuffer2.hasRemaining()) {
                            int Q2 = Q(byteBuffer2);
                            if (Q2 > 0) {
                                i4 += Q2;
                                SSLEngineResult C3 = C(byteBuffer, i4, i5, handshakeStatus);
                                if (C3 != null) {
                                    if (C3.getStatus() != SSLEngineResult.Status.OK) {
                                        return C3;
                                    }
                                    i5 = C3.bytesProduced();
                                }
                            } else {
                                int error = SSL.getError(this.a, Q2);
                                if (error == 2) {
                                    SSLEngineResult C4 = C(byteBuffer, i4, i5, handshakeStatus);
                                    if (C4 == null) {
                                        C4 = new SSLEngineResult(q(), SSLEngineResult.HandshakeStatus.NEED_UNWRAP, i4, i5);
                                    }
                                    return C4;
                                } else if (error == 3) {
                                    SSLEngineResult C5 = C(byteBuffer, i4, i5, handshakeStatus);
                                    if (C5 == null) {
                                        C5 = b0;
                                    }
                                    return C5;
                                } else if (error == 6) {
                                    if (!this.n) {
                                        p();
                                    }
                                    SSLEngineResult C6 = C(byteBuffer, i4, i5, handshakeStatus);
                                    if (C6 == null) {
                                        C6 = c0;
                                    }
                                    return C6;
                                } else {
                                    throw I("SSL_write");
                                }
                            }
                        }
                        i++;
                    } else {
                        throw new IllegalArgumentException("srcs[" + i + "] is null");
                    }
                }
                if (i4 != 0 || (C2 = C(byteBuffer, 0, i5, handshakeStatus)) == null) {
                    return w(i4, i5, handshakeStatus);
                }
                return C2;
            }
        } else {
            throw new ReadOnlyBufferException();
        }
    }

    @Override // io.netty.util.o
    public final o z(Object obj) {
        this.q.z(obj);
        return this;
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
        ByteBuffer[] byteBufferArr2;
        try {
            byteBufferArr2 = this.G;
            byteBufferArr2[0] = byteBuffer;
        } finally {
            F();
        }
        return O(byteBufferArr2, byteBufferArr);
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr, int i, int i2) {
        ByteBuffer[] byteBufferArr2;
        try {
            byteBufferArr2 = this.G;
            byteBufferArr2[0] = byteBuffer;
        } finally {
            F();
        }
        return N(byteBufferArr2, 0, 1, byteBufferArr, i, i2);
    }

    @Override // javax.net.ssl.SSLEngine
    public final synchronized SSLEngineResult wrap(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        ByteBuffer[] byteBufferArr;
        try {
            byteBufferArr = this.G;
            byteBufferArr[0] = byteBuffer;
        } finally {
            F();
        }
        return wrap(byteBufferArr, byteBuffer2);
    }
}
