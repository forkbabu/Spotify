package com.spotify.mobile.android.share.menu.preview.api;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import com.spotify.mobile.android.share.menu.preview.SharePreviewMenuFragment;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.h;

public final class e {
    private final o a;

    public e(o oVar) {
        h.e(oVar, "fragmentManager");
        this.a = oVar;
    }

    public final boolean a() {
        List<Fragment> b0 = this.a.b0();
        h.d(b0, "fragmentManager.fragments");
        if (b0.isEmpty()) {
            return false;
        }
        Iterator<T> it = b0.iterator();
        while (it.hasNext()) {
            if (it.next() instanceof SharePreviewMenuFragment) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        new SharePreviewMenuFragment().Y4(this.a, "preview-share-menu");
    }
}
