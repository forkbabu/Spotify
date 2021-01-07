package defpackage;

import com.spotify.mobile.android.ui.contextmenu.y3;
import com.spotify.music.libs.yourlibraryx.pin.YourLibraryPinStatus;
import io.reactivex.functions.c;

/* renamed from: x02  reason: default package */
public final /* synthetic */ class x02 implements c {
    public final /* synthetic */ z12 a;
    public final /* synthetic */ y3 b;

    public /* synthetic */ x02(z12 z12, y3 y3Var) {
        this.a = z12;
        this.b = y3Var;
    }

    @Override // io.reactivex.functions.c
    public final Object a(Object obj, Object obj2) {
        return this.a.e(this.b, (com.spotify.android.flags.c) obj, (YourLibraryPinStatus) obj2);
    }
}
