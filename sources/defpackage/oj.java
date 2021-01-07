package defpackage;

import com.google.android.exoplayer2.extractor.flv.b;
import com.google.android.exoplayer2.util.e0;
import java.lang.reflect.Constructor;
import java.util.Collections;

/* renamed from: oj  reason: default package */
public final class oj implements sj {
    private static final Constructor<? extends qj> a;

    static {
        Constructor<? extends U> constructor;
        try {
            constructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(qj.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException unused) {
            constructor = null;
        } catch (Exception e) {
            throw new RuntimeException("Error instantiating FLAC extension", e);
        }
        a = constructor;
    }

    @Override // defpackage.sj
    public synchronized qj[] a() {
        qj[] qjVarArr;
        Constructor<? extends qj> constructor = a;
        qjVarArr = new qj[(constructor == null ? 13 : 14)];
        qjVarArr[0] = new ek(0);
        qjVarArr[1] = new rk(0, null, null, null, Collections.emptyList());
        qjVarArr[2] = new uk(0);
        qjVarArr[3] = new kk(0, -9223372036854775807L);
        qjVarArr[4] = new ql(0);
        qjVarArr[5] = new ml();
        qjVarArr[6] = new nm(1, new e0(0), new sl(0));
        qjVarArr[7] = new b();
        qjVarArr[8] = new dl();
        qjVarArr[9] = new gm();
        qjVarArr[10] = new rm();
        qjVarArr[11] = new ak(0);
        qjVarArr[12] = new ol();
        if (constructor != null) {
            try {
                qjVarArr[13] = (qj) constructor.newInstance(new Object[0]);
            } catch (Exception e) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
            }
        }
        return qjVarArr;
    }
}
