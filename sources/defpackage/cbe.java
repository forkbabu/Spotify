package defpackage;

import android.widget.DatePicker;

/* renamed from: cbe  reason: default package */
public final /* synthetic */ class cbe implements DatePicker.OnDateChangedListener {
    public final /* synthetic */ ebe a;

    public /* synthetic */ cbe(ebe ebe) {
        this.a = ebe;
    }

    @Override // android.widget.DatePicker.OnDateChangedListener
    public final void onDateChanged(DatePicker datePicker, int i, int i2, int i3) {
        this.a.e(datePicker, i, i2, i3);
    }
}
