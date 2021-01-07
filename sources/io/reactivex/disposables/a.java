package io.reactivex.disposables;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.b;
import java.util.ArrayList;

public final class a implements b, io.reactivex.internal.disposables.a {
    b<b> a;
    volatile boolean b;

    public a() {
    }

    @Override // io.reactivex.internal.disposables.a
    public boolean a(b bVar) {
        if (!c(bVar)) {
            return false;
        }
        bVar.dispose();
        return true;
    }

    @Override // io.reactivex.internal.disposables.a
    public boolean b(b bVar) {
        if (bVar != null) {
            if (!this.b) {
                synchronized (this) {
                    if (!this.b) {
                        b<b> bVar2 = this.a;
                        if (bVar2 == null) {
                            bVar2 = new b<>(16, 0.75f);
                            this.a = bVar2;
                        }
                        bVar2.a(bVar);
                        return true;
                    }
                }
            }
            bVar.dispose();
            return false;
        }
        throw new NullPointerException("disposable is null");
    }

    @Override // io.reactivex.internal.disposables.a
    public boolean c(b bVar) {
        if (bVar == null) {
            throw new NullPointerException("disposables is null");
        } else if (this.b) {
            return false;
        } else {
            synchronized (this) {
                if (this.b) {
                    return false;
                }
                b<b> bVar2 = this.a;
                if (bVar2 != null) {
                    if (bVar2.d(bVar)) {
                        return true;
                    }
                }
                return false;
            }
        }
    }

    @Override // io.reactivex.disposables.b
    public boolean d() {
        return this.b;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    this.b = true;
                    b<b> bVar = this.a;
                    this.a = null;
                    g(bVar);
                }
            }
        }
    }

    public boolean e(b... bVarArr) {
        if (bVarArr != null) {
            if (!this.b) {
                synchronized (this) {
                    if (!this.b) {
                        b<b> bVar = this.a;
                        if (bVar == null) {
                            bVar = new b<>(bVarArr.length + 1, 0.75f);
                            this.a = bVar;
                        }
                        for (b bVar2 : bVarArr) {
                            io.reactivex.internal.functions.a.c(bVar2, "A Disposable in the disposables array is null");
                            bVar.a(bVar2);
                        }
                        return true;
                    }
                }
            }
            for (b bVar3 : bVarArr) {
                bVar3.dispose();
            }
            return false;
        }
        throw new NullPointerException("disposables is null");
    }

    public void f() {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    b<b> bVar = this.a;
                    this.a = null;
                    g(bVar);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void g(b<b> bVar) {
        if (bVar != null) {
            ArrayList arrayList = null;
            Object[] b2 = bVar.b();
            for (Object obj : b2) {
                if (obj instanceof b) {
                    try {
                        ((b) obj).dispose();
                    } catch (Throwable th) {
                        yif.V(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
            }
            if (arrayList == null) {
                return;
            }
            if (arrayList.size() == 1) {
                throw ExceptionHelper.e((Throwable) arrayList.get(0));
            }
            throw new CompositeException(arrayList);
        }
    }

    public int h() {
        int i = 0;
        if (this.b) {
            return 0;
        }
        synchronized (this) {
            if (this.b) {
                return 0;
            }
            b<b> bVar = this.a;
            if (bVar != null) {
                i = bVar.f();
            }
            return i;
        }
    }

    public a(b... bVarArr) {
        this.a = new b<>(bVarArr.length + 1, 0.75f);
        for (b bVar : bVarArr) {
            io.reactivex.internal.functions.a.c(bVar, "A Disposable in the disposables array is null");
            this.a.a(bVar);
        }
    }
}
