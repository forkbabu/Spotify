package com.spotify.mobile.android.hubframework.defaults.components.glue2;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.google.common.collect.Collections2;
import com.spotify.android.glue.components.trackcloud.a;
import com.spotify.android.glue.components.trackcloud.c;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import defpackage.s51;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Random;

class g0 extends i<c> {
    private final Random c = new Random();

    g0() {
        super(EnumSet.of(GlueLayoutTraits.Trait.STACKABLE), c.class);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [g90, s81, w51, s51$b] */
    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.i
    public void a(c cVar, s81 s81, w51 w51, s51.b bVar) {
        c cVar2 = cVar;
        p81[] bundleArray = s81.custom().bundleArray("tracks");
        String title = s81.text().title();
        boolean boolValue = s81.custom().boolValue("showArtists", true);
        int intValue = s81.custom().intValue("maxTracksToShow", 10);
        int i = 0;
        boolean boolValue2 = s81.custom().boolValue("showHearts", false);
        boolean boolValue3 = s81.custom().boolValue("showNumbers", false);
        boolean boolValue4 = s81.custom().boolValue("shuffle", false);
        int intValue2 = s81.custom().intValue("maxLines", 3);
        String str = "";
        String string = s81.custom().string("ellipsis", str);
        if (bundleArray != null) {
            ArrayList newArrayListWithCapacity = Collections2.newArrayListWithCapacity(bundleArray.length);
            int length = bundleArray.length;
            while (i < length) {
                p81 p81 = bundleArray[i];
                newArrayListWithCapacity.add(new a.C0145a(p81.string("trackName", str), p81.string("artistName", str), p81.boolValue("isHearted", false), p81.boolValue("isEnabled", true)));
                i++;
                length = length;
                bundleArray = bundleArray;
                cVar2 = cVar2;
                str = str;
                string = string;
                intValue2 = intValue2;
            }
            if (boolValue4) {
                a aVar = (a) bVar.a(s81);
                if (aVar == null) {
                    aVar = new a(this.c.nextInt());
                    bVar.b(s81, aVar);
                }
                Collections.shuffle(newArrayListWithCapacity, new Random((long) aVar.a));
            }
            com.spotify.android.glue.components.trackcloud.a a2 = com.spotify.android.glue.components.trackcloud.a.a();
            a2.o(title);
            a2.q(newArrayListWithCapacity);
            a2.i(boolValue);
            a2.h(intValue);
            a2.k(boolValue2);
            a2.m(boolValue3);
            a2.f(intValue2);
            a2.b(string);
            cVar2.c2(a2);
            i91.a(cVar2.getView());
            t51.a(w51, cVar2.getView(), s81);
            if (s81.events().containsKey("longClick")) {
                i91.b(w51.b()).e("longClick").d(s81).c(cVar2.getView()).b();
            }
        }
    }

    /* Return type fixed from 'g90' to match base method */
    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.i
    public c f(Context context, ViewGroup viewGroup, w51 w51) {
        return e90.f().a(context, viewGroup);
    }

    static class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0182a();
        final int a;

        /* renamed from: com.spotify.mobile.android.hubframework.defaults.components.glue2.g0$a$a  reason: collision with other inner class name */
        static class C0182a implements Parcelable.Creator<a> {
            C0182a() {
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

        a(int i) {
            this.a = i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
        }

        protected a(Parcel parcel) {
            this.a = parcel.readInt();
        }
    }
}
