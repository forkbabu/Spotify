package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AlertController;

class e implements AdapterView.OnItemClickListener {
    final /* synthetic */ AlertController a;
    final /* synthetic */ AlertController.b b;

    e(AlertController.b bVar, AlertController alertController) {
        this.b = bVar;
        this.a = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.b.p.onClick(this.a.b, i);
        if (!this.b.r) {
            this.a.b.dismiss();
        }
    }
}
