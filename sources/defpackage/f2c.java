package defpackage;

import android.content.res.Resources;
import com.spotify.mobile.android.util.h0;

/* renamed from: f2c  reason: default package */
public class f2c extends h0 implements e2c {
    private final h2c b;

    f2c(Resources resources, h2c h2c) {
        super(resources);
        this.b = h2c;
    }

    @Override // defpackage.e2c
    public String a(int i) {
        Integer a = this.b.a(i);
        a.getClass();
        return c(a.intValue(), new Object[0]);
    }
}
