package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.android.glue.patterns.header.headers.v2.GlueHeaderViewV2;
import com.spotify.android.goldenpath.a;
import com.spotify.music.C0707R;

/* renamed from: a84  reason: default package */
public class a84 implements f84 {
    private final GlueHeaderViewV2 a;
    private final h84 b;
    private final k84 c;

    public a84(h84 h84, o84 o84, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        context.getClass();
        GlueHeaderViewV2 glueHeaderViewV2 = new GlueHeaderViewV2(context, null);
        this.a = glueHeaderViewV2;
        glueHeaderViewV2.setLayoutParams(a.c(context, viewGroup));
        glueHeaderViewV2.setContentTopMargin(a.e(context.getResources()));
        o84.a(glueHeaderViewV2);
        k84 k84 = new k84(context, glueHeaderViewV2, C0707R.layout.browse_header_gradient);
        this.c = k84;
        glueHeaderViewV2.setContentViewBinder(k84);
        this.b = h84;
    }

    @Override // com.spotify.encore.ViewProvider
    public View getView() {
        return this.a;
    }

    @Override // defpackage.f84
    public void setTitle(CharSequence charSequence) {
        this.c.setTitle(charSequence);
    }

    @Override // defpackage.f84
    public void v(String str) {
        this.b.a(this.a, str);
    }
}
