package androidx.mediarouter.app;

import android.view.View;
import androidx.mediarouter.app.i;
import defpackage.n6;

class j implements View.OnClickListener {
    final /* synthetic */ n6.f a;
    final /* synthetic */ i.d.c b;

    j(i.d.c cVar, n6.f fVar) {
        this.b = cVar;
        this.a = fVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.a.D();
        this.b.D.setVisibility(4);
        this.b.E.setVisibility(0);
    }
}
