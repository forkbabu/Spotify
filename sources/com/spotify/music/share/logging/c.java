package com.spotify.music.share.logging;

import android.content.Context;
import com.spotify.music.share.logging.ShareMenuLogger;
import com.spotify.ubi.specification.factories.s3;
import com.spotify.ubi.specification.factories.t3;
import kotlin.jvm.internal.h;

public final class c implements ShareMenuLogger {
    private final Context a;
    private final ere b;
    private final s3 c;
    private final t3 d;

    public c(Context context, ere ere, s3 s3Var, t3 t3Var) {
        h.e(context, "context");
        h.e(ere, "ubiLogger");
        h.e(s3Var, "menuEventFactory");
        h.e(t3Var, "subMenuEventFactory");
        this.a = context;
        this.b = ere;
        this.c = s3Var;
        this.d = t3Var;
    }

    @Override // com.spotify.music.share.logging.ShareMenuLogger
    public void a() {
        this.b.a(this.c.c().b());
    }

    @Override // com.spotify.music.share.logging.ShareMenuLogger
    public void b(int i, int i2, String str, String str2) {
        h.e(str, "entityUrl");
        ere ere = this.b;
        t3.b.a b2 = this.d.b().b(this.a.getString(i), Integer.valueOf(i2));
        if (str2 == null) {
            str2 = "";
        }
        ere.a(b2.a(str, str2));
    }

    @Override // com.spotify.music.share.logging.ShareMenuLogger
    public void c(int i, int i2) {
        this.b.a(this.c.c().c(this.a.getString(i), Integer.valueOf(i2)).b());
    }

    @Override // com.spotify.music.share.logging.ShareMenuLogger
    public void d(int i, int i2) {
        this.b.a(this.d.b().b(this.a.getString(i), Integer.valueOf(i2)).b());
    }

    @Override // com.spotify.music.share.logging.ShareMenuLogger
    public void e(int i, int i2, String str, String str2) {
        h.e(str, "entityUrl");
        ere ere = this.b;
        s3.c.a c2 = this.c.c().c(this.a.getString(i), Integer.valueOf(i2));
        if (str2 == null) {
            str2 = "";
        }
        ere.a(c2.a(str, str2));
    }

    @Override // com.spotify.music.share.logging.ShareMenuLogger
    public void f(ShareMenuLogger.ErrorMessageReason errorMessageReason) {
        h.e(errorMessageReason, "reason");
        this.b.a(this.c.b(errorMessageReason.d()).b());
    }

    @Override // com.spotify.music.share.logging.ShareMenuLogger
    public void g(ShareMenuLogger.ErrorMessageReason errorMessageReason) {
        h.e(errorMessageReason, "reason");
        this.b.a(this.c.b(errorMessageReason.d()).a());
    }

    @Override // com.spotify.music.share.logging.ShareMenuLogger
    public void h() {
        this.b.a(this.c.d().b().a());
    }
}
