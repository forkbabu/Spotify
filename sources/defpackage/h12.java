package defpackage;

import com.spotify.android.flags.c;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.contextmenu.y3;
import com.spotify.music.libs.yourlibraryx.pin.YourLibraryPinStatus;
import com.spotify.playlist.models.j;
import io.reactivex.functions.i;

/* renamed from: h12  reason: default package */
public final /* synthetic */ class h12 implements i {
    public final /* synthetic */ e22 a;
    public final /* synthetic */ j b;
    public final /* synthetic */ y3 c;

    public /* synthetic */ h12(e22 e22, j jVar, y3 y3Var) {
        this.a = e22;
        this.b = jVar;
        this.c = y3Var;
    }

    @Override // io.reactivex.functions.i
    public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        return this.a.f(this.b, this.c, (SessionState) obj, (c) obj2, (Boolean) obj3, (YourLibraryPinStatus) obj4);
    }
}
