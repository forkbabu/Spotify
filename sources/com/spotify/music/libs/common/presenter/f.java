package com.spotify.music.libs.common.presenter;

import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.localization.SpotifyLocale;
import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.disposables.b;
import io.reactivex.functions.g;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.s;
import io.reactivex.y;
import java.lang.reflect.Field;

@Deprecated
public class f<T extends Parcelable> {
    private e<T> a;
    private final s<SessionState> b;
    private s<T> c;
    private final y d;
    private b e;
    private b f;
    @i62
    private String g;
    @i62
    protected T h;
    private boolean i;
    private final g<Throwable> j = new a(this);
    private final g<T> k = new d(this);
    private final g<Throwable> l = new b(this);
    private final g<SessionState> m = new c(this);

    public f(y yVar, s<T> sVar, s<SessionState> sVar2) {
        EmptyDisposable emptyDisposable = EmptyDisposable.INSTANCE;
        this.e = emptyDisposable;
        this.f = emptyDisposable;
        this.d = yVar;
        sVar.getClass();
        this.c = sVar;
        sVar2.getClass();
        this.b = sVar2;
    }

    public T a() {
        return this.h;
    }

    public e<T> b() {
        return this.a;
    }

    public /* synthetic */ void c(Throwable th) {
        this.a.f1(th);
    }

    public /* synthetic */ void d(Throwable th) {
        this.a.f1(th);
    }

    /* access modifiers changed from: protected */
    public void e(T t) {
        t.getClass();
        this.h = t;
        this.a.N(t);
    }

    public void f(Bundle bundle, T t) {
        boolean z = true;
        if (j62.b(this, bundle)) {
            if (!rw.equal(this.g, SpotifyLocale.c())) {
                Field[] declaredFields = getClass().getDeclaredFields();
                for (Field field : declaredFields) {
                    if (field.isAnnotationPresent(i62.class)) {
                        Class<?> type = field.getType();
                        boolean isAccessible = field.isAccessible();
                        field.setAccessible(true);
                        try {
                            if (type.equals(Boolean.TYPE)) {
                                field.setBoolean(this, false);
                            } else {
                                if (!type.equals(Integer.TYPE) && !type.equals(Long.TYPE) && !type.equals(Double.TYPE)) {
                                    if (!type.equals(Float.TYPE)) {
                                        field.set(this, null);
                                    }
                                }
                                field.setInt(this, 0);
                            }
                            field.setAccessible(isAccessible);
                        } catch (IllegalAccessException e2) {
                            throw new AssertionError("Problems loading states " + field.getName() + ':' + e2.getMessage());
                        } catch (Throwable th) {
                            field.setAccessible(isAccessible);
                            throw th;
                        }
                    }
                }
            }
        } else if (t != null) {
            this.h = t;
        }
        if (this.h == null) {
            z = false;
        }
        this.i = z;
    }

    public void g(Bundle bundle) {
        this.g = SpotifyLocale.c();
        j62.c(this, bundle);
    }

    /* access modifiers changed from: protected */
    public void h(SessionState sessionState) {
        sessionState.getClass();
        if (this.h == null) {
            if (sessionState.connected()) {
                this.a.s1();
                this.e.dispose();
                this.e = this.c.o0(this.d).subscribe(this.k, this.j);
            } else {
                this.a.K0();
            }
        }
        this.a.W0(sessionState);
    }

    public void i(e<T> eVar) {
        T t;
        this.a = eVar;
        if (!this.i || (t = this.h) == null) {
            this.f.dispose();
            this.f = this.b.subscribe(this.m, this.l);
            return;
        }
        e(t);
    }

    public void j() {
        this.f.dispose();
        this.e.dispose();
        this.a = null;
    }
}
