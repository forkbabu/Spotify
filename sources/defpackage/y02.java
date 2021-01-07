package defpackage;

import com.spotify.mobile.android.ui.contextmenu.y3;
import com.spotify.music.libs.yourlibraryx.pin.YourLibraryPinStatus;
import io.reactivex.functions.c;

/* renamed from: y02  reason: default package */
public final /* synthetic */ class y02 implements c {
    public final /* synthetic */ a22 a;
    public final /* synthetic */ y3 b;

    public /* synthetic */ y02(a22 a22, y3 y3Var) {
        this.a = a22;
        this.b = y3Var;
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        return this.a.d(this.b, (com.spotify.android.flags.c) obj, (YourLibraryPinStatus) obj2);
    }
}
