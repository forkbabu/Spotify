package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import androidx.core.app.d;
import defpackage.e1;

/* renamed from: i1  reason: default package */
public final class i1 {
    public final Intent a;

    i1(Intent intent, Bundle bundle) {
        this.a = intent;
    }

    public void a(Context context, Uri uri) {
        this.a.setData(uri);
        Intent intent = this.a;
        int i = androidx.core.content.a.b;
        int i2 = Build.VERSION.SDK_INT;
        context.startActivity(intent, null);
    }

    /* renamed from: i1$a */
    public static final class a {
        private final Intent a;
        private final e1.a b;
        private boolean c;

        public a() {
            this.a = new Intent("android.intent.action.VIEW");
            this.b = new e1.a();
            this.c = true;
        }

        public i1 a() {
            if (!this.a.hasExtra("android.support.customtabs.extra.SESSION")) {
                Bundle bundle = new Bundle();
                d.c(bundle, "android.support.customtabs.extra.SESSION", null);
                this.a.putExtras(bundle);
            }
            this.a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.c);
            Intent intent = this.a;
            e1 a2 = this.b.a();
            Bundle bundle2 = new Bundle();
            Integer num = a2.a;
            if (num != null) {
                bundle2.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
            }
            intent.putExtras(bundle2);
            return new i1(this.a, null);
        }

        public a b(boolean z) {
            this.a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z ? 1 : 0);
            return this;
        }

        public a c(int i) {
            this.b.b(i);
            return this;
        }

        public a(k1 k1Var) {
            Intent intent = new Intent("android.intent.action.VIEW");
            this.a = intent;
            this.b = new e1.a();
            this.c = true;
            if (k1Var != null) {
                intent.setPackage(k1Var.b().getPackageName());
                IBinder a2 = k1Var.a();
                PendingIntent c2 = k1Var.c();
                Bundle bundle = new Bundle();
                d.c(bundle, "android.support.customtabs.extra.SESSION", a2);
                if (c2 != null) {
                    bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", c2);
                }
                intent.putExtras(bundle);
            }
        }
    }
}
