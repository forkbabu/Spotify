package defpackage;

import android.support.wearable.view.drawer.PageIndicatorView;
import android.support.wearable.view.drawer.WearableNavigationDrawer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.spotify.music.C0707R;
import defpackage.b0;

/* renamed from: c0  reason: default package */
public class c0 implements b0.a {
    private f0 a;
    private ViewPager b;
    private PageIndicatorView c;

    public void a(WearableNavigationDrawer wearableNavigationDrawer, f0 f0Var) {
        this.a = f0Var;
        View inflate = LayoutInflater.from(wearableNavigationDrawer.getContext()).inflate(C0707R.layout.navigation_drawer_view, (ViewGroup) wearableNavigationDrawer, false);
        this.b = (ViewPager) inflate.findViewById(C0707R.id.wearable_support_navigation_drawer_view_pager);
        this.c = (PageIndicatorView) inflate.findViewById(C0707R.id.wearable_support_navigation_drawer_page_indicator);
        wearableNavigationDrawer.setDrawerContent(inflate);
    }
}
