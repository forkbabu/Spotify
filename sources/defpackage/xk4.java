package defpackage;

import android.content.Context;
import android.view.View;
import com.spotify.android.glue.patterns.header.headers.GlueNoHeaderView;

/* access modifiers changed from: package-private */
/* renamed from: xk4  reason: default package */
public class xk4 implements rk4 {
    private final GlueNoHeaderView a;

    xk4(Context context) {
        this.a = new GlueNoHeaderView(context);
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }

    @Override // defpackage.rk4
    public void setTitle(CharSequence charSequence) {
    }

    @Override // defpackage.rk4
    public void v(String str) {
    }
}
