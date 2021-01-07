package defpackage;

/* renamed from: o3  reason: default package */
public final class o3 {
    public static final n3 a = new d(null, false);
    public static final n3 b = new d(null, true);
    public static final n3 c;
    public static final n3 d;

    /* renamed from: o3$a */
    private static class a implements b {
        static final a a = new a();

        private a() {
        }

        @Override // defpackage.o3.b
        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i));
                n3 n3Var = o3.a;
                if (directionality != 0) {
                    if (!(directionality == 1 || directionality == 2)) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                i4 = 2;
                                break;
                        }
                        i++;
                    }
                    i4 = 0;
                    i++;
                }
                i4 = 1;
                i++;
            }
            return i4;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o3$b */
    public interface b {
        int a(CharSequence charSequence, int i, int i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: o3$c */
    public static abstract class c implements n3 {
        private final b a;

        c(b bVar) {
            this.a = bVar;
        }

        @Override // defpackage.n3
        public boolean a(CharSequence charSequence, int i, int i2) {
            if (i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            }
            b bVar = this.a;
            if (bVar == null) {
                return b();
            }
            int a2 = bVar.a(charSequence, i, i2);
            if (a2 == 0) {
                return true;
            }
            if (a2 != 1) {
                return b();
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public abstract boolean b();
    }

    /* renamed from: o3$d */
    private static class d extends c {
        private final boolean b;

        d(b bVar, boolean z) {
            super(bVar);
            this.b = z;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.o3.c
        public boolean b() {
            return this.b;
        }
    }

    static {
        a aVar = a.a;
        c = new d(aVar, false);
        d = new d(aVar, true);
    }
}
