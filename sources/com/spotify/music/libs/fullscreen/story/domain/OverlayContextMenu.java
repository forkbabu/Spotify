package com.spotify.music.libs.fullscreen.story.domain;

import kotlin.jvm.internal.h;

public final class OverlayContextMenu {
    private final String a;
    private final String b;
    private final String c;
    private final Type d;

    public enum Type {
        TRACK,
        ALBUM,
        PLAYLIST,
        EPISODE
    }

    public OverlayContextMenu(String str, String str2, String str3, Type type) {
        h.e(str, "name");
        h.e(str2, "entityUri");
        h.e(str3, "contextUri");
        h.e(type, "type");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = type;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final Type d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OverlayContextMenu)) {
            return false;
        }
        OverlayContextMenu overlayContextMenu = (OverlayContextMenu) obj;
        return h.a(this.a, overlayContextMenu.a) && h.a(this.b, overlayContextMenu.b) && h.a(this.c, overlayContextMenu.c) && h.a(this.d, overlayContextMenu.d);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Type type = this.d;
        if (type != null) {
            i = type.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("OverlayContextMenu(name=");
        V0.append(this.a);
        V0.append(", entityUri=");
        V0.append(this.b);
        V0.append(", contextUri=");
        V0.append(this.c);
        V0.append(", type=");
        V0.append(this.d);
        V0.append(")");
        return V0.toString();
    }
}
