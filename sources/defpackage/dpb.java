package defpackage;

import io.reactivex.functions.g;

/* renamed from: dpb  reason: default package */
public final /* synthetic */ class dpb implements g {
    public final /* synthetic */ wpb a;

    public /* synthetic */ dpb(wpb wpb) {
        this.a = wpb;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.a((Long) obj);
    }
}
