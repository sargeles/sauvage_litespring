package org.litespring.core.io.support;

import org.litespring.core.io.Resource;
import org.litespring.core.io.ResourceLoader;
import org.litespring.util.ClassUtils;

/**
 * @author sargeles
 */
public abstract class AbstractResourceLoader implements ResourceLoader {

    private Resource resource;

    public AbstractResourceLoader(String path){
        this.resource = getResourceByPath(path);
    }

    public Resource getResource() {
        return this.resource;
    }

    protected abstract Resource getResourceByPath(String path);
}
