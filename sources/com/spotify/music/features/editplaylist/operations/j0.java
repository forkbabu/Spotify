package com.spotify.music.features.editplaylist.operations;

import android.net.Uri;
import android.os.Bundle;
import com.google.common.base.Optional;
import com.spotify.music.features.editplaylist.operations.SetPictureOperationHandler;
import com.spotify.music.features.editplaylist.operations.a;
import io.reactivex.internal.operators.completable.CompletableConcatIterable;
import io.reactivex.internal.operators.completable.b;
import io.reactivex.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class j0 {
    private final ArrayList<e0> a = new ArrayList<>();
    private Optional<o0> b = Optional.absent();
    private boolean c;
    private final f0 d;
    private final List<i0> e;
    private final SetPictureOperationHandler f;

    j0(f0 f0Var, List<i0> list, SetPictureOperationHandler setPictureOperationHandler) {
        this.d = f0Var;
        this.e = list;
        this.f = setPictureOperationHandler;
    }

    private boolean d(e0 e0Var) {
        for (i0 i0Var : this.e) {
            if (i0Var.d(e0Var)) {
                return i0Var.a(this.a, e0Var);
            }
        }
        throw new IllegalStateException("Failed to find Operation Handler for operation " + e0Var);
    }

    public void a(String str) {
        d(this.d.a(str));
    }

    public void b(String str) {
        d(this.d.b(str));
    }

    public boolean c(String str, String str2) {
        return d(this.d.c(str, str2));
    }

    public void e(String str) {
        d(this.d.d(str));
    }

    public void f(Uri uri) {
        this.b = Optional.of(this.d.e(uri));
    }

    public u g(u uVar) {
        Iterator<e0> it = this.a.iterator();
        while (it.hasNext()) {
            e0 next = it.next();
            for (i0 i0Var : this.e) {
                if (i0Var.d(next)) {
                    uVar = i0Var.b(uVar, next);
                }
            }
        }
        if (!this.b.isPresent()) {
            return uVar;
        }
        SetPictureOperationHandler setPictureOperationHandler = this.f;
        o0 o0Var = this.b.get();
        setPictureOperationHandler.getClass();
        a.b bVar = (a.b) uVar.k();
        bVar.c(o0Var.a());
        bVar.d(!Uri.EMPTY.equals(o0Var.a()));
        return bVar.a();
    }

    public io.reactivex.a h() {
        if (!this.b.isPresent()) {
            return b.a;
        }
        SetPictureOperationHandler setPictureOperationHandler = this.f;
        setPictureOperationHandler.getClass();
        return io.reactivex.a.u(new i(setPictureOperationHandler, this.b.get()));
    }

    public io.reactivex.a i() {
        ArrayList arrayList = new ArrayList(this.a.size());
        Iterator<e0> it = this.a.iterator();
        while (it.hasNext()) {
            e0 next = it.next();
            for (i0 i0Var : this.e) {
                if (i0Var.d(next)) {
                    arrayList.add(i0Var.e(next));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return b.a;
        }
        return new CompletableConcatIterable(arrayList);
    }

    public boolean j() {
        return !this.a.isEmpty() || this.b.isPresent();
    }

    public boolean k() {
        return this.c;
    }

    public s<SetPictureOperationHandler.Status> l() {
        if (!this.b.isPresent()) {
            return s.i0(SetPictureOperationHandler.Status.NOTHING);
        }
        SetPictureOperationHandler setPictureOperationHandler = this.f;
        setPictureOperationHandler.getClass();
        return s.y(new h(setPictureOperationHandler, this.b.get()));
    }

    public boolean m(String str) {
        v a2 = this.d.a(str);
        for (i0 i0Var : this.e) {
            if (i0Var.d(a2)) {
                return i0Var.c(this.a, a2);
            }
        }
        throw new IllegalStateException("Failed to find Operation Handler for operation " + a2);
    }

    public void n() {
        this.b = Optional.absent();
    }

    public void o(Bundle bundle) {
        if (bundle != null) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("operations");
            if (parcelableArrayList != null) {
                this.a.clear();
                this.a.addAll(parcelableArrayList);
            }
            this.b = Optional.fromNullable(bundle.getParcelable("set_picture_operation"));
            this.c = bundle.getBoolean("is_saving");
        }
    }

    public void p(Bundle bundle) {
        bundle.putParcelableArrayList("operations", this.a);
        bundle.putParcelable("set_picture_operation", this.b.orNull());
        bundle.putBoolean("is_saving", this.c);
    }

    public void q(boolean z) {
        this.c = z;
    }

    public io.reactivex.a r() {
        if (!this.b.isPresent()) {
            return b.a;
        }
        SetPictureOperationHandler setPictureOperationHandler = this.f;
        setPictureOperationHandler.getClass();
        return io.reactivex.a.u(new k(setPictureOperationHandler, this.b.get()));
    }
}
