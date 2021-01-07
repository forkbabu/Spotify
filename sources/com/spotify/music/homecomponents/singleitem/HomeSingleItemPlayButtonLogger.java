package com.spotify.music.homecomponents.singleitem;

import com.spotify.music.libs.viewuri.c;
import com.spotify.player.model.ContextTrack;
import defpackage.uqe;

public class HomeSingleItemPlayButtonLogger {
    private final jz1 a;
    private final ifd b;
    private final c c;
    private final cqe d;
    private final ere e;

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

    public HomeSingleItemPlayButtonLogger(jz1 jz1, ifd ifd, c cVar, cqe cqe, ere ere) {
        this.a = jz1;
        this.b = ifd;
        this.c = cVar;
        this.d = cqe;
        this.e = ere;
    }

    private void a(String str, n61 n61, UserIntent userIntent) {
        this.a.a(new fa1(n61.d().logging().string("ui:source"), this.b.getName(), this.c.toString(), "single-item-play-button", 0, str, InteractionType.HIT.d(), userIntent.d(), (double) this.d.d()));
    }

    private uqe.b e(p81 p81) {
        return uqe.b(n81.b(p81, "")).c();
    }

    public void b(String str, n61 n61) {
        a(str, n61, UserIntent.PAUSE);
        this.e.a(e(n61.d().logging()).c(str));
    }

    public String c(String str, n61 n61) {
        a(str, n61, UserIntent.PLAY);
        nqe d2 = e(n61.d().logging()).d(str);
        this.e.a(d2);
        return d2.b();
    }

    public void d(String str, n61 n61) {
        a(str, n61, UserIntent.RESUME);
        this.e.a(e(n61.d().logging()).f(str));
    }
}
