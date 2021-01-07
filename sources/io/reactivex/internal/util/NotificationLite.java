package io.reactivex.internal.util;

import io.reactivex.disposables.b;
import io.reactivex.internal.functions.a;
import io.reactivex.x;
import java.io.Serializable;

public enum NotificationLite {
    COMPLETE;

    static final class DisposableNotification implements Serializable {
        private static final long serialVersionUID = -7482590109178395495L;
        final b upstream;

        DisposableNotification(b bVar) {
            this.upstream = bVar;
        }

        @Override // java.lang.Object
        public String toString() {
            StringBuilder V0 = je.V0("NotificationLite.Disposable[");
            V0.append(this.upstream);
            V0.append("]");
            return V0.toString();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class ErrorNotification implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;
        final Throwable e;

        ErrorNotification(Throwable th) {
            this.e = th;
        }

        @Override // java.lang.Object
        public boolean equals(Object obj) {
            if (obj instanceof ErrorNotification) {
                return a.a(this.e, ((ErrorNotification) obj).e);
            }
            return false;
        }

        @Override // java.lang.Object
        public int hashCode() {
            return this.e.hashCode();
        }

        @Override // java.lang.Object
        public String toString() {
            StringBuilder V0 = je.V0("NotificationLite.Error[");
            V0.append(this.e);
            V0.append("]");
            return V0.toString();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class SubscriptionNotification implements Serializable {
        private static final long serialVersionUID = -1322257508628817540L;
        final vpf upstream;

        SubscriptionNotification(vpf vpf) {
            this.upstream = vpf;
        }

        @Override // java.lang.Object
        public String toString() {
            StringBuilder V0 = je.V0("NotificationLite.Subscription[");
            V0.append(this.upstream);
            V0.append("]");
            return V0.toString();
        }
    }

    public static <T> boolean d(Object obj, x<? super T> xVar) {
        if (obj == COMPLETE) {
            xVar.onComplete();
            return true;
        } else if (obj instanceof ErrorNotification) {
            xVar.onError(((ErrorNotification) obj).e);
            return true;
        } else {
            xVar.onNext(obj);
            return false;
        }
    }

    public static <T> boolean g(Object obj, upf<? super T> upf) {
        if (obj == COMPLETE) {
            upf.onComplete();
            return true;
        } else if (obj instanceof ErrorNotification) {
            upf.onError(((ErrorNotification) obj).e);
            return true;
        } else {
            upf.onNext(obj);
            return false;
        }
    }

    public static <T> boolean h(Object obj, x<? super T> xVar) {
        if (obj == COMPLETE) {
            xVar.onComplete();
            return true;
        } else if (obj instanceof ErrorNotification) {
            xVar.onError(((ErrorNotification) obj).e);
            return true;
        } else if (obj instanceof DisposableNotification) {
            xVar.onSubscribe(((DisposableNotification) obj).upstream);
            return false;
        } else {
            xVar.onNext(obj);
            return false;
        }
    }

    public static Object i(b bVar) {
        return new DisposableNotification(bVar);
    }

    public static Object k(Throwable th) {
        return new ErrorNotification(th);
    }

    public static Throwable l(Object obj) {
        return ((ErrorNotification) obj).e;
    }

    public static boolean m(Object obj) {
        return obj == COMPLETE;
    }

    public static boolean n(Object obj) {
        return obj instanceof ErrorNotification;
    }

    public static Object p(vpf vpf) {
        return new SubscriptionNotification(vpf);
    }

    @Override // java.lang.Enum, java.lang.Object
    public String toString() {
        return "NotificationLite.Complete";
    }
}
