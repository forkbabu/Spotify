package defpackage;

import com.spotify.player.controls.d;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;

/* renamed from: dye  reason: default package */
public final /* synthetic */ class dye implements w {
    public final /* synthetic */ d a;
    public final /* synthetic */ hze b;

    public /* synthetic */ dye(d dVar, hze hze) {
        this.a = dVar;
        this.b = hze;
    }

    @Override // io.reactivex.w
    public final v apply(s sVar) {
        return sVar.Y(new wve(this.a, this.b)).B().N();
    }
}
