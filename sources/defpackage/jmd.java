package defpackage;

import com.spotify.music.ubi.interactions.InteractionAction;

/* renamed from: jmd  reason: default package */
public final class jmd {
    private final jz1 a;

    jmd(jz1 jz1) {
        this.a = jz1;
    }

    public void a(String str, String str2, boolean z) {
        this.a.a(new ga1(null, null, str, "options-menu", -1, str2, "hit", z ? "follow" : "unfollow", (double) System.currentTimeMillis(), (z ? InteractionAction.FOLLOW : InteractionAction.UNFOLLOW).d()));
    }
}
