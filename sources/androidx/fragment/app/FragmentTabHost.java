package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TabHost;
import java.util.ArrayList;

@Deprecated
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {
    private final ArrayList<b> a = new ArrayList<>();
    private int b;
    private TabHost.OnTabChangeListener c;
    private boolean f;

    static class a extends View.BaseSavedState {
        public static final Parcelable.Creator<a> CREATOR = new C0031a();
        String a;

        /* renamed from: androidx.fragment.app.FragmentTabHost$a$a  reason: collision with other inner class name */
        static class C0031a implements Parcelable.Creator<a> {
            C0031a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public a[] newArray(int i) {
                return new a[i];
            }
        }

        a(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // java.lang.Object
        public String toString() {
            StringBuilder V0 = je.V0("FragmentTabHost.SavedState{");
            V0.append(Integer.toHexString(System.identityHashCode(this)));
            V0.append(" curTab=");
            return je.I0(V0, this.a, "}");
        }

        @Override // android.view.View.BaseSavedState, android.os.Parcelable, android.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
        }

        a(Parcel parcel) {
            super(parcel);
            this.a = parcel.readString();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b {
    }

    @Deprecated
    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.b = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    private x a(String str, x xVar) {
        if (this.a.size() <= 0) {
            return null;
        }
        this.a.get(0).getClass();
        throw null;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    @Deprecated
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        if (this.a.size() <= 0) {
            this.f = true;
            x a2 = a(currentTabTag, null);
            if (a2 != null) {
                a2.i();
                throw null;
            }
            return;
        }
        this.a.get(0).getClass();
        throw null;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    @Deprecated
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f = false;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    @Deprecated
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.getSuperState());
        setCurrentTabByTag(aVar.a);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    @Deprecated
    public Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.a = getCurrentTabTag();
        return aVar;
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    @Deprecated
    public void onTabChanged(String str) {
        x a2;
        if (this.f && (a2 = a(str, null)) != null) {
            a2.i();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.c;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.c = onTabChangeListener;
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }
}
