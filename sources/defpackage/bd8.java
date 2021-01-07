package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.libs.search.history.h;

/* renamed from: bd8  reason: default package */
public class bd8 implements we8, ve8 {
    private final dd8 a;
    private final h b;

    public bd8(dd8 dd8, h hVar) {
        this.a = dd8;
        this.b = hVar;
    }

    private boolean c(b91 b91) {
        if (b91 == null) {
            return true;
        }
        if (this.b.b(b91)) {
            return true;
        }
        if (!b91.overlays().isEmpty() ? "search-start-empty-view".equals(((s81) b91.overlays().get(0)).custom().get("tag")) : false) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ve8
    public void a(b91 b91, b91 b912) {
        if (!rqa.m(b91)) {
            if (!c(b91) && !yf8.g(b91)) {
                return;
            }
            if (rqa.m(b912)) {
                this.a.d();
            } else if (yf8.f(b912)) {
                this.a.c();
            } else if (!c(b912) && !yf8.g(b912)) {
                this.a.reset();
            }
        }
    }

    @Override // defpackage.we8
    public void b(b91 b91, String str, String str2) {
        if (!rqa.m(b91)) {
            boolean z = true;
            if (c(b91) && MoreObjects.isNullOrEmpty(str) && !MoreObjects.isNullOrEmpty(str2)) {
                this.a.e();
                return;
            }
            if ((!c(b91) && !yf8.g(b91)) || !MoreObjects.isNullOrEmpty(str2)) {
                z = false;
            }
            if (z) {
                this.a.a();
            }
        }
    }
}
