package defpackage;

import android.os.Build;
import android.os.SystemClock;
import android.view.KeyEvent;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.player.model.PlayerState;
import defpackage.oia;
import io.reactivex.d0;
import io.reactivex.disposables.a;
import io.reactivex.disposables.b;
import io.reactivex.e;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

/* renamed from: pia  reason: default package */
public class pia implements oia, d {
    private final rha a;
    private final g<Optional<PlayerState>> b;
    private final y c;
    private final ria f;
    private b n = EmptyDisposable.INSTANCE;
    private long o;
    private final a p = new a();

    public pia(rha rha, g<PlayerState> gVar, y yVar, ria ria) {
        this.a = rha;
        this.b = gVar.O(kia.a);
        this.c = yVar;
        this.f = ria;
    }

    private void b(l<Optional<PlayerState>, d0<zwd>> lVar, oia.a aVar) {
        this.p.b(this.b.h0(1).Q(this.c).J(lVar).subscribe(new fia(aVar)));
    }

    @Override // defpackage.oia
    public void a(KeyEvent keyEvent, oia.a aVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            switch (keyEvent.getKeyCode()) {
                case 272:
                    ria ria = this.f;
                    ria.getClass();
                    this.p.b(ria.e().subscribe(new fia(aVar)));
                    break;
                case 273:
                    ria ria2 = this.f;
                    ria2.getClass();
                    this.p.b(ria2.g().subscribe(new fia(aVar)));
                    break;
                case 274:
                    ria ria3 = this.f;
                    ria3.getClass();
                    b(new cia(ria3), aVar);
                    break;
                case 275:
                    ria ria4 = this.f;
                    ria4.getClass();
                    b(new iia(ria4), aVar);
                    break;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79) {
            Logger.g("Handling Keycode Headset Hook", new Object[0]);
            if (SystemClock.elapsedRealtime() - this.o < 600) {
                ria ria5 = this.f;
                ria5.getClass();
                this.p.b(ria5.e().subscribe(new fia(aVar)));
                if (!this.n.d()) {
                    this.n.dispose();
                }
                this.p.b(this.a.d(1).subscribe());
            } else {
                ria ria6 = this.f;
                ria6.getClass();
                b(new jia(ria6), aVar);
                b subscribe = this.b.X(600, TimeUnit.MILLISECONDS, this.c).C(dia.a).O(mia.a).h0(1).a0().B(this.c).t(new hia(this)).B().subscribe();
                this.n = subscribe;
                this.p.b(subscribe);
            }
            this.o = SystemClock.elapsedRealtime();
        } else if (keyCode != 126) {
            if (keyCode != 127) {
                switch (keyCode) {
                    case 85:
                        Logger.g("Handling Keycode Media Play/Pause", new Object[0]);
                        ria ria7 = this.f;
                        ria7.getClass();
                        b(new jia(ria7), aVar);
                        return;
                    case 86:
                        break;
                    case 87:
                        Logger.g("Handling Keycode Media Next", new Object[0]);
                        ria ria8 = this.f;
                        ria8.getClass();
                        b(new eia(ria8), aVar);
                        return;
                    case 88:
                        Logger.g("Handling Keycode Media Previous", new Object[0]);
                        ria ria9 = this.f;
                        ria9.getClass();
                        b(new lia(ria9), aVar);
                        return;
                    default:
                        return;
                }
            }
            Logger.g("Handling Keycode Media Pause/Stop", new Object[0]);
            ria ria10 = this.f;
            ria10.getClass();
            this.p.b(ria10.f().subscribe(new fia(aVar)));
        } else {
            Logger.g("Handling Keycode Media Play", new Object[0]);
            ria ria11 = this.f;
            ria11.getClass();
            this.p.b(ria11.h().subscribe(new fia(aVar)));
        }
    }

    public /* synthetic */ e c(PlayerState playerState) {
        return this.a.c((!playerState.isPlaying() || playerState.isPaused()) ? 0 : 1);
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.p.b(this.b.subscribe(gia.a));
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        this.p.dispose();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "MediaButtonActionsHandlerPlugin";
    }
}
