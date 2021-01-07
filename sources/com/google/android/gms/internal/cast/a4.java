package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.r5;

public final class a4 extends r5<a4, a> implements a7 {
    private static volatile i7<a4> zzahx;
    private static final a4 zzbjd;
    private int zzahj;
    private int zzbiz;
    private int zzbja;
    private int zzbjb;
    private z5<b> zzbjc = j7.f();

    public static final class a extends r5.b<a4, a> implements a7 {
        a(y2 y2Var) {
            super(a4.zzbjd);
        }
    }

    public static final class b extends r5<b, a> implements a7 {
        private static volatile i7<b> zzahx;
        private static final b zzbji;
        private int zzahj;
        private int zzbje;
        private int zzbjf;
        private int zzbjg;
        private int zzbjh;

        public static final class a extends r5.b<b, a> implements a7 {
            a(y2 y2Var) {
                super(b.zzbji);
            }
        }

        static {
            b bVar = new b();
            zzbji = bVar;
            r5.l(b.class, bVar);
        }

        private b() {
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.cast.r5
        public final Object j(int i, Object obj, Object obj2) {
            switch (y2.a[i - 1]) {
                case 1:
                    return new b();
                case 2:
                    return new a(null);
                case 3:
                    return new n7(zzbji, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzahj", "zzbje", "zzbjf", "zzbjg", "zzbjh"});
                case 4:
                    return zzbji;
                case 5:
                    i7<b> i7Var = zzahx;
                    if (i7Var == null) {
                        synchronized (b.class) {
                            i7Var = zzahx;
                            if (i7Var == null) {
                                i7Var = new r5.a<>(zzbji);
                                zzahx = i7Var;
                            }
                        }
                    }
                    return i7Var;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    static {
        a4 a4Var = new a4();
        zzbjd = a4Var;
        r5.l(a4.class, a4Var);
    }

    private a4() {
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.cast.r5
    public final Object j(int i, Object obj, Object obj2) {
        switch (y2.a[i - 1]) {
            case 1:
                return new a4();
            case 2:
                return new a(null);
            case 3:
                return new n7(zzbjd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004\u001b", new Object[]{"zzahj", "zzbiz", "zzbja", "zzbjb", "zzbjc", b.class});
            case 4:
                return zzbjd;
            case 5:
                i7<a4> i7Var = zzahx;
                if (i7Var == null) {
                    synchronized (a4.class) {
                        i7Var = zzahx;
                        if (i7Var == null) {
                            i7Var = new r5.a<>(zzbjd);
                            zzahx = i7Var;
                        }
                    }
                }
                return i7Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
