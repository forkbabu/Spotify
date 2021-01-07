package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.support.wearable.view.drawer.WearableNavigationDrawer;
import com.spotify.music.C0707R;
import defpackage.d0;

/* renamed from: e0  reason: default package */
public class e0 implements d0.a {
    private static final int[] e = {C0707R.id.wearable_support_nav_drawer_icon_0, C0707R.id.wearable_support_nav_drawer_icon_1, C0707R.id.wearable_support_nav_drawer_icon_2, C0707R.id.wearable_support_nav_drawer_icon_3, C0707R.id.wearable_support_nav_drawer_icon_4, C0707R.id.wearable_support_nav_drawer_icon_5, C0707R.id.wearable_support_nav_drawer_icon_6};
    private static final int[] f = {0, C0707R.layout.single_page_nav_drawer_1_item, C0707R.layout.single_page_nav_drawer_2_item, C0707R.layout.single_page_nav_drawer_3_item, C0707R.layout.single_page_nav_drawer_4_item, C0707R.layout.single_page_nav_drawer_5_item, C0707R.layout.single_page_nav_drawer_6_item, C0707R.layout.single_page_nav_drawer_7_item};
    private final WearableNavigationDrawer a;
    private final Handler b = new Handler(Looper.getMainLooper());
    private final Runnable c = new a();
    private f0 d;

    /* renamed from: e0$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e0.this.a.b();
        }
    }

    public e0(WearableNavigationDrawer wearableNavigationDrawer) {
        this.a = wearableNavigationDrawer;
    }

    public void b(f0 f0Var) {
        this.d = f0Var;
    }
}
