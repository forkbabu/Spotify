package com.uber.rxdogtag;

import io.reactivex.a;
import io.reactivex.b0;
import io.reactivex.c;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.g;
import io.reactivex.l;
import io.reactivex.n;
import io.reactivex.observers.b;
import io.reactivex.s;
import io.reactivex.x;
import io.reactivex.z;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public final class RxDogTag {
    public static final String STACK_ELEMENT_SOURCE_DELEGATE = "[[ Originating callback: %s ]]";
    public static final String STACK_ELEMENT_SOURCE_HEADER = "[[ ↑↑ Inferred subscribe point ↑↑ ]]";
    public static final String STACK_ELEMENT_TRACE_HEADER = "[[ ↓↓ Original trace ↓↓ ]]";

    public static final class Builder {
        boolean disableAnnotations = false;
        boolean guardObserverCallbacks = true;
        Set<String> ignoredPackages = new LinkedHashSet();
        List<ObserverHandler> observerHandlers = new ArrayList();
        boolean repackageOnErrorNotImplementedExceptions = true;

        Builder() {
        }

        public Builder addIgnoredPackages(String... strArr) {
            return addIgnoredPackages(Arrays.asList(strArr));
        }

        public Builder addObserverHandlers(ObserverHandler... observerHandlerArr) {
            return addObserverHandlers(Arrays.asList(observerHandlerArr));
        }

        public Builder configureWith(Configurer configurer) {
            configurer.apply(this);
            return this;
        }

        public Builder disableAnnotations() {
            this.disableAnnotations = true;
            return this;
        }

        public Builder disableRepackagingOnErrorNotImplementedExceptions() {
            this.repackageOnErrorNotImplementedExceptions = false;
            return this;
        }

        public Builder guardObserverCallbacks(boolean z) {
            this.guardObserverCallbacks = z;
            return this;
        }

        public void install() {
            RxDogTag.installWithBuilder(new Configuration(this));
        }

        public Builder addIgnoredPackages(Collection<String> collection) {
            this.ignoredPackages.addAll(collection);
            return this;
        }

        public Builder addObserverHandlers(Collection<ObserverHandler> collection) {
            this.observerHandlers.addAll(collection);
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    public static class Configuration {
        private static final ObserverHandler DEFAULT_HANDLER = new ObserverHandler() {
            /* class com.uber.rxdogtag.RxDogTag.Configuration.AnonymousClass1 */

            @Override // com.uber.rxdogtag.ObserverHandler
            public /* synthetic */ b0 handle(z zVar, b0 b0Var) {
                return r0.$default$handle(this, zVar, b0Var);
            }

            @Override // com.uber.rxdogtag.ObserverHandler
            public /* synthetic */ c handle(a aVar, c cVar) {
                return r0.$default$handle(this, aVar, cVar);
            }

            @Override // com.uber.rxdogtag.ObserverHandler
            public /* synthetic */ n handle(l lVar, n nVar) {
                return r0.$default$handle(this, lVar, nVar);
            }

            @Override // com.uber.rxdogtag.ObserverHandler
            public /* synthetic */ x handle(s sVar, x xVar) {
                return r0.$default$handle(this, sVar, xVar);
            }

            @Override // com.uber.rxdogtag.ObserverHandler
            public /* synthetic */ upf handle(g gVar, upf upf) {
                return r0.$default$handle(this, gVar, upf);
            }
        };
        private static final Collection<String> DEFAULT_IGNORED_PACKAGES = Arrays.asList(s.class.getPackage().getName(), DogTagObserver.class.getPackage().getName());
        final boolean disableAnnotations;
        final boolean guardObserverCallbacks;
        final Set<String> ignoredPackages;
        final List<ObserverHandler> observerHandlers;
        final boolean repackageOnErrorNotImplementedExceptions;

        Configuration(Builder builder) {
            this.disableAnnotations = builder.disableAnnotations;
            ArrayList arrayList = new ArrayList(builder.observerHandlers);
            arrayList.add(DEFAULT_HANDLER);
            LinkedHashSet linkedHashSet = new LinkedHashSet(builder.ignoredPackages);
            linkedHashSet.addAll(DEFAULT_IGNORED_PACKAGES);
            this.observerHandlers = Collections.unmodifiableList(arrayList);
            this.ignoredPackages = Collections.unmodifiableSet(linkedHashSet);
            this.repackageOnErrorNotImplementedExceptions = builder.repackageOnErrorNotImplementedExceptions;
            this.guardObserverCallbacks = builder.guardObserverCallbacks;
        }
    }

    public interface Configurer {
        void apply(Builder builder);
    }

    interface NonCheckingConsumer<T> {
        void accept(T t);
    }

    /* access modifiers changed from: private */
    public interface NonCheckingPredicate<T> {
        boolean test(T t);
    }

    private RxDogTag() {
        throw new InstantiationError();
    }

    static /* synthetic */ x a(Configuration configuration, s sVar, x xVar) {
        for (ObserverHandler observerHandler : configuration.observerHandlers) {
            if (shouldDecorate(observerHandler.handle(sVar, xVar))) {
                return new DogTagObserver(configuration, xVar);
            }
        }
        return xVar;
    }

    static /* synthetic */ upf b(Configuration configuration, g gVar, upf upf) {
        for (ObserverHandler observerHandler : configuration.observerHandlers) {
            if (shouldDecorate(observerHandler.handle(gVar, upf))) {
                return new DogTagSubscriber(configuration, upf);
            }
        }
        return upf;
    }

    public static Builder builder() {
        return new Builder();
    }

    static /* synthetic */ b0 c(Configuration configuration, z zVar, b0 b0Var) {
        for (ObserverHandler observerHandler : configuration.observerHandlers) {
            if (shouldDecorate(observerHandler.handle(zVar, b0Var))) {
                return new DogTagSingleObserver(configuration, b0Var);
            }
        }
        return b0Var;
    }

    private static boolean containsAnyPackages(String str, Set<String> set) {
        for (String str2 : set) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    static OnErrorNotImplementedException createException(Configuration configuration, Throwable th, Throwable th2, String str) {
        OnErrorNotImplementedException onErrorNotImplementedException;
        StackTraceElement[] stackTraceElementArr;
        StackTraceElement extractStackElementTag = extractStackElementTag(th, configuration.ignoredPackages);
        if (configuration.repackageOnErrorNotImplementedExceptions && (th2 instanceof OnErrorNotImplementedException)) {
            th2 = th2.getCause();
        }
        if (th2 instanceof OnErrorNotImplementedException) {
            OnErrorNotImplementedException onErrorNotImplementedException2 = (OnErrorNotImplementedException) th2;
            onErrorNotImplementedException = onErrorNotImplementedException2;
            th2 = onErrorNotImplementedException2.getCause();
        } else {
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            onErrorNotImplementedException = new OnErrorNotImplementedException(message, th2);
            onErrorNotImplementedException.setStackTrace(new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = th2.getStackTrace();
        char c = 3;
        int i = str != null ? 4 : 3;
        if (configuration.disableAnnotations) {
            stackTraceElementArr = new StackTraceElement[(stackTrace.length + 1)];
            stackTraceElementArr[0] = extractStackElementTag;
            if (stackTrace.length != 0) {
                System.arraycopy(stackTrace, 0, stackTraceElementArr, 1, stackTrace.length);
            }
        } else {
            int indexOfLast = indexOfLast(stackTrace, l0.a);
            int i2 = indexOfLast != -1 ? indexOfLast + 1 : 0;
            StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[((stackTrace.length + i) - i2)];
            stackTraceElementArr2[0] = extractStackElementTag;
            stackTraceElementArr2[1] = new StackTraceElement(STACK_ELEMENT_SOURCE_HEADER, "", "", 0);
            if (str != null) {
                stackTraceElementArr2[2] = new StackTraceElement(String.format(Locale.US, STACK_ELEMENT_SOURCE_DELEGATE, str), "", "", 0);
            } else {
                c = 2;
            }
            stackTraceElementArr2[c] = new StackTraceElement(STACK_ELEMENT_TRACE_HEADER, "", "", 0);
            if (stackTrace.length != 0) {
                System.arraycopy(stackTrace, i2, stackTraceElementArr2, i, stackTrace.length - i2);
            }
            stackTraceElementArr = stackTraceElementArr2;
        }
        th2.setStackTrace(stackTraceElementArr);
        return onErrorNotImplementedException;
    }

    static /* synthetic */ n d(Configuration configuration, l lVar, n nVar) {
        for (ObserverHandler observerHandler : configuration.observerHandlers) {
            if (shouldDecorate(observerHandler.handle(lVar, nVar))) {
                return new DogTagMaybeObserver(configuration, nVar);
            }
        }
        return nVar;
    }

    static /* synthetic */ c e(Configuration configuration, a aVar, c cVar) {
        for (ObserverHandler observerHandler : configuration.observerHandlers) {
            if (shouldDecorate(observerHandler.handle(aVar, cVar))) {
                return new DogTagCompletableObserver(configuration, cVar);
            }
        }
        return cVar;
    }

    private static StackTraceElement extractStackElementTag(Throwable th, Set<String> set) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (!containsAnyPackages(stackTraceElement.getClassName(), set)) {
                return stackTraceElement;
            }
        }
        return new StackTraceElement("Unknown", "unknown", "unknown", 0);
    }

    static void guardedDelegateCall(NonCheckingConsumer<Throwable> nonCheckingConsumer, Runnable runnable) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = Thread.currentThread().getUncaughtExceptionHandler();
        try {
            Thread.currentThread().setUncaughtExceptionHandler(new m0(uncaughtExceptionHandler, nonCheckingConsumer));
            runnable.run();
        } catch (OnErrorNotImplementedException e) {
            nonCheckingConsumer.accept(e.getCause());
        } catch (Throwable th) {
            Thread.currentThread().setUncaughtExceptionHandler(uncaughtExceptionHandler);
            throw th;
        }
        Thread.currentThread().setUncaughtExceptionHandler(uncaughtExceptionHandler);
    }

    private static <T> int indexOfLast(T[] tArr, NonCheckingPredicate<T> nonCheckingPredicate) {
        for (int length = tArr.length - 1; length >= 0; length--) {
            if (nonCheckingPredicate.test(tArr[length])) {
                return length;
            }
        }
        return -1;
    }

    public static void install() {
        new Builder().install();
    }

    /* access modifiers changed from: private */
    public static synchronized void installWithBuilder(Configuration configuration) {
        synchronized (RxDogTag.class) {
            io.reactivex.plugins.a.q(new o0(configuration));
            io.reactivex.plugins.a.o(new n0(configuration));
            io.reactivex.plugins.a.r(new j0(configuration));
            io.reactivex.plugins.a.p(new k0(configuration));
            io.reactivex.plugins.a.n(new p0(configuration));
        }
    }

    static void reportError(Configuration configuration, Throwable th, Throwable th2, String str) {
        io.reactivex.plugins.a.g(createException(configuration, th, th2, str));
    }

    public static synchronized void reset() {
        synchronized (RxDogTag.class) {
            io.reactivex.plugins.a.o(null);
            io.reactivex.plugins.a.q(null);
            io.reactivex.plugins.a.p(null);
            io.reactivex.plugins.a.r(null);
            io.reactivex.plugins.a.n(null);
        }
    }

    private static boolean shouldDecorate(Object obj) {
        if (obj instanceof RxDogTagErrorReceiver) {
            return true;
        }
        if (obj instanceof b) {
            return !((b) obj).hasCustomOnError();
        }
        return false;
    }
}
