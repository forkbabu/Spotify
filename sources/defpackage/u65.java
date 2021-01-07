package defpackage;

import com.spotify.encore.consumer.components.artist.api.trackrow.Event;
import defpackage.w65;
import kotlin.f;

/* renamed from: u65  reason: default package */
public final /* synthetic */ class u65 implements nmf {
    public final /* synthetic */ w65.a a;
    public final /* synthetic */ s81 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String f;

    public /* synthetic */ u65(w65.a aVar, s81 s81, int i, String str) {
        this.a = aVar;
        this.b = s81;
        this.c = i;
        this.f = str;
    }

    @Override // defpackage.nmf
    public final Object invoke(Object obj) {
        this.a.B(this.b, this.c, this.f, (Event) obj);
        return f.a;
    }
}
