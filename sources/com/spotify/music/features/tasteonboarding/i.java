package com.spotify.music.features.tasteonboarding;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.transition.ChangeBounds;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o;
import androidx.fragment.app.x;
import com.spotify.music.features.tasteonboarding.artistpicker.view.TastePickerFragment;
import com.spotify.music.features.tasteonboarding.artistsearch.view.ArtistSearchFragment;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import com.spotify.music.features.tasteonboarding.updatetaste.view.UpdateTasteFragment;
import com.spotify.music.sociallistening.participantlist.impl.m;
import java.util.ArrayDeque;
import java.util.Deque;

public class i {
    private final o a;
    private final int b;
    final Deque<gz1> c = new ArrayDeque();
    private final Context d;
    private Fragment e;
    public a f;

    public interface a {
    }

    public i(o oVar, int i, Context context) {
        this.a = oVar;
        this.b = i;
        this.d = context;
    }

    private void h(Fragment fragment, boolean z) {
        View W;
        x i = this.a.i();
        m.d(fragment, bu9.j);
        if (this.e == null) {
            i.b(this.b, fragment);
        } else {
            if (z) {
                if (this.c.size() >= 30) {
                    this.c.removeLast();
                }
                this.c.push(gz1.a(this.a, this.e));
            }
            Fragment fragment2 = this.e;
            if (Build.VERSION.SDK_INT >= 21 && (fragment2 instanceof uq8) && (fragment instanceof uq8)) {
                uq8 uq8 = (uq8) fragment2;
                uq8 uq82 = (uq8) fragment;
                boolean z2 = false;
                for (String str : uq8.K1()) {
                    if (uq82.h0(str) && (W = uq8.W(str)) != null) {
                        i.f(W, str);
                        z2 = true;
                    }
                }
                if (z2) {
                    fragment.C4(new ChangeBounds());
                }
            }
            i.q(this.b, fragment, null);
        }
        this.e = fragment;
        i.k();
        a aVar = this.f;
        if (aVar != null) {
            ((TasteOnboardingActivity) aVar).V0(this.e);
        }
    }

    public Fragment a() {
        return this.e;
    }

    public void b() {
        h(new ArtistSearchFragment(), true);
    }

    public void c() {
        h(new TastePickerFragment(), false);
    }

    public void d() {
        h(new UpdateTasteFragment(), false);
    }

    public void e(Bundle bundle) {
        ClassLoader classLoader = this.d.getClassLoader();
        Parcelable[] parcelableArray = bundle.getParcelableArray("entries");
        parcelableArray.getClass();
        for (Parcelable parcelable : parcelableArray) {
            Bundle bundle2 = (Bundle) parcelable;
            bundle2.setClassLoader(classLoader);
            this.c.push(gz1.d(classLoader, bundle2.getParcelable("fragment_snapshot")));
        }
        this.e = this.a.T(this.b);
    }

    public boolean f() {
        if (this.c.isEmpty()) {
            return false;
        }
        h(this.c.pop().c(this.a), false);
        return true;
    }

    public boolean g(TasteOnboardingItem tasteOnboardingItem) {
        if (this.c.isEmpty()) {
            return false;
        }
        Fragment c2 = this.c.pop().c(this.a);
        Bundle D2 = c2.D2();
        if (D2 == null) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("key_item_clicked_from_search", tasteOnboardingItem);
            c2.r4(bundle);
        } else {
            D2.putParcelable("key_item_clicked_from_search", tasteOnboardingItem);
        }
        h(c2, false);
        return true;
    }

    public void i() {
        this.e = this.a.T(this.b);
    }
}
