package androidx.appcompat.app;

import android.view.View;

class b implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ View b;
    final /* synthetic */ AlertController c;

    b(AlertController alertController, View view, View view2) {
        this.c = alertController;
        this.a = view;
        this.b = view2;
    }

    @Override // java.lang.Runnable
    public void run() {
        AlertController.d(this.c.A, this.a, this.b);
    }
}
