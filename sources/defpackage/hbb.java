package defpackage;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* renamed from: hbb  reason: default package */
public final /* synthetic */ class hbb implements DialogInterface.OnCancelListener {
    public final /* synthetic */ jbb a;
    public final /* synthetic */ JsResult b;

    public /* synthetic */ hbb(jbb jbb, JsResult jsResult) {
        this.a = jbb;
        this.b = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a.d(this.b, dialogInterface);
    }
}
