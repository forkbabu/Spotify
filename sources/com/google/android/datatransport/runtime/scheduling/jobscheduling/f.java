package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;

final /* synthetic */ class f implements Runnable {
    private final JobInfoSchedulerService a;
    private final JobParameters b;

    private f(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        this.a = jobInfoSchedulerService;
        this.b = jobParameters;
    }

    public static Runnable a(JobInfoSchedulerService jobInfoSchedulerService, JobParameters jobParameters) {
        return new f(jobInfoSchedulerService, jobParameters);
    }

    @Override // java.lang.Runnable
    public void run() {
        JobInfoSchedulerService jobInfoSchedulerService = this.a;
        JobParameters jobParameters = this.b;
        int i = JobInfoSchedulerService.a;
        jobInfoSchedulerService.jobFinished(jobParameters, false);
    }
}
