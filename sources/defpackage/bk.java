package defpackage;

import com.comscore.streaming.AdvertisementType;
import com.google.android.exoplayer2.ParserException;
import java.util.ArrayDeque;

/* access modifiers changed from: package-private */
/* renamed from: bk  reason: default package */
public final class bk implements dk {
    private final byte[] a = new byte[8];
    private final ArrayDeque<b> b = new ArrayDeque<>();
    private final gk c = new gk();
    private ck d;
    private int e;
    private int f;
    private long g;

    /* access modifiers changed from: private */
    /* renamed from: bk$b */
    public static final class b {
        private final int a;
        private final long b;

        b(int i, long j, a aVar) {
            this.a = i;
            this.b = j;
        }
    }

    private long c(nj njVar, int i) {
        njVar.i(this.a, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (this.a[i2] & 255));
        }
        return j;
    }

    public void a(ck ckVar) {
        this.d = ckVar;
    }

    public boolean b(nj njVar) {
        int i;
        String str;
        double d2;
        this.d.getClass();
        while (true) {
            if (this.b.isEmpty() || njVar.e() < this.b.peek().b) {
                if (this.e == 0) {
                    long d3 = this.c.d(njVar, true, false, 4);
                    if (d3 == -2) {
                        njVar.j();
                        while (true) {
                            njVar.f(this.a, 0, 4, false);
                            int c2 = gk.c(this.a[0]);
                            if (c2 != -1 && c2 <= 4) {
                                int a2 = (int) gk.a(this.a, c2, false);
                                ek.this.getClass();
                                if (a2 == 357149030 || a2 == 524531317 || a2 == 475249515 || a2 == 374648427) {
                                    njVar.l(c2);
                                    d3 = (long) a2;
                                }
                            }
                            njVar.l(1);
                        }
                    }
                    if (d3 == -1) {
                        return false;
                    }
                    this.f = (int) d3;
                    this.e = 1;
                }
                if (this.e == 1) {
                    this.g = this.c.d(njVar, false, true, 8);
                    this.e = 2;
                }
                ck ckVar = this.d;
                int i2 = this.f;
                ek.this.getClass();
                switch (i2) {
                    case 131:
                    case 136:
                    case 155:
                    case 159:
                    case 176:
                    case 179:
                    case 186:
                    case 215:
                    case AdvertisementType.BRANDED_ON_DEMAND_PRE_ROLL /* 231 */:
                    case 238:
                    case 241:
                    case 251:
                    case 16980:
                    case 17029:
                    case 17143:
                    case 18401:
                    case 18408:
                    case 20529:
                    case 20530:
                    case 21420:
                    case 21432:
                    case 21680:
                    case 21682:
                    case 21690:
                    case 21930:
                    case 21945:
                    case 21946:
                    case 21947:
                    case 21948:
                    case 21949:
                    case 21998:
                    case 22186:
                    case 22203:
                    case 25188:
                    case 30321:
                    case 2352003:
                    case 2807729:
                        i = 2;
                        break;
                    case 134:
                    case 17026:
                    case 21358:
                    case 2274716:
                        i = 3;
                        break;
                    case 160:
                    case 166:
                    case 174:
                    case 183:
                    case 187:
                    case 224:
                    case 225:
                    case 18407:
                    case 19899:
                    case 20532:
                    case 20533:
                    case 21936:
                    case 21968:
                    case 25152:
                    case 28032:
                    case 30113:
                    case 30320:
                    case 290298740:
                    case 357149030:
                    case 374648427:
                    case 408125543:
                    case 440786851:
                    case 475249515:
                    case 524531317:
                        i = 1;
                        break;
                    case 161:
                    case 163:
                    case 165:
                    case 16981:
                    case 18402:
                    case 21419:
                    case 25506:
                    case 30322:
                        i = 4;
                        break;
                    case 181:
                    case 17545:
                    case 21969:
                    case 21970:
                    case 21971:
                    case 21972:
                    case 21973:
                    case 21974:
                    case 21975:
                    case 21976:
                    case 21977:
                    case 21978:
                    case 30323:
                    case 30324:
                    case 30325:
                        i = 5;
                        break;
                    default:
                        i = 0;
                        break;
                }
                if (i == 0) {
                    njVar.l((int) this.g);
                    this.e = 0;
                } else if (i == 1) {
                    long e2 = njVar.e();
                    this.b.push(new b(this.f, this.g + e2, null));
                    ek.this.r(this.f, e2, this.g);
                    this.e = 0;
                    return true;
                } else if (i == 2) {
                    long j = this.g;
                    if (j <= 8) {
                        ek.this.n(this.f, c(njVar, (int) j));
                        this.e = 0;
                        return true;
                    }
                    StringBuilder V0 = je.V0("Invalid integer size: ");
                    V0.append(this.g);
                    throw new ParserException(V0.toString());
                } else if (i == 3) {
                    long j2 = this.g;
                    if (j2 <= 2147483647L) {
                        ck ckVar2 = this.d;
                        int i3 = this.f;
                        int i4 = (int) j2;
                        if (i4 == 0) {
                            str = "";
                        } else {
                            byte[] bArr = new byte[i4];
                            njVar.i(bArr, 0, i4, false);
                            while (i4 > 0) {
                                int i5 = i4 - 1;
                                if (bArr[i5] == 0) {
                                    i4 = i5;
                                } else {
                                    str = new String(bArr, 0, i4);
                                }
                            }
                            str = new String(bArr, 0, i4);
                        }
                        ek.this.s(i3, str);
                        this.e = 0;
                        return true;
                    }
                    StringBuilder V02 = je.V0("String element size: ");
                    V02.append(this.g);
                    throw new ParserException(V02.toString());
                } else if (i == 4) {
                    ek.this.h(this.f, (int) this.g, njVar);
                    this.e = 0;
                    return true;
                } else if (i == 5) {
                    long j3 = this.g;
                    if (j3 == 4 || j3 == 8) {
                        ck ckVar3 = this.d;
                        int i6 = this.f;
                        int i7 = (int) j3;
                        long c3 = c(njVar, i7);
                        if (i7 == 4) {
                            d2 = (double) Float.intBitsToFloat((int) c3);
                        } else {
                            d2 = Double.longBitsToDouble(c3);
                        }
                        ek.this.l(i6, d2);
                        this.e = 0;
                        return true;
                    }
                    StringBuilder V03 = je.V0("Invalid float size: ");
                    V03.append(this.g);
                    throw new ParserException(V03.toString());
                } else {
                    throw new ParserException(je.p0("Invalid element type ", i));
                }
            } else {
                ek.this.j(this.b.pop().a);
                return true;
            }
        }
    }

    public void d() {
        this.e = 0;
        this.b.clear();
        this.c.e();
    }
}
