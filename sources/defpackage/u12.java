package defpackage;

import android.net.Uri;
import com.google.common.base.Optional;
import com.spotify.android.flags.c;
import com.spotify.mobile.android.ui.contextmenu.y3;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.playlist.models.a;
import com.spotify.playlist.models.b;
import com.spotify.playlist.models.o;
import io.reactivex.functions.j;
import java.util.List;

/* renamed from: u12  reason: default package */
public final /* synthetic */ class u12 implements j {
    public final /* synthetic */ i22 a;
    public final /* synthetic */ y3 b;
    public final /* synthetic */ LinkType c;
    public final /* synthetic */ o d;
    public final /* synthetic */ a e;
    public final /* synthetic */ List f;
    public final /* synthetic */ b g;

    public /* synthetic */ u12(i22 i22, y3 y3Var, LinkType linkType, o oVar, a aVar, List list, b bVar) {
        this.a = i22;
        this.b = y3Var;
        this.c = linkType;
        this.d = oVar;
        this.e = aVar;
        this.f = list;
        this.g = bVar;
    }

    @Override // io.reactivex.functions.j
    public final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return this.a.i(this.b, this.c, this.d, this.e, this.f, this.g, (Optional) obj, (Optional) obj2, (Uri) obj3, (c) obj4, (Boolean) obj5);
    }
}
