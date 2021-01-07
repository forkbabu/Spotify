package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: hvb  reason: default package */
public final /* synthetic */ class hvb implements qg0 {
    public final /* synthetic */ AppCompatTextView a;

    public /* synthetic */ hvb(AppCompatTextView appCompatTextView) {
        this.a = appCompatTextView;
    }

    @Override // defpackage.qg0
    public final void accept(Object obj) {
        AppCompatTextView appCompatTextView = this.a;
        View view = (View) obj;
        appCompatTextView.invalidate();
        appCompatTextView.requestLayout();
    }
}
