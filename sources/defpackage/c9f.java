package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import io.reactivex.t;

/* renamed from: c9f  reason: default package */
final class c9f extends BottomSheetBehavior.d {
    final /* synthetic */ t a;
    final /* synthetic */ Object b;

    c9f(t tVar, Object obj) {
        this.a = tVar;
        this.b = obj;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
    public void a(View view, float f) {
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
    public void b(View view, int i) {
        if (5 == i) {
            this.a.onNext(this.b);
            this.a.onComplete();
        }
    }
}
