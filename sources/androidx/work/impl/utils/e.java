package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.j;

public class e {
    private static final String a = j.f("PackageManagerHelper");

    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0031: APUT  (r7v1 java.lang.Object[]), (1 ??[boolean, int, float, short, byte, char]), (r8v1 java.lang.String) */
    /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x0050: APUT  (r3v1 java.lang.Object[]), (1 ??[boolean, int, float, short, byte, char]), (r0v1 java.lang.String) */
    public static void a(Context context, Class<?> cls, boolean z) {
        String str;
        String str2 = "enabled";
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z ? 1 : 2, 1);
            j c = j.c();
            String str3 = a;
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            if (z) {
                str = str2;
            } else {
                str = "disabled";
            }
            objArr[1] = str;
            c.a(str3, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e) {
            j c2 = j.c();
            String str4 = a;
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            if (!z) {
                str2 = "disabled";
            }
            objArr2[1] = str2;
            c2.a(str4, String.format("%s could not be %s", objArr2), e);
        }
    }
}
