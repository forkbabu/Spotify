package com.spotify.music.homecomponents.promotionv2;

import com.spotify.music.libs.viewuri.c;
import com.spotify.player.model.ContextTrack;

public class HomePromotionPlayButtonLogger {
    private final jz1 a;
    private final ifd b;
    private final c c;
    private final cqe d;
    private final ere e;
    private final j81 f;

    /* access modifiers changed from: private */
    public enum InteractionType {
        HIT("hit");
        
        private final String mType;

        private InteractionType(String str) {
            this.mType = str;
        }

        public String d() {
            return this.mType;
        }
    }

    /* access modifiers changed from: private */
    public enum UserIntent {
        PLAY("play"),
        PAUSE(ContextTrack.TrackAction.PAUSE),
        RESUME(ContextTrack.TrackAction.RESUME);
        
        private final String mIntent;

        private UserIntent(String str) {
            this.mIntent = str;
        }

        public String d() {
            return this.mIntent;
        }
    }

    public HomePromotionPlayButtonLogger(jz1 jz1, ifd ifd, c cVar, cqe cqe, ere ere, j81 j81) {
        this.a = jz1;
        this.b = ifd;
        this.c = cVar;
        this.d = cqe;
        this.e = ere;
        this.f = j81;
    }

    private void a(String str, n61 n61, UserIntent userIntent) {
        p81 logging = n61.d().logging();
        this.a.a(new fa1(logging.string("ui:source"), this.b.getName(), this.c.toString(), logging.string("ui:group"), 0, str, InteractionType.HIT.d(), userIntent.d(), (double) this.d.d()));
    }

    public void b(String str, n61 n61) {
        a(str, n61, UserIntent.PAUSE);
        this.e.a(this.f.a(n61).c(str));
    }

    public String c(String str, n61 n61) {
        a(str, n61, UserIntent.PLAY);
        nqe d2 = this.f.a(n61).d(str);
        this.e.a(d2);
        return d2.b();
    }

    public void d(String str, n61 n61) {
        a(str, n61, UserIntent.RESUME);
        this.e.a(this.f.a(n61).f(str));
    }
}
