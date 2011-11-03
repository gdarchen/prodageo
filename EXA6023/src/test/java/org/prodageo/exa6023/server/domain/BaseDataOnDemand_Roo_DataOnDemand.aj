// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.prodageo.exa6023.server.domain;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import org.prodageo.exa6023.server.domain.Base;
import org.springframework.stereotype.Component;

privileged aspect BaseDataOnDemand_Roo_DataOnDemand {
    
    declare @type: BaseDataOnDemand: @Component;
    
    private Random BaseDataOnDemand.rnd = new SecureRandom();
    
    private List<Base> BaseDataOnDemand.data;
    
    public Base BaseDataOnDemand.getNewTransientBase(int index) {
        Base obj = new Base();
        return obj;
    }
    
    public Base BaseDataOnDemand.getSpecificBase(int index) {
        init();
        if (index < 0) index = 0;
        if (index > (data.size() - 1)) index = data.size() - 1;
        Base obj = data.get(index);
        return Base.findBase(obj.getId());
    }
    
    public Base BaseDataOnDemand.getRandomBase() {
        init();
        Base obj = data.get(rnd.nextInt(data.size()));
        return Base.findBase(obj.getId());
    }
    
    public boolean BaseDataOnDemand.modifyBase(Base obj) {
        return false;
    }
    
    public void BaseDataOnDemand.init() {
        data = Base.findBaseEntries(0, 10);
        if (data == null) throw new IllegalStateException("Find entries implementation for 'Base' illegally returned null");
        if (!data.isEmpty()) {
            return;
        }
        
        data = new ArrayList<org.prodageo.exa6023.server.domain.Base>();
        for (int i = 0; i < 10; i++) {
            Base obj = getNewTransientBase(i);
            try {
                obj.persist();
            } catch (ConstraintViolationException e) {
                StringBuilder msg = new StringBuilder();
                for (Iterator<ConstraintViolation<?>> it = e.getConstraintViolations().iterator(); it.hasNext();) {
                    ConstraintViolation<?> cv = it.next();
                    msg.append("[").append(cv.getConstraintDescriptor()).append(":").append(cv.getMessage()).append("=").append(cv.getInvalidValue()).append("]");
                }
                throw new RuntimeException(msg.toString(), e);
            }
            obj.flush();
            data.add(obj);
        }
    }
    
}
