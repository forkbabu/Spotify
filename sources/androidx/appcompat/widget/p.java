package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.m;

public interface p {
    boolean a();

    boolean b();

    boolean c();

    void collapseActionView();

    void d(Menu menu, m.a aVar);

    boolean e();

    void f();

    boolean g();

    Context getContext();

    CharSequence getTitle();

    boolean h();

    void i(int i);

    int j();

    x4 k(int i, long j);

    ViewGroup l();

    void m(boolean z);

    void n();

    void o(boolean z);

    void p();

    void q(a0 a0Var);

    void r(int i);

    int s();

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setVisibility(int i);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    void t();

    void u(Drawable drawable);
}
