package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import defpackage.di9;
import defpackage.ni9;

/* access modifiers changed from: package-private */
/* renamed from: oi9  reason: default package */
public class oi9 implements ni9.c {
    final /* synthetic */ di9.d a;
    final /* synthetic */ pi9 b;

    oi9(pi9 pi9, di9.d dVar) {
        this.b = pi9;
        this.a = dVar;
    }

    @Override // defpackage.ni9.c
    public int a() {
        return this.a.e();
    }

    @Override // defpackage.ni9.c
    public SpotifyIconV2 getIcon() {
        return pi9.a(this.b, this.a);
    }

    @Override // defpackage.ni9.c
    public String getKey() {
        return this.a.c().c();
    }
}
