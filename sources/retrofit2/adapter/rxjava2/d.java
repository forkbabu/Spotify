package retrofit2.adapter.rxjava2;

import retrofit2.v;

public final class d<T> {
    private d(v<T> vVar, Throwable th) {
    }

    public static <T> d<T> a(Throwable th) {
        if (th != null) {
            return new d<>(null, th);
        }
        throw new NullPointerException("error == null");
    }

    public static <T> d<T> b(v<T> vVar) {
        if (vVar != null) {
            return new d<>(vVar, null);
        }
        throw new NullPointerException("response == null");
    }
}
