package defpackage;

import android.os.Build;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.util.Assertion;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.TlsVersion;
import okhttp3.k;
import okhttp3.y;

/* renamed from: sm0  reason: default package */
public class sm0 {
    private X509TrustManager a;
    private SSLSocketFactory b;
    private List<k> c;

    /* access modifiers changed from: private */
    /* renamed from: sm0$b */
    public static class b {
        static final sm0 a = new sm0(null);
    }

    sm0(a aVar) {
        try {
            if (Build.VERSION.SDK_INT <= 19) {
                try {
                    TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                    instance.init((KeyStore) null);
                    TrustManager[] trustManagers = instance.getTrustManagers();
                    if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
                        throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
                    }
                    this.a = (X509TrustManager) trustManagers[0];
                    TlsVersion tlsVersion = TlsVersion.TLS_1_2;
                    SSLContext instance2 = SSLContext.getInstance(tlsVersion.g());
                    instance2.init(null, new TrustManager[]{this.a}, null);
                    this.b = new tm0(instance2.getSocketFactory());
                    k.a aVar2 = new k.a(k.g);
                    aVar2.f(tlsVersion);
                    this.c = Arrays.asList(aVar2.a(), k.h, k.i);
                } catch (GeneralSecurityException e) {
                    Assertion.i("Failed to enable TLS 1.2.", e);
                }
            }
        } catch (Exception e2) {
            Logger.e(e2, "Unexpected problem on applying TLS patch.", new Object[0]);
        }
    }

    public static sm0 a() {
        return b.a;
    }

    public y.b b(y.b bVar) {
        X509TrustManager x509TrustManager;
        SSLSocketFactory sSLSocketFactory = this.b;
        if (!(sSLSocketFactory == null || (x509TrustManager = this.a) == null || this.c == null)) {
            bVar.l(sSLSocketFactory, x509TrustManager);
            bVar.g(this.c);
        }
        return bVar;
    }
}
