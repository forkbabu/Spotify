package androidx.appcompat.widget;

import android.view.View;
import androidx.appcompat.view.menu.p;
import androidx.appcompat.widget.AppCompatSpinner;

/* access modifiers changed from: package-private */
public class k extends t {
    final /* synthetic */ AppCompatSpinner.d s;
    final /* synthetic */ AppCompatSpinner t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    k(AppCompatSpinner appCompatSpinner, View view, AppCompatSpinner.d dVar) {
        super(view);
        this.t = appCompatSpinner;
        this.s = dVar;
    }

    @Override // androidx.appcompat.widget.t
    public p b() {
        return this.s;
    }

    @Override // androidx.appcompat.widget.t
    public boolean c() {
        if (this.t.getInternalPopup().b()) {
            return true;
        }
        this.t.b();
        return true;
    }
}
