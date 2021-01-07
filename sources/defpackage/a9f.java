package defpackage;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import io.reactivex.t;
import io.reactivex.u;

/* renamed from: a9f  reason: default package */
public final /* synthetic */ class a9f implements u {
    public final /* synthetic */ Object a;
    public final /* synthetic */ BottomSheetBehavior b;

    public /* synthetic */ a9f(Object obj, BottomSheetBehavior bottomSheetBehavior) {
        this.a = obj;
        this.b = bottomSheetBehavior;
    }

    @Override // io.reactivex.u
    public final void subscribe(t tVar) {
        Object obj = this.a;
        BottomSheetBehavior bottomSheetBehavior = this.b;
        c9f c9f = new c9f(tVar, obj);
        tVar.e(new z8f(bottomSheetBehavior, c9f));
        bottomSheetBehavior.i(c9f);
    }
}
