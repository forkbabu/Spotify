package dagger.android.support;

import android.content.Context;
import androidx.appcompat.app.AppCompatDialogFragment;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.b;
import dagger.android.h;

public abstract class DaggerAppCompatDialogFragment extends AppCompatDialogFragment implements h {
    DispatchingAndroidInjector<Object> u0;

    @Override // dagger.android.h
    public b<Object> C() {
        return this.u0;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void p3(Context context) {
        a.a(this);
        super.p3(context);
    }
}
