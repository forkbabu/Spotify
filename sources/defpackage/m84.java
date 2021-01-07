package defpackage;

import android.content.Context;
import android.view.View;
import com.spotify.android.glue.patterns.header.headers.GlueNoHeaderView;

/* access modifiers changed from: package-private */
/* renamed from: m84  reason: default package */
public class m84 implements f84 {
    private final GlueNoHeaderView a;

    m84(Context context) {
        this.a = new GlueNoHeaderView(context);
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }

    @Override // defpackage.f84
    public void setTitle(CharSequence charSequence) {
    }

    @Override // defpackage.f84
    public void v(String str) {
    }
}
