package com.google.android.gms.tasks;

public final class DuplicateTaskCompletionException extends IllegalStateException {
    private DuplicateTaskCompletionException(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException a(g<?> gVar) {
        String str;
        if (!gVar.q()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception m = gVar.m();
        if (m != null) {
            str = "failure";
        } else if (gVar.r()) {
            String valueOf = String.valueOf(gVar.n());
            str = je.i0(valueOf.length() + 7, "result ", valueOf);
        } else {
            str = gVar.p() ? "cancellation" : "unknown issue";
        }
        String valueOf2 = String.valueOf(str);
        return new DuplicateTaskCompletionException(valueOf2.length() != 0 ? "Complete with: ".concat(valueOf2) : new String("Complete with: "), m);
    }
}
