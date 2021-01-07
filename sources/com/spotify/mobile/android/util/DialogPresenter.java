package com.spotify.mobile.android.util;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.ui.fragments.logic.PresentableDialogFragment;
import java.util.ArrayList;

public class DialogPresenter extends Fragment {
    private ArrayList<b> g0 = new ArrayList<>();
    private ArrayList<b> h0 = new ArrayList<>();
    private b i0;
    private boolean j0;

    private synchronized void L4() {
        if (this.j0) {
            if (!this.h0.isEmpty()) {
                if (this.i0 == null) {
                    b remove = this.h0.remove(0);
                    this.i0 = remove;
                    PresentableDialogFragment presentableDialogFragment = (PresentableDialogFragment) Q2().U(remove.a);
                    if (presentableDialogFragment == null) {
                        b bVar = this.i0;
                        throw new AssertionError(String.format("Cannot find fragment with tag (%s)", bVar != null ? bVar.a : null));
                    }
                    Logger.b("Showing dialog (%s)", presentableDialogFragment);
                    presentableDialogFragment.L4();
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void H3() {
        super.H3();
        this.j0 = false;
    }

    public synchronized int K4(PresentableDialogFragment presentableDialogFragment) {
        this.g0.add(new b(presentableDialogFragment.X2(), (a) null));
        return this.g0.size();
    }

    @Override // androidx.fragment.app.Fragment
    public void M3() {
        super.M3();
        this.j0 = true;
        if (this.i0 == null) {
            L4();
        }
    }

    public synchronized void M4(PresentableDialogFragment presentableDialogFragment) {
        Logger.b("Queuing dialog (%s)", presentableDialogFragment);
        this.h0.add(new b(presentableDialogFragment.X2(), (a) null));
        L4();
    }

    @Override // androidx.fragment.app.Fragment
    public synchronized void N3(Bundle bundle) {
        bundle.putParcelableArrayList("request_code_map", this.g0);
        bundle.putParcelableArrayList("dialog_queue", this.h0);
        bundle.putParcelable("current_dialog", this.i0);
    }

    @Override // androidx.fragment.app.Fragment
    public synchronized void n3(int i, int i2, Intent intent) {
        b bVar = this.g0.get(i - 1);
        PresentableDialogFragment presentableDialogFragment = (PresentableDialogFragment) Q2().U(bVar.a);
        Logger.b("Dialog has closed (%s)", presentableDialogFragment);
        if (presentableDialogFragment != null) {
            Assertion.a(bVar, this.i0);
            this.i0 = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void s3(Bundle bundle) {
        super.s3(bundle);
        if (bundle != null) {
            synchronized (this) {
                ArrayList<b> parcelableArrayList = bundle.getParcelableArrayList("request_code_map");
                parcelableArrayList.getClass();
                this.g0 = parcelableArrayList;
                ArrayList<b> parcelableArrayList2 = bundle.getParcelableArrayList("dialog_queue");
                parcelableArrayList2.getClass();
                this.h0 = parcelableArrayList2;
                this.i0 = (b) bundle.getParcelable("current_dialog");
            }
        }
    }

    /* access modifiers changed from: private */
    public static class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();
        private final String a;

        static class a implements Parcelable.Creator<b> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, (a) null);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public b[] newArray(int i) {
                return new b[i];
            }
        }

        b(String str, a aVar) {
            this.a = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // java.lang.Object
        public boolean equals(Object obj) {
            return (obj instanceof b) && ((b) obj).a.equals(this.a);
        }

        @Override // java.lang.Object
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.a);
        }

        b(Parcel parcel, a aVar) {
            this.a = parcel.readString();
        }
    }
}
