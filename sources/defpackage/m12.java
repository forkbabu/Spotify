package defpackage;

import com.spotify.android.flags.c;
import io.reactivex.functions.l;

/* renamed from: m12  reason: default package */
public final /* synthetic */ class m12 implements l {
    public final /* synthetic */ i22 a;
    public final /* synthetic */ String b;

    public /* synthetic */ m12(i22 i22, String str) {
        this.a = i22;
        this.b = str;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.j(this.b, (c) obj);
    }
}
