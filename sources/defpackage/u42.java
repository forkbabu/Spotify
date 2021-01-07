package defpackage;

import android.view.View;
import android.view.ViewGroup;

@Deprecated
/* renamed from: u42  reason: default package */
public class u42 implements w42 {
    @Override // defpackage.w42
    public View a(int i, ViewGroup viewGroup) {
        return e90.e().d(viewGroup.getContext(), viewGroup).getView();
    }

    @Override // defpackage.w42
    public void b(int i, View view, String str, String str2, boolean z) {
        int i2 = e90.i;
        ia0 ia0 = (ia0) l70.o(view, ia0.class);
        ia0.V1(z);
        ia0.setTitle(str);
    }
}
