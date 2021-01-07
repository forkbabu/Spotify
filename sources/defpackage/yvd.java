package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: yvd  reason: default package */
public final /* synthetic */ class yvd implements pud {
    public final /* synthetic */ sg0 a;
    public final /* synthetic */ pud b;
    public final /* synthetic */ Context c;

    public /* synthetic */ yvd(sg0 sg0, pud pud, Context context) {
        this.a = sg0;
        this.b = pud;
        this.c = context;
    }

    @Override // defpackage.pud
    public final Drawable createDrawable(Bitmap bitmap) {
        Drawable drawable;
        sg0 sg0 = this.a;
        pud pud = this.b;
        Context context = this.c;
        if (pud != null) {
            drawable = pud.createDrawable(bitmap);
        } else {
            drawable = new BitmapDrawable(context.getResources(), bitmap);
        }
        return (Drawable) sg0.apply(drawable);
    }
}
