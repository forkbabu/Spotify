package com.spotify.libs.onboarding.allboarding.picker;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.n;
import com.spotify.libs.onboarding.allboarding.room.AllboardingSearch;
import com.spotify.music.C0707R;
import java.io.Serializable;
import kotlin.jvm.internal.h;

final class q implements n {
    private final AllboardingSearch a;
    private final String b;

    public q(AllboardingSearch allboardingSearch, String str) {
        h.e(allboardingSearch, "searchConfig");
        h.e(str, "sessionId");
        this.a = allboardingSearch;
        this.b = str;
    }

    @Override // androidx.navigation.n
    public int a() {
        return C0707R.id.action_pickerFragment_to_searchFragment;
    }

    @Override // androidx.navigation.n
    public Bundle b() {
        Bundle bundle = new Bundle();
        if (Parcelable.class.isAssignableFrom(AllboardingSearch.class)) {
            AllboardingSearch allboardingSearch = this.a;
            if (allboardingSearch != null) {
                bundle.putParcelable("searchConfig", allboardingSearch);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.os.Parcelable");
            }
        } else if (Serializable.class.isAssignableFrom(AllboardingSearch.class)) {
            AllboardingSearch allboardingSearch2 = this.a;
            if (allboardingSearch2 != null) {
                bundle.putSerializable("searchConfig", (Serializable) allboardingSearch2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.io.Serializable");
            }
        } else {
            throw new UnsupportedOperationException(je.l0(AllboardingSearch.class, new StringBuilder(), " must implement Parcelable or Serializable or must be an Enum."));
        }
        bundle.putString("sessionId", this.b);
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return h.a(this.a, qVar.a) && h.a(this.b, qVar.b);
    }

    public int hashCode() {
        AllboardingSearch allboardingSearch = this.a;
        int i = 0;
        int hashCode = (allboardingSearch != null ? allboardingSearch.hashCode() : 0) * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ActionPickerFragmentToSearchFragment(searchConfig=");
        V0.append(this.a);
        V0.append(", sessionId=");
        return je.I0(V0, this.b, ")");
    }
}
