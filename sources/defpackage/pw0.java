package defpackage;

import android.animation.Animator;
import android.widget.Button;
import com.spotify.music.libs.search.view.ToolbarSearchFieldView;
import com.spotify.music.libs.search.view.l;
import kotlin.jvm.internal.h;

/* renamed from: pw0  reason: default package */
public final class pw0 implements ToolbarSearchFieldView.e {
    final /* synthetic */ ow0 a;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    pw0(ow0 ow0) {
        this.a = ow0;
    }

    @Override // com.spotify.music.libs.search.view.ToolbarSearchFieldView.e
    public void a() {
        this.a.m();
        Button searchPlaceHolder = this.a.g.getSearchPlaceHolder();
        h.d(searchPlaceHolder, "mSearchFieldView.searchPlaceHolder");
        searchPlaceHolder.setPressed(false);
        Button searchPlaceHolder2 = this.a.g.getSearchPlaceHolder();
        if (searchPlaceHolder2 != null) {
            l stateListAnimatorCompat = ((zud) searchPlaceHolder2).getStateListAnimatorCompat();
            h.d(stateListAnimatorCompat, "(mSearchFieldView.search… .stateListAnimatorCompat");
            Animator e = stateListAnimatorCompat.e();
            if (e != null) {
                e.cancel();
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.spotify.paste.core.motion.StateListAnimatorCompatSupport");
    }

    @Override // com.spotify.music.libs.search.view.ToolbarSearchFieldView.e
    public void b() {
        l.c cVar = this.a.c;
        boolean z = true;
        if (cVar == null || !cVar.B1()) {
            z = false;
        }
        if (!z) {
            this.a.b();
            this.a.c();
        }
    }

    @Override // com.spotify.music.libs.search.view.ToolbarSearchFieldView.e
    public void c() {
        this.a.b();
    }
}
