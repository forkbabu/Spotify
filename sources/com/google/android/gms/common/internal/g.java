package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import java.util.Arrays;

public abstract class g {
    private static final Object a = new Object();
    private static g b;
    public static final /* synthetic */ int c = 0;

    /* access modifiers changed from: protected */
    public static final class a {
        private static final Uri e = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
        private final String a;
        private final String b;
        private final int c;
        private final boolean d;

        public a(String str, String str2, int i, boolean z) {
            com.google.android.exoplayer2.util.g.i(str);
            this.a = str;
            com.google.android.exoplayer2.util.g.i(str2);
            this.b = str2;
            this.c = i;
            this.d = z;
        }

        public final Intent a(Context context) {
            Bundle bundle;
            Intent intent = null;
            if (this.a == null) {
                return new Intent().setComponent(null);
            }
            if (this.d) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("serviceActionBundleKey", this.a);
                try {
                    bundle = context.getContentResolver().call(e, "serviceIntentCall", (String) null, bundle2);
                } catch (IllegalArgumentException e2) {
                    String.valueOf(e2).length();
                    bundle = null;
                }
                if (bundle != null) {
                    intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
                }
                if (intent == null) {
                    String valueOf = String.valueOf(this.a);
                    if (valueOf.length() != 0) {
                        "Dynamic lookup for intent failed for action: ".concat(valueOf);
                    } else {
                        new String("Dynamic lookup for intent failed for action: ");
                    }
                }
            }
            if (intent == null) {
                return new Intent(this.a).setPackage(this.b);
            }
            return intent;
        }

        public final String b() {
            return this.b;
        }

        public final int c() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return m.a(this.a, aVar.a) && m.a(this.b, aVar.b) && m.a(null, null) && this.c == aVar.c && this.d == aVar.d;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b, null, Integer.valueOf(this.c), Boolean.valueOf(this.d)});
        }

        public final String toString() {
            String str = this.a;
            str.getClass();
            return str;
        }
    }

    @RecentlyNonNull
    public static g a(@RecentlyNonNull Context context) {
        synchronized (a) {
            if (b == null) {
                b = new x0(context.getApplicationContext());
            }
        }
        return b;
    }

    /* access modifiers changed from: protected */
    public abstract boolean b(a aVar, ServiceConnection serviceConnection, String str);

    /* access modifiers changed from: protected */
    public abstract void c(a aVar, ServiceConnection serviceConnection, String str);
}
