package com.spotify.music.features.notificationsettings.combined;

import com.spotify.localization.SpotifyLocale;
import com.spotify.music.features.notificationsettings.common.Channel;
import com.spotify.music.notification.c;
import com.spotify.ubi.specification.factories.r1;
import io.reactivex.disposables.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class g implements e {
    private final c a;
    private final r1 b;
    private final ere c;
    private final List<String> d = new ArrayList(5);
    private f e;
    a f = new a();

    public g(c cVar, r1 r1Var, ere ere) {
        this.a = cVar;
        this.b = r1Var;
        this.c = ere;
    }

    public static void f(g gVar, List list) {
        if (list == null) {
            gVar.d.clear();
            ((h) gVar.e).b(Collections.emptyList());
            return;
        }
        ((h) gVar.e).b(list);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.spotify.music.features.notificationsettings.combined.e
    public void a(String str, Channel channel, boolean z) {
        io.reactivex.a aVar;
        nqe nqe;
        this.d.add(str);
        String lowerCase = channel.name().toLowerCase(Locale.US);
        if (z) {
            aVar = this.a.b(lowerCase, str);
        } else {
            aVar = this.a.c(lowerCase, str);
        }
        str.hashCode();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1474763089:
                if (str.equals("notify-recommended-music")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1318328504:
                if (str.equals("notify-artist-updates")) {
                    c2 = 1;
                    break;
                }
                break;
            case -828406013:
                if (str.equals("notify-news-and-offers")) {
                    c2 = 2;
                    break;
                }
                break;
            case 203138612:
                if (str.equals("notify-new-music")) {
                    c2 = 3;
                    break;
                }
                break;
            case 822001277:
                if (str.equals("notify-concert-notifications")) {
                    c2 = 4;
                    break;
                }
                break;
            case 1331895763:
                if (str.equals("notify-playlist-updates")) {
                    c2 = 5;
                    break;
                }
                break;
            case 1648494837:
                if (str.equals("notify-product-news")) {
                    c2 = 6;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                if (channel == Channel.PUSH) {
                    if (!z) {
                        nqe = this.b.h().c().a();
                        break;
                    } else {
                        nqe = this.b.h().c().b();
                        break;
                    }
                } else {
                    if (channel == Channel.EMAIL) {
                        if (!z) {
                            nqe = this.b.h().b().a();
                            break;
                        } else {
                            nqe = this.b.h().b().b();
                            break;
                        }
                    }
                    nqe = null;
                    break;
                }
            case 1:
                if (channel == Channel.PUSH) {
                    if (!z) {
                        nqe = this.b.b().c().a();
                        break;
                    } else {
                        nqe = this.b.b().c().b();
                        break;
                    }
                } else {
                    if (channel == Channel.EMAIL) {
                        if (!z) {
                            nqe = this.b.b().b().a();
                            break;
                        } else {
                            nqe = this.b.b().b().b();
                            break;
                        }
                    }
                    nqe = null;
                    break;
                }
            case 2:
                if (channel == Channel.PUSH) {
                    if (!z) {
                        nqe = this.b.e().c().a();
                        break;
                    } else {
                        nqe = this.b.e().c().b();
                        break;
                    }
                } else {
                    if (channel == Channel.EMAIL) {
                        if (!z) {
                            nqe = this.b.e().b().a();
                            break;
                        } else {
                            nqe = this.b.e().b().b();
                            break;
                        }
                    }
                    nqe = null;
                    break;
                }
            case 3:
                if (channel == Channel.PUSH) {
                    if (!z) {
                        nqe = this.b.d().c().a();
                        break;
                    } else {
                        nqe = this.b.d().c().b();
                        break;
                    }
                } else {
                    if (channel == Channel.EMAIL) {
                        if (!z) {
                            nqe = this.b.d().b().a();
                            break;
                        } else {
                            nqe = this.b.d().b().b();
                            break;
                        }
                    }
                    nqe = null;
                    break;
                }
            case 4:
                if (channel == Channel.PUSH) {
                    if (!z) {
                        nqe = this.b.c().c().a();
                        break;
                    } else {
                        nqe = this.b.c().c().b();
                        break;
                    }
                } else {
                    if (channel == Channel.EMAIL) {
                        if (!z) {
                            nqe = this.b.c().b().a();
                            break;
                        } else {
                            nqe = this.b.c().b().b();
                            break;
                        }
                    }
                    nqe = null;
                    break;
                }
            case 5:
                if (channel == Channel.PUSH) {
                    if (!z) {
                        nqe = this.b.f().c().a();
                        break;
                    } else {
                        nqe = this.b.f().c().b();
                        break;
                    }
                } else {
                    if (channel == Channel.EMAIL) {
                        if (!z) {
                            nqe = this.b.f().b().a();
                            break;
                        } else {
                            nqe = this.b.f().b().b();
                            break;
                        }
                    }
                    nqe = null;
                    break;
                }
            case 6:
                if (channel == Channel.PUSH) {
                    if (!z) {
                        nqe = this.b.g().c().a();
                        break;
                    } else {
                        nqe = this.b.g().c().b();
                        break;
                    }
                } else {
                    if (channel == Channel.EMAIL) {
                        if (!z) {
                            nqe = this.b.g().b().a();
                            break;
                        } else {
                            nqe = this.b.g().b().b();
                            break;
                        }
                    }
                    nqe = null;
                    break;
                }
            default:
                nqe = null;
                break;
        }
        if (nqe != null) {
            this.c.a(nqe);
        }
        this.f.b(aVar.A(io.reactivex.android.schedulers.a.b()).subscribe(new a(this, str, channel, z), new c(this)));
    }

    @Override // com.spotify.music.features.notificationsettings.combined.e
    public void b(f fVar) {
        if (this.e != fVar) {
            this.e = fVar;
            ((h) fVar).e(this);
        }
    }

    public /* synthetic */ void c(Throwable th) {
        ((h) this.e).f();
    }

    public /* synthetic */ void d(String str, Channel channel, boolean z) {
        this.d.remove(str);
        if (!this.d.contains(str)) {
            ((h) this.e).c(str, channel, z);
        }
    }

    public /* synthetic */ void e(Throwable th) {
        ((h) this.e).f();
    }

    @Override // com.spotify.music.features.notificationsettings.combined.e
    public void start() {
        this.f.b(this.a.a(SpotifyLocale.c()).B(io.reactivex.android.schedulers.a.b()).subscribe(new d(this), new b(this)));
    }

    @Override // com.spotify.music.features.notificationsettings.combined.e
    public void stop() {
        this.f.f();
    }
}
