package defpackage;

import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.h;
import java.util.Locale;

/* renamed from: pr  reason: default package */
public class pr {
    private final String a;
    private final String b;
    private final int c;

    public pr(@RecentlyNonNull String str, @RecentlyNonNull String... strArr) {
        String str2;
        if (strArr.length == 0) {
            str2 = "";
        } else {
            StringBuilder S0 = je.S0('[');
            for (String str3 : strArr) {
                if (S0.length() > 1) {
                    S0.append(",");
                }
                S0.append(str3);
            }
            S0.append(']');
            S0.append(' ');
            str2 = S0.toString();
        }
        this.b = str2;
        this.a = str;
        new h(str);
        int i = 2;
        while (7 >= i && !Log.isLoggable(this.a, i)) {
            i++;
        }
        this.c = i;
    }

    public void a(@RecentlyNonNull String str, Object... objArr) {
        if (this.c <= 3) {
            if (objArr.length > 0) {
                str = String.format(Locale.US, str, objArr);
            }
            this.b.concat(str);
        }
    }

    public void b(@RecentlyNonNull String str, Object... objArr) {
        String str2 = this.a;
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        Log.e(str2, this.b.concat(str));
    }
}
