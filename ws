[33mcommit 249176f12f837a193e6bf60e77b576cb5e457278[m[33m ([m[1;36mHEAD -> [m[1;32mmaster[m[33m, [m[1;31morigin/master[m[33m)[m
Author: Ckatt <0932814148_ckatt@ukr.net>
Date:   Wed Jan 24 18:56:39 2018 +0300

    Video_5_2 GridBagLayout доступно

[1mdiff --git a/.metadata/.log b/.metadata/.log[m
[1mindex 77cbbbe..2bf4c10 100644[m
[1m--- a/.metadata/.log[m
[1m+++ b/.metadata/.log[m
[36m@@ -698,3 +698,22 @@[m [muser global configuration and to define the default location to store repositori[m
 not correct please set the HOME environment variable and restart Eclipse. Otherwise Git for Windows and[m
 EGit might behave differently since they see different configuration options.[m
 This warning can be switched off on the Team > Git > Confirmations and Warnings preference page.[m
[32m+[m
[32m+[m[32m!ENTRY org.eclipse.recommenders.rcp 4 18 2018-01-24 18:03:31.226[m
[32m+[m[32m!MESSAGE Failed to resolve selection in ‘=TestFain5January/src<Video_5_2_GridBag{GBC.java’ at offset 2 213.[m
[32m+[m[32m!STACK 0[m
[32m+[m[32morg.eclipse.recommenders.utils.Logs$LogTraceException[m
[32m+[m	[32mat org.eclipse.recommenders.utils.Logs$LogTraceException.newTrace(Logs.java:381)[m
[32m+[m	[32mat org.eclipse.recommenders.utils.Logs.log(Logs.java:134)[m
[32m+[m	[32mat org.eclipse.recommenders.internal.rcp.JavaElementSelections.resolveJavaElementFromTypeRootInEditor(JavaElementSelections.java:164)[m
[32m+[m	[32mat org.eclipse.recommenders.internal.rcp.JavaElementSelections.resolveJavaElementFromEditor(JavaElementSelections.java:119)[m
[32m+[m	[32mat org.eclipse.recommenders.internal.rcp.JavaElementSelections.resolveJavaElementFromEditor(JavaElementSelections.java:102)[m
[32m+[m	[32mat org.eclipse.recommenders.internal.rcp.JavaElementSelectionService.handleSelectionInEditor(JavaElementSelectionService.java:108)[m
[32m+[m	[32mat org.eclipse.recommenders.internal.rcp.JavaElementSelectionService.access$1(JavaElementSelectionService.java:105)[m
[32m+[m	[32mat org.eclipse.recommenders.internal.rcp.JavaElementSelectionService$1.run(JavaElementSelectionService.java:82)[m
[32m+[m	[32mat java.base/java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:514)[m
[32m+[m	[32mat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)[m
[32m+[m	[32mat java.base/java.util.concurrent.ScheduledThreadPoolExecutor$ScheduledFutureTask.run(ScheduledThreadPoolExecutor.java:299)[m
[32m+[m	[32mat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)[m
[32m+[m	[32mat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)[m
[32m+[m	[32mat java.base/java.lang.Thread.run(Thread.java:844)[m
[1mdiff --git a/.metadata/.plugins/org.eclipse.core.resources/.projects/TestFain5January/.markers.snap b/.metadata/.plugins/org.eclipse.core.resources/.projects/TestFain5January/.markers.snap[m
[1mindex 08b5500..b3ce012 100644[m
Binary files a/.metadata/.plugins/org.eclipse.core.resources/.projects/TestFain5January/.markers.snap and b/.metadata/.plugins/org.eclipse.core.resources/.projects/TestFain5January/.markers.snap differ
[1mdiff --git a/.metadata/.plugins/org.eclipse.core.resources/.projects/TestFain5January/.syncinfo.snap b/.metadata/.plugins/org.eclipse.core.resources/.projects/TestFain5January/.syncinfo.snap[m
[1mindex 004befb..5757b26 100644[m
Binary files a/.metadata/.plugins/org.eclipse.core.resources/.projects/TestFain5January/.syncinfo.snap and b/.metadata/.plugins/org.eclipse.core.resources/.projects/TestFain5January/.syncinfo.snap differ
[1mdiff --git a/.metadata/.plugins/org.eclipse.core.resources/.root/.markers.snap b/.metadata/.plugins/org.eclipse.core.resources/.root/.markers.snap[m
[1mindex 935b664..2328749 100644[m
Binary files a/.metadata/.plugins/org.eclipse.core.resources/.root/.markers.snap and b/.metadata/.plugins/org.eclipse.core.resources/.root/.markers.snap differ
[1mdiff --git a/.metadata/.plugins/org.eclipse.core.resources/.safetable/org.eclip