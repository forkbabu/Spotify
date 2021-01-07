package defpackage;

import com.spotify.player.model.Context;
import io.reactivex.functions.l;

/* renamed from: wic  reason: default package */
public final /* synthetic */ class wic implements l {
    public final /* synthetic */ fjc a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String f;

    public /* synthetic */ wic(fjc fjc, String str, long j, String str2) {
        this.a = fjc;
        this.b = str;
        this.c = j;
        this.f = str2;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.e(this.b, this.c, this.f, (Context) obj);
    }
}
