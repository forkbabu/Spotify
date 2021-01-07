package defpackage;

import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.options.CommandOptions;
import defpackage.h6d;
import io.reactivex.a;
import io.reactivex.e;
import io.reactivex.functions.l;
import io.reactivex.internal.operators.completable.b;
import io.reactivex.internal.operators.completable.f;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.y;
import io.reactivex.z;

/* renamed from: t6d  reason: default package */
public final /* synthetic */ class t6d implements l {
    public final /* synthetic */ f4d a;
    public final /* synthetic */ y b;
    public final /* synthetic */ d c;

    public /* synthetic */ t6d(f4d f4d, y yVar, d dVar) {
        this.a = f4d;
        this.b = yVar;
        this.c = dVar;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        e eVar;
        f4d f4d = this.a;
        y yVar = this.b;
        d dVar = this.c;
        a A = a.u(new l6d(f4d)).d(new f(f4d.a().P0(new y6d(f4d.k().b())))).A(yVar);
        if (((h6d.b) obj).b()) {
            z<zwd> a2 = dVar.a(c.d(PauseCommand.builder().options(CommandOptions.builder().onlyForLocalDevice(true).build()).build()));
            a2.getClass();
            eVar = new i(a2);
        } else {
            eVar = b.a;
        }
        return A.d(eVar).N();
    }
}
