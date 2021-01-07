package defpackage;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import io.reactivex.functions.f;

/* renamed from: ygf  reason: default package */
public final /* synthetic */ class ygf implements f {
    public final /* synthetic */ BottomSheetBehavior a;
    public final /* synthetic */ BottomSheetBehavior.d b;

    public /* synthetic */ ygf(BottomSheetBehavior bottomSheetBehavior, BottomSheetBehavior.d dVar) {
        this.a = bottomSheetBehavior;
        this.b = dVar;
    }

    @Override // io.reactivex.functions.f
    public final void cancel() {
        this.a.r(this.b);
    }
}
