package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;

/* renamed from: pa  reason: default package */
public class pa extends Paint {
    public pa() {
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }

    public pa(int i) {
        super(i);
    }

    public pa(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public pa(int i, PorterDuff.Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
