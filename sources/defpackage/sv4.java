package defpackage;

import android.widget.CompoundButton;

/* renamed from: sv4  reason: default package */
public final /* synthetic */ class sv4 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ uv4 a;

    public /* synthetic */ sv4(uv4 uv4) {
        this.a = uv4;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.b(compoundButton, z);
    }
}
