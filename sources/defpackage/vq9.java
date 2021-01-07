package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.music.C0707R;
import defpackage.s51;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import kotlin.jvm.internal.h;

/* renamed from: vq9  reason: default package */
public final class vq9 implements Object<ViewGroup>, pk9 {
    private final int a;
    private final int b;
    private final int c;
    private final Activity f;

    public vq9(Activity activity) {
        h.e(activity, "activity");
        this.f = activity;
        this.a = activity.getResources().getDimensionPixelSize(C0707R.dimen.std_16dp);
        this.b = activity.getResources().getDimensionPixelSize(C0707R.dimen.single_item_container_max_width);
        this.c = activity.getResources().getDimensionPixelSize(C0707R.dimen.single_item_container_min_width);
    }

    @Override // defpackage.s51
    public void b(View view, s81 s81, s51.a aVar, int[] iArr) {
        h.e((ViewGroup) view, "viewGroup");
        h.e(s81, "model");
        h.e(aVar, "action");
        h.e(iArr, "indexPath");
    }

    @Override // defpackage.s51
    public void c(View view, s81 s81, w51 w51, s51.b bVar) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup viewGroup = (ViewGroup) view;
        h.e(viewGroup, "viewGroup");
        h.e(s81, "data");
        h.e(w51, "hubsConfig");
        h.e(bVar, "state");
        xq9 xq9 = (xq9) l70.o(viewGroup, xq9.class);
        xq9.g();
        ArrayList arrayList = new ArrayList(s81.children().size());
        for (s81 s812 : s81.children()) {
            s51<?> a2 = w51.g().a(w51.c().d(s812));
            if (a2 != null) {
                View h = a2.h(xq9.c(), w51);
                a2.c(h, s812, w51, bVar);
                h.d(h, "childView");
                ViewGroup.LayoutParams layoutParams = h.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    layoutParams = null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams2 != null) {
                    marginLayoutParams2.setMargins(0, arrayList.size() > 0 ? this.a : 0, 0, 0);
                    e2.t(marginLayoutParams2, 0);
                    e2.s(marginLayoutParams2, 0);
                    marginLayoutParams = marginLayoutParams2;
                } else {
                    marginLayoutParams = h.getLayoutParams();
                }
                h.setLayoutParams(marginLayoutParams);
                arrayList.add(h);
            }
        }
        if (!(!s81.children().isEmpty()) || arrayList.size() != s81.children().size()) {
            xq9.d();
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            xq9.b((View) it.next());
        }
        Resources resources = this.f.getResources();
        h.d(resources, "activity.resources");
        double d = (double) resources.getDisplayMetrics().widthPixels;
        Double.isNaN(d);
        Double.isNaN(d);
        xq9.o2(knf.c(anf.a(d * 0.9d), this.c, this.b));
        xq9.w();
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.home_single_item_container_component;
    }

    public EnumSet<GlueLayoutTraits.Trait> e() {
        EnumSet<GlueLayoutTraits.Trait> of = EnumSet.of(GlueLayoutTraits.Trait.STACKABLE);
        h.d(of, "EnumSet.of(GlueLayoutTraits.Trait.STACKABLE)");
        return of;
    }

    @Override // defpackage.s51
    public View h(ViewGroup viewGroup, w51 w51) {
        h.e(viewGroup, "parent");
        h.e(w51, "config");
        xq9 xq9 = new xq9(this.f, viewGroup);
        xq9.getView().setTag(C0707R.id.glue_viewholder_tag, xq9);
        return xq9.c();
    }
}
