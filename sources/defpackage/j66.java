package defpackage;

import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.playlist.endpoints.d;
import io.reactivex.functions.l;
import java.util.Map;

/* renamed from: j66  reason: default package */
public final /* synthetic */ class j66 implements l {
    public final /* synthetic */ d76 a;
    public final /* synthetic */ PreparePlayOptions b;
    public final /* synthetic */ PlayOrigin c;
    public final /* synthetic */ Map f;
    public final /* synthetic */ String n;
    public final /* synthetic */ String o;

    public /* synthetic */ j66(d76 d76, PreparePlayOptions preparePlayOptions, PlayOrigin playOrigin, Map map, String str, String str2) {
        this.a = d76;
        this.b = preparePlayOptions;
        this.c = playOrigin;
        this.f = map;
        this.n = str;
        this.o = str2;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.B(this.b, this.c, this.f, this.n, this.o, (d.b) obj);
    }
}
