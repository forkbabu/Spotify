package defpackage;

import com.spotify.mobile.android.ui.contextmenu.y3;
import com.spotify.music.libs.yourlibraryx.pin.YourLibraryPinStatus;
import io.reactivex.functions.c;

/* renamed from: j12  reason: default package */
public final /* synthetic */ class j12 implements c {
    public final /* synthetic */ f22 a;
    public final /* synthetic */ y3 b;

    public /* synthetic */ j12(f22 f22, y3 y3Var) {
        this.a = f22;
        this.b = y3Var;
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        return this.a.f(this.b, (com.spotify.android.flags.c) obj, (YourLibraryPinStatus) obj2);
    }
}
