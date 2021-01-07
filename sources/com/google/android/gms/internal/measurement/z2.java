package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.b3;
import com.google.android.gms.internal.measurement.z2;
import com.google.android.gms.internal.measurement.zzhf;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class z2<MessageType extends z2<MessageType, BuilderType>, BuilderType extends b3<MessageType, BuilderType>> implements l5 {
    protected int zza = 0;

    protected static <T> void h(Iterable<T> iterable, List<? super T> list) {
        Charset charset = h4.a;
        iterable.getClass();
        if (iterable instanceof t4) {
            List<?> b = ((t4) iterable).b();
            t4 t4Var = (t4) list;
            int size = list.size();
            for (Object obj : b) {
                if (obj == null) {
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(t4Var.size() - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    int size2 = t4Var.size();
                    while (true) {
                        size2--;
                        if (size2 >= size) {
                            t4Var.remove(size2);
                        } else {
                            throw new NullPointerException(sb2);
                        }
                    }
                } else if (obj instanceof zzgm) {
                    t4Var.j0((zzgm) obj);
                } else {
                    t4Var.add((String) obj);
                }
            }
        } else if (iterable instanceof v5) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
            }
            int size3 = list.size();
            for (T t : iterable) {
                if (t == null) {
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append("Element at index ");
                    sb3.append(list.size() - size3);
                    sb3.append(" is null.");
                    String sb4 = sb3.toString();
                    int size4 = list.size();
                    while (true) {
                        size4--;
                        if (size4 >= size3) {
                            list.remove(size4);
                        } else {
                            throw new NullPointerException(sb4);
                        }
                    }
                } else {
                    list.add(t);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.l5
    public final zzgm b() {
        f4 f4Var = (f4) this;
        try {
            int c = f4Var.c();
            zzgm zzgm = zzgm.a;
            l3 l3Var = new l3(c, null);
            f4Var.f(l3Var.b());
            return l3Var.a();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder U0 = je.U0("ByteString".length() + name.length() + 62, "Serializing ", name, " to a ", "ByteString");
            U0.append(" threw an IOException (should never happen).");
            throw new RuntimeException(U0.toString(), e);
        }
    }

    public final byte[] i() {
        f4 f4Var = (f4) this;
        try {
            int c = f4Var.c();
            byte[] bArr = new byte[c];
            int i = zzhf.d;
            zzhf.a aVar = new zzhf.a(bArr, c);
            f4Var.f(aVar);
            if (aVar.b() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder U0 = je.U0(name.length() + 62 + 10, "Serializing ", name, " to a ", "byte array");
            U0.append(" threw an IOException (should never happen).");
            throw new RuntimeException(U0.toString(), e);
        }
    }

    /* access modifiers changed from: package-private */
    public int k() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public void l(int i) {
        throw new UnsupportedOperationException();
    }
}
