package com.spotify.music.features.yourlibraryx.view.entities.swipe;

import kotlin.f;
import kotlin.jvm.internal.h;

public final class SwipeAction {
    private final int a;
    private final a b;
    private final cmf<f> c;

    public SwipeAction(int i, a aVar, cmf<f> cmf) {
        h.e(aVar, "swipeActionDrawable");
        h.e(cmf, "onAction");
        this.a = i;
        this.b = aVar;
        this.c = cmf;
    }

    public static SwipeAction a(SwipeAction swipeAction, int i, a aVar, cmf cmf, int i2) {
        if ((i2 & 1) != 0) {
            i = swipeAction.a;
        }
        a aVar2 = (i2 & 2) != 0 ? swipeAction.b : null;
        if ((i2 & 4) != 0) {
            cmf = swipeAction.c;
        }
        h.e(aVar2, "swipeActionDrawable");
        h.e(cmf, "onAction");
        return new SwipeAction(i, aVar2, cmf);
    }

    public final int b() {
        return this.a;
    }

    public final cmf<f> c() {
        return this.c;
    }

    public final a d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwipeAction)) {
            return false;
        }
        SwipeAction swipeAction = (SwipeAction) obj;
        return this.a == swipeAction.a && h.a(this.b, swipeAction.b) && h.a(this.c, swipeAction.c);
    }

    public int hashCode() {
        int i = this.a * 31;
        a aVar = this.b;
        int i2 = 0;
        int hashCode = (i + (aVar != null ? aVar.hashCode() : 0)) * 31;
        cmf<f> cmf = this.c;
        if (cmf != null) {
            i2 = cmf.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder V0 = je.V0("SwipeAction(backgroundColor=");
        V0.append(this.a);
        V0.append(", swipeActionDrawable=");
        V0.append(this.b);
        V0.append(", onAction=");
        V0.append(this.c);
        V0.append(")");
        return V0.toString();
    }

    public SwipeAction(int i, a aVar, cmf cmf, int i2) {
        AnonymousClass1 r3 = (i2 & 4) != 0 ? AnonymousClass1.a : null;
        h.e(aVar, "swipeActionDrawable");
        h.e(r3, "onAction");
        this.a = i;
        this.b = aVar;
        this.c = r3;
    }
}
