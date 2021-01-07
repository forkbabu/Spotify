package defpackage;

import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import com.spotify.base.java.logging.Logger;
import defpackage.ej9;
import io.reactivex.s;
import io.reactivex.v;
import java.util.Arrays;

/* renamed from: kca  reason: default package */
public final class kca {
    private static s<u3<String, String>> a() {
        return s.i0(new u3(null, null));
    }

    public static s<u3<String, String>> b(Fragment fragment) {
        s<u3<String, String>> sVar;
        gca gca = new gca(fragment);
        if (fragment instanceof com.spotify.mobile.android.ui.fragments.s) {
            sVar = ((com.spotify.mobile.android.ui.fragments.s) fragment).u0().e().W(ica.a, false, Integer.MAX_VALUE).E0(a());
        } else {
            sVar = a();
        }
        return s.n(gca, sVar, jca.a).Q(hca.a).E();
    }

    static /* synthetic */ v c(ej9 ej9) {
        if (ej9 instanceof fj9) {
            fj9 fj9 = (fj9) ej9;
            return s.i0(new u3(fj9.d(), fj9.e()));
        } else if (ej9 instanceof ej9.a) {
            return s.i0(new u3(null, ((ej9.a) ej9).b()));
        } else {
            return a();
        }
    }

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0057: APUT  (r0v1 java.lang.Object[]), (1 ??[boolean, int, float, short, byte, char]), (r1v4 java.lang.String) */
    public static void d(String... strArr) {
        String str;
        Object[] objArr = new Object[3];
        objArr[0] = Long.valueOf(SystemClock.elapsedRealtime());
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (4 < stackTrace.length) {
            String[] split = stackTrace[4].getClassName().split("\\.");
            str = split[split.length - 1] + '.' + stackTrace[4].getMethodName() + ':' + stackTrace[4].getLineNumber();
        } else {
            str = "No stack trace available";
        }
        objArr[1] = str;
        objArr[2] = Arrays.toString(strArr);
        Logger.b("GAIA: TIMING(%d) %s %s", objArr);
    }
}
