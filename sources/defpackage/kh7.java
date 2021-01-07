package defpackage;

import android.content.DialogInterface;

/* renamed from: kh7  reason: default package */
/* compiled from: java-style lambda group */
public final class kh7 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public kh7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        if (i2 == 0) {
            ((da2) this.b).accept(yf7.a);
        } else if (i2 == 1) {
            ((da2) this.b).accept(sg7.a);
        } else {
            throw null;
        }
    }
}
