package defpackage;

import android.view.View;

/* renamed from: gib  reason: default package */
/* compiled from: java-style lambda group */
public final class gib implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public gib(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        if (i == 0) {
            ((wib) this.c).T.a((String) this.b, false);
            wib.C0((wib) this.c);
        } else if (i == 1) {
            ((wib) this.c).R.a((String) this.b);
            wib.B0((wib) this.c, (String) this.b);
        } else {
            throw null;
        }
    }
}
