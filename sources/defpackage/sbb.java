package defpackage;

import android.view.View;
import java.util.List;

/* renamed from: sbb  reason: default package */
final class sbb implements View.OnClickListener {
    final /* synthetic */ tbb a;
    final /* synthetic */ List b;
    final /* synthetic */ String c;

    sbb(tbb tbb, List list, String str) {
        this.a = tbb;
        this.b = list;
        this.c = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        tbb.c(this.a, this.b, this.c);
    }
}
