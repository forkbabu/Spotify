package defpackage;

import android.content.DialogInterface;

/* renamed from: yk9  reason: default package */
public final /* synthetic */ class yk9 implements DialogInterface.OnClickListener {
    public final /* synthetic */ jl9 a;
    public final /* synthetic */ String b;

    public /* synthetic */ yk9(jl9 jl9, String str) {
        this.a = jl9;
        this.b = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.b(this.b, dialogInterface, i);
    }
}
