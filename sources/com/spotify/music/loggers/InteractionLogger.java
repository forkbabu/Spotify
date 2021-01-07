package com.spotify.music.loggers;

import com.spotify.instrumentation.a;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.ubi.interactions.InteractionAction;

public class InteractionLogger {
    private final a a;
    private final c b;
    private final jz1 c;
    private final cqe d;

    public enum InteractionType {
        SCROLL("scroll"),
        SWIPE("swipe"),
        SWIPE_LEFT("swipe-left"),
        SWIPE_RIGHT("swipe-right"),
        HIT("hit"),
        DEFERRED("deferred"),
        DRAG("drag"),
        DRAG_SLIDER("drag-slider"),
        TAP("tap");
        
        private final String mStrValue;

        private InteractionType(String str) {
            this.mStrValue = str;
        }

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            return this.mStrValue;
        }
    }

    public InteractionLogger(jz1 jz1, c cVar, a aVar, cqe cqe) {
        this.c = jz1;
        this.b = cVar;
        this.a = aVar;
        this.d = cqe;
    }

    private void f(String str, String str2, String str3, String str4, int i, InteractionType interactionType, String str5, InteractionAction interactionAction) {
        m91 m91;
        if (interactionAction != null) {
            m91 = new ga1(str, str3, this.b.toString(), str4, (long) i, str2, interactionType.toString(), str5, (double) this.d.d(), interactionAction.d());
        } else {
            m91 = new fa1(str, str3, this.b.toString(), str4, (long) i, str2, interactionType.toString(), str5, (double) this.d.d());
        }
        this.c.a(m91);
    }

    public void a(String str, String str2, int i, InteractionType interactionType, String str3) {
        c("", str, str2, i, interactionType, str3);
    }

    public void b(String str, String str2, int i, InteractionType interactionType, String str3, InteractionAction interactionAction) {
        f("", str, this.a.path(), str2, i, interactionType, str3, interactionAction);
    }

    public void c(String str, String str2, String str3, int i, InteractionType interactionType, String str4) {
        e(str, str2, this.a.path(), str3, i, interactionType, str4);
    }

    public void d(String str, String str2, String str3, int i, InteractionType interactionType, String str4, InteractionAction interactionAction) {
        f(str, str2, this.a.path(), str3, i, interactionType, str4, interactionAction);
    }

    public void e(String str, String str2, String str3, String str4, int i, InteractionType interactionType, String str5) {
        f(str, str2, str3, str4, i, interactionType, str5, null);
    }
}
