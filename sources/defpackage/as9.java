package defpackage;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.google.common.collect.Collections2;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: as9  reason: default package */
public class as9 {
    private final w52 a;

    public as9(w52 w52) {
        this.a = w52;
    }

    public boolean a(Context context) {
        return this.a.f(context, "android.permission.ACCESS_FINE_LOCATION");
    }

    public void b(Fragment fragment, String str, int i) {
        if (!a(fragment.F2())) {
            w52 w52 = this.a;
            HashSet newHashSetWithExpectedSize = Collections2.newHashSetWithExpectedSize(1);
            Collections.addAll(newHashSetWithExpectedSize, "android.permission.ACCESS_FINE_LOCATION");
            w52.a(i, fragment, newHashSetWithExpectedSize, str, true);
        }
    }
}
