# todo_2
My Todo Project

{
    "timestamp": "2022-03-03T14:43:04.711+00:00",
    "status": 500,
    "error": "Internal Server Error",
    "trace": "com.google.cloud.datastore.DatastoreException: I/O error\n\tat com.google.cloud.
    datastore.spi.v1.HttpDatastoreRpc.translate(HttpDatastoreRpc.java:138)\n\tat com.google.cloud.datastore.spi.v1.HttpDatastoreRpc.commit(HttpDatastoreRpc.
    java:164)\n\tat com.google.cloud.datastore.DatastoreImpl$5.call(DatastoreImpl.java:564)\n\tat com.google.cloud.datastore.DatastoreImpl$5.call(DatastoreImpl.
    java:561)\n\tat com.google.api.gax.retrying.DirectRetryingExecutor.submit(DirectRetryingExecutor.java:105)\n\tat com.google.cloud.RetryHelper.run(RetryHelper.
    java:76)\n\tat com.google.cloud.RetryHelper.runWithRetries(RetryHelper.java:50)\n\tat com.google.cloud.datastore.DatastoreImpl.commit(DatastoreImpl.java:560)\n\
    tat com.google.cloud.datastore.DatastoreImpl.commitMutation(DatastoreImpl.java:553)
    \n\tat com.google.cloud.datastore.DatastoreImpl.put(DatastoreImpl.java:513)\n\tat org.springframework.cloud.gcp.data.datastore.core.util.SliceUtil.sliceAndExecute
    (SliceUtil.java:46)\n\tat org.springframework.cloud.gcp.data.datastore.core.DatastoreTemplate.saveEntities(DatastoreTemplate.java:187)\n\tat org.springframework.
    cloud.gcp.data.datastore.core.DatastoreTemplate.save(DatastoreTemplate.java:153)\n\tat org.springframework.cloud.gcp.data.datastore.repository.support.SimpleDatastoreRepository.
    save(SimpleDatastoreRepository.java:102)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:78)\n\tat 
    java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.
    java:567)\n\tat org.springframework.data.repository.core.support.RepositoryMethodInvoker$RepositoryFragmentMethodInvoker.lambda$new$0(RepositoryMethodInvoker.java:289)
    \n\tat org.springframework.data.repository.core.support.RepositoryMethodInvoker.doInvoke(RepositoryMethodInvoker.java:137)\n\tat org.springframework.data.repository.core.
    support.RepositoryMethodInvoker.invoke(RepositoryMethodInvoker.java:121)\n\tat org.springframework.data.repository.core.support.RepositoryComposition$RepositoryFragments.
    invoke(RepositoryComposition.java:529)\n\tat org.springframework.data.
    repository.core.support.RepositoryComposition.invoke(RepositoryComposition.java:285)\n\tat org.springframework.data.repository.core.support.RepositoryFactorySupport$ImplementationMethodExecutionInterceptor.
    invoke(RepositoryFactorySupport.java:639)\n\tat org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)\n\tat org.springframework.data.repository.core.support
    .QueryExecutorMethodInterceptor.doInvoke(QueryExecutorMethodInterceptor.java:163)\n\tat org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.invoke(QueryExecutorMethodInterceptor.java:138)\n\tat
    org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)\n\tat org.springframework.aop.interceptor.ExposeInvocationInterceptor.invoke(ExposeInvocationInterceptor.java:97)\n\tat 
    org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)\n\tat org.springframework.aop.framework.JdkDynamicAopProxy.invoke(JdkDynamicAopProxy.java:215)\n\tat jdk.proxy3/jdk.proxy3.
    $Proxy70.save(Unknown Source)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:78)\n\tat java.base
    /jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:567)\n\tat org.springframework.aop.support.AopUtils.invokeJoinpointUsingReflection(AopUtils.java:344)\n\
    tat org.springframework.aop.framework.ReflectiveMethodInvocation.invokeJoinpoint(ReflectiveMethodInvocation.java:198)\n\tat org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:163)\n\tat org.springframework.dao.support.
    PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:137)\n\tat org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)\n\tat org.springframework.aop.framework.
    JdkDynamicAopProxy.invoke(JdkDynamicAopProxy.java:215)\n\tat jdk.proxy3/jdk.proxy3.$Proxy70.save(Unknown Source)\n\tat com.sample.todo.controller.todoController.createTodo(todoController.java:38)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0
    (Native Method)\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:78)\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.base/java.lang.reflect.Method.
    invoke(Method.java:567)\n\tat org.springframework.web.method.support.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:205)\n\tat org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:150)\n\tat org.springframework.
    web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:117)\n\tat org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:895)\n\tat org.
    springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:808)\n\tat org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:87)\n\tat org.springframework.
    web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1067)\n\tat org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:963)\n\tat org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1006)\n\tat org.springframework.
    web.servlet.FrameworkServlet.doPost(FrameworkServlet.java:909)\n\tat javax.servlet.http.HttpServlet.service(HttpServlet.java:517)\n\tat org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883)\n\tat javax.servlet.http.HttpServlet.service(HttpServlet.java:584)\n\tat 
    org.eclipse.jetty.servlet.ServletHolder.handle(ServletHolder.java:799)\n\tat org.eclipse.jetty.servlet.ServletHandler$ChainEnd.doFilter(ServletHandler.java:1631)\n\tat org.eclipse.jetty.websocket.server.WebSocketUpgradeFilter.doFilter(WebSocketUpgradeFilter.java:228)\n\tat org.eclipse.jetty.servlet.
    FilterHolder.doFilter(FilterHolder.java:193)\n\tat org.eclipse.jetty.servlet.ServletHandler$Chain.doFilter(ServletHandler.java:1601)\n\tat org.springframework.web.filter.RequestContextFilter.doFilterInternal(RequestContextFilter.java:100)\n\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(
    OncePerRequestFilter.java:117)\n\tat org.eclipse.jetty.servlet.FilterHolder.doFilter(FilterHolder.java:193)\n\tat org.eclipse.jetty.servlet.ServletHandler$Chain.doFilter(ServletHandler.java:1601)\n\tat org.springframework.web.filter.FormContentFilter.doFilterInternal(FormContentFilter.java:93)\n\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)\n\tat org.eclipse.jetty.servlet.FilterHolder.doFilter(FilterHolder.java:193)\n\tat org.eclipse.jetty.servlet.ServletHandler$Chain.doFilter(ServletHandler.java:1601)\n\tat org.springframework.web.filter.CharacterEncodingFilter.doFilterInternal(CharacterEncodingFilter.java:201)\n\tat org.springframework.web.filter.OncePerRequestFilter.doFilter(OncePerRequestFilter.java:117)\n\tat org.eclipse.jetty.servlet.FilterHolder.doFilter(FilterHolder.java:193)\n\tat org.eclipse.jetty.servlet.ServletHandler$Chain.doFilter(ServletHandler.java:1601)\n\tat org.eclipse.jetty.servlet.ServletHandler.doHandle(ServletHandler.java:548)\n\tat org.eclipse.jetty.server.handler.ScopedHandler.handle(ScopedHandler.java:143)\n\tat org.eclipse.jetty.security.SecurityHandler.handle(SecurityHandler.java:600)\n\tat org.eclipse.jetty.server.handler.HandlerWrapper.handle(HandlerWrapper.java:127)\n\tat org.eclipse.jetty.server.handler.ScopedHandler.nextHandle(ScopedHandler.java:235)\n\tat org.eclipse.jetty.server.session.SessionHandler.doHandle(SessionHandler.java:1624)\n\tat org.eclipse.jetty.server.handler.ScopedHandler.nextHandle(ScopedHandler.java:233)\n\tat org.eclipse.jetty.server.handler.ContextHandler.doHandle(ContextHandler.java:1434)\n\tat org.eclipse.jetty.server.handler.ScopedHandler.nextScope(ScopedHandler.java:188)\n\tat org.eclipse.jetty.servlet.ServletHandler.doScope(ServletHandler.java:501)\n\tat org.eclipse.jetty.server.session.SessionHandler.doScope(SessionHandler.java:1594)\n\tat org.eclipse.jetty.server.handler.ScopedHandler.nextScope(ScopedHandler.java:186)\n\tat org.eclipse.jetty.server.handler.ContextHandler.doScope(ContextHandler.java:1349)\n\tat org.eclipse.jetty.server.handler.ScopedHandler.handle(ScopedHandler.java:141)\n\tat org.eclipse.jetty.server.handler.HandlerWrapper.handle(HandlerWrapper.java:127)\n\tat org.eclipse.jetty.server.Server.handle(Server.java:516)\n\tat org.eclipse.jetty.server.HttpChannel.lambda$handle$1(HttpChannel.java:400)\n\tat org.eclipse.jetty.server.HttpChannel.dispatch(HttpChannel.java:645)\n\tat org.eclipse.jetty.server.HttpChannel.handle(HttpChannel.java:392)\n\tat org.eclipse.jetty.server.HttpConnection.onFillable(HttpConnection.java:277)\n\tat org.eclipse.jetty.io.AbstractConnection$ReadCallback.succeeded(AbstractConnection.java:311)\n\tat org.eclipse.jetty.io.FillInterest.fillable(FillInterest.java:105)\n\tat org.eclipse.jetty.io.ChannelEndPoint$1.run(ChannelEndPoint.java:104)\n\tat org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:883)\n\tat org.eclipse.jetty.util.thread.QueuedThreadPool$Runner.run(QueuedThreadPool.java:1034)\n\tat java.base/java.lang.Thread.run(Thread.java:831)\nCaused by: com.google.datastore.v1.client.DatastoreException: I/O error, code=UNAVAILABLE\n\tat com.google.datastore.v1.client.RemoteRpc.makeException(RemoteRpc.java:136)\n\tat com.google.datastore.v1.client.RemoteRpc.call(RemoteRpc.java:105)\n\tat com.google.datastore.v1.client.Datastore.commit(Datastore.java:87)\n\tat com.google.cloud.datastore.spi.v1.HttpDatastoreRpc.commit(HttpDatastoreRpc.java:162)\n\t... 102 more\nCaused by: java.net.ConnectException: Connection refused\n\tat java.base/sun.nio.ch.Net.pollConnect(Native Method)\n\tat java.base/sun.nio.ch.Net.pollConnectNow(Net.java:669)\n\tat java.base/sun.nio.ch.NioSocketImpl.timedFinishConnect(NioSocketImpl.java:549)\n\tat java.base/sun.nio.ch.NioSocketImpl.connect(NioSocketImpl.java:597)\n\tat java.base/java.net.Socket.connect(Socket.java:645)\n\tat java.base/sun.net.NetworkClient.doConnect(NetworkClient.java:177)\n\tat java.base/sun.net.www.http.HttpClient.openServer(HttpClient.java:497)\n\tat java.base/sun.net.www.http.HttpClient.openServer(HttpClient.java:600)\n\tat java.base/sun.net.www.http.HttpClient.<init>(HttpClient.java:246)\n\tat java.base/sun.net.www.http.HttpClient.New(HttpClient.java:351)\n\tat java.base/sun.net.www.http.HttpClient.New(HttpClient.java:372)\n\tat java.base/sun.net.www.protocol.http.HttpURLConnection.getNewHttpClient(HttpURLConnection.java:1299)\n\tat java.base/sun.net.www.protocol.http.HttpURLConnection.plainConnect0(HttpURLConnection.java:1232)\n\tat java.base/sun.net.www.protocol.http.HttpURLConnection.plainConnect(HttpURLConnection.java:1120)\n\tat java.base/sun.net.www.protocol.http.HttpURLConnection.connect(HttpURLConnection.java:1051)\n\tat java.base/sun.net.www.protocol.http.HttpURLConnection.getOutputStream0(HttpURLConnection.java:1419)\n\tat java.base/sun.net.www.protocol.http.HttpURLConnection.getOutputStream(HttpURLConnection.java:1390)\n\tat com.google.api.client.http.javanet.NetHttpRequest.execute(NetHttpRequest.java:113)\n\tat com.google.api.client.http.javanet.NetHttpRequest.execute(NetHttpRequest.java:84)\n\tat com.google.api.client.http.HttpRequest.execute(HttpRequest.java:1012)\n\tat com.google.datastore.v1.client.RemoteRpc.call(RemoteRpc.java:93)\n\t... 104 more\n",
    "message": "org.springframework.web.util.NestedServletException: Request processing failed; nested exception is com.google.cloud.datastore.DatastoreException: 
  I/O error",
    "path": "/api/v1/todos"
}