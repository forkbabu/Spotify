package defpackage;

import android.view.MotionEvent;
import android.view.View;
import defpackage.iw4;

/* renamed from: hw4  reason: default package */
public final /* synthetic */ class hw4 implements View.OnTouchListener {
    public final /* synthetic */ iw4.c a;

    public /* synthetic */ hw4(iw4.c cVar) {
        this.a = cVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        iw4.c cVar = this.a;
        cVar.getClass();
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        iw4.this.o.x(cVar);
        return false;
    }
}
