package com.getkeepsafe.relinker;

import android.content.Context;
import com.getkeepsafe.relinker.b;
import java.io.File;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class d {
    protected final Set<String> a = new HashSet();
    protected final b.AbstractC0082b b;
    protected final b.a c;
    protected b.c d;

    protected d() {
        e eVar = new e();
        a aVar = new a();
        this.b = eVar;
        this.c = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009d, code lost:
        if (r5.length > 0) goto L_0x00b8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d(android.content.Context r12, java.lang.String r13, java.lang.String r14) {
        /*
        // Method dump skipped, instructions count: 233
        */
        throw new UnsupportedOperationException("Method not decompiled: com.getkeepsafe.relinker.d.d(android.content.Context, java.lang.String, java.lang.String):void");
    }

    /* access modifiers changed from: protected */
    public File a(Context context) {
        return context.getDir("lib", 0);
    }

    /* access modifiers changed from: protected */
    public File b(Context context, String str, String str2) {
        String a2 = ((e) this.b).a(str);
        if (b.a(str2)) {
            return new File(a(context), a2);
        }
        return new File(a(context), je.y0(a2, ".", str2));
    }

    public void c(Context context, String str) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        } else if (!b.a(str)) {
            e("Beginning load of %s...", str);
            d(context, str, null);
        } else {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
    }

    public void e(String str, Object... objArr) {
        String format = String.format(Locale.US, str, objArr);
        b.c cVar = this.d;
        if (cVar != null) {
            cVar.log(format);
        }
    }
}
