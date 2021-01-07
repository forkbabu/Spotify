package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.spotify.android.glue.patterns.header.transformations.TransformationSet;
import com.spotify.music.C0707R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: pc0  reason: default package */
public class pc0 implements oc0 {
    private final Set<View> a = new HashSet(1);
    private final List<ub0> b = new ArrayList(1);
    private final LinearLayout c;
    private final TransformationSet f;

    pc0(Context context, ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(C0707R.layout.glue_header_view_binder_content_set, viewGroup, false);
        this.c = linearLayout;
        this.f = l70.d(linearLayout);
    }

    @Override // defpackage.oc0
    public void F1(ub0 ub0) {
        View view = ub0.getView();
        this.a.add(view);
        this.b.add(ub0);
        this.c.addView(view, -1, new LinearLayout.LayoutParams(-1, -2));
    }

    @Override // defpackage.sc0
    public void b() {
        for (ub0 ub0 : this.b) {
            if (ub0.h2()) {
                this.c.setPivotX((float) ub0.u0());
                this.c.setPivotY((float) ub0.C0());
                return;
            }
        }
    }

    @Override // defpackage.tc0
    public void e0(int i, float f2) {
        this.f.a(f2);
    }

    @Override // defpackage.qc0, com.spotify.encore.ViewProvider
    public View getView() {
        return this.c;
    }

    @Override // defpackage.oc0
    public List<ub0> l0() {
        return Collections.unmodifiableList(this.b);
    }
}
