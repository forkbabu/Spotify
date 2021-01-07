package defpackage;

import android.os.IBinder;
import com.spotify.libs.connect.ConnectManager;
import com.spotify.libs.connect.l;
import com.spotify.mobile.android.service.a0;
import com.spotify.mobile.android.util.Assertion;

/* renamed from: la3  reason: default package */
public final /* synthetic */ class la3 implements l.a {
    public final /* synthetic */ ConnectManager a;

    public /* synthetic */ la3(ConnectManager connectManager) {
        this.a = connectManager;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.eg0.b
    public final ConnectManager a(IBinder iBinder) {
        ConnectManager connectManager = this.a;
        if (iBinder instanceof a0) {
            return ((a0) iBinder).a();
        }
        Class<?> cls = iBinder.getClass();
        Assertion.h(String.format("Wrong IBinder received: %s", cls.getName()), cls.getClassLoader().toString());
        return connectManager;
    }
}
