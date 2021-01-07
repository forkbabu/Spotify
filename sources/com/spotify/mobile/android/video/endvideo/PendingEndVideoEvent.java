package com.spotify.mobile.android.video.endvideo;

import com.spotify.mobile.android.video.v;

public final class PendingEndVideoEvent {
    private final Kind a;
    private final n b;
    private final String c;
    private final v.b d;

    public enum Kind {
        CREATE_IF_NOT_EXISTS,
        UPDATE,
        SEND
    }

    private PendingEndVideoEvent(Kind kind, n nVar, v.b bVar, String str) {
        this.a = kind;
        this.b = nVar;
        this.d = bVar;
        this.c = str;
    }

    public static PendingEndVideoEvent a() {
        return new PendingEndVideoEvent(Kind.CREATE_IF_NOT_EXISTS, null, null, "");
    }

    public static PendingEndVideoEvent f(v.b bVar) {
        return new PendingEndVideoEvent(Kind.SEND, null, bVar, "");
    }

    public static PendingEndVideoEvent g(n nVar, String str) {
        return new PendingEndVideoEvent(Kind.UPDATE, nVar, null, str);
    }

    public Kind b() {
        return this.a;
    }

    public n c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public void e() {
        v.b bVar = this.d;
        if (bVar != null) {
            bVar.a();
        }
    }
}
