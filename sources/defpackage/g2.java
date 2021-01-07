package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: g2  reason: default package */
public class g2 {
    Context a;
    String b;
    Intent[] c;
    CharSequence d;
    IconCompat e;

    /* renamed from: g2$a */
    public static class a {
        private final g2 a;

        public a(Context context, String str) {
            g2 g2Var = new g2();
            this.a = g2Var;
            g2Var.a = context;
            g2Var.b = str;
        }

        public g2 a() {
            if (!TextUtils.isEmpty(this.a.d)) {
                g2 g2Var = this.a;
                Intent[] intentArr = g2Var.c;
                if (intentArr != null && intentArr.length != 0) {
                    return g2Var;
                }
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }

        public a b(IconCompat iconCompat) {
            this.a.e = iconCompat;
            return this;
        }

        public a c(Intent intent) {
            this.a.c = new Intent[]{intent};
            return this;
        }

        public a d(CharSequence charSequence) {
            this.a.d = charSequence;
            return this;
        }
    }

    g2() {
    }

    public ShortcutInfo a() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.a, this.b).setShortLabel(this.d).setIntents(this.c);
        IconCompat iconCompat = this.e;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.n(this.a));
        }
        if (!TextUtils.isEmpty(null)) {
            intents.setLongLabel(null);
        }
        if (!TextUtils.isEmpty(null)) {
            intents.setDisabledMessage(null);
        }
        intents.setRank(0);
        if (Build.VERSION.SDK_INT >= 29) {
            intents.setLongLived(false);
        } else {
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putBoolean("extraLongLived", false);
            intents.setExtras(persistableBundle);
        }
        return intents.build();
    }
}
