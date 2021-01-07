package defpackage;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* renamed from: fbb  reason: default package */
public final /* synthetic */ class fbb implements DialogInterface.OnClickListener {
    public final /* synthetic */ jbb a;
    public final /* synthetic */ JsResult b;

    public /* synthetic */ fbb(jbb jbb, JsResult jsResult) {
        this.a = jbb;
        this.b = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.b(this.b, dialogInterface, i);
    }
}
