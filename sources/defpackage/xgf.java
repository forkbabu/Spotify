package defpackage;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import io.reactivex.t;
import io.reactivex.u;

/* renamed from: xgf  reason: default package */
public final /* synthetic */ class xgf implements u {
    public final /* synthetic */ Object a;
    public final /* synthetic */ BottomSheetBehavior b;

    public /* synthetic */ xgf(Object obj, BottomSheetBehavior bottomSheetBehavior) {
        this.a = obj;
        this.b = bottomSheetBehavior;
    }

    @Override // io.reactivex.u
    public final void subscribe(t tVar) {
        Object obj = this.a;
        BottomSheetBehavior bottomSheetBehavior = this.b;
        ahf ahf = new ahf(tVar, obj);
        tVar.e(new ygf(bottomSheetBehavior, ahf));
        bottomSheetBehavior.i(ahf);
    }
}
