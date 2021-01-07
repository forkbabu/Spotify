package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;

/* renamed from: p7  reason: default package */
public interface p7 extends Closeable {
    void A(String str);

    Cursor D1(String str);

    Cursor N(s7 s7Var, CancellationSignal cancellationSignal);

    boolean S1();

    void Y();

    void a0(String str, Object[] objArr);

    t7 e1(String str);

    void i0();

    boolean isOpen();

    String o();

    void t();

    Cursor w0(s7 s7Var);

    List<Pair<String, String>> z();
}
