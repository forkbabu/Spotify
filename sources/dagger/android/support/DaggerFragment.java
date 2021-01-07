package dagger.android.support;

import android.content.Context;
import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.b;
import dagger.android.h;

public abstract class DaggerFragment extends Fragment implements h {
    DispatchingAndroidInjector<Object> g0;

    public DaggerFragment() {
    }

    @Override // dagger.android.h
    public b<Object> C() {
        return this.g0;
    }

    @Override // androidx.fragment.app.Fragment
    public void p3(Context context) {
        a.a(this);
        super.p3(context);
    }

    public DaggerFragment(int i) {
        super(i);
    }
}
