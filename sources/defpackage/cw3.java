package defpackage;

import android.text.Spannable;
import android.view.View;
import android.widget.TextView;
import defpackage.dw3;

/* renamed from: cw3  reason: default package */
class cw3 implements View.OnLayoutChangeListener {
    final /* synthetic */ dw3.a a;

    cw3(dw3.a aVar) {
        this.a = aVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.c.removeOnLayoutChangeListener(this);
        dw3.a aVar = this.a;
        this.a.c.setText(dw3.a.C(aVar, (Spannable) aVar.c.getText()), TextView.BufferType.SPANNABLE);
    }
}
