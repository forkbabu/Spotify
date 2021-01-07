package androidx.mediarouter.app;

import android.view.View;
import androidx.mediarouter.app.k;

class l implements View.OnClickListener {
    final /* synthetic */ k.h.c a;

    l(k.h.c cVar) {
        this.a = cVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        k.h.c cVar = this.a;
        k.this.E = true;
        cVar.H.D();
        this.a.D.setVisibility(4);
        this.a.E.setVisibility(0);
    }
}
