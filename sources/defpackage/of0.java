package defpackage;

import android.content.Context;
import com.spotify.mobile.android.service.o;
import com.spotify.music.C0707R;
import java.lang.ref.WeakReference;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* renamed from: of0  reason: default package */
public class of0 implements mf0 {
    private final o a;
    private PublicKey b;
    private final WeakReference<Context> c;

    public of0(Context context, o oVar) {
        this.b = ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(context.getResources().openRawResource(C0707R.raw.certificate))).getPublicKey();
        this.c = new WeakReference<>(context);
        this.a = oVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0101 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0102  */
    @Override // defpackage.mf0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.google.common.base.Optional<java.lang.Long> r13, android.net.Uri r14) {
        /*
        // Method dump skipped, instructions count: 282
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.of0.a(com.google.common.base.Optional, android.net.Uri):void");
    }
}
