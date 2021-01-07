package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;

/* access modifiers changed from: package-private */
/* renamed from: zg8  reason: default package */
public class zg8 extends RecyclerView {
    final /* synthetic */ yg8 O0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zg8(yg8 yg8, Context context) {
        super(context, null);
        this.O0 = yg8;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || this.O0.k.b(drawable);
    }
}
