package com.facebook.appevents.internal;

import android.os.AsyncTask;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;

public class f extends AsyncTask<String, Void, Boolean> {
    private a a;
    private File b;
    private String c;

    public interface a {
        void a(File file);
    }

    public f(String str, File file, a aVar) {
        this.c = str;
        this.b = file;
        this.a = aVar;
    }

    /* access modifiers changed from: protected */
    public Boolean a() {
        if (uf.c(this)) {
            return null;
        }
        try {
            URL url = new URL(this.c);
            int contentLength = url.openConnection().getContentLength();
            DataInputStream dataInputStream = new DataInputStream(url.openStream());
            byte[] bArr = new byte[contentLength];
            dataInputStream.readFully(bArr);
            dataInputStream.close();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.b));
            dataOutputStream.write(bArr);
            dataOutputStream.flush();
            dataOutputStream.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            return Boolean.FALSE;
        } catch (Throwable th) {
            uf.b(th, this);
            return null;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
    /* access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ Boolean doInBackground(String[] strArr) {
        if (uf.c(this)) {
            return null;
        }
        try {
            String[] strArr2 = strArr;
            return a();
        } catch (Throwable th) {
            uf.b(th, this);
            return null;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onPostExecute(Boolean bool) {
        if (!uf.c(this)) {
            try {
                Boolean bool2 = bool;
                if (!uf.c(this)) {
                    try {
                        if (bool2.booleanValue()) {
                            this.a.a(this.b);
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
}
