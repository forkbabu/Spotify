package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* access modifiers changed from: package-private */
public class d0 {
    static int a(RecyclerView.y yVar, y yVar2, View view, View view2, RecyclerView.m mVar, boolean z) {
        if (mVar.W() == 0 || yVar.c() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(mVar.o0(view) - mVar.o0(view2)) + 1;
        }
        return Math.min(yVar2.n(), yVar2.d(view2) - yVar2.g(view));
    }

    static int b(RecyclerView.y yVar, y yVar2, View view, View view2, RecyclerView.m mVar, boolean z, boolean z2) {
        int i;
        if (mVar.W() == 0 || yVar.c() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(mVar.o0(view), mVar.o0(view2));
        int max = Math.max(mVar.o0(view), mVar.o0(view2));
        if (z2) {
            i = Math.max(0, (yVar.c() - max) - 1);
        } else {
            i = Math.max(0, min);
        }
        if (!z) {
            return i;
        }
        return Math.round((((float) i) * (((float) Math.abs(yVar2.d(view2) - yVar2.g(view))) / ((float) (Math.abs(mVar.o0(view) - mVar.o0(view2)) + 1)))) + ((float) (yVar2.m() - yVar2.g(view))));
    }

    static int c(RecyclerView.y yVar, y yVar2, View view, View view2, RecyclerView.m mVar, boolean z) {
        if (mVar.W() == 0 || yVar.c() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return yVar.c();
        }
        return (int) ((((float) (yVar2.d(view2) - yVar2.g(view))) / ((float) (Math.abs(mVar.o0(view) - mVar.o0(view2)) + 1))) * ((float) yVar.c()));
    }
}
