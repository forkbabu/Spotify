package com.spotify.music.features.languagepicker.model;

import android.os.Parcelable;
import java.util.Comparator;

public abstract class g implements Parcelable {
    public static final Comparator<g> a = new a();

    static class a implements Comparator<g> {
        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // java.util.Comparator
        public int compare(g gVar, g gVar2) {
            return gVar.e().compareTo(gVar2.e());
        }
    }

    public abstract String a();

    public g b(boolean z) {
        return new d(e(), c(), a(), z);
    }

    public abstract String c();

    public abstract String e();

    public abstract boolean f();
}
