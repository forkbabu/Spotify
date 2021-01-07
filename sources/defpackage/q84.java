package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderViewV2;
import com.spotify.android.goldenpath.a;

/* access modifiers changed from: package-private */
/* renamed from: q84  reason: default package */
public class q84 implements w84 {
    private final GlueHeaderViewV2 a;
    private final t84 b;

    q84(Context context, ViewGroup viewGroup) {
        GlueHeaderViewV2 glueHeaderViewV2 = new GlueHeaderViewV2(context, null);
        this.a = glueHeaderViewV2;
        t84 t84 = new t84(glueHeaderViewV2);
        this.b = t84;
        glueHeaderViewV2.setContentViewBinder(t84);
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
        this.b.setText(charSequence);
    }
}
