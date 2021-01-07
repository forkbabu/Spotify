package com.facebook;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.net.HttpURLConnection;
import java.util.List;

public class o extends AsyncTask<Void, Void, List<q>> {
    private static final String d = o.class.getCanonicalName();
    private final HttpURLConnection a = null;
    private final p b;
    private Exception c;

    public o(p pVar) {
        this.b = pVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
    /* access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public List<q> doInBackground(Void[] voidArr) {
        if (uf.c(this)) {
            return null;
        }
        try {
            Void[] voidArr2 = voidArr;
            if (uf.c(this)) {
                return null;
            }
            try {
                HttpURLConnection httpURLConnection = this.a;
                if (httpURLConnection != null) {
                    return m.j(httpURLConnection, this.b);
                }
                p pVar = this.b;
                pVar.getClass();
                return m.i(pVar);
            } catch (Exception e) {
                this.c = e;
                return null;
            } catch (Throwable th) {
                uf.b(th, this);
                return null;
            }
        } catch (Throwable th2) {
            uf.b(th2, this);
            return null;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onPostExecute(List<q> list) {
        if (!uf.c(this)) {
            try {
                List<q> list2 = list;
                if (!uf.c(this)) {
                    try {
                        super.onPostExecute(list2);
                        Exception exc = this.c;
                        if (exc != null) {
                            String.format("onPostExecute: exception encountered during request: %s", exc.getMessage());
                            boolean z = k.n;
                        }
                    } catch (Throwable th) {
                        uf.b(th, this);
                    }
                }
            } catch (Throwable th2) {
                uf.b(th2, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onPreExecute() {
        Handler handler;
        if (!uf.c(this)) {
            try {
                super.onPreExecute();
                boolean z = k.n;
                if (this.b.h() == null) {
                    if (Thread.currentThread() instanceof HandlerThread) {
                        handler = new Handler();
                    } else {
                        handler = new Handler(Looper.getMainLooper());
                    }
                    this.b.n(handler);
                }
            } catch (Throwable th) {
                uf.b(th, this);
            }
        }
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder Z0 = je.Z0("{RequestAsyncTask: ", " connection: ");
        Z0.append(this.a);
        Z0.append(", requests: ");
        Z0.append(this.b);
        Z0.append("}");
        return Z0.toString();
    }
}
