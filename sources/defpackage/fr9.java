package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import defpackage.owd;

/* access modifiers changed from: package-private */
/* renamed from: fr9  reason: default package */
public class fr9 implements owd.d {
    final /* synthetic */ View a;
    final /* synthetic */ float b;
    final /* synthetic */ int c;
    final /* synthetic */ gr9 d;

    fr9(gr9 gr9, View view, float f, int i) {
        this.d = gr9;
        this.a = view;
        this.b = f;
        this.c = i;
    }

    @Override // defpackage.owd.d
    public void a(int i) {
        this.d.c(this.a, i, this.b, this.c);
    }

    @Override // defpackage.owd.d
    public void b(Drawable drawable) {
        gr9 gr9 = this.d;
        gr9.c(this.a, gr9.c, this.b, this.c);
    }
}
