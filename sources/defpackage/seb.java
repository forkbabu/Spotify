package defpackage;

import android.os.Bundle;
import androidx.fragment.app.o;
import androidx.fragment.app.x;
import com.spotify.music.lyrics.share.selection.ui.SelectionFragment;
import kotlin.jvm.internal.h;

/* renamed from: seb  reason: default package */
public final class seb {
    private final o a;

    public seb(o oVar) {
        h.e(oVar, "fragmentManager");
        this.a = oVar;
    }

    public final void a(Bundle bundle) {
        h.e(bundle, "bundle");
        h.e(bundle, "bundle");
        SelectionFragment selectionFragment = new SelectionFragment();
        selectionFragment.r4(bundle);
        x i = this.a.i();
        i.d(selectionFragment, SelectionFragment.class.getSimpleName());
        i.i();
    }
}
