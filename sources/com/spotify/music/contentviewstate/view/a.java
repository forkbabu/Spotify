package com.spotify.music.contentviewstate.view;

import android.content.Context;
import android.view.View;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;

public class a implements b {
    private final View a;
    private final Context b;

    public a(Context context, View view) {
        if (context == null) {
            Assertion.p("Don't pass null context to constructor");
        }
        if (view == null) {
            Assertion.p("Don't pass null views to constructor");
        }
        this.b = context;
        this.a = view;
    }

    @Override // com.spotify.music.contentviewstate.view.b
    public void a() {
        this.a.setVisibility(0);
    }

    @Override // com.spotify.music.contentviewstate.view.b
    public long b() {
        return (long) this.b.getResources().getInteger(C0707R.integer.loading_view_delay_before_showing_throbber);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a) || ((a) obj).a != this.a) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
