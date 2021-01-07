package com.spotify.music.superbird.setup;

import java.util.Comparator;
import java.util.Date;
import kotlin.Result$Failure;

public final class h<T> implements Comparator<T> {
    final /* synthetic */ SuperbirdSetupFragmentViewModel a;

    public h(SuperbirdSetupFragmentViewModel superbirdSetupFragmentViewModel) {
        this.a = superbirdSetupFragmentViewModel;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        Object obj;
        Object obj2;
        try {
            obj = this.a.e.parse(t2.getModified());
        } catch (Throwable th) {
            obj = yif.m(th);
        }
        Object obj3 = null;
        if (obj instanceof Result$Failure) {
            obj = null;
        }
        Date date = (Date) obj;
        try {
            obj2 = this.a.e.parse(t.getModified());
        } catch (Throwable th2) {
            obj2 = yif.m(th2);
        }
        if (!(obj2 instanceof Result$Failure)) {
            obj3 = obj2;
        }
        return xlf.a(date, (Date) obj3);
    }
}
