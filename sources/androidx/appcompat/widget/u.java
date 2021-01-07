package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* access modifiers changed from: package-private */
public class u implements AdapterView.OnItemSelectedListener {
    final /* synthetic */ ListPopupWindow a;

    u(ListPopupWindow listPopupWindow) {
        this.a = listPopupWindow;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        r rVar;
        if (i != -1 && (rVar = this.a.c) != null) {
            rVar.setListSelectionHidden(false);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
