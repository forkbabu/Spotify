package defpackage;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: ele  reason: default package */
public final /* synthetic */ class ele implements TextView.OnEditorActionListener {
    public final /* synthetic */ da2 a;

    public /* synthetic */ ele(da2 da2) {
        this.a = da2;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        da2 da2 = this.a;
        if (i != 5) {
            return false;
        }
        da2.accept(oke.e());
        return true;
    }
}
