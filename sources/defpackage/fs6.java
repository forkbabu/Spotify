package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: fs6  reason: default package */
public interface fs6 {

    /* renamed from: fs6$a */
    public interface a {
        fs6 create();
    }

    View a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    void b();

    void c(Bundle bundle);

    void d(Bundle bundle);

    ViewGroup e();

    twd f();

    void g(ar6 ar6, List<? extends View> list);

    void h(List<? extends View> list);

    void i(RecyclerView recyclerView);
}
