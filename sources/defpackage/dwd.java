package defpackage;

import com.squareup.picasso.g;

/* renamed from: dwd  reason: default package */
public abstract class dwd extends g.a {
    private b a = new a(this);

    /* renamed from: dwd$a */
    private static class a extends b {
        public a(dwd dwd) {
            super(dwd);
        }
    }

    /* renamed from: dwd$b */
    public static abstract class b {
        private final dwd a;

        public b(dwd dwd) {
            this.a = dwd;
            dwd.a(dwd, this);
        }

        /* access modifiers changed from: protected */
        public final void a(int i) {
            this.a.onColorExtracted(i);
            this.a.onSuccess();
        }
    }

    static void a(dwd dwd, b bVar) {
        dwd.a = bVar;
    }

    public static int b(kvd kvd) {
        int b2 = kvd.b(-65281);
        return b2 == -65281 ? kvd.c(-7829368) : b2;
    }

    public abstract void onColorExtracted(int i);

    public void onPaletteGenerated(kvd kvd) {
        a aVar = (a) this.a;
        aVar.getClass();
        aVar.a(b(kvd));
    }
}
