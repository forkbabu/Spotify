package androidx.appcompat.widget;

import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.a;

/* access modifiers changed from: package-private */
public class i0 implements View.OnClickListener {
    final a a;
    final /* synthetic */ j0 b;

    i0(j0 j0Var) {
        this.b = j0Var;
        this.a = new a(j0Var.a.getContext(), 0, 16908332, 0, j0Var.i);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        j0 j0Var = this.b;
        Window.Callback callback = j0Var.l;
        if (callback != null && j0Var.m) {
            callback.onMenuItemSelected(0, this.a);
        }
    }
}
