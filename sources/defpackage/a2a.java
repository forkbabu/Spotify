package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.libs.assistedcuration.adapter.AssistedCurationCardAdapter;
import com.spotify.music.libs.assistedcuration.model.h;
import com.spotify.music.libs.assistedcuration.presenter.s;
import java.util.ArrayList;
import java.util.List;

/* renamed from: a2a  reason: default package */
public interface a2a extends AssistedCurationCardAdapter.a {

    /* renamed from: a2a$a */
    public interface a {
        a2a a(com.spotify.instrumentation.a aVar, x1a x1a);
    }

    View a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    void b(String str);

    void d(Bundle bundle);

    void f(Bundle bundle);

    void h();

    void i(ArrayList<String> arrayList);

    void j(List<h> list, boolean z, boolean z2);

    void l();

    void m(String str);

    void n(s sVar);

    void o();

    void p();
}
