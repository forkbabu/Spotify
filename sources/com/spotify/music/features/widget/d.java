package com.spotify.music.features.widget;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import com.google.common.base.Optional;

/* access modifiers changed from: package-private */
public final class d extends m {
    private final Optional<Bitmap> a;
    private final String b;
    private final String c;
    private final f d;
    private final e e;
    private final f f;
    private final PendingIntent g;

    d(Optional<Bitmap> optional, String str, String str2, f fVar, e eVar, f fVar2, PendingIntent pendingIntent) {
        if (optional != null) {
            this.a = optional;
            if (str != null) {
                this.b = str;
                if (str2 != null) {
                    this.c = str2;
                    if (fVar != null) {
                        this.d = fVar;
                        if (eVar != null) {
                            this.e = eVar;
                            if (fVar2 != null) {
                                this.f = fVar2;
                                if (pendingIntent != null) {
                                    this.g = pendingIntent;
                                    return;
                                }
                                throw new NullPointerException("Null clickIntent");
                            }
                            throw new NullPointerException("Null skipNextButton");
                        }
                        throw new NullPointerException("Null playPauseButton");
                    }
                    throw new NullPointerException("Null skipPrevButton");
                }
                throw new NullPointerException("Null subtitle");
            }
            throw new NullPointerException("Null title");
        }
        throw new NullPointerException("Null coverArt");
    }

    @Override // com.spotify.music.features.widget.m
    public PendingIntent a() {
        return this.g;
    }

    @Override // com.spotify.music.features.widget.m
    public Optional<Bitmap> b() {
        return this.a;
    }

    @Override // com.spotify.music.features.widget.m
    public e d() {
        return this.e;
    }

    @Override // com.spotify.music.features.widget.m
    public f e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (!this.a.equals(mVar.b()) || !this.b.equals(mVar.h()) || !this.c.equals(mVar.g()) || !this.d.equals(mVar.f()) || !this.e.equals(mVar.d()) || !this.f.equals(mVar.e()) || !this.g.equals(mVar.a())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.features.widget.m
    public f f() {
        return this.d;
    }

    @Override // com.spotify.music.features.widget.m
    public String g() {
        return this.c;
    }

    @Override // com.spotify.music.features.widget.m
    public String h() {
        return this.b;
    }

    public int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("SpotifyWidgetViewData{coverArt=");
        V0.append(this.a);
        V0.append(", title=");
        V0.append(this.b);
        V0.append(", subtitle=");
        V0.append(this.c);
        V0.append(", skipPrevButton=");
        V0.append(this.d);
        V0.append(", playPauseButton=");
        V0.append(this.e);
        V0.append(", skipNextButton=");
        V0.append(this.f);
        V0.append(", clickIntent=");
        V0.append(this.g);
        V0.append("}");
        return V0.toString();
    }
}
