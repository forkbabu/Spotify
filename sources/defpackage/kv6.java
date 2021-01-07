package defpackage;

import android.content.DialogInterface;

/* renamed from: kv6  reason: default package */
public final /* synthetic */ class kv6 implements DialogInterface.OnClickListener {
    public final /* synthetic */ tw6 a;
    public final /* synthetic */ String b;

    public /* synthetic */ kv6(tw6 tw6, String str) {
        this.a = tw6;
        this.b = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.e(this.b, dialogInterface, i);
    }
}
