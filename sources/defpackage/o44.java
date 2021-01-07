package defpackage;

import android.view.View;
import defpackage.p44;

/* renamed from: o44  reason: default package */
/* compiled from: java-style lambda group */
public final class o44 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public o44(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        if (i == 0) {
            ((p44.a) this.b).b.accept(c44.a);
        } else if (i == 1) {
            ((p44.a) this.b).b.accept(y34.a);
        } else {
            throw null;
        }
    }
}
