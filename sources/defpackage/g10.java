package defpackage;

import android.content.Context;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* renamed from: g10  reason: default package */
public class g10 {
    private final Context a;
    private boolean b = false;
    private String c;

    public g10(Context context) {
        this.a = context;
    }

    public String a() {
        String str;
        if (!this.b) {
            Context context = this.a;
            int n = CommonUtils.n(context, "com.google.firebase.crashlytics.unity_version", "string");
            if (n != 0) {
                str = context.getResources().getString(n);
                ty.f().b("Unity Editor version is: " + str);
            } else {
                str = null;
            }
            this.c = str;
            this.b = true;
        }
        String str2 = this.c;
        if (str2 != null) {
            return str2;
        }
        return null;
    }
}
