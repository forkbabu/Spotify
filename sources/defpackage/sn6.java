package defpackage;

import com.spotify.player.model.PlayerState;
import io.reactivex.functions.l;

/* renamed from: sn6  reason: default package */
public final /* synthetic */ class sn6 implements l {
    public final /* synthetic */ io6 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ sn6(io6 io6, String str, String str2) {
        this.a = io6;
        this.b = str;
        this.c = str2;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.i(this.b, this.c, (PlayerState) obj);
    }
}
