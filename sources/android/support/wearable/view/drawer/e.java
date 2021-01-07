package android.support.wearable.view.drawer;

import android.view.View;

/* access modifiers changed from: package-private */
public class e implements View.OnClickListener {
    final /* synthetic */ WearableDrawerView a;

    e(WearableDrawerView wearableDrawerView) {
        this.a = wearableDrawerView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.a.k(view);
    }
}
