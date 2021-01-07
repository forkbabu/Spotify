package androidx.core.app;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

public class h {
    final Bundle a;
    private IconCompat b;
    private final r[] c;
    private final r[] d;
    private boolean e;
    boolean f;
    private final int g;
    private final boolean h;
    @Deprecated
    public int i;
    public CharSequence j;
    public PendingIntent k;

    public static final class a {
        private final IconCompat a;
        private final CharSequence b;
        private final PendingIntent c;
        private boolean d;
        private final Bundle e;
        private boolean f;

        public a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            IconCompat iconCompat = i != 0 ? IconCompat.f(null, "", i) : null;
            Bundle bundle = new Bundle();
            this.d = true;
            this.f = true;
            this.a = iconCompat;
            this.b = k.c(charSequence);
            this.c = pendingIntent;
            this.e = bundle;
            this.d = true;
            this.f = true;
        }

        public h a() {
            r[] rVarArr;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            r[] rVarArr2 = null;
            if (arrayList.isEmpty()) {
                rVarArr = null;
            } else {
                rVarArr = (r[]) arrayList.toArray(new r[arrayList.size()]);
            }
            if (!arrayList2.isEmpty()) {
                rVarArr2 = (r[]) arrayList2.toArray(new r[arrayList2.size()]);
            }
            return new h(this.a, this.b, this.c, this.e, rVarArr2, rVarArr, this.d, 0, this.f, false);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public h(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
        this(i2 != 0 ? IconCompat.f(null, "", i2) : null, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false);
    }

    public boolean a() {
        return this.e;
    }

    public r[] b() {
        return this.d;
    }

    public IconCompat c() {
        int i2;
        if (this.b == null && (i2 = this.i) != 0) {
            this.b = IconCompat.f(null, "", i2);
        }
        return this.b;
    }

    public r[] d() {
        return this.c;
    }

    public int e() {
        return this.g;
    }

    public boolean f() {
        return this.h;
    }

    h(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, r[] rVarArr, r[] rVarArr2, boolean z, int i2, boolean z2, boolean z3) {
        this.f = true;
        this.b = iconCompat;
        if (iconCompat != null && iconCompat.j() == 2) {
            this.i = iconCompat.g();
        }
        this.j = k.c(charSequence);
        this.k = pendingIntent;
        this.a = bundle == null ? new Bundle() : bundle;
        this.c = rVarArr;
        this.d = rVarArr2;
        this.e = z;
        this.g = i2;
        this.f = z2;
        this.h = z3;
    }
}
