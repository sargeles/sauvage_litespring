package org.litespring.util;

public abstract class ClassUtils {
	public static ClassLoader getDefaultClassLoader() {
		ClassLoader cl = null;
		try {
			//线程的 contextClassLoader 是从父线程那里继承过来的，
			// 所谓父线程就是创建了当前线程的线程。
			// 程序启动时的 main 线程的 contextClassLoader 就是 AppClassLoader。
			// 这意味着如果没有人工去设置，那么所有的线程的 contextClassLoader 都是 AppClassLoader。
			cl = Thread.currentThread().getContextClassLoader();
		}
		catch (Throwable ex) {
			// Cannot access thread context ClassLoader - falling back...
		}
		if (cl == null) {
			// No thread context class loader -> use class loader of this class.
			cl = ClassUtils.class.getClassLoader();
			if (cl == null) {
				// getClassLoader() returning null indicates the bootstrap ClassLoader
				try {
					cl = ClassLoader.getSystemClassLoader();
				}
				catch (Throwable ex) {
					// Cannot access system ClassLoader - oh well, maybe the caller can live with null...
				}
			}
		}
		return cl;
	}
}
