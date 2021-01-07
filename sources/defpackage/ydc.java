package defpackage;

import android.widget.CompoundButton;

/* renamed from: ydc  reason: default package */
public final /* synthetic */ class ydc implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ da2 a;

    public /* synthetic */ ydc(da2 da2) {
        this.a = da2;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.accept(bdc.f(z));
    }
}
