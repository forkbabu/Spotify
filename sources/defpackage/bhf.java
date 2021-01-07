package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.spotify.mobius.q;
import com.spotify.mobius.rx2.i;
import io.reactivex.s;

/* renamed from: bhf  reason: default package */
public final class bhf {
    public static <T> q<T> a(BottomSheetBehavior<View> bottomSheetBehavior, T t) {
        return i.a(s.y(new xgf(t, bottomSheetBehavior)));
    }
}
