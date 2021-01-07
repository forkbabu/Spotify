package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderViewV2;
import com.spotify.android.goldenpath.a;

/* access modifiers changed from: package-private */
/* renamed from: p84  reason: default package */
public class p84 implements w84 {
    private final GlueHeaderViewV2 a;

    p84(Context context, ViewGroup viewGroup) {
        GlueHeaderViewV2 glueHeaderViewV2 = new GlueHeaderViewV2(context, null);
        this.a = glueHeaderViewV2;
        glueHeaderViewV2.setLayoutParams(a.c(context, viewGroup));
        glueHeaderViewV2.setContentTopMargin(a.e(context.getResources()));
        l70.k(context).o(0.0f);
    }

    @Override // defpackage.qc0, com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }

    @Override // defpackage.w84
    public void setText(CharSequence charSequence) {
    }
}
