package defpackage;

import android.os.AsyncTask;

/* access modifiers changed from: package-private */
/* renamed from: fv9  reason: default package */
public class fv9 extends AsyncTask<Void, Void, Void> {
    fv9() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object[]] */
    /* access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ Void doInBackground(Void[] voidArr) {
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onPreExecute() {
        z42.a("This dummy task must be called from the main thread");
        super.onPreExecute();
    }
}
