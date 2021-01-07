package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.webkit.JsResult;

/* access modifiers changed from: package-private */
/* renamed from: jbb  reason: default package */
public class jbb {
    private AlertDialog a;

    jbb() {
    }

    /* access modifiers changed from: package-private */
    public void a() {
        AlertDialog alertDialog = this.a;
        if (alertDialog != null) {
            alertDialog.cancel();
            this.a = null;
        }
    }

    public void b(JsResult jsResult, DialogInterface dialogInterface, int i) {
        jsResult.confirm();
        this.a = null;
    }

    public void c(JsResult jsResult, DialogInterface dialogInterface, int i) {
        jsResult.cancel();
        this.a = null;
    }

    public void d(JsResult jsResult, DialogInterface dialogInterface) {
        jsResult.cancel();
        this.a = null;
    }

    /* access modifiers changed from: package-private */
    public void e(Context context, String str, JsResult jsResult) {
        AlertDialog alertDialog = this.a;
        if (alertDialog != null) {
            alertDialog.cancel();
            this.a = null;
        }
        this.a = new AlertDialog.Builder(context).setMessage(str).setPositiveButton(17039370, new fbb(this, jsResult)).setNegativeButton(17039360, new gbb(this, jsResult)).setOnCancelListener(new hbb(this, jsResult)).show();
    }
}
