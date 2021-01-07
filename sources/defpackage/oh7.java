package defpackage;

import android.widget.CompoundButton;

/* access modifiers changed from: package-private */
/* renamed from: oh7  reason: default package */
public final class oh7 implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ da2 a;

    oh7(da2 da2) {
        this.a = da2;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.accept(new kg7(z));
    }
}
