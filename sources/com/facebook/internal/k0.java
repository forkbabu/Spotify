package com.facebook.internal;

import com.facebook.FacebookException;
import com.facebook.FacebookGraphResponseException;
import com.facebook.FacebookRequestError;
import com.facebook.internal.i0;
import com.facebook.m;
import com.facebook.q;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class k0 implements m.c {
    final /* synthetic */ String[] a;
    final /* synthetic */ int b;
    final /* synthetic */ CountDownLatch c;
    final /* synthetic */ i0.g d;

    k0(i0.g gVar, String[] strArr, int i, CountDownLatch countDownLatch) {
        this.d = gVar;
        this.a = strArr;
        this.b = i;
        this.c = countDownLatch;
    }

    @Override // com.facebook.m.c
    public void b(q qVar) {
        try {
            FacebookRequestError e = qVar.e();
            String str = "Error staging photo.";
            if (e != null) {
                String c2 = e.c();
                if (c2 != null) {
                    str = c2;
                }
                throw new FacebookGraphResponseException(qVar, str);
            }
            JSONObject f = qVar.f();
            if (f != null) {
                String optString = f.optString("uri");
                if (optString != null) {
                    this.a[this.b] = optString;
                    this.c.countDown();
                    return;
                }
                throw new FacebookException(str);
            }
            throw new FacebookException(str);
        } catch (Exception e2) {
            this.d.c[this.b] = e2;
        }
    }
}
