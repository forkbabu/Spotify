package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

@Deprecated
/* renamed from: t42  reason: default package */
public class t42 implements w42 {
    private final Context a;

    public t42(Context context) {
        this.a = context;
    }

    @Override // defpackage.w42
    public View a(int i, ViewGroup viewGroup) {
        return e90.e().a(this.a, viewGroup).getView();
    }

    @Override // defpackage.w42
    public void b(int i, View view, String str, String str2, boolean z) {
        int i2 = e90.i;
        ia0 ia0 = (ia0) l70.o(view, ia0.class);
        ia0.setTitle(str);
        ia0.c1(str2);
        ia0.V1(z);
    }
}
