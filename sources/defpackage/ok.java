package defpackage;

import com.google.android.exoplayer2.util.v;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: ok  reason: default package */
public abstract class ok {
    public final int a;

    /* access modifiers changed from: package-private */
    /* renamed from: ok$a */
    public static final class a extends ok {
        public final long b;
        public final List<b> c = new ArrayList();
        public final List<a> d = new ArrayList();

        public a(int i, long j) {
            super(i);
            this.b = j;
        }

        public a b(int i) {
            int size = this.d.size();
            for (int i2 = 0; i2 < size; i2++) {
                a aVar = this.d.get(i2);
                if (aVar.a == i) {
                    return aVar;
                }
            }
            return null;
        }

        public b c(int i) {
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                b bVar = this.c.get(i2);
                if (bVar.a == i) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // defpackage.ok
        public String toString() {
            return ok.a(this.a) + " leaves: " + Arrays.toString(this.c.toArray()) + " containers: " + Arrays.toString(this.d.toArray());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ok$b */
    public static final class b extends ok {
        public final v b;

        public b(int i, v vVar) {
            super(i);
            this.b = vVar;
        }
    }

    public ok(int i) {
        this.a = i;
    }

    public static String a(int i) {
        StringBuilder V0 = je.V0("");
        V0.append((char) ((i >> 24) & BitmapRenderer.ALPHA_VISIBLE));
        V0.append((char) ((i >> 16) & BitmapRenderer.ALPHA_VISIBLE));
        V0.append((char) ((i >> 8) & BitmapRenderer.ALPHA_VISIBLE));
        V0.append((char) (i & BitmapRenderer.ALPHA_VISIBLE));
        return V0.toString();
    }

    public String toString() {
        return a(this.a);
    }
}
