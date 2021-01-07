package android.support.wearable.view.drawer;

import android.view.View;

class d implements Runnable {
    final /* synthetic */ View a;

    d(View view) {
        this.a = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.setVisibility(8);
    }
}
