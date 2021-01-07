package defpackage;

import com.spotify.music.libs.fullscreen.story.domain.g;
import com.spotify.music.libs.fullscreen.story.domain.i;
import com.spotify.player.controls.c;
import com.spotify.player.controls.d;
import com.spotify.player.model.command.PauseCommand;
import com.spotify.player.model.command.options.CommandOptions;
import io.reactivex.internal.operators.completable.i;
import io.reactivex.internal.operators.observable.o;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.y;

/* renamed from: kc5  reason: default package */
public class kc5 {
    private final d a;
    private final y b;

    public kc5(d dVar, y yVar) {
        this.a = dVar;
        this.b = yVar;
    }

    public v a(g.p pVar) {
        if (pVar.a()) {
            return new i(this.a.a(c.e()).H(this.b).F(zwd.a("Error with PlayerControls"))).g(s.i0(i.f.a));
        }
        return new io.reactivex.internal.operators.completable.i(this.a.a(c.d(PauseCommand.builder().options(CommandOptions.builder().onlyForLocalDevice(true).build()).build())).F(zwd.a("Error with PlayerControls"))).g(o.a);
    }
}
