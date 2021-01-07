package io.reactivex.internal.disposables;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.schedulers.ScheduledRunnable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class b implements io.reactivex.disposables.b, a {
    List<io.reactivex.disposables.b> a;
    volatile boolean b;

    @Override // io.reactivex.internal.disposables.a
    public boolean a(io.reactivex.disposables.b bVar) {
        if (!c(bVar)) {
            return false;
        }
        ((ScheduledRunnable) bVar).dispose();
        return true;
    }

    @Override // io.reactivex.internal.disposables.a
    public boolean b(io.reactivex.disposables.b bVar) {
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    List list = this.a;
                    if (list == null) {
                        list = new LinkedList();
                        this.a = list;
                    }
                    list.add(bVar);
                    return true;
                }
            }
        }
        bVar.dispose();
        return false;
    }

    @Override // io.reactivex.internal.disposables.a
    public boolean c(io.reactivex.disposables.b bVar) {
        if (bVar == null) {
            throw new NullPointerException("Disposable item is null");
        } else if (this.b) {
            return false;
        } else {
            synchronized (this) {
                if (this.b) {
                    return false;
                }
                List<io.reactivex.disposables.b> list = this.a;
                if (list != null) {
                    if (list.remove(bVar)) {
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
        List<io.reactivex.disposables.b> list;
        ArrayList arrayList;
        if (!this.b) {
            synchronized (this) {
                if (!this.b) {
                    this.b = true;
                    list = this.a;
                    arrayList = null;
                    this.a = null;
                } else {
                    return;
                }
            }
            if (list != null) {
                for (io.reactivex.disposables.b bVar : list) {
                    try {
                        bVar.dispose();
                    } catch (Throwable th) {
                        yif.V(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
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
    }
}
