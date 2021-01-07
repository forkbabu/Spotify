package defpackage;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* renamed from: gbb  reason: default package */
public final /* synthetic */ class gbb implements DialogInterface.OnClickListener {
    public final /* synthetic */ jbb a;
    public final /* synthetic */ JsResult b;

    public /* synthetic */ gbb(jbb jbb, JsResult jsResult) {
        this.a = jbb;
        this.b = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.c(this.b, dialogInterface, i);
    }
}
