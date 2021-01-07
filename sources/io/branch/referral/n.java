package io.branch.referral;

import android.content.Context;
import io.branch.referral.g0;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class n extends e<Void, Void, Void> {
    private WeakReference<Context> a;
    private final g0.a b;

    n(Context context, g0.a aVar) {
        this.a = new WeakReference<>(context);
        this.b = aVar;
    }

    /* access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new m(this, countDownLatch)).start();
        try {
            countDownLatch.await(1500, TimeUnit.MILLISECONDS);
            return null;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onPostExecute(Object obj) {
        super.onPostExecute((Void) obj);
        g0.a aVar = this.b;
        if (aVar != null) {
            ((Branch) aVar).R();
        }
    }
}
