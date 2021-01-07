package defpackage;

import android.content.DialogInterface;

/* renamed from: xk9  reason: default package */
public final /* synthetic */ class xk9 implements DialogInterface.OnClickListener {
    public final /* synthetic */ jl9 a;
    public final /* synthetic */ String b;

    public /* synthetic */ xk9(jl9 jl9, String str) {
        this.a = jl9;
        this.b = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.a(this.b, dialogInterface, i);
    }
}
