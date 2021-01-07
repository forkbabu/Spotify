package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import androidx.appcompat.app.g;
import com.spotify.mobile.android.util.ui.u;

/* renamed from: id0  reason: default package */
public abstract class id0 extends g {
    private boolean A;

    /* renamed from: id0$a */
    private static class a extends u {
        public a(Window.Callback callback) {
            super(callback);
        }

        @Override // com.spotify.mobile.android.util.ui.u, android.view.Window.Callback
        public boolean onMenuItemSelected(int i, MenuItem menuItem) {
            CharSequence titleCondensed = menuItem.getTitleCondensed();
            if (titleCondensed != null) {
                menuItem.setTitleCondensed(titleCondensed.toString());
            } else if (menuItem.getTitle() != null) {
                menuItem.setTitleCondensed(menuItem.getTitle().toString());
            }
            boolean onMenuItemSelected = super.onMenuItemSelected(i, menuItem);
            menuItem.setTitleCondensed(titleCondensed);
            return onMenuItemSelected;
        }
    }

    public /* synthetic */ void N0(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.A = false;
        com.google.android.exoplayer2.util.g.r(new hd0(this, bundle));
        if (Build.VERSION.SDK_INT < 18) {
            getWindow().setCallback(new a(getWindow().getCallback()));
        }
    }

    @Override // androidx.fragment.app.c, android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (this.A) {
            return false;
        }
        return super.onCreatePanelMenu(i, menu);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.A = true;
    }
}
