package com.facebook;

import com.adjust.sdk.Constants;
import com.facebook.m;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Locale;

/* access modifiers changed from: package-private */
public class n implements m.d {
    final /* synthetic */ ArrayList a;

    n(m mVar, ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // com.facebook.m.d
    public void a(String str, String str2) {
        this.a.add(String.format(Locale.US, "%s=%s", str, URLEncoder.encode(str2, Constants.ENCODING)));
    }
}
